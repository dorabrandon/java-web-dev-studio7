package org.launchcode.studio7;

public abstract class BaseDisc implements OpticalDisc{
    String name;
    double capacity;
    String contents;
    String discType;

    public BaseDisc(String name, double capacity, String contents, String discType, String shape) {
        this.name = name;
        this.capacity = capacity;
        this.contents = contents;
        this.discType = discType;
        this.shape = shape;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    String shape;


    public String getName() {
        return name;
    }

    public double getCapacity() {
        return capacity;
    }

    public String getContents() {
        return contents;
    }

    public String getDiscType() {
        return discType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }
}
