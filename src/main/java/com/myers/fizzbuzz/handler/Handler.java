package com.myers.fizzbuzz.handler;

import java.util.Optional;
import java.util.function.Function;

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
