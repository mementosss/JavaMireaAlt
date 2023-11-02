package Study_Java.Task2;

public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        if (gender == 'M' || gender == 'F' || gender == 'U') {
            this.gender = gender;
        } else {
            throw new IllegalArgumentException("Incorrect value for the field. Try using 'M', 'F' or 'U'.");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (gender == 'M' || gender == 'F' || gender == 'U') {
            this.gender = gender;
        } else {
            throw new IllegalArgumentException("Incorrect value for the field. Try using 'M', 'F' or 'U'.");
        }
    }

    @Override
    public String toString() {
        return "Author - " + name + "(" + gender + ")" + ", at " + email;
    }
}