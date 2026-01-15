package com.hotel.HotelAccessPlatform.controller;

import com.hotel.HotelAccessPlatform.custom_exceptions.ResourceNotFoundException;
import com.hotel.HotelAccessPlatform.model.Guest;
import com.hotel.HotelAccessPlatform.service.GuestService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
public class GuestController {
    private final GuestService guestService;
    public GuestController(GuestService guestService){
        this.guestService = guestService;
    }

    @GetMapping("/guests")
    public ResponseEntity<List<Guest>> getGuests(){
        System.out.println("Getting all guests");
        List<Guest> list = guestService.getAllGuests();
        System.out.println("Getting all guests done");
        if (list.isEmpty()) {
            System.out.println("No guests found");
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
        return ResponseEntity.ok(list);
    }

    @GetMapping("/guests/{id}")
    public ResponseEntity<Guest> getGuestById(@PathVariable Long id){
        System.out.println("Getting guest by id");
        Guest guest = guestService.getGuestById(id);
        return ResponseEntity.ok(guest);
    }

    @PutMapping("/guests/{id}")
    public ResponseEntity<?> updateGuest(@PathVariable Long id, @RequestBody Guest guestData){
        System.out.println("Updating guest");
        Guest updateStatus = guestService.updateGuest(id, guestData);
        return ResponseEntity.ok(updateStatus);
    }
}
