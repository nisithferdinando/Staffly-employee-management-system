package com.ems.Staffly.dto.response;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HrLoginResponse {

    private String token;
    private String type="Bearer";
    private HrDetailsResponse hrDetails;
    private String message="Login successful";
    private String timestamp;

    public HrLoginResponse(){

    }

    public HrLoginResponse(String token, HrDetailsResponse hrDetails) {
        this.token=token;
        this.hrDetails=hrDetails;
        this.timestamp= LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        this.message=message;
    }
    public HrLoginResponse(String token, HrDetailsResponse hrDetails, String message) {
        this.token = token;
        this.hrDetails = hrDetails;
        this.message = message;
        this.timestamp = LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
    }
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public HrDetailsResponse getHrDetails() {
        return hrDetails;
    }

    public void setHrDetails(HrDetailsResponse hrDetails) {
        this.hrDetails = hrDetails;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

}
