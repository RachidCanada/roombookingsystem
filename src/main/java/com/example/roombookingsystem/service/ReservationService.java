package com.example.roombookingsystem.service;

import com.example.roombookingsystem.model.Reservation;
import com.example.roombookingsystem.repository.ReservationRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ReservationService {
    private final ReservationRepository reservationRepository;

    public ReservationService(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    public List<Reservation> findReservations(Long salleId, LocalDateTime start, LocalDateTime end) {
        return reservationRepository.findBySalleIdAndDateDebutBetween(salleId, start, end);
    }

    public Reservation save(Reservation reservation) {
        return reservationRepository.save(reservation);
    }
}
