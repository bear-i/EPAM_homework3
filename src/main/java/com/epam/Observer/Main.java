package com.epam.Observer;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        PublishingHouse publishingHouse = new PublishingHouse(post);

        Observer subscriber1 = new Subscriber(1);
        Observer subscriber2 = new Subscriber(2);
        Observer subscriber3 = new Subscriber(3);

        post.register(subscriber1);
        subscriber1.setNotifier(post);

        post.register(subscriber2);
        subscriber2.setNotifier(post);

        post.register(subscriber3);
        subscriber3.setNotifier(post);

        publishingHouse.start();

        try {
            publishingHouse.join();
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupred");
            e.printStackTrace();
        }
    }
}
