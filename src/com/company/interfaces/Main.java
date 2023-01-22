package com.company.interfaces;

import com.company.interfaces.challenge.Player;
import com.company.interfaces.challenge.Saveable;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ITelephone timsPhone;
        timsPhone = new DeskPhone(123456);
        timsPhone.powerOn();
        timsPhone.callPhone(123456);
        timsPhone.answer();

        timsPhone = new MobilePhone(23456);
        timsPhone.powerOn();
        timsPhone.callPhone(23456);
        timsPhone.answer();

        Player tim = new Player("Tim",10,15);
        System.out.println(tim.toString());
        saveObject(tim);

        tim.setHitPoints(8);
        System.out.println(tim);
        System.out.println("Strom");
        saveObject(tim);
        loadObject(tim);
        System.out.println(tim);
    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" + "1 to enter a String\n " + "0 to quit");

        while(!quit) {
            System.out.println("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a string");
                    String stringInput = scanner.nextLine();
                    values.add(index,stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void saveObject(Saveable objectToSave) {
        for(int i = 0; i< objectToSave.write().size(); i++){
            System.out.printf("Saving" + objectToSave.write().get(i) + " to storage device");
        }
    } // passing on the savable allows to use any object which implements this interface
    // in the above method it's going over each object as its using .write() & saving the player
    // .write() returns a list which we are then using to count the elements

    public static void loadObject(Saveable objectToLoad) {
        ArrayList<String> values = readValues();
        objectToLoad.read(values);

    }
}
