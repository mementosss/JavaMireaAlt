package Study_Java.Task6;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();

        while (true) {
            System.out.println("Choose operation:");
            System.out.println("1. Add new device");
            System.out.println("2. Delete device");
            System.out.println("3. Find device");
            System.out.println("4. Print list of devices");
            System.out.println("5. Exit");
            int choice = shop.getIntInput("Choose number: ");

            switch (choice) {
                case 1:
                    OriginOfPC originOfPC = OriginOfPC.values()[shop.getIntInput("Type manufacturer of PC (number from list): ")];
                    String processorModel = shop.getStringInput("Type model of microchip: ");
                    double processorClockSpeed = shop.getDoubleInput("Type clock speed: ");
                    int memoryCapacity = shop.getIntInput("Type memory reserve (GB): ");
                    String memoryType = shop.getStringInput("Type var of memory type: ");
                    String monitorModel = shop.getStringInput("Type the model of the monitor: ");
                    double monitorSize = shop.getDoubleInput("Type size of monitor: ");

                    Processor processor = new Processor(processorModel, processorClockSpeed);
                    Memory memory = new Memory(memoryCapacity, memoryType);
                    Monitor monitor = new Monitor(monitorModel, monitorSize);
                    Computer computer = new Computer(originOfPC, processor, memory, monitor);

                    shop.addComputer(computer);
                    break;

                case 2:
                    OriginOfPC removeBrand = OriginOfPC.values()[shop.getIntInput("Type manufacturer of PC for deliting (number): ")];
                    Computer removeComputer = shop.findComputer(removeBrand);
                    if (removeComputer != null) {
                        shop.removeComputer(removeComputer);
                    }
                    break;

                case 3:
                    OriginOfPC searchBrand = OriginOfPC.values()[shop.getIntInput("Type manufacturer of PC (number from list): ")];
                    Computer foundComputer = shop.findComputer(searchBrand);
                    if (foundComputer != null) {
                        System.out.println("Information about the found PC:");
                        System.out.println("Manufacturer: " + foundComputer.getOriginOfPC());
                        System.out.println("Microchip: " + foundComputer.getProcessor().getModel());
                        System.out.println("Memory reserve: " + foundComputer.getMemory().getCapacity() + " GB");
                        System.out.println("Monitor: " + foundComputer.getMonitor().getModel() + ", " + foundComputer.getMonitor().getSize());
                    }
                    break;

                case 4:
                    shop.displayComputers();
                    break;

                case 5:
                    System.out.println("Exit from shop.");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Exception. Please choose the correct operation.");
                    break;
            }
        }
    }
}