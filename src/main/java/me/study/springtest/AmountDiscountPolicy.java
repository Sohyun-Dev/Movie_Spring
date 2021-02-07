package me.study.springtest;

import org.springframework.stereotype.Component;

@Component
public class AmountDiscountPolicy extends DiscountPolicy {
    private double money;
    private DiscountCondition discountCondition;

    public AmountDiscountPolicy(int money, DiscountCondition discountCondition) {

        super(money, discountCondition);
    }


    public void calculateDiscountAmount(Screening screening) {
        if (discountCondition.isSatisfiedBy(screening) == true) {
            money = money * 0.9;
        }
    }
}
