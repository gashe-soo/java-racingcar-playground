package racing;

public class Car {

    private final Name name;
    private Position position;

    public Car(String name) {

        this.name = new Name(name);
        this.position = new Position();
    }

    public void go(int distance) {
        this.position.go(distance);
    }

    public int getNowPosition() {
        return this.position.now();
    }

    public String getName() {
        return name.getName();
    }

}
