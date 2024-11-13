package com.example.demo.service.impl;

import com.example.demo.Repository.ReservationRepository;
import com.example.demo.entity.Reservation;
import com.example.demo.service.ReservationService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class ReservationServiceImpl implements ReservationService {

    ReservationRepository reservationRepository;

    @Override
    public Reservation save(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public Reservation findById(String idReservation) {
        return reservationRepository.findById(idReservation).get();
    }

    @Override
    public List<Reservation> findAll() {
        return reservationRepository.findAll();
    }

    @Override
    public void delete(String idReservation) {
        reservationRepository.deleteById(idReservation);
    }
}
