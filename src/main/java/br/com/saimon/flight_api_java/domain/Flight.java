package br.com.saimon.flight_api_java.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

@Document
@Getter
@Setter
public class Flight {
    @Id
    private String id;

    private HashMap<String, String> origin;

    private HashMap<String, String> destination;

    private String travelAt;

    private Integer timeGoing;

    private Integer timeReturn;

    private Long price;

    private ArrayList<String> airlines;
}
