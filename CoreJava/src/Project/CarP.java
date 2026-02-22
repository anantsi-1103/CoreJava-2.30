package CarProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Car Class
class Car {
	private String carID;
	private String brand;
	private String model;
	private double PricePerDay;
	private boolean available;

	public Car(String carID, String brand, String model, double pricePerDay) {
		super();
		this.carID = carID;
		this.brand = brand;
		this.model = model;
		this.PricePerDay = pricePerDay;
		this.available = true;
	}

	public String getCarID() {
		return carID;
	}

	public String getDetails() {
		return brand + " " + model + " (Rs. " + PricePerDay + "/day)";
	}

	public boolean isAvailable() {
		return available;
	}

	public double calculatePrice(int day) {
		return PricePerDay * day;
	}

	public void rentCar() {
		available = false;
	}

	public void returnCar() {
		available = true;
	}
}

// Customer Class

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

// Rental Class
class Rental {
	private Car car;
	private Customer customer;
	private int days;

	public Rental(Car car, Customer customer, int days) {
		super();
		this.car = car;
		this.customer = customer;
		this.days = days;
	}

	public Car getCar() {
		return car;
	}

}

// Payment -
class Payment {

	public static boolean processPayment(double amount, Scanner s) {

		System.out.println(" ----- Payment Portal -----");
		System.out.println("Amount to Pay : Rs" + amount);
		System.out.println("1. UPI");
		System.out.println("2. Credit Card");
		System.out.println("3. Cash");
		System.out.print("Choose Your Payment Method:");

		int choice = s.nextInt();
		s.nextLine(); // next line

		switch (choice) {
		case 1 -> System.out.print("Enter UPI ID");
		case 2 -> System.out.print("Enter Card Number");
		case 3 -> System.out.print("Give Cash");

		default -> {
			System.out.println("Invalid Payment Method");
			return false;
		}
		}

		s.nextLine();

		System.out.println("Processing Payment ......");

		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Payment Successfully");
		return true;
	}
}

// Main System
class CarRentalSystem {

	private List<Car> cars = new ArrayList<Car>();
	private List<Rental> rentals = new ArrayList<Rental>();

	private Scanner s = new Scanner(System.in);

	//
	public void addCar(Car car) {
		cars.add(car);

	}

	public void viewAllCar() {
		System.out.println(" ---- All Car ----");

		if (cars.isEmpty()) {
			System.out.println("No Car is available");
			return;
		}

		for (Car c : cars) {
			System.out.println("Car Id : " + c.getCarID());
			System.out.println("Car  : " + c.getDetails());
			System.out.println("Status : " + (c.isAvailable() ? "Available" : "Rented"));
			System.out.println("---------------------------------");
		}
	}

	public void rentCar() {

		System.out.println("Enter your Name : ");
		String name = s.nextLine();
		Customer cust = new Customer(name);

		viewAllCar();

		System.out.println("Enter your CarID for Rent");
		String CarID = s.nextLine();

		Car selectedCar = null;
		for (Car c : cars) {
			if (c.getCarID().equalsIgnoreCase(CarID) && c.isAvailable()) {
				selectedCar = c;
				break;
			}
		}

		if (selectedCar == null) {
			System.out.println("Car is not Available");
			return;
		}

		System.out.println("Enter number of days");
		int days = s.nextInt();

		s.nextLine();

		double bill = selectedCar.calculatePrice(days);

		System.out.println(" ----- Bill -----");

		System.out.println("Customer : " + name);
		System.out.println("Car : " + selectedCar.getDetails());
		System.out.println("Days : " + days);
		System.out.println("Total : Rs" + bill);

		System.out.println("Proceed To Payment? (Y/N)");
		String confirm = s.nextLine();

		if (confirm.equalsIgnoreCase("Y")) {

			boolean paid = Payment.processPayment(bill, s);

			if (paid) {
				selectedCar.rentCar();
				rentals.add(new Rental(selectedCar, cust, days));
				System.out.println("Car Rented Successfully");
			} else {
				System.out.println("Payment Failed");
			}
		} else {
			System.out.println("Booking Cancelled");
		}

	}

	public void returnCar() {
		System.out.println("Enter your CarID for Rent");
		String CarID = s.nextLine();

		for (Rental r : rentals) {
			if (r.getCar().getCarID().equalsIgnoreCase(CarID)) {
				r.getCar().returnCar();
				rentals.remove(r);
				System.out.println("Car Returned Successfully");
				return;
			}
		}

		System.out.println("Car Not Found");
	}

	public void menu() {

		while (true) {
			System.out.println(" ----- Car Rental System -----");
			System.out.println("1. View Cars");
			System.out.println("2. Rent Car");
			System.out.println("3. Return Car");
			System.out.println("4. Exit");
			System.out.print("Enter Choice: ");

			int choice = s.nextInt();
			s.nextLine();

			switch (choice) {
			case 1 -> viewAllCar();
			case 2 -> rentCar();
			case 3 -> returnCar();
			case 4 -> {
				System.out.println("Thank you for using Car rental System");
				return;
			}
			default -> System.out.println("Invalid Choice");
			}
		}
	}
}

public class CarP {
	public static void main(String[] args) {

		CarRentalSystem cr = new CarRentalSystem();

		cr.addCar(new Car("C101", "Toyota", "Fortuner", 4500));
		cr.addCar(new Car("C102", "Maruti", "Dzire", 2000));
		cr.addCar(new Car("C103", "Honda", "City", 3500));
		cr.addCar(new Car("C104", "Kia", "Seltos", 4000));

		cr.menu();

	}
}
