package org.example.api;


import graphql.kickstart.tools.GraphQLMutationResolver;
import lombok.RequiredArgsConstructor;
import org.example.dto.VehicleDto;
import org.example.entity.Vehicle;
import org.example.repository.VehicleRepository;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.time.LocalDate;

/**
 * save update işlemleri
 */

public class VechileMutationResolver implements GraphQLMutationResolver {




}
