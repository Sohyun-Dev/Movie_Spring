package me.study.springtest;

import org.springframework.stereotype.Component;

@Component
public class Reservation {
    private int customer;
    private Screening screening;
    private int money;
    private int audienceCount;

    public Reservation(int customer, Screening screening, int money, int audienceCount) {
        this.customer = customer;
        this.screening = screening;
        this.money = money;
        this.audienceCount = audienceCount;
    }

    public void calculate() {
        screening.reserve(customer, audienceCount);
    }
}
