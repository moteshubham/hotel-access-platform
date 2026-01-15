package com.hotel.HotelAccessPlatform.service;

import com.hotel.HotelAccessPlatform.model.Guest;

import java.util.List;
import java.util.Optional;

public interface GuestService {
    public List<Guest> getAllGuests();
    public Guest getGuestById(Long id);
    public Guest saveGuest(Guest guestData);
    public Guest updateGuest(Long id, Guest guestData);
    public void deleteGuest(Long id);
}
