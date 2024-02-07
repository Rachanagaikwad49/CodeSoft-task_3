//Create a class to represent the ATM Machine.  
import java.util.Scanner;  
public class Task_3
{  
    
    public static void main(String args[] )  
    {  
        int balance = 100000, withdraw, deposit;  
        Scanner sc = new Scanner(System.in);  
          
        while(true)  
        {  
            System.out.println("Automated Teller Machine(ATM)");  
            System.out.println("Choose 1 : Withdraw");  
            System.out.println("Choose 2 : Deposit");  
            System.out.println("Choose 3 : Check Balance");  
            System.out.println("Choose 4 : EXIT");  
            System.out.print("Choose the operation you want to perform:");  
            int choice = sc.nextInt();  
            switch(choice)  
            {  
                case 1:  
        System.out.print("Enter money for withdrawn:");  
                      
        
        withdraw = sc.nextInt();  
        if(balance >= withdraw)  
        {  
            balance = balance - withdraw;  
            System.out.println("Please collect your money");  
        }  
        else  
        {  
    
            System.out.println("Insufficient Balance");  
        }  
        System.out.println("");  
        break;  
   
                case 2:  
                      
        System.out.print("Enter money to be deposited:");  
        deposit = sc.nextInt();  
                      
       
        balance = balance + deposit;  
        System.out.println("Your Money has been successfully depsited");  
        System.out.println("");  
        break;  
   
                case 3:  
        System.out.println("Balance : "+balance);  
        System.out.println("");  
        break;  
   
                case 4:  
        System.exit(0);  
            }  
        }  
    }  
}  