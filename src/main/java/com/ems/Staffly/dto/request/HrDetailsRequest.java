package com.ems.Staffly.dto.request;


public class HrDetailsRequest {
    private String hrFirstName;
    private String hrLastName;
    private String hrEmail;
    private String hrPassword;

    public HrDetailsRequest() {

    }
    public HrDetailsRequest(String hrFirstName, String hrLastName, String hrEmail, String hrPassword) {
        this.hrFirstName = hrFirstName;
        this.hrLastName = hrLastName;
        this.hrEmail = hrEmail;
        this.hrPassword = hrPassword;
    }
    public String getHrFirstName() {
        return hrFirstName;
    }

    public void setHrFirstName(String hrFirstName) {
        this.hrFirstName = hrFirstName;
    }

    public String getHrLastName() {
        return hrLastName;
    }

    public void setHrLastName(String hrLastName) {
        this.hrLastName = hrLastName;
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
