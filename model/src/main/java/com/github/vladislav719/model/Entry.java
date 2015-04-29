package com.github.vladislav719.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by vladislav on 29.04.2015.
 */
@Entity
@Table(name = "ENTRIES")
public class Entry {

    @Id
    @GeneratedValue
    @Column(name = "entry_id")
    private Long id;

    @Column(name = "client_name")
    private String clientName;

    private String phone;

    private Integer price;

    /**
     * ?? ????? ????? ?????? ????????? ??????
     */
    @Column(name = "date_at")
    private Date dateAt;

    /**
     * ????? ???? ??????? ?????? ? ??????
     */
    @Column(name = "creation_date")
    private Date creationDate;

    public Long getId() {
        return id;
    }


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

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Date getDateAt() {
        return dateAt;
    }

    public void setDateAt(Date dateAt) {
        this.dateAt = dateAt;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
}
