package model;

import java.util.function.BiFunction;

public class Calculadora {
    public String calculadora(BiFunction<Integer,Integer,String> biFunction,Integer i1,Integer i2) {
        return  biFunction.apply(i1,i2);
    }

}
