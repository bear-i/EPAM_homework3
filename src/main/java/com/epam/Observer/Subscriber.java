package com.epam.Observer;

public class Subscriber implements Observer {
    private int id;
    Notifier post;

    public Subscriber(int id) {
        this.id = id;
    }

    @Override
    public void update() {
        post.getUpdate();
        System.out.println("Subscriber " + id + " have got new publication");
    }

    @Override
    public void setNotifier(Notifier post) {
        this.post = post;
    }
}
