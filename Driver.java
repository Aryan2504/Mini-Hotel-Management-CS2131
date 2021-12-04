package Lab6_7_209301499_AryanSingh;
import java.util.*;
import java.io.*;

public class Driver
{
    public static void main(String args[]) throws IOException
    {
        Scanner sc = new Scanner (System.in);

        System.out.println("Welcome to BHOYO ROOMS!!\n\nEnter your choice:\n1. Existing User\n2. New User");
        int user_type = sc.nextInt();
        
        boolean flag1 = false, flag1x = false;  //flag variables for verification

        SignIn ob1 = new SignIn();
        SignUp ob2 = new SignUp();
        

        if (user_type == 1)
        {
            while (flag1 == false)
            {
                flag1 = ob1.input();
            }
        }

        else if (user_type == 2)
        {
            ob2.beginSignUp();
            System.out.println("\nKindly sign in with your credentials");
            while (flag1x == false)
            {
                flag1x = ob1.input();
            }
        }

        else
        {
            System.out.println("Invalid Choice");
        }

        System.out.println("Enter your choice of your city: ");
        File file = new File("D:cities.txt");    

        Scanner reader = new Scanner(file);  

        int i = 1;
        String selected = null;

        while (reader.hasNextLine())   //printing all the data of a file line by line
        {  
            String data = reader.nextLine();  
            System.out.print(i+". ");
            System.out.println(data);  
            i++;
        }  
        int city = sc.nextInt();
        String cityx = null;
        
        if (city == 1)  //updating value of city x w.r.t. user's choice
        cityx = "NYC";
        else
        cityx = "LA";
        
        
        HotelSelect ob3 = new HotelSelect();
        int rent = ob3.HotelInterface(city);

        Details ob4 = new Details();
        ob4.input();

        Bill ob5 = new Bill();
        double amt = ob5.calc(ob4.rooms_count , rent);
        
        Booking_Id ob6 = new Booking_Id();
        ob6.id_generator(ob2.name, ob1.id , cityx, amt);
    }
} //end of Driver Class