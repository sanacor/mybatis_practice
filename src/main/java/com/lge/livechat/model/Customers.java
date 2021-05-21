package com.lge.livechat.model;

public class Customers {

    private Integer customerId;
    private String customerName;
    private String email;

    public Integer getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(Integer id) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerName(String name) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
