package io.thorntail.servicemesh;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.faulttolerance.Fallback;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

/**
 * @author Ken Finnigan
 */
@RegisterRestClient
@Path("/api")
public interface NameService {

    @GET
    @Path("/name")
    @Produces(MediaType.TEXT_PLAIN)
    @Fallback(NameFallbackHandler.class)
    String getName();

}
