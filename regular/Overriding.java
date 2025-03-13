package regular;


class A{
    void display(){
        System.out.println("A class");
    }

    Number add(int a, int b){
        return a+b;
    }
}

class B extends A{

    // explicit overriding 
    @Override
    void display(){
        System.out.println("B class");
    }

    // implicit overriding + overloading
    float add(float a, float b){
        return a+b;
    }

}


public class Overriding {

    public static void main(String[] args) {
        B obj = new B();
        obj.display();
    }
    
}
