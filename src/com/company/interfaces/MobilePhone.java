package com.company.interfaces;

public class MobilePhone implements ITelephone {

    private int myNymber;
    private boolean isRinging;
    private boolean isOn = false;

    public MobilePhone(int myNymber) {
        this.myNymber = myNymber;
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Mobile Phone powered up");
    }

    @Override
    public void dial(int phoneNumber) {
        if(isOn) {
        System.out.println("Now Ringing " + phoneNumber + " on deskphone");
    }else {
            System.out.println("Phone is switched off");
        }
    }

    @Override
    public void answer() {
        if (isRinging) {
            System.out.println("Answering the mobile phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNymber && isOn) {
            isRinging = true;
            System.out.println("Melody playing");

        } else {
            isRinging = false;
            System.out.println("Mobile phone off, or number is different");
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
