package br.com.bruno.parking.model;

import br.com.bruno.parking.controller.dto.ParkingDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
public class Parking {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String license;

    private String state;

    private String model;

    private String color;

    private LocalDateTime entryDate;

    private LocalDateTime exitDate;

    private Double bill;

    public Parking() { }

    public Parking(String id, String license, String state, String model, String color) {
        this.id = id;
        this.license = license;
        this.state = state;
        this.model = model;
        this.color = color;
    }

    public ParkingDTO toParkingDTO() {
        return new ParkingDTO(this.id, this.license, this.state, this.model, this.color);
    }
}
