package com.solvd.deliveryservice.lambda;

@FunctionalInterface
public interface Generatable<T> {

   T produce();
}
