package T07Inheritance.lab.L03HierarchicalInheritance;

import T07Inheritance.lab.L02MultipleInheritance.Puppy;

public class Main {
    public static void main(String[] args) {

       Dog dog = new Dog();

       dog.eat();
       dog.bark();

       Cat cat = new Cat();

       cat.eat();
       cat.meow();
    }
}
