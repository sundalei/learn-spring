package com.example.data;

import java.sql.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ReservationRepository extends CrudRepository<Reservation, Long> {
    
    List<Reservation> findReservationByDate(Date date);
}
