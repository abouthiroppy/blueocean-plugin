package io.jenkins.blueocean.commons;

import javax.annotation.Nonnull;
import java.security.Principal;

/**
 * Represents authenticated user principal
 *
 * @author Vivek Pandey
 */
public final class Identity implements Principal {
    private final String name;

    public Identity(@Nonnull String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    /**
     * Anonymous user's identity. Typically indicates context where there is
     * no logged in user.
     */
    public static final Identity ANONYMOUS = new Identity("anonymous");
}