package racing;

import java.util.Objects;

public final class Position {

    private final int pos;

    public Position(){
        this(0);
    }

    public Position(int pos) {
        this.pos = pos;
    }

    public Position add(int distance) {
        return new Position(pos+distance);
    }

    public int now(){
        return pos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return pos == position.pos;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pos);
    }
}
