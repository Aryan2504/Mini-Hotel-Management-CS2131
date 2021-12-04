package Lab6_7_209301499_AryanSingh;

import java.util.*;

public class SignIn
{
    static String id;
    static boolean input() 
    {
        Scanner ob = new Scanner(System.in);

        System.out.println("\n\nEnter your ID");
        id = ob.nextLine();

        System.out.println("Enter password: ");
        String pass = ob.nextLine();

        LookUp x = new LookUp();
        GetPass y = new GetPass();
        int id_freq = 0 , pass_freq = 0;

        
        try
        {
            id_freq = x.frequency(id);
        }
        catch (Exception e)
        {
            System.out.println("Unexcpected error occurred!aaa");
        }

        String password = y.get_pass(id);
        boolean truth = pass.equals(password);
        if ( id_freq == 1 && truth)
        {
            System.out.println("Credentials Verified\n WELCOME!!!!");
            return true;
        }
        else
        {
            System.out.println("Unable to verify the credentials");
            return false;
        }

    }
}