package com.pluralsight;

import com.sun.jdi.JDIPermission;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        int numberOfVehicles = 6;
        Vehicle[] vehiclesList = new Vehicle[20];

        vehiclesList[0] = new Vehicle(123, "Ford Explorer", "Blue", 160000, 7000);
        vehiclesList[1] = new Vehicle(456, "Toyota Camry", "Blue", 160000, 7000);
        vehiclesList[2] = new Vehicle(789, "Chevrolet Malibu", "Blue", 160000, 7000);
        vehiclesList[3] = new Vehicle(123, "Honda Civic", "Blue", 160000, 7000);
        vehiclesList[4] = new Vehicle(456, "Subaru Outback", "Blue", 160000, 7000);
        vehiclesList[5] = new Vehicle(789, "Jeep Wrangler", "Blue", 160000, 7000);

        String mainMenuText = """
                What do you want to do?
                1 - List all vehicles
                2 - Search by make/model
                3 - Search by price range
                4 - Search by color
                5 - Add a vehicle
                6 - Quit
                Enter your command:
                """;

        int choice;

        do {
            choice = Console.promptForInt(mainMenuText);

            switch (choice) {
                case 1 -> processListAllVehicles(vehiclesList, numberOfVehicles);
                case 2 -> processSearchByMakeModel(vehiclesList, numberOfVehicles);
                case 3 -> processSearchByPrice(vehiclesList, numberOfVehicles);
                case 4 -> processSearchByColor(vehiclesList, numberOfVehicles);
                case 5 -> processAddVehicle(vehiclesList, numberOfVehicles);
                case 6 -> System.out.println("Have a Blessed Day!");
                default -> System.out.println("Invalid command, please try again...");
            }

        } while (choice != 6);

    }

    private static void displayVehicle(Vehicle vehicle) {
        System.out.println(
                "Vehicle Id: " + vehicle.getVehicleId()
                        + " Make Model: " + vehicle.getMakeModel()
                        + " Color: " + vehicle.getColor()
                        + " Odometer Reading: " + vehicle.getOdometerReading()
                        + " Price: " + vehicle.getPrice());
    }

    private static void displayModels(Vehicle vehicle) {
        System.out.println("Make Model: " + vehicle.getMakeModel());
    }

    private static void displayPriceRange(Vehicle vehicle) {
        System.out.println("Price: " + vehicle.getPrice());
    }

    private static void displayVehicleColors(Vehicle vehicle) {
        System.out.println("Color: " + vehicle.getColor());
    }

    private static void processListAllVehicles(Vehicle[] vehiclesList, int numberOfVehicles) {
        for (int i = 0; i < numberOfVehicles; i++) {
            displayVehicle(vehiclesList[i]);
        }
    }

    private static void processSearchByMakeModel(Vehicle[] vehiclesList, int numberOfVehicles) {
        for (int i = 0; i < numberOfVehicles; i++) {
            displayModels(vehiclesList[i]);
        }
    }

    private static void processSearchByPrice(Vehicle[] vehiclesList, int numberOfVehicles) {
        for (int i = 0; i < numberOfVehicles; i++) {
            displayPriceRange(vehiclesList[i]);
        }
    }

    private static void processSearchByColor(Vehicle[] vehiclesList, int numberOfVehicles) {
        for (int i = 0; i < numberOfVehicles; i++) {
            displayVehicleColors(vehiclesList[i]);
        }
    }

    private static void processAddVehicle(Vehicle[] vehiclesList, int numberOfVehicles) {


        int vehicleId = Console.promptForInt("Enter Vehicle ID: ");
        String makeModel = Console.promptForString("Enter Make/Model: ");
        String color = Console.promptForString("Enter Color: ");
        int odometerReading = Console.promptForInt("Enter Odometer Reading: ");
        double price = Console.promptForDouble("Enter Price: ");

        Vehicle newVehicle = new Vehicle(vehicleId, makeModel, color, odometerReading, price);

        for (int i = 0; i < vehiclesList.length; i++) {
            if (vehiclesList[i] == null) {
                vehiclesList[i] = newVehicle;
                System.out.println("Vehicle added successfully!");
                return;
            }
        }

        System.out.println("Inventory is full.");
    }
}