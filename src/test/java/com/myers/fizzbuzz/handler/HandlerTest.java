package com.myers.fizzbuzz.handler;

import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertEquals;

public class HandlerTest {
    private static final String result = "SUCCESS";

    @Test
    public void testFunctionIsLastThingCalled() {
        Handler handler = new Handler(null, (Integer x) -> Optional.of(result));
        assertEquals(result, handler.handle(1));
    }

    @Test
    public void testNextHandlerIsLastThingCalled() {
        Handler handlerBase = new Handler(null, (Integer x) -> Optional.of(result));
        Handler handler = new Handler(handlerBase, (Integer x) -> Optional.empty());
        assertEquals(result, handler.handle(1));
    }

    @Test(expected = NullPointerException.class)
    public void testExceptionIsThrownIfNoHandlerIsFound() {
        Handler handler = new Handler(null, (Integer x) -> Optional.empty());
        handler.handle(1);
    }
}
