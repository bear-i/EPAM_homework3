package com.epam.Observer;

public interface Notifier {
    public void register(Observer obj);
    public void unregister(Observer obj);
    public void notifyObservers();
    public void getUpdate();
}
