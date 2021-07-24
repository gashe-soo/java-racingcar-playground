package racing;

public final class Name {
    private final String name;

    public Name(String name) {
        validateName(name);
        this.name = name;
    }

    private void validateName(String name) {
        if (name == null || name.isEmpty())
            throw new IllegalArgumentException("이름은 공백일 수 없습니다.");
        if (name.length() > 5)
            throw new IllegalArgumentException("이름은 5자이하이어야 합니다.");

    }


}
