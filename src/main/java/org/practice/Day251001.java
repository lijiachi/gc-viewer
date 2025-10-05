package org.practice;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

class Animal{
    private String name;
    Animal(String name){
        this.name = name;
    }
}
class Dog extends Animal{
    public Dog(String name){
        super(name);
    }
}
public class Day251001 {
    public static void main(String[] args){
        //常见运算符——略
        //复杂类型隐式转换dog -> animal
        Animal animal = new Dog("动物");
        //复杂类型显式转换animal ->dog
        Dog dog = (Dog)animal;
        //(byte、short和char),进行+等运算时先隐式转换到int
        byte a = 1;
        byte b = 2;
//        byte c = a + b;//a+b时进行了隐式转换byte->int编译错误由此可以倒推一下编译逻辑
        System.out.println("animal:"+animal.getClass());
        System.out.println(byte.class);
        int c = 0;
        System.out.println(c++); // 0
        System.out.println(++c); // 2

    }
    @Test
    public void testType(){
        Animal animal = new Dog("动物");
        Dog dog = (Dog)animal;
        byte a = 1;
        byte b = 2;
        assertEquals("Animal",animal.getClass());
    }
}
