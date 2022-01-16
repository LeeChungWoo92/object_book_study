package com.lcw.study.object_exam;

/**
 * 판매원
 **/
public class TicketSeller {
    private TicketOffice ticketOffice; //판매원은 자신이 일하는 TicketOffice를 알고 있어야 한다.

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    public TicketOffice getTicketOffice() {
        return ticketOffice;
    }
}
