package com.example.learn;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class HotelBooking {
    private String hotelName;
    private double pricePerNight;
    private double nbOfNights;
    @Id
    @GeneratedValue(strategy =GenerationType.SEQUENCE)
    private long id;
    public long getId(){
        return id;
    }




    public String getHotelName() {
        return hotelName;
    }
    public HotelBooking(){

    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public double getNbOfNights() {
        return nbOfNights;
    }

    public double getTotalPrice(){
        return pricePerNight*nbOfNights;
    }

    public void setNbOfNights(double nbOfNights) {
        this.nbOfNights = nbOfNights;
    }

    public HotelBooking(String hotelName, double  pricePerNight, double nbOfNights) {

        this.hotelName = hotelName;
        this.pricePerNight = pricePerNight;
        this.nbOfNights = nbOfNights;
    }
}
