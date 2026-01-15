package com.hotel.HotelAccessPlatform.repository;

import com.hotel.HotelAccessPlatform.model.Guest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GuestRepository extends JpaRepository<Guest, Long> {
}
