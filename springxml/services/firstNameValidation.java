
//service
public class firstNameValidation implements interfaceValidation {
    @Override
    public Boolean validation(String input) {

        if(input == null)
        {
            return false;
        }
        return true;
    }
}