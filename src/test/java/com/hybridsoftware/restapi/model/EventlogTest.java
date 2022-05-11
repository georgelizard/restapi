package com.hybridsoftware.restapi.model;

import org.jeasy.random.EasyRandom;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.Scope;

@Scope("test")
class EventlogTest {

  @Test
  void shouldCreateEventlog(){
    EasyRandom generator = new EasyRandom();
    Assertions.assertNotNull(generator.nextObject(Eventlog.class));
  }

  @Test
  void shouldBuildEventlog(){
    Assertions.assertNotNull(Eventlog.builder().build());
  }
}
