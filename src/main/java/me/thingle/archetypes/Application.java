package me.thingle.archetypes;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("/app")
public class Application extends ResourceConfig {

   public Application() {
      register(HelloResource.class);

      register(ThrowableMapper.class);
   }

}
