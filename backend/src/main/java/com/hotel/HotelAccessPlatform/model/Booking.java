package com.hotel.HotelAccessPlatform.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Booking {
    @Id
    private Long id;
    private Long guestId;
    private Long roomNumber;
    private Long checkInDate;
    private Long checkOutDate;
    @Enumerated(EnumType.STRING)
    private BookingStatus status;
    private Long createdAt;
    private Long updatedAt;
    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus;
}
