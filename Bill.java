package Lab6_7_209301499_AryanSingh;

public class Bill
{
    double calc (int rooms_no , int rent)
    {
        double amount = rooms_no * rent;
        System.out.println("Amount without discount is $"+amount);
        if (amount > 10000)
        {
            amount = amount - 1000;
        }
        System.out.println("Amount after discount is $"+amount);
        
        return amount;
    }
}