package com.epam.Observer;

import java.util.ArrayList;
import java.util.List;

public class Post implements Notifier {
    private List<Observer> subscribes = new ArrayList<>();
    private boolean gotNewPublication = false;

    @Override
    public void register(Observer observer) {
        if (observer != null) {
            if(!subscribes.contains(observer)){
                subscribes.add(observer);
            }
        }else{
            System.out.println("Null observer");
        }
    }

    @Override
    public void unregister(Observer observer) {
        subscribes.remove(observer);
    }

    @Override
    public void notifyObservers() {
        if(!gotNewPublication){
            return;
        }
        for(Observer subscriber : subscribes){
            subscriber.update();
        }
        gotNewPublication = false;
    }

    public void getNewPublication(){
        gotNewPublication = true;
        System.out.println("Post have got new publication");
        notifyObservers();
    }

    public void getUpdate(){
        System.out.println("New publication was send to subscriber");
    }
}
