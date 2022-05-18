package com.jaisoft.junit.services;

import org.junit.Assert;
import org.junit.Test;

public class GreetingServiceUnitTest {

    private GreetingService greetingService = new GreetingService();

    @Test
    public void itShouldSayHolaMundo() {
        Assert.assertEquals("Hola Mundo", greetingService.helloWorld());
    }

}
