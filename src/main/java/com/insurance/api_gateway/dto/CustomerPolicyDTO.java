package com.insurance.api_gateway.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class CustomerPolicyDTO {
    @JsonProperty
    CustomerDTO customer;
    @JsonProperty
    List<PolicyDTO> policies;

    public CustomerPolicyDTO(CustomerDTO customer, List<PolicyDTO> policies) {
        this.customer = customer;
        this.policies = policies;
    }
}
