package de.bfw;

public class Smartphone extends Computer {
    private double diagonale;

    public Smartphone(int ram, String name) {
        super(ram, name);

    }

    public double getDiagonale() {
        return diagonale;
    }

    public void setDiagonale(double diagonale) {
        this.diagonale = diagonale;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + "\n" +
                "RAM: " + getRam() + "\n" +
                "Diagonale: " + diagonale +"\n" +
                "#########################";
    }
}
