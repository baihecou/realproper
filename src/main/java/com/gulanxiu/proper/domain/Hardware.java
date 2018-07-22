package com.gulanxiu.proper.domain;


import java.io.Serializable;

public class Hardware implements Serializable {

  private Integer id;
  private String number;
  private String name;
  private String version;
  private Double price;
  private String place;
  private String describe;
  private String unit;
  private Integer state;
  private Integer deleteTag;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }


  public String getPlace() {
    return place;
  }

  public void setPlace(String place) {
    this.place = place;
  }


  public String getDescribe() {
    return describe;
  }

  public void setDescribe(String describe) {
    this.describe = describe;
  }


  public String getUnit() {
    return unit;
  }

  public void setUnit(String unit) {
    this.unit = unit;
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

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

}
