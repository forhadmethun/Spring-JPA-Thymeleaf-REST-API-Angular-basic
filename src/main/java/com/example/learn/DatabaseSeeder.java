package com.example.learn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DatabaseSeeder implements CommandLineRunner {
    private BookingRepository bookingRepository;

    @Autowired
    public DatabaseSeeder(BookingRepository bookingRepository){
        this.bookingRepository = bookingRepository;
    }


    @Override
    public void run(String... args) throws Exception {

        List<HotelBooking> bookingList = new ArrayList<>();
        bookingList.add(new HotelBooking("Marriot",200.50,3));
        bookingList.add(new HotelBooking("Ibis",90,4));
        bookingList.add(new HotelBooking("Novoratar",130,1));


        bookingRepository.saveAll(bookingList);



    }
}