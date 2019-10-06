import firstNameValidation.java
import lastNameValidation.java
import emailValidation.java

public class user{

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
        this(1, "Abby", "Snopek", "asnopek@wctc.edu")
    }

    private interfaceValidation validation;

    public user(interfaceValidation validation){
        this.validation=validation;
    }

    public Boolean isFirstNameValid()
    {
        return validation.validation(firstName)
    }

    public Boolean isLastNameValid()
    {
        return validation.validation(lastName)
    }

    public Boolean isEmailValid(){
        return validation.validation(email)
    }


}