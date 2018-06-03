package com.example.learn;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepository extends JpaRepository<HotelBooking,Long> {
    List<HotelBooking> findByPricePerNightLessThan(double price);

}
