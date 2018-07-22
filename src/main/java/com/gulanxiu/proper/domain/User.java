package com.gulanxiu.proper.domain;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class User  implements Serializable {

  private Integer id;
  private String usernumber;
  private String username;
  @JsonIgnore
  private String password;
  private String acedemy;
  @JsonProperty("user_type")
  private Integer state;
  @JsonIgnore
  private Integer deleteTag;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public String getUsernumber() {
    return usernumber;
  }

  public void setUsernumber(String usernumber) {
    this.usernumber = usernumber;
  }


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public String getAcedemy() {
    return acedemy;
  }

  public void setAcedemy(String acedemy) {
    this.acedemy = acedemy;
  }


  public Integer getState() {
    return state;
  }

  public void setState(Integer state) {
    this.state = state;
  }


  public Integer getDeleteTag() {
    return deleteTag;
  }

  public void setDeleteTag(Integer deleteTag) {
    this.deleteTag = deleteTag;
  }

}
