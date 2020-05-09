package com.dc.mycatMysql.pojo;

import java.util.Date;

/**
 * @Description
 * @Author DC
 * @Date 2020-05-08
 */
public class Ticket {
    /*
     * 车票ID
     */
    private String  ticketID;
    /*
     * 开车地点
     */
    private String startting;
    /*
     * 到站地点
     */
    private String destination;
    /*
     * 价钱
     */
    private Integer price;
    /*
     * 开车时间
     */
    private Date beginTime;

    public String getTicketID() {
        return ticketID;
    }

    public void setTicketID(String ticketID) {
        this.ticketID = ticketID;
    }

    public String getStartting() {
        return startting;
    }

    public void setStartting(String startting) {
        this.startting = startting;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }
}
