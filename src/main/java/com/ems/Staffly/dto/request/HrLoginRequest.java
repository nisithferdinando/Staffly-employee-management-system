package com.ems.Staffly.dto.request;


public class HrLoginRequest {
    private String hrEmail;
    private String hrPassword;

    public HrLoginRequest(){

    }
    public HrLoginRequest(String hrEmail, String hrPassword) {
        this.hrEmail = hrEmail;
        this.hrPassword = hrPassword;
    }

    public String getHrEmail() {
        return hrEmail;
    }
    public void setHrEmail(String hrEmail) {
        this.hrEmail = hrEmail;
    }
    public String getHrPassword() {
        return hrPassword;
    }
    public void setHrPassword(String hrPassword) {
        this.hrPassword = hrPassword;
    }

}

