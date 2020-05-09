package com.dc.mycatMysql.service;

import com.dc.mycatMysql.pojo.Ticket;

import java.util.List;

/**
 * @Description
 * @Author DC
 * @Date 2020-05-08
 */
public interface TicketService {
    public void addTicket();
    public List<Ticket> getTicket();
}
