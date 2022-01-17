package com.lcw.study.object_exam.chapter1;

/**
 * 관람객
 **/
public class Audience {
    private Bag bag; //관람객은 소지품을 보관하기 위해 가방을 소지할 수 있다.

    public Audience(Bag bag) {
        this.bag = bag;
    }

  /*  public Bag getBag(){ //chapter1_2
        return bag;
    }*/

    public Long buy(Ticket ticket) {
     /*   if (bag.hasInviation()) { //chapter1_3
            bag.setTicket(ticket);
            return 0L;
        } else {
            bag.setTicket(ticket);
            bag.minusAmount(ticket.getFee());
            return ticket.getFee();
        }*/
        return bag.hold(ticket);

    }
}
