package com.arthy.BasicPrograms;

public class MultiInheri {
    public static void main(String[] args) {
        BabyDog b = new BabyDog();
        b.weep();
        b.Eat();
        b.Bark();
    }
}
class Animals{
    void Eat(){
        System.out.println("Eating...");
    }
}
class Dogs extends Animals{
    void Bark(){
        System.out.println("Barking...");
    }
}
class BabyDog extends Dogs{
    void weep(){
        System.out.println("Weeping...");
    }
}
