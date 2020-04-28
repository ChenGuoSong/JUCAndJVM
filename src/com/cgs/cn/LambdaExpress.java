package com.cgs.cn;

@FunctionalInterface
interface Foo{

    void sayHello(int a, int b);

}

public class LambdaExpress {

    public static void main(String[] args) {

        Foo foo = (int a,int b) ->{System.out.println("hello");};
        foo.sayHello(1,2);

    }
}
