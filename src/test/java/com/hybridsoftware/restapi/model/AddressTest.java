package com.hybridsoftware.restapi.model;

import org.jeasy.random.EasyRandom;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.Scope;

@Scope("test")
class AddressTest {

  @Test
  void shouldCreateAddress(){
    EasyRandom generator = new EasyRandom();
    Assertions.assertNotNull(generator.nextObject(Address.class));
  }

  @Test
  void shouldBuildAddress(){
    Assertions.assertNotNull(Address.builder().build());
  }
}
