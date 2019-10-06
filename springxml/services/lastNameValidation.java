
//service
public class firstNameValidation implements interfaceValidation {
    @Override
    public Boolean validation() {

        if(input == null)
        {
            return false;
        }
        return true;
    }
}