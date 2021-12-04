
package Lab6_7_209301499_AryanSingh;
import java.util.*; 
import java.io.*;
import java.lang.*;

public class HotelSelect
{
    static boolean display_flag = false;
    static int HotelInterface(int city)
    {
        int rentInt = 0;

        System.out.println("\nSelect a Hotel from the following list: ");

        try 
        {  
            File file;
            if (city == 1)
            file = new File("D:New York City.txt");    
            else
            file = new File("D:Los Angeles.txt");  

            Scanner reader = new Scanner(file);  

            int i = 1;
            String selected = null;

            while (reader.hasNextLine()) 
            {  
                String data = reader.nextLine();  
                System.out.print(i+". ");
                System.out.println(data);  
                i++;
            }  

            Scanner ob = new Scanner(System.in);
            System.out.println("\nEnter your choice: ");
            int choice = ob.nextInt();
            
           
            try (BufferedReader br = new BufferedReader(new FileReader(file)))
            {
                for (int j = 0; j < choice - 1; j++)
                    br.readLine();
                selected = br.readLine();
            }
            catch(IOException e)
            {
                System.out.println(e);
            }

            selected.trim();
            String hotel_name = selected.substring(0 , selected.indexOf(" ", 0));
            String rent = selected.substring(selected.indexOf("$") + 1 ,selected.indexOf("/") );
            rentInt = Integer.parseInt(rent);

            reader.close();  

        } 
        catch (FileNotFoundException exception) 
        {  
            System.out.println("Unexcpected error occurred!"); 
        }  
        return rentInt;

    }
}