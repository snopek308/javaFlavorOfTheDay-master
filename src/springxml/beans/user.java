package springxml.beans;

import springxml.services.emailValidation;
import springxml.services.interfaceValidation;

public class user{

    private int id;
    private String firstName;
    private String lastName;
    private String email;

    public int getID(){
        return id;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getEmail(){
        return email;
    }

    public void setID(int id){
        this.id=id;
    }

    public void setFirstName(String firstName){
        this.firstName=firstName;
    }

    public void setLastName(String lastName){
        this.lastName=lastName;
    }

    public void setEmail(String email){
        this.email=email;
    }

    public user(){
        this.lastName=lastName;
        this.firstName=firstName;
        this.email=email;
        this.id=id;
    }

    private interfaceValidation validation;

    public user(interfaceValidation validation){
        this.validation=validation;
    }

    public Boolean isFirstNameValid()
    {
        return validation.validation(firstName);
    }

    public Boolean isLastNameValid()
    {
        return validation.validation(lastName);
    }

    public Boolean isEmailValid(){
        return validation.validation(email);
    }


}