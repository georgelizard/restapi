package com.hybridsoftware.restapi.model;

import org.jeasy.random.EasyRandom;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.Scope;

@Scope("test")
class OrderitemsTest {

  @Test
  void shouldCreateOrderitems(){
    EasyRandom generator = new EasyRandom();
    Assertions.assertNotNull(generator.nextObject(Orderitems.class));
  }

  @Test
  void shouldBuildOrderitems(){
    Assertions.assertNotNull(Orderitems.builder().build());
  }
}
