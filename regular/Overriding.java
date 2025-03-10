package regular;


class A{
    void display(){
        System.out.println("A class");
    }
}

class B extends A{
    @Override
    void display(){
        System.out.println("B class");
    }
}


public class Overriding {

    public static void main(String[] args) {
        B obj = new B();
        obj.display();
    }
    
}
