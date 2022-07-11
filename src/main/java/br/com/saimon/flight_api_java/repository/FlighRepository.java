package br.com.saimon.flight_api_java.repository;

import br.com.saimon.flight_api_java.domain.Flight;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FlighRepository extends MongoRepository<Flight, String> {
}
