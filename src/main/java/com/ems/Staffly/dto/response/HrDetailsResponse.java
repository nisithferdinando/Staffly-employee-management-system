package com.ems.Staffly.dto.response;


public class HrDetailsResponse {

    private String hrFirstName;
    private String hrLastName;
    private String hrEmail;

    public HrDetailsResponse() {

    }
    public HrDetailsResponse(String hrFirstName, String hrLastName, String hrEmail) {
        this.hrFirstName = hrFirstName;
        this.hrLastName = hrLastName;
        this.hrEmail = hrEmail;
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
}
