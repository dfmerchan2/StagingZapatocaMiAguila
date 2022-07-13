package co.com.staging.zapatoca.miaguila.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class User {

    private final String name;
    private final String firstSurname;
    private final String secondSurname;
    private final String documentType;
    private final String documentNumber;
    private final String email;
    private final String phone;
    private final String password;

    public User(Map<String, String> userData) {
        this.name = userData.get("name");
        this.firstSurname = userData.get("firstSurname");
        this.secondSurname = userData.get("secondSurname");
        this.documentType = userData.get("documentType");
        this.documentNumber = userData.get("documentNumber");
        this.email = userData.get("email");
        this.phone = userData.get("phone");
        this.password = userData.get("password");
    }

    public String getName() {
        return name;
    }

    public String getFirstSurname() {
        return firstSurname;
    }

    public String getSecondSurname() {
        return secondSurname;
    }

    public String getDocumentType() {
        return documentType;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getPassword() {
        return password;
    }

    public static List<User> getUser(List<Map<String, String>> creditCardList) {
        List<User> users = new ArrayList<>();
        creditCardList.forEach(i -> users.add(new User(i)));
        return users;
    }

}
