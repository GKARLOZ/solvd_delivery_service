package com.solvd.deliveryservice.lambda;

import java.util.List;

@FunctionalInterface
public interface Convertable<T, E> {

    E convert(List<T> t);

}
