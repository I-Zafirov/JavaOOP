package T07Inheritance.lab.L01SingleInheritance;

public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.print("Sharo is ");
        super.eat();
    }

    public void bark() {
        System.out.println("barking...");
    }
}
