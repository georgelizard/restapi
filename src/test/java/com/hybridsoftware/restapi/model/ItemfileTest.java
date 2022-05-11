package com.hybridsoftware.restapi.model;

import org.jeasy.random.EasyRandom;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.Scope;

@Scope("test")
class ItemfileTest {

  @Test
  void shouldCreateItemfile(){
    EasyRandom generator = new EasyRandom();
    Assertions.assertNotNull(generator.nextObject(Itemfile.class));
  }

  @Test
  void shouldBuildItemfile(){
    Assertions.assertNotNull(Itemfile.builder().build());
  }
}
