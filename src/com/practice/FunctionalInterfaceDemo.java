package com.practice;

import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        Predicate<Integer> predicate= (i)-> {return i%2==0;};
        //function
        Function<Integer,Integer> function=(i)->{return i*i;};
        //consumer
        Consumer<Integer> consumer=(i)->{System.out.println(i);};
        //supplier
        Supplier<String> supplier=()->{
            Date date=new Date();
            return date.toString();} ;
        System.out.println(predicate.test(10));
        System.out.println(function.apply(10))  ;
        consumer.accept(20);
        System.out.println(supplier.get());
    }
}
