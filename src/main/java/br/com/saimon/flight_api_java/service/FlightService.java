package br.com.saimon.flight_api_java.service;

import br.com.saimon.flight_api_java.domain.Flight;

import java.util.List;

public interface FlightService {

    List<Flight> getAllFlights();

    Flight getFlighById(String id);
}
