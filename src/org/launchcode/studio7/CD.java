package org.launchcode.studio7;



public class CD extends BaseDisc{

    int minRPM= 200;
    int maxRPM = 500;

    public CD(String name, double capacity, String contents, String discType, String shape) {
            super(name, capacity, contents, discType, shape);


    }

    @Override
    public void spinDisc() {
        System.out.println("A CD spins at a rate of "+ this.minRPM +" - " + this.maxRPM+" rpm");
    }

    @Override
    public void readDisc() {

    }

    @Override
    public void writeDisc() {

    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
