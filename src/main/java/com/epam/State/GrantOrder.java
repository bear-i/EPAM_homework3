package com.epam.State;

import com.epam.State.States.CreatedState;
import com.epam.State.States.GrantState;

public class GrantOrder {
    GrantState state;
    Student student;

    GrantOrder(Student student){
        this.student = student;
        state = new CreatedState(this);
    }

    public void setState(GrantState state){
        this.state = state;
    }

    public GrantState getState() {
        return state;
    }

    public Student getStudent() {
        return student;
    }
}
