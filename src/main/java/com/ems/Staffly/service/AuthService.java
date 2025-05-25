package com.ems.Staffly.service;

import com.ems.Staffly.dto.request.HrLoginRequest;
import com.ems.Staffly.dto.response.HrDetailsResponse;
import com.ems.Staffly.dto.response.HrLoginResponse;
import com.ems.Staffly.entity.HrDetails;
import com.ems.Staffly.repository.HrDetailsRepository;
import com.ems.Staffly.util.JwtUtil;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthService {
    private static final Logger logger = LoggerFactory.getLogger(AuthService.class);
    private final HrDetailsRepository hrDetailsRepository;
    private final JwtUtil jwtUtil;
    private final ModelMapper modelMapper;

    public AuthService(HrDetailsRepository hrDetailsRepository, JwtUtil jwtUtil,
                       ModelMapper modelMapper) {
        this.hrDetailsRepository = hrDetailsRepository;
        this.jwtUtil = jwtUtil;
        this.modelMapper = modelMapper;

    }

    public HrLoginResponse hrLogin(HrLoginRequest request){
        logger.info("Login attempt for email: {}", request.getHrEmail());
        if(request.getHrEmail()==null || request.getHrEmail().trim().isEmpty()){
            throw new RuntimeException("Email is required");
        }
        if(request.getHrPassword()==null || request.getHrPassword().trim().isEmpty()){
            throw new RuntimeException("Password is required");
        }
        Optional<HrDetails> hrOptional= hrDetailsRepository.findByHrEmail(request.getHrEmail().trim());
        if(hrOptional.isEmpty()){
            logger.info("Login failed HR is not found: {}", request.getHrEmail());
            throw new RuntimeException("Invalid email or password");
        }
        HrDetails hrDetails=hrOptional.get();
        if(!hrDetails.getHrPassword().equals(request.getHrPassword())){
            logger.warn("Login failed HR password does not match");
            throw new RuntimeException("Invalid password");
        }
         String token= jwtUtil.generateToken(hrDetails.getHrEmail());
        if(token==null || token.isEmpty()){
            logger.error("Failed to generate JWT token for use: {}", request.getHrEmail());
            throw new RuntimeException("Failed to generate JWT token");
        }
        HrDetailsResponse hrResponse = modelMapper.map(hrDetails, HrDetailsResponse.class);
        logger.info("Login successful");
        return new HrLoginResponse(token, hrResponse);
    }
}
