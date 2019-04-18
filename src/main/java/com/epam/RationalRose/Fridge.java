package com.epam.RationalRose;

import java.util.ArrayList;

public class Fridge {
    ArrayList<CoolingChamber> chambers = new ArrayList<CoolingChamber>();
    ElectronicJournal journal;
    USBPort usbPort;

    public Fridge() {
        chambers.add(new CoolingChamber(this));
        chambers.add(new CoolingChamber(this));
        chambers.add(new CoolingChamber(this));
        journal = new ElectronicJournal();
        usbPort = new USBPort();
    }

    public ElectronicJournal getJournal() {
        return journal;
    }

    public void setJournal(ElectronicJournal journal) {
        this.journal = journal;
    }

    public ArrayList<CoolingChamber> getChambers() {
        return chambers;
    }

    public void setChambers(ArrayList<CoolingChamber> chambers) {
        this.chambers = chambers;
    }

    public void addCoolingChamber(CoolingChamber coolingChamber){
        chambers.add(coolingChamber);
    }

    public USBPort getUsbPort() {
        return usbPort;
    }

    public void setUsbPort(USBPort usbPort) {
        this.usbPort = usbPort;
    }

    public class USBPort{
        public void connect(){

        }

        public void dataExchange(){

        }
    }

    public class ElectronicJournal{
        private ArrayList<String> journal = new ArrayList<String>();

        public ArrayList<String> getJournal() {
            return journal;
        }

        public void setJournal(ArrayList<String> journal) {
            this.journal = journal;
        }

        public void makeNotation(String notation){
            journal.add(notation);
        }
    }
}
