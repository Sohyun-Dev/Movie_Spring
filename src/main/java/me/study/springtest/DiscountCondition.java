package me.study.springtest;

import org.springframework.stereotype.Component;

@Component
public class DiscountCondition {
    public Boolean isSatisfiedBy(Screening screening) {
        return false;
    }
}
