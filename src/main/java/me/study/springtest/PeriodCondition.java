package me.study.springtest;

import org.springframework.stereotype.Component;

@Component
public class PeriodCondition extends DiscountCondition {
    private int dd;
    private int startTime;
    private int endTime;

    @Override
    public Boolean isSatisfiedBy(Screening screening) {
        if (screening.getWhenScreened() < endTime && screening.getWhenScreened() > startTime) {
            return true;
        } else {
            return false;
        }
    }
}
