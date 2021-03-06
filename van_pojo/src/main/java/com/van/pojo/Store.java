package com.van.pojo;


import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.sql.Timestamp;

public class Store implements Serializable {

  private String sId;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
  private Timestamp sTime;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
  private Timestamp sOutime;
  private String sCount;
  private String sOutcount;

//一对1员工
  private Staff staff;

//一对一仓库编号
  private Warehouse warehouse;

//一对多货物编号
  private Goods goods;

  private String stId;
  private String ckId;
  private String gId;

    public Store(String sId, Timestamp sTime, Timestamp sOutime, String sCount, String sOutcount, String stId, String ckId, String gId) {
        this.sId = sId;
        this.sTime = sTime;
        this.sOutime = sOutime;
        this.sCount = sCount;
        this.sOutcount = sOutcount;
        this.stId = stId;
        this.ckId = ckId;
        this.gId = gId;
    }

    public Store() {
    }

    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }

    public Timestamp getsTime() {
        return sTime;
    }

    public void setsTime(Timestamp sTime) {
        this.sTime = sTime;
    }

    public Timestamp getsOutime() {
        return sOutime;
    }

    public void setsOutime(Timestamp sOutime) {
        this.sOutime = sOutime;
    }

    public String getsCount() {
        return sCount;
    }

    public void setsCount(String sCount) {
        this.sCount = sCount;
    }

    public String getsOutcount() {
        return sOutcount;
    }

    public void setsOutcount(String sOutcount) {
        this.sOutcount = sOutcount;
    }

    public String getStId() {
        return stId;
    }

    public void setStId(String stId) {
        this.stId = stId;
    }

    public String getCkId() {
        return ckId;
    }

    public void setCkId(String ckId) {
        this.ckId = ckId;
    }

    public String getgId() {
        return gId;
    }

    public void setgId(String gId) {
        this.gId = gId;
    }


    public Store(String sId, Timestamp sTime, Timestamp sOutime, String sCount, String sOutcount, Staff staff, Warehouse warehouse, Goods goods, String stId, String ckId, String gId) {
        this.sId = sId;
        this.sTime = sTime;
        this.sOutime = sOutime;
        this.sCount = sCount;
        this.sOutcount = sOutcount;
        this.staff = staff;
        this.warehouse = warehouse;
        this.goods = goods;
        this.stId = stId;
        this.ckId = ckId;
        this.gId = gId;
    }

    public Store(String sId, Timestamp sTime, Timestamp sOutime, String sCount, String sOutcount, Staff staff, Warehouse warehouse, Goods goods) {
        this.sId = sId;
        this.sTime = sTime;
        this.sOutime = sOutime;
        this.sCount = sCount;
        this.sOutcount = sOutcount;
        this.staff = staff;
        this.warehouse = warehouse;
        this.goods = goods;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    @Override
    public String toString() {
        return "Store{" +
                "sId='" + sId + '\'' +
                ", sTime=" + sTime +
                ", sOutime=" + sOutime +
                ", sCount='" + sCount + '\'' +
                ", sOutcount='" + sOutcount + '\'' +
                ", stId='" + stId + '\'' +
                ", ckId='" + ckId + '\'' +
                ", gId='" + gId + '\'' +
                '}';
    }
}
