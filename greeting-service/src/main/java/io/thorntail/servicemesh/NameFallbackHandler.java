package io.thorntail.servicemesh;

import org.eclipse.microprofile.faulttolerance.ExecutionContext;
import org.eclipse.microprofile.faulttolerance.FallbackHandler;

/**
 * @author Ken Finnigan
 */
public class NameFallbackHandler implements FallbackHandler<String> {
    @Override
    public String handle(ExecutionContext context) {
        return "FALLBACK";
    }
}
