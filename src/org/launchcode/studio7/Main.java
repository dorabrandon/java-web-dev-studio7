package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.

        // TODO: Call each CD and DVD method to verify that they work as expected.
        OpticalDisc disc1 = new CD("My First CD",2,"Audio","CD","round");
        OpticalDisc disc2 = new DVD("My First DVD",700,"Audio/Video","DVD","round");

        disc1.spinDisc();
        disc2.spinDisc();
    }
}
