package com.lcw.study.object_exam.chapter1;

import com.lcw.study.object_exam.chapter1.Audience;
import com.lcw.study.object_exam.chapter1.Ticket;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 매표소
 **/
public class TicketOffice {
    private Long amount; //판매금액
    private List<Ticket> tickets = new ArrayList<>(); //판매하거나 교환해 줄 티켓목록

    public TicketOffice(Long amount, Ticket tickets) {
        this.amount = amount;
        this.tickets.addAll(Arrays.asList(tickets));
    }

    private Ticket getTicket() {  //티켓 판매
        return tickets.remove(0); //티켓목록에서 맨 첫 번째 위치에 저장된 티켓 반환
    }

    private void minusAmount(Long amount) { //판매금액 차감
        this.amount -= amount;
    }

    private void plusAmount(Long amount) { //판매금액 더하기
        this.amount += amount;
    }

    public void sellTicketTo(Audience audience){
        plusAmount(audience.buy(getTicket()));
    }
}
