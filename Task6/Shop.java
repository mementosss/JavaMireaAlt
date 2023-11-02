package Study_Java.Task6;

import java.util.ArrayList;
import java.util.List;

public class Shop implements Interface {
    private List<Computer> computers;

    public Shop() {
        computers = new ArrayList<>();
    }

    public void addComputer(Computer computer) {
        computers.add(computer);
        System.out.println("Succeed.");
    }

    public void removeComputer(Computer computer) {
        if (computers.remove(computer)) {
            System.out.println("Delete complete!");
        } else {
            System.out.println("The device was not found.");
        }
    }

    public Computer findComputer(OriginOfPC originOfPC) {
        for (Computer computer : computers) {
            if (computer.getOriginOfPC() == originOfPC) {
                System.out.println("The PC was found.");
                return computer;
            }
        }
        System.out.println("The PC with manufacturer " + originOfPC + " was not found in this shop.");
        return null;
    }

    public void displayComputers() {
        System.out.println("The list of devices:");
        for (Computer computer : computers) {
            System.out.println("Manufacturer: " + computer.getOriginOfPC());
            System.out.println("Microchip: " + computer.getProcessor().getModel());
            System.out.println("Memory reserve: " + computer.getMemory().getCapacity() + " GB");
            System.out.println("Monitor: " + computer.getMonitor().getModel() + ", " + computer.getMonitor().getSize());
            System.out.println();
        }
    }
}