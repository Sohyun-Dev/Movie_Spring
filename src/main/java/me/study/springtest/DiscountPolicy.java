package me.study.springtest;

import org.springframework.stereotype.Component;

@Component
public class DiscountPolicy {
    private double money;
    private DiscountCondition discountCondition;

    public DiscountPolicy(double money, DiscountCondition discountCondition) {
        this.money = money;
        this.discountCondition = discountCondition;
    }

    public void calculateDiscountAmount(Screening screening) {
        discountCondition.isSatisfiedBy(screening);
    }
}
