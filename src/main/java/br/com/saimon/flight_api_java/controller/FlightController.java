package br.com.saimon.flight_api_java.controller;

import br.com.saimon.flight_api_java.domain.Flight;
import br.com.saimon.flight_api_java.service.FlightService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/flight")
@AllArgsConstructor
public class FlightController {

    private final FlightService flightService;

    @GetMapping("/all")
    public ResponseEntity<List<Flight>> getAllFlights() {
        return ResponseEntity.ok(flightService.getAllFlights());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Flight> getFlighById(@PathVariable String id) {
        return ResponseEntity.ok(flightService.getFlighById(id));
    }

}
