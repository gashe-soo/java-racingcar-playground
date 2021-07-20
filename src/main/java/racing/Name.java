package racing;

public class Name {

    private String name;

    public Name(String name) {
        validName(name);
        this.name = name;
    }

    private void validName(String name) {
        if(name.length()>5)
            throw new IllegalArgumentException("자동차 이름은 5자를 초과할 수 없습니다.");
    }

    public String getName(){
        return this.name;
    }
}
