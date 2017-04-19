package me.thingle.archetypes;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class HelloServiceImpl implements HelloService {

  public CompletableFuture<Map<String, Object>> sayHello(String name) {
    return CompletableFuture.supplyAsync(() -> {
      Map<String, Object> result = new HashMap<>();
      result.put("hello", name);
      return result;
    });
  }

}
