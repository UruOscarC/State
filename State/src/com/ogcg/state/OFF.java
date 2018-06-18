package com.ogcg.state;

class OFF extends State {
    private static OFF instance = new OFF();
    private OFF() { }

    public static State instance() {
        return instance;
    }

    public void push(Button b) {
        b.setCurrent(ON.instance());
        System.out.println("   turning ON");
    }
}
