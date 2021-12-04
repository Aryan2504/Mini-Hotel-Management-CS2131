package Lab6_7_209301499_AryanSingh;
import java.util.*;

public class Details
{
    int rooms_count = 0;
     void input()
    {
        Scanner ob = new Scanner(System.in);
        
        int  i = 1;
        
        System.out.println("Enter the number of rooms you want to book");
        rooms_count = ob.nextInt();
        
        System.out.println("Enter the number of people");
        int people_count = ob.nextInt();
        
        
        System.out.println("Are you one of the people:\n1.Yes\n2.No\n");
        int check = ob.nextInt();
        
        if (check == 1)
        {
            people_count -= 1;
            i++;
        }
        
        ob.nextLine();

        String names[] = new String[people_count + 1];
        String ages[] = new String[people_count + 1];
        
        if (check == 1)
        {
            SignUp obj = new SignUp();
            names[0] = obj.name ;
            ages[0] = String.valueOf(obj.age);
        }
        
        while( i <= people_count + 1)
        {
            System.out.println("Person "+i+" name: ");
            names[i - 1] = ob.nextLine();
            System.out.println("Person "+i+" age: ");
            ages[i - 1] = ob.nextLine();
            i++;
        }
        
        
        
    }
}
