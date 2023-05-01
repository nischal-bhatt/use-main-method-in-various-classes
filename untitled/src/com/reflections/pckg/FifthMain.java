package com.reflections.pckg;

public class FifthMain {

    public static void main(String[] args) {


        LambdaExample lambdaExample = (r) -> {
            String r1 = "hey";
            return r+r1 + "bro";
        };

        String b = lambdaExample.x("hello");

        System.out.println(b);
    }
}
