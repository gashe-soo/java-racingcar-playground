package racing;

public class Car {

    private static final int HURDLE = 4;
    private Name name;
    private int pos;

    public Car(String name) {
        this.name = new Name(name);
        this.pos = 0;
    }

    public void move(int number) {
        if(number>=HURDLE){
            pos++;
        }
    }

    public int getNow() {
        return pos;
    }
}
