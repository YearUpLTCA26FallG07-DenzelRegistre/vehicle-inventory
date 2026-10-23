package com.pluralsight;

public class Vehicle {
    private int vehicleId;
    private String makeModel;
    private String color;
    private int odometerReading;
    private double price;

    public Vehicle(int vehicleId, String makeModel, String color,
                       int odometerReading, double price){
        this.vehicleId = vehicleId;
        this.makeModel = makeModel;
        this.color = color;
        this.odometerReading = odometerReading;
        this.price = price;

    }


    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int newVehicleId){
        this.vehicleId = newVehicleId;
    }

    public String getMakeModel(){
        return makeModel;
    }

    public void setMakeModel(String newMakeModel){
        this.makeModel = newMakeModel;

    }

    public String getColor(){
        return color;
    }

    public void setColor(String newColor){
        this.color = newColor;
    }

    public int getOdometerReading(){
        return odometerReading;
    }

    public void setOdometerReading(int newOdometerReading){
        this.odometerReading = newOdometerReading;

    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double newPrice){
        this.price = newPrice;
    }






}


