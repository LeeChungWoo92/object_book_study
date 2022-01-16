package com.lcw.study.object_exam;

/**
 * 소극장
 **/
public class Theater {
    private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    public void enter(Audience audience) { //관람객 맞이
     /*   if (audience.getBag().hasInviation()) { //가방안에 초대장이 들어있는지 확인(초대장이 있다)
            Ticket ticket = ticketSeller.getTicketOffice().getTicket(); //판매원에게 받은 티켓
            audience.getBag().setTicket(ticket); //받은 티켓을 관람객의 가방에 넣어준다

        } else { //가방안에 초대장이 없다
            Ticket ticket = ticketSeller.getTicketOffice().getTicket(); //판매원에게 받은 티켓
            audience.getBag().minusAmount(ticket.getFee()); //관람객 가방에서 티켓금액 차감
            ticketSeller.getTicketOffice().plusAmount(ticket.getFee()); //매표소 금액 증가
            audience.getBag().setTicket(ticket); //구매한 티켓을 관람객의 가방에 넣어준다
        }*/
        ticketSeller.sellTo(audience);
    }
}
