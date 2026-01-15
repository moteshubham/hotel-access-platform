package com.hotel.HotelAccessPlatform.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Room {
    @Id
    private Long roomNumber;
    private int floor;
}
