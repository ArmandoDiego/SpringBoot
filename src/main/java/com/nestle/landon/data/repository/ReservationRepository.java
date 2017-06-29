package com.nestle.landon.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nestle.landon.data.entity.Reservation;

import java.sql.Date;
import java.util.List;

@Repository
public interface ReservationRepository extends CrudRepository<Reservation, Long> {
    List<Reservation> findByDate(Date date);
}