import java.time.LocalDate;
import java.util.Scanner;

public class Character {
    static int genId = 0;
    private int id;
    private String name;
    private int age;
    private String gender;
    private String model;
    private LocalDate birthday;
    private double spina;

    public Character(String name, int age, String gender, String model, LocalDate birthday) {
        this.id = ++genId;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.model = model;
        this.birthday = birthday;
        this.spina = 10000;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = genId++;
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
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public double getSpina() {
        return spina;
    }

    public void setSpina(double spina) {
        this.spina = spina;
    }

    public Character() {
    }

    @Override
    public String toString() {
        return "Character iD: " + id + "\n" +
                "Tên nhân vật: " + name + "\n" +
                "Tuổi: " + age + "\n" +
                "Giới tính: " + gender + "\n" +
                "Chiều cao: " + model + "\n" +
                "Ngày sinh: " + birthday + "\n" +
                "Spina: " + spina + "\n" +
                "-----------------------------";
    }

}
