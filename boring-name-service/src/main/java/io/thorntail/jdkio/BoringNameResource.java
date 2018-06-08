package io.thorntail.jdkio;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.eclipse.microprofile.metrics.annotation.Counted;

/**
 * @author Ken Finnigan
 */
@Path("/")
public class BoringNameResource {

    @Inject
    @ConfigProperty(name = "myapp.default-name", defaultValue = "John")
    private String defaultName;

    @GET
    @Path("/name")
    @Produces(MediaType.TEXT_PLAIN)
    @Counted(name = "boringCount",
            absolute = true,
            description = "# calls to BoringService",
            monotonic = true)
    public String boring() {
        return defaultName;
    }
}
