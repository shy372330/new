package com.itdreamworks.datamanage.entity;

public class Boiler_Device_View {
    private Integer id,boilerType,boilerTon,boilerMedium,boilerFuel,status;
    private  String customerId,boilerNo,deviceNo,typeName,tonName,mediumName,fuelName,lat,lng;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBoilerType() {
        return boilerType;
    }

    public void setBoilerType(Integer boilerType) {
        this.boilerType = boilerType;
    }

    public Integer getBoilerTon() {
        return boilerTon;
    }

    public void setBoilerTon(Integer boilerTon) {
        this.boilerTon = boilerTon;
    }

    public Integer getBoilerMedium() {
        return boilerMedium;
    }

    public void setBoilerMedium(Integer boilerMedium) {
        this.boilerMedium = boilerMedium;
    }

    public Integer getBoilerFuel() {
        return boilerFuel;
    }

    public void setBoilerFuel(Integer boilerFuel) {
        this.boilerFuel = boilerFuel;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getBoilerNo() {
        return boilerNo;
    }

    public void setBoilerNo(String boilerNo) {
        this.boilerNo = boilerNo;
    }

    public String getDeviceNo() {
        return deviceNo;
    }

    public void setDeviceNo(String deviceNo) {
        this.deviceNo = deviceNo;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getTonName() {
        return tonName;
    }

    public void setTonName(String tonName) {
        this.tonName = tonName;
    }

    public String getMediumName() {
        return mediumName;
    }

    public void setMediumName(String mediumName) {
        this.mediumName = mediumName;
    }

    public String getFuelName() {
        return fuelName;
    }

    public void setFuelName(String fuelName) {
        this.fuelName = fuelName;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }
}
