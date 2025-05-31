package com.ems.Staffly.controller;

import com.ems.Staffly.dto.request.HrLoginRequest;
import com.ems.Staffly.dto.response.HrLoginResponse;
import com.ems.Staffly.service.AuthService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/auth/hr")
public class AuthController {
    private static final Logger logger= LoggerFactory.getLogger(AuthController.class);

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping( "/login")
    public ResponseEntity<?> hrLogin(@RequestBody HrLoginRequest hrLoginRequest){
        try{
            logger.info("Login request received");
            HrLoginResponse response= authService.hrLogin(hrLoginRequest);
            logger.info("Login successful");
            return ResponseEntity.status((HttpStatus.OK)).body(response);
        }
        catch (RuntimeException e) {
            logger.warn("Login error: {}", e.getMessage());
            Map<String, String> errorResponse=new HashMap<>();
            errorResponse.put("message", e.getMessage());
            errorResponse.put("status", "error");
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
        }
        catch (Exception e){
            logger.error("Unexpected error during login.");
            Map<String, String> errorResponse=new HashMap<>();
            errorResponse.put("message", "An expected error occurred during login.");
            errorResponse.put("status", "error");
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorResponse);
        }
 }
}
