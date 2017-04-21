package kata6;

public class Person {
    private final String ml;
    private final Integer id;

    public Person(Integer id, String ml) {
        this.id = id;
        this.ml = ml;
    }
    public String getMail() {
        return ml;
    }

    public Integer getId() {
        return id;
    }
}