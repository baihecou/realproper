package com.gulanxiu.proper.domain;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Date;

public class Borrow  implements Serializable {

  private Integer id;
  @JsonProperty("user_id")
  private Integer userId;
  @JsonProperty("hardware_id")
  private Integer hardwareId;
  @JsonProperty("start_time")
  private Date startTime;
  @JsonProperty("end_time")
  private Date endTime;

  public Date getStartTime() {
    return startTime;
  }

  public void setStartTime(Date startTime) {
    this.startTime = startTime;
  }

  public Date getEndTime() {
    return endTime;
  }

  public void setEndTime(Date endTime) {
    this.endTime = endTime;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public Integer getHardwareId() {
    return hardwareId;
  }

  public void setHardwareId(Integer hardwareId) {
    this.hardwareId = hardwareId;
  }


}
