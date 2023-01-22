package com.company.interfaces;

public class DeskPhone implements ITelephone {

    private int myNymber;
    private boolean isRinging;

    public DeskPhone(int myNymber) {
        this.myNymber = myNymber;
    }

    @Override
    public void powerOn() {
        System.out.println("No action taken, desk phone doesnt have a power button");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now Ringing " + phoneNumber + " on deskphone");
    }

    @Override
    public void answer() {
        if (isRinging) {
            System.out.println("Answering the desk phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNymber) {
            isRinging = true;
            System.out.println("Ring ring");

        } else {
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
