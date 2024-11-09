package com.insurance.api_gateway.client;


import com.insurance.api_gateway.dto.CustomerDTO;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@Path("/customer")
@RegisterRestClient(configKey = "customer-service")
public interface CustomerServiceClient {
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    CustomerDTO getCustomerById(@PathParam("id") Long id);
}
