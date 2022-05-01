package com.sigma.sigmabackend.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Batch
{
    @Id
    @GeneratedValue
    @Column(nullable = false)
    private int id;
    @Column(nullable = false)
    private String batchName;
    @Column(nullable = true)
    private String batchDescription;
    @Column(nullable = false)
    private String batchTime;
    @Column(nullable = false)
    private String batchDay;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public String getBatchDescription() {
        return batchDescription;
    }

    public void setBatchDescription(String batchDescription) {
        this.batchDescription = batchDescription;
    }

    public String getBatchTime() {
        return batchTime;
    }

    public void setBatchTime(String batchTime) {
        this.batchTime = batchTime;
    }

    public String getBatchDay() {
        return batchDay;
    }

    public void setBatchDay(String batchDay) {
        this.batchDay = batchDay;
    }

    public Batch(int id, String batchName, String batchDescription, String batchTime, String batchDay) {
        this.id = id;
        this.batchName = batchName;
        this.batchDescription = batchDescription;
        this.batchTime = batchTime;
        this.batchDay = batchDay;
    }

    public Batch() {
    }

    @Override
    public String toString() {
        return "Batch{" +
                "id=" + id +
                ", batchName='" + batchName + '\'' +
                ", batchDescription='" + batchDescription + '\'' +
                ", batchTime='" + batchTime + '\'' +
                ", batchDay='" + batchDay + '\'' +
                '}';
    }
}
