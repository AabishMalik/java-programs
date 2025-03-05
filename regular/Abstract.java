package regular;

abstract class AbstractClass {
    abstract void abstractMethod();
    void concreteMethod() {
        System.out.println("Concrete Method");
    }
}


public class Abstract extends AbstractClass {
    // Overriding abstract method
    void abstractMethod() {
        System.out.println("Abstract Method");
    }

    public static void main(String[] args) {
        // AbstractClass obj = new AbstractClass(); // Compilation error // Cannot create object of abstract class
        Abstract obj = new Abstract();
        obj.abstractMethod();
        obj.concreteMethod();
    }
}
