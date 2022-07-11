package br.com.saimon.flight_api_java.service.impl;

import br.com.saimon.flight_api_java.domain.Flight;
import br.com.saimon.flight_api_java.repository.FlighRepository;
import br.com.saimon.flight_api_java.service.FlightService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class FlightServiceImpl implements FlightService {

    private final FlighRepository flighRepository;

    @Override
    public List<Flight> getAllFlights() {
        return flighRepository.findAll();
    }

    @Override
    public Flight getFlighById(String id) {
        return flighRepository.findById(id).orElseThrow(RuntimeException::new);
    }
}
