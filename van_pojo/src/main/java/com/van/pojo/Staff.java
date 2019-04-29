package com.van.pojo;


public class Staff {

  private String stId;
  private String stName;
  private String stSex;
  private long stAge;
  private String stPhone;


  public String getStId() {
    return stId;
  }

  public void setStId(String stId) {
    this.stId = stId;
  }


  public String getStName() {
    return stName;
  }

  public void setStName(String stName) {
    this.stName = stName;
  }


  public String getStSex() {
    return stSex;
  }

  public void setStSex(String stSex) {
    this.stSex = stSex;
  }


  public long getStAge() {
    return stAge;
  }

  public void setStAge(long stAge) {
    this.stAge = stAge;
  }


  public String getStPhone() {
    return stPhone;
  }

  public void setStPhone(String stPhone) {
    this.stPhone = stPhone;
  }

    public Staff(String stId, String stName, String stSex, long stAge, String stPhone) {
        this.stId = stId;
        this.stName = stName;
        this.stSex = stSex;
        this.stAge = stAge;
        this.stPhone = stPhone;
    }

    public Staff() {
    }
}
