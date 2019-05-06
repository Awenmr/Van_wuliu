package com.van.page;

import java.io.Serializable;

/**
 * 处理分页
 */
public class Page implements Serializable {

    //当前页
    private Integer page = 1;
    //页大小
    private Integer rows = 5;
    // 总记录 数
    private Integer totalRecord;
    //总页数
    private Integer totalPage;
    //关键字类型
    private String keyType;
    //查询关键字
    private String keyWord;
    //开始记录位置
    private Integer start;
    //用户id
    private String userId;
    //货单ID
    private String orderId;
    //其他用户id
    private String stId;
    //储存
    private String sId;
    //仓库
    private String ckId;
    //货物
    private String gId;



    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    public Integer getTotalRecord() {
        return totalRecord;
    }

    public void setTotalRecord(Integer totalRecord) {
        this.totalRecord = totalRecord;
    }

    public Integer getTotalPage() {

        totalPage = (totalRecord - 1) / rows + 1;
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public String getKeyType() {
        return keyType;
    }

    public void setKeyType(String keyType) {
        this.keyType = keyType;
    }

    public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }

    public Integer getStart() {
        start = (page - 1) * rows;
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getStId() {
        return stId;
    }

    public void setStId(String stId) {
        this.stId = stId;
    }

    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }

    public String getCkId() {
        return ckId;
    }

    public void setCkId(String ckId) {
        this.ckId = ckId;
    }


    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getgId() {
        return gId;
    }
    public void setgId(String gId) {
        this.gId = gId;
    }

    public Page() {
    }

    public Page(Integer page, Integer rows, Integer totalRecord, Integer totalPage, String keyType, String keyWord, Integer start, String userId, String orderId, String stId, String sId, String ckId, String gId) {
        this.page = page;
        this.rows = rows;
        this.totalRecord = totalRecord;
        this.totalPage = totalPage;
        this.keyType = keyType;
        this.keyWord = keyWord;
        this.start = start;
        this.userId = userId;
        this.orderId = orderId;
        this.stId = stId;
        this.sId = sId;
        this.ckId = ckId;
        this.gId = gId;
    }

    @Override
    public String toString() {
        return "Page{" +
                "page=" + page +
                ", rows=" + rows +
                ", totalRecord=" + totalRecord +
                ", totalPage=" + totalPage +
                ", keyType='" + keyType + '\'' +
                ", keyWord='" + keyWord + '\'' +
                ", start=" + start +
                ", userId='" + userId + '\'' +
                ", orderId='" + orderId + '\'' +
                ", stId='" + stId + '\'' +
                ", sId='" + sId + '\'' +
                ", ckId='" + ckId + '\'' +
                ", gId='" + gId + '\'' +
                '}';
    }
}
