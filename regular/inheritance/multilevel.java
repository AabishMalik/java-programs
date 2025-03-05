package regular.inheritance;

class Parent{
    Parent(){
        System.out.println("Parent class constructor");
    }

    public void display(){
        System.out.println("Parent class");
    }
}


class Child extends Parent{
    Child(){
        System.out.println("Child class constructor");
    }
    
    @Override
    public void display(){
        System.out.println("Child class");
    }

}

public class multilevel extends Child {
    multilevel(){
        System.out.println("Multilevel class constructor");
    }

    @Override
    public void display(){
        System.out.println("Multilevel class");
    }

    public static void main(String[] args) {
        multilevel obj = new multilevel();

        obj.display();
    }
    
}
