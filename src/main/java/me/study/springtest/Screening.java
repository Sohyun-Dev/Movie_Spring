package me.study.springtest;

import org.springframework.stereotype.Component;

@Component
public class Screening {
    private Movie movie;

    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public int getWhenScreened() {
        return whenScreened;
    }

    public void setWhenScreened(int whenScreened) {
        this.whenScreened = whenScreened;
    }

    private int sequence;
    private int whenScreened;

    public void reserve(int customer, int count) {
        //여기 어떻게?
        movie.calculateMovieFee(Screening screening);
    }
}
