package regular;


public class Cube {
    int side;

    Cube(int side){
        this.side = side;
    }


    public int volume (){
        return (int) Math.pow(this.side, 3);
    }
}
