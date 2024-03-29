package com.videometric.survey.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Counter {
    @Id
    private int slot;

    private int cnt;

    public int getSlot() {
        return slot;
    }

    public int getCnt() {
        return cnt;
    }

    public void setSlot(int slot) {
        this.slot = slot;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }
}
