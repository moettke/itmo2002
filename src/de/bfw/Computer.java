package de.bfw;

public class Computer {
    private int ram;
    private String name;

    public Computer(int ram, String name){
        this.ram = ram;
        this.name = name;
    }

    public int getRam() {
        return ram;
    }

    public String getName() {
        return name;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setName(String name) {
        this.name = name;
    }
}
