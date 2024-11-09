package com.insurance.api_gateway.dto;

import java.time.Instant;
import java.util.UUID;

public record PolicyDTO(
        Long customerId,
        UUID policyNumber,
        Instant startDate,
        Instant endDate,
        double premium,
        PolicyStatus status,
        PolicyType policyType
) {}

