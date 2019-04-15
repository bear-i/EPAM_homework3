package com.epam.Observer;

public class PublishingHouse extends Thread {
    Post post;

    PublishingHouse(Post post){
        this.post = post;
    }

    @Override
    public void run() {
        int i = 0;
        while(i<10){
            System.out.println("Publishing house have done new publication.");
            post.getNewPublication();
            i++;
            try{
                this.sleep(7000);
            }catch(InterruptedException e){
                System.out.println("Thread was interrupted");
            }
        }
    }
}
