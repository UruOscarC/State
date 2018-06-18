package com.ogcg.state;

class Button {
    private State current;

    public Button() {
        current = OFF.instance();
    }

    public void setCurrent(State s) {
        current = s;
    }

    public void push() {
        current.push(this);
    }
}
