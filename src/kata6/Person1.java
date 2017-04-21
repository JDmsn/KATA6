package kata6;

public class Person1 {
    private final String name;
    private final int id;
    private final String gender;
    private final Float weight;
    private final String mail;
    private final String birthdate;

    public Person1(Integer id, String name, String gender, String birthdate, Float weight, String mail) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birthdate = birthdate;
        this.weight = weight;
        this.mail = mail;
    }

    public int getId() {
        return id;
    }

    public String getGender() {
        return gender;
    }
    
    public String getName() {
        return name;
    }

    public Float getWeight() {
        return weight;
    }


    public String getBirthdate() {
        return birthdate;
    }

    public String getMail() {
        return mail;
    }

}