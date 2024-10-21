package org.example.api;


import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.RequiredArgsConstructor;
import org.example.dto.VehicleDto;
import org.example.entity.Vehicle;
import org.example.repository.VehicleRepository;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

/**
 * sorgu çekme
 */
@Controller
@RequiredArgsConstructor
public class VehicleQueryResolver implements GraphQLQueryResolver {
    private final VehicleRepository vehicleRepository;

    @QueryMapping
    public List<Vehicle> getVehicles(@Argument String type){
        return vehicleRepository.getByTypeLike(type);
    }

    @QueryMapping
    public Vehicle getById(@Argument Long id) {
        return vehicleRepository.findById(id).orElse(null);
    }

    @MutationMapping
    public Vehicle createVehicle(@Argument VehicleDto vehicleDto) {
        Vehicle vehicle = new Vehicle();
        vehicle.setType(vehicleDto.getType());
        vehicle.setModelCode(vehicleDto.getModelCode());
        vehicle.setBrandName(vehicleDto.getBrandName());
        vehicle.setLaunchDate(LocalDate.now());
        return vehicleRepository.save(vehicle);
    }

}
