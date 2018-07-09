package com.itdreamworks.datamanage.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class CustomerSaleRecord_CusPro__Location_View {
    private int id,customerProductId,endUserId,categoryId;

    private String productCode,deviceNo,customerId, lng,lat;
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Date saleDatetime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomerProductId() {
        return customerProductId;
    }

    public void setCustomerProductId(int customerProductId) {
        this.customerProductId = customerProductId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public int getEndUserId() {
        return endUserId;
    }

    public void setEndUserId(int endUserId) {
        this.endUserId = endUserId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getDeviceNo() {
        return deviceNo;
    }

    public void setDeviceNo(String deviceNo) {
        this.deviceNo = deviceNo;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public Date getSaleDatetime() {
        return saleDatetime;
    }

    public void setSaleDatetime(Date saleDatetime) {
        this.saleDatetime = saleDatetime;
    }
}
