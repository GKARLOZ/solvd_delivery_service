package com.solvd.deliveryservice.lambda;

@FunctionalInterface
public interface Detectable <T> {


    boolean detect(T t);

}
