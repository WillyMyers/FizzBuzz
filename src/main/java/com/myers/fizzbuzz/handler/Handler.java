package com.myers.fizzbuzz.handler;

import java.util.Optional;
import java.util.function.Function;

/**
 * Handler that takes a function to call and another handler to delegate to if necessary.
 * Chain of responsibility with a dash of State pattern thrown in.
 */
public class Handler {

    private Handler next;
    private Function<Integer, Optional<String>> fun;

    public Handler(Handler next, Function<Integer, Optional<String>> fun) {
        this.next = next;
        this.fun = fun;
    }

    public String handle(int value){
        Optional<String> result = fun.apply(value);
        return result.orElseGet(() -> next.handle(value));
    }
}
