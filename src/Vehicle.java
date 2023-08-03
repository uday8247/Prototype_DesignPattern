import java.util.*;

abstract class Vehicle { // Abstract class having declartion of Clone() method

    //class variables
    protected int seats;
    protected int tyres;
    protected String color;
    protected String fuel;

    public Vehicle() { //Default constructor

    }

    public Vehicle(Vehicle v) { //parameterised constructor
        if (v != null) {// Checking passed object is null or not
            // Copying values from original object into the prototyped object
            this.seats = v.seats;
            this.tyres = v.tyres;
            this.color = v.color;
            this.fuel = v.fuel;
        }
    }

    public abstract Vehicle clone();// Abstract Clone() method - Child classes implement this method

    @Override
    public String toString() { // Overriding toString() method so that we can get desired print format
        return "Seats:" + this.seats + "\nTyres:" + this.tyres + "\nColor:" + this.color + "\nFuel :" + this.fuel + "\n";
    }
}

    class Bike extends Vehicle{ // First child class
          public Bike(){ //Default constructor

          }
          public Bike(Bike b){  //parameterised constructor
              super(b); // Calling Parent class to initialize the object
          }
          @Override
        public Vehicle clone(){
              return new Bike(this); // Cloning current object with exact same functionality
          }
    }

    class Car extends Vehicle{ // Second child class
    public Car(){

    }
    public Car(Car c){
        super(c);
    }
    @Override
        public Vehicle clone(){
        return new Car(this);
    }
    }

