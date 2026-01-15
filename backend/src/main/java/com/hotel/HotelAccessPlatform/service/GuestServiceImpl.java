package com.hotel.HotelAccessPlatform.service;

import com.hotel.HotelAccessPlatform.model.Guest;
import com.hotel.HotelAccessPlatform.repository.GuestRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GuestServiceImpl implements GuestService{
    private final GuestRepository guestRepository;
    public GuestServiceImpl(GuestRepository guestRepository) {
        this.guestRepository = guestRepository;
    }

    @Override
    public List<Guest> getAllGuests(){
        System.out.println("Getting all service");
        return guestRepository.findAll();
    }
    @Override
    public Guest getGuestById(Long id){
        return guestRepository.findById(id).orElseThrow(() -> new RuntimeException("Guest not found"));
    }

    @Override
    public Guest saveGuest(Guest guest){
        Guest savedGuest = guestRepository.save(guest);
        return savedGuest;
    }

    @Override
    public Guest updateGuest(Long id, Guest guestData){
        Guest updateGuest = guestRepository.findById(id).get();
        updateGuest.setFirstName(guestData.getFirstName());
        updateGuest.setLastName(guestData.getLastName());
        updateGuest.setEmail(guestData.getEmail());
        updateGuest.setPhoneNumber(guestData.getPhoneNumber());
        return guestRepository.save(updateGuest);
    }

    @Override
    public void deleteGuest(Long id){
        guestRepository.deleteById(id);
    }
}
