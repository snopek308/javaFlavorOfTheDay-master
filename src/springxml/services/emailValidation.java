package springxml.services;

//hibernate.service
public class emailValidation implements interfaceValidation{
@Override
public Boolean validation(String input){


        if(input==null)
        {
            return false;
        }
            return true;
    }
}