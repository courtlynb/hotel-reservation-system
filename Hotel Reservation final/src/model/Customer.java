package model;

import java.util.regex.Pattern;

public class Customer {
    private String email;
    private String firstName;
    private String lastName;
    private final String emailRegex = "^(.+)@(.+).(.+)$";
    private final Pattern pattern = Pattern.compile(emailRegex);


    public Customer (String email, String firstName, String lastName){
        if (!pattern.matcher(email).matches()){
            throw new IllegalArgumentException("Error, invalid email. Try again.");
        }

        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
    }
     public String getEmail(){
        return email;
     }

     public String getFirstName(){
        return firstName;
     }

     public String getLastName(){
        return lastName;
     }

    @Override
    public String toString() {
        return "First Name: " + firstName + " Last Name: " + lastName + " Email: " + email;
    }

}
