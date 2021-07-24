package racing;

public class Car {

    private static final int HURDLE = 4;
    private Name name;
    private Position pos;

    public Car(String name) {
        this.name = new Name(name);
        this.pos = new Position();
    }

    public void move(int number) {
        if (number >= HURDLE) {
            pos = pos.add(1);
        }
    }

    public int getNow() {
        return pos.now();
    }
}
