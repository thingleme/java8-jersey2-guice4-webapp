package me.thingle.archetypes.guice;

import javax.inject.Singleton;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import me.thingle.archetypes.HelloService;
import me.thingle.archetypes.HelloServiceImpl;
import me.thingle.archetypes.ThrowableMapper;
import me.thingle.archetypes.HelloResource;

public class AppModule extends AbstractModule {

  @Override
  protected void configure() {
    bind(HelloResource.class);

    bind(ThrowableMapper.class);
  }

  @Provides
  @Singleton
  public HelloService helloService() {
    return new HelloServiceImpl();
  }

}
