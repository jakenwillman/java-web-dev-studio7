package org.launchcode.studio7;

public interface OpticalDisc {
    int cdSpinSpeed = 500; // RPM
    int dvdSpinSpeed = 1600; // RPM
    int cdStorageCapacity = 700; // MB
    int dvdStorageCapacity = 5000; // MB

    void spinDisc();
    void play();
    void stop();
    void readData();
    void storeData();
    void displayInfo();

}
