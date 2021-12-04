package Lab6_7_209301499_AryanSingh;
import java.lang.*;
import java.io.*;  

public class Booking_Id
{
    void id_generator(String name,String id, String city, double amount)
    {
        try 
        {  
            FileWriter fwrite = new FileWriter("D:bookings.txt");  

            String r = String.valueOf(Math.random()*10000000);

            String b_id = "_BHOYO_"+r;

            fwrite.write(b_id+"\t"+name+"\t"+city+"\t"+amount);   

            fwrite.close();   
        } 
        catch (IOException e)
        {  
            System.out.println("Unexpected error occurred");  
        }
    }
}