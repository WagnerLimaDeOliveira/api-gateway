package com.insurance.api_gateway.controller;

import com.insurance.api_gateway.client.CustomerServiceClient;
import com.insurance.api_gateway.client.PolicyServiceClient;
import com.insurance.api_gateway.dto.CustomerDTO;
import com.insurance.api_gateway.dto.CustomerPolicyDTO;
import com.insurance.api_gateway.dto.PolicyDTO;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import java.util.List;

@Path("/api")
public class CustomerPolicyAggregationController {
    @Inject
    @RestClient
    CustomerServiceClient customerServiceClient;

    @Inject
    @RestClient
    PolicyServiceClient policyServiceClient;

    @GET
    @Path("/customer/{id}/details")
    @Produces(MediaType.APPLICATION_JSON)
    public CustomerPolicyDTO customerPolicyAggregation(@PathParam("id") Long id) {
        CustomerDTO customerDTO = customerServiceClient.getCustomerById(id);
        List<PolicyDTO> policyDTO = policyServiceClient.getPoliciesByCustomerId(id);
        return new CustomerPolicyDTO(customerDTO, policyDTO);
    }
}
