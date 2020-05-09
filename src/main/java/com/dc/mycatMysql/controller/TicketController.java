package com.dc.mycatMysql.controller;

import com.dc.mycatMysql.pojo.Ticket;
import com.dc.mycatMysql.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Description
 * @Author DC
 * @Date 2020-05-08
 */

@Controller
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @RequestMapping("/addTicket")
    @ResponseBody
    public void addTicketList() {
        ticketService.addTicket();
    }

    @RequestMapping("/getTicket")
    @ResponseBody
    public List<Ticket> getTicketList() {
        List<Ticket> tickets = ticketService.getTicket();
        return tickets;
    }
}