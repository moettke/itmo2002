package de.bfw;

public class Laptop extends Computer{
    private double gewicht;

    public Laptop(int ram, String name, double gewicht) {
        super(ram, name);
        this.gewicht = gewicht;
    }

    public double getGewicht() {
        return gewicht;
    }

    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + "\n" +
                "RAM: " + getRam() + "\n" +
                "Gewicht: " + gewicht + "\n" +
                "#########################";
    }
}
