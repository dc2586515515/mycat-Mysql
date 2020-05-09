package com.dc.mycatMysql.mapper;

import com.dc.mycatMysql.pojo.Ticket;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Description
 * @Author DC
 * @Date 2020-05-08
 */
public interface TicketMapper {
    void addTicket(@Param("vo") Ticket ticket);

    List<Ticket> getTicket();
}
