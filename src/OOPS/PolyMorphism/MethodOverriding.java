package OOPS.PolyMorphism;
// Method overriding occurs when a child class provides its own implementation of a method that is already defined in its parent class.
//same name,different class,different implementation.
public class MethodOverriding {
    public static void main(String[] args){
        Animal a = new Animal();
        a.sound();
        Dog d = new Dog();
        d.sound();
    }
}
class Animal{
    void sound(){
        System.out.println("Animal makes sound");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Dog barks");
    }
}