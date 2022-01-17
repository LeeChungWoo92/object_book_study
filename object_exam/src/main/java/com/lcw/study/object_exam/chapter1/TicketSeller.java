package com.lcw.study.object_exam.chapter1;

/**
 * 판매원
 **/
public class TicketSeller {
    private TicketOffice ticketOffice; //판매원은 자신이 일하는 TicketOffice를 알고 있어야 한다.

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    /*public TicketOffice getTicketOffice() { //chapter1_1
        return ticketOffice;
    }*/

    public void sellTo(Audience audience){
      /*  if(audience.getBag().hasInviation()){
            Ticket ticket = ticketOffice.getTicket();
            audience.getBag().setTicket(ticket);
        }else{
            Ticket ticket = ticketOffice.getTicket();
            audience.getBag().minusAmount(ticket.getFee());
            ticketOffice.plusAmount(ticket.getFee());
            audience.getBag().setTicket(ticket);

        }*/ //chapter1_2
        // ticketOffice.plusAmount(audience.buy(ticketOffice.getTicket())); chapter1_3
        ticketOffice.sellTicketTo(audience);
    }
}
