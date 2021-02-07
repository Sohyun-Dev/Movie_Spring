package me.study.springtest;

import org.springframework.stereotype.Component;

@Component
public class PercentDiscountPolicy extends DiscountPolicy {
    private double money;
    private DiscountCondition discountCondition;

    public PercentDiscountPolicy(int money, DiscountCondition discountCondition) {

        super(money, discountCondition);
    }


    public void calculateDiscountAmount(Screening screening) {
        if (discountCondition.isSatisfiedBy(screening) == true) {
            money = money - 1000;
        }
    }
}
