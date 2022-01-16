package com.lcw.study.object_exam;

/**
 * 관람객이 소지품을 보관할 Bag
 **/
public class Bag {
    private Long amount; //현금
    private Inviation inviation; //초대장
    private Ticket ticket; //티켓

    public Long hold(Ticket ticket) {
        if (hasInviation()) {
            setTicket(ticket);
            return 0L;
        } else {
            setTicket(ticket);
            minusAmount(ticket.getFee());
            return ticket.getFee();
        }
    }

    public Bag(long amount) {  //초대장 없이 현금만 보관
        this(null, amount);
    }

    public Bag(Inviation inviation, long amount) { //초대장,현금 보관
        this.inviation = inviation;
        this.amount = amount;
    }


    private boolean hasInviation() { //초대장 보유 여부
        return inviation != null;
    }

    private boolean hasTicket() { //티켓 소유 여부
        return ticket != null;
    }

    private void setTicket(Ticket ticket) { //초대장을 티켓으로 교환
        this.ticket = ticket;
    }

    private void minusAmount(Long amount) { //현금 증가
        this.amount -= amount;
    }

    public void plusAmount(Long amount) { //현금 감소
        this.amount += amount;
    }


}
