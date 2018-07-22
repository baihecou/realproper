package com.gulanxiu.proper.domain;

import java.io.Serializable;

/**
 * @author gulanxiu
 * @time 2018/7/18   12:29
 * @projectname proper
 */
public class Loan implements Serializable {
    private Integer id;
    private Integer userId;
    private Integer hardwareId;
    private String hardwareName;
    private String hardwareVersion;
    private Double hardwarePrice;
    private  String hardwarePlace;
    private Integer hardwareState;
    private String hardwareNumber;

    public String getHardwareNumber() {
        return hardwareNumber;
    }

    public void setHardwareNumber(String hardwareNumber) {
        this.hardwareNumber = hardwareNumber;
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

    public String getHardwareName() {
        return hardwareName;
    }

    public void setHardwareName(String hardwareName) {
        this.hardwareName = hardwareName;
    }

    public String getHardwareVersion() {
        return hardwareVersion;
    }

    public void setHardwareVersion(String hardwareVersion) {
        this.hardwareVersion = hardwareVersion;
    }

    public Double getHardwarePrice() {
        return hardwarePrice;
    }

    public void setHardwarePrice(Double hardwarePrice) {
        this.hardwarePrice = hardwarePrice;
    }

    public String getHardwarePlace() {
        return hardwarePlace;
    }

    public void setHardwarePlace(String hardwarePlace) {
        this.hardwarePlace = hardwarePlace;
    }

    public Integer getHardwareState() {
        return hardwareState;
    }

    public void setHardwareState(Integer hardwareState) {
        this.hardwareState = hardwareState;
    }
}
