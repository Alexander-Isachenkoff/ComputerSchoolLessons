package lesson2_classes;

public class Person {
    private String firstName;
    private String lastName;
    private Gender gender;
    private int age;
    private String phoneNumber;
    private String email;
    private String address;

    public Person(String firstName, String lastName, Gender gender, int age, String phoneNumber, String email, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
    }

    String getInfo() {
        String info = "";
        info += "Имя:     " + firstName + "\n";
        info += "Фамилия: " + lastName + "\n";
        info += "Пол:     " + gender.genderName + "\n";
        info += "Возраст: " + age + "\n";
        info += "Телефон: " + phoneNumber + "\n";
        info += "email:   " + email + "\n";
        info += "Адрес:   " + address;
        return info;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return getInfo();
    }

}

enum Gender {
    MALE("Мужской"), FEMALE("Женский");

    String genderName;

    Gender(String genderName) {
        this.genderName = genderName;
    }
}
