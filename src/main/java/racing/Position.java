package racing;

public class Position {

    private int pos;

    public Position() {
        this.pos = 0;
    }

    public void go(int movement) {
        if(movement<0)
            throw new IllegalArgumentException("전진하는 수는 0이상이어야 합니다.");
        pos += movement;
    }

    public int now() {
        return this.pos;
    }
}
