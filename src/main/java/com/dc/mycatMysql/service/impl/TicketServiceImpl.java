package com.dc.mycatMysql.service.impl;

import com.dc.mycatMysql.mapper.TicketMapper;
import com.dc.mycatMysql.pojo.Ticket;
import com.dc.mycatMysql.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @Description
 * @Author DC
 * @Date 2020-05-08
 */
@Service
public class TicketServiceImpl implements TicketService {
    @Autowired
    private TicketMapper ticketMapper;

    @Override
    public void addTicket() {
        Ticket ticket = new Ticket();
        ticket.setTicketID(UUID.randomUUID().toString());
        ticket.setDestination("北京" + System.currentTimeMillis());
        ticket.setPrice(100);
        ticket.setStartting("合肥" + System.currentTimeMillis());
        ticket.setBeginTime(new Date());
        ticketMapper.addTicket(ticket);
    }

    @Override
    public List<Ticket> getTicket() {
        List<Ticket> tickets = ticketMapper.getTicket();
        return tickets;
    }
}
