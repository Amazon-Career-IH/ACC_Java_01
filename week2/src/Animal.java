public class Animal {

    private String name;
    private int age;
    private String gender;


    public Animal(String name, int age, String gender) {
        this.name = name;
        setAge(age);
        this.gender = gender;
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("La edad no puede ser negativa");
        } else this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
