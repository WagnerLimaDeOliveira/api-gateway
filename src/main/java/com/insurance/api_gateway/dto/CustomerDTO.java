package com.insurance.api_gateway.dto;

import java.time.Instant;

public record CustomerDTO(
        Long id,
        String firstName,
        String lastName,
        String email,
        String phoneNumber,
        String address,
        Instant dateOfBirth,
        Instant registrationDate
) {}
