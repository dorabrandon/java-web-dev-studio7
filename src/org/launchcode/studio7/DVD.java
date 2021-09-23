package org.launchcode.studio7;

public class DVD extends BaseDisc{

    int minRPM= 570;
    int maxRPM = 1600;

    public DVD(String name, double capacity, String contents, String discType, String shape) {
        super(name, capacity, contents, discType, shape);
    }

    @Override
    public void spinDisc() {
        System.out.println("A DVD spins at a rate of "+ this.minRPM +" - " + this.maxRPM+" rpm");
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
