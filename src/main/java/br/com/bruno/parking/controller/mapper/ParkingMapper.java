package br.com.bruno.parking.controller.mapper;

import br.com.bruno.parking.controller.dto.ParkingCreateDTO;
import br.com.bruno.parking.controller.dto.ParkingDTO;
import br.com.bruno.parking.controller.dto.ParkingUpdateDTO;
import br.com.bruno.parking.model.Parking;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ParkingMapper {

    private static final ModelMapper MODEL_MAPPER = new ModelMapper();

    public ParkingDTO toParkingDTO(Parking parking) {
        return MODEL_MAPPER.map(parking, ParkingDTO.class);
    }

    public List<ParkingDTO> toParkingDTOList(List<Parking> parkingList) {
        return parkingList.stream().map(this::toParkingDTO).collect(Collectors.toList());
    }

    public Parking toParking(ParkingDTO dto) {
        return MODEL_MAPPER.map(dto, Parking.class);
    }

    public Parking toParkingCreate(ParkingCreateDTO dto) {
        return MODEL_MAPPER.map(dto, Parking.class);
    }
    
    public Parking toParkingUpdate(ParkingUpdateDTO dto) {
        return MODEL_MAPPER.map(dto, Parking.class);
    }
}
