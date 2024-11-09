package com.insurance.api_gateway.client;

import com.insurance.api_gateway.dto.PolicyDTO;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import java.util.List;

@Path("/customer")
@RegisterRestClient(configKey="policy-service")
public interface PolicyServiceClient {
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    List<PolicyDTO> getPoliciesByCustomerId(@PathParam("id") Long customerId);
}

