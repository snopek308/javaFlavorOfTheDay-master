package springxml;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import springxml.beans.user;

public class springApp{
    public static void main(String[]args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        user myUser = context.getBean("user", user.class);


        System.out.println(myUser.getEmail());
        if(myUser.isEmailValid() == false)
        {
            System.out.println("This is not a valid email");
        }
        else{
            System.out.println("This is a valid email");
        }


        System.out.println(myUser.getFirstName());
        if(myUser.isFirstNameValid() == false)
        {
            System.out.println("This is not a valid first name entry");
        }
        else{
            System.out.println("This is a valid first name entry");
        }


        System.out.println(myUser.getLastName());
        if(myUser.isLastNameValid() == false)
        {
            System.out.println("This is not a valid last name entry");
        }
        else{
            System.out.println("This is a valid first name entry");
        }


    }
}
