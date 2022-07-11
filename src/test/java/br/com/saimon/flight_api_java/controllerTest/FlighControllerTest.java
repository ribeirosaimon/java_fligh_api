package br.com.saimon.flight_api_java.controllerTest;

import br.com.saimon.flight_api_java.controller.FlightController;
import br.com.saimon.flight_api_java.domain.Flight;
import br.com.saimon.flight_api_java.service.FlightService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class FlighControllerTest {
    @Mock
    public FlightService flightService;

    @Test
    void teste() throws Exception {
        FlightController flightController = new FlightController(flightService);
        ResponseEntity<List<Flight>> response = flightController.getAllFlights();
        Assertions.assertEquals("202", response.getStatusCode().is2xxSuccessful());
    }
}
