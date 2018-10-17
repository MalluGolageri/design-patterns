package com.mallu.design.facade;

public class ClientApp {

    public static void main(String[] args) {
        FlightBooking flightBooking = () -> System.out.println("flight package done");
        HotelBooking hotelBooking = () -> System.out.println("hotel package done");
        TravelPackage travelPackage = () -> {
            flightBooking.book();
            hotelBooking.book();
            System.out.println("travel package done");
        };
        travelPackage.book();
    }
}
