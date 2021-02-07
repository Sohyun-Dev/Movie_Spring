package me.study.springtest;

import org.springframework.stereotype.Component;

@Component
public class SequenceCondition extends DiscountCondition {

    @Override
    public Boolean isSatisfiedBy(Screening screening) {
        if (screening.getSequence() == 10) {
            return true;
        } else {
            return false;
        }
    }
}
