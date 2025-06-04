abstract class abstractClass {
    abstract void abstractMethod(); // Abstract method must be implemented by subclasses
    
    void concreteMethod() { // Concrete method inside the abstract class
        System.out.println("This is a concrete method.");
    }
}

class B extends abstractClass {
    void abstractMethod() { // Implementing the abstract method
        System.out.println("B's implementation of abstractMethod.");
    }
}

class C extends abstractClass {
    @Override
    void abstractMethod() { // Implementing the abstract method
        System.out.println("C's implementation of abstractMethod.");
    }
}

public class Task14 {
    public static void main(String args[]) {
        B b = new B();
        b.abstractMethod();
        b.concreteMethod();
        
        C c = new C();
        c.abstractMethod();
        c.concreteMethod();
    }
}
