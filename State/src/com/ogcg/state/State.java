package com.ogcg.state;

class State {
    public void push(Button b) {
        b.setCurrent(OFF.instance());
        System.out.println("   turning OFF");
    }
}
