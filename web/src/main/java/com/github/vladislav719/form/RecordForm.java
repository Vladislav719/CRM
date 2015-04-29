package com.github.vladislav719.form;

import java.util.Date;

/**
 * Created by vladislav on 29.04.2015.
 */
public class RecordForm {

    private String clientName;
    private String phone;
    private int price;
    private Date dateAt;

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getDateAt() {
        return dateAt;
    }

    public void setDateAt(Date dateAt) {
        this.dateAt = dateAt;
    }
}
