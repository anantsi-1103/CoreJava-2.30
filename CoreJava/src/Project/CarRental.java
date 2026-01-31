package Project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarRental {
    public static void main(String[] args) {
        CarRentalSystem carRentalSystem = new CarRentalSystem();

        carRentalSystem.addCar(new Car("C101", "Toyota", "Fortuner", 4500));
        carRentalSystem.addCar(new Car("C102", "Mahindra", "Roxx", 5000));
        carRentalSystem.addCar(new Car("C103", "Maruti", "Baleno", 3000));
        carRentalSystem.addCar(new Car("C104", "Kia", "Seltos", 4000));
        carRentalSystem.addCar(new Car("C105", "Honda", "City", 5500));

        carRentalSystem.menu();
    }
}

// ---------------- CAR ----------------
class Car {
    private String carID;
    private String brand;
    private String model;
    private double pricePerDay;
    private boolean available;

    public Car(String carID, String brand, String model, double pricePerDay) {
        this.carID = carID;
        this.brand = brand;
        this.model = model;
        this.pricePerDay = pricePerDay;
        this.available = true;
    }

    public String getCarID() {
        return carID;
    }

    public String getDetails() {
        return brand + " " + model + " (Rs." + pricePerDay + "/day)";
    }

    public boolean isAvailable() {
        return available;
    }

    public double calculatePrice(int days) {
        return pricePerDay * days;
    }

    public void rentCar() {
        available = false;
    }

    public void returnCar() {
        available = true;
    }
}

// ---------------- CUSTOMER ----------------
class Customer {
    private static int counter = 1;
    private String customerID;
    private String name;

    public Customer(String name) {
        this.customerID = "CUS" + counter++;
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// ---------------- RENTAL ----------------
class Rental {
    private Car car;
    private Customer customer;
    private int days;

    public Rental(Car car, Customer customer, int days) {
        this.car = car;
        this.customer = customer;
        this.days = days;
    }

    public Car getCar() {
        return car;
    }
}

// ---------------- SYSTEM ----------------
class CarRentalSystem {
    private List<Car> cars = new ArrayList<>();
    private List<Rental> rentals = new ArrayList<>();

    Scanner s = new Scanner(System.in);

    public void addCar(Car car) {
        cars.add(car);
    }

    public void viewAllCars() {
        System.out.println("\n====== All Cars ======");

        if (cars.isEmpty()) {
            System.out.println("No Cars Available");
            return;
        }

        for (Car c : cars) {
            System.out.println("Car ID : " + c.getCarID());
            System.out.println("Car    : " + c.getDetails());
            System.out.println("Status : " + (c.isAvailable() ? "Available" : "Not Available"));
            System.out.println("-------------------------");
        }
    }

    public void rentCar() {
        System.out.print("Enter your name: ");
        String name = s.nextLine();

        Customer customer = new Customer(name);
        viewAllCars();

        System.out.print("Enter Car ID to rent: ");
        String carID = s.nextLine();

        Car selected = null;

        for (Car c : cars) {
            if (c.getCarID().equalsIgnoreCase(carID) && c.isAvailable()) {
                selected = c;
                break;
            }
        }

        if (selected == null) {
            System.out.println("Car not available or invalid ID!");
            return;
        }

        System.out.print("Enter number of days: ");
        int days = s.nextInt();
        s.nextLine();

        double bill = selected.calculatePrice(days);

        System.out.println("\n====== BILL ======");
        System.out.println("Customer : " + name);
        System.out.println("Car      : " + selected.getDetails());
        System.out.println("Days     : " + days);
        System.out.println("Total    : Rs. " + bill);

        System.out.print("Confirm Booking (Y/N): ");
        String confirm = s.nextLine();

        if (confirm.equalsIgnoreCase("Y")) {
            selected.rentCar();
            rentals.add(new Rental(selected, customer, days));
            System.out.println("Car Rented Successfully!");
        } else {
            System.out.println("Booking Cancelled.");
        }
    }

    public void returnCar() {
        System.out.print("Enter Car ID to return: ");
        String carID = s.nextLine();

        for (Rental r : rentals) {
            if (r.getCar().getCarID().equalsIgnoreCase(carID)) {
                r.getCar().returnCar();
                rentals.remove(r);
                System.out.println("Car Returned Successfully!");
                return;
            }
        }
        System.out.println("Car not found or not rented.");
    }

    public void menu() {
        while (true) {
            System.out.println("\n====== Car Rental System ======");
            System.out.println("1. View All Cars");
            System.out.println("2. Rent a Car");
            System.out.println("3. Return a Car");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            int choice = s.nextInt();
            s.nextLine();

            switch (choice) {
                case 1 -> viewAllCars();
                case 2 -> rentCar();
                case 3 -> returnCar();
                case 4 -> {
                    System.out.println("Thank you for using Car Rental System!");
                    return;
                }
                default -> System.out.println("Invalid Choice!");
            }
        }
    }
}
