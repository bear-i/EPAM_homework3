package com.epam.FactoryMethod;

import com.epam.FactoryMethod.creators.StandartFigureCreator;
import com.epam.FactoryMethod.creators.SuperFigureCreator;

public class Main {
    public static void main(String[] args) {
        StandartFigureCreator standartFigureCreator = new StandartFigureCreator();
        SuperFigureCreator superFigureCreator = new SuperFigureCreator();
        while (true) {
            int random = (int) Math.round((Math.random() * 10));
            if(random<9){
                System.out.println(standartFigureCreator.createFigure());
            }else{
                System.out.println(superFigureCreator.createFigure());
            }
            try{
                Thread mainThread = Thread.currentThread();
                mainThread.sleep(600);
            }catch(InterruptedException e){
                System.out.println("Thread was interrupted");
            }
        }
    }
}
