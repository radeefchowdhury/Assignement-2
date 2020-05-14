package atmmachine;

import java.util.Scanner;
import java.lang.Math;

public class AtmMachine {

   //This program is an atm machine simulator, letting the user withdraw,deposit, transfer or print balance. Then asking if they wanna repeat the program.
    public static void main(String[] args) {
       final int hundred = 100;
       final int fifty = 50;
       final int twenty = 20;
       final int ten = 10;
       final int five = 5;
        Scanner sc = new Scanner(System.in);
        
        //This leaves the boolean repeat true at the start, and assigns values for three accounts.
        boolean repeat = true;
        boolean anotherTransaction1 = true;
        Account checquing = new Account("Radeef Chowdhury", 10000, "vanierstudent100");{
        String checquingName = checquing.getName(); 
        double checquingBalance = checquing.getBalance();
        String checquingPassword = checquing.getPassword();
        
        Account checquing2 = new Account("Radeef Chowdhury", 0, "vanierstudent100"); {
        }
        Account checquing3 = new Account("Radeef Chowdhury", 100, "vanierstudent100" ); {
        
        }
        
        //This asks the user for a password, if person doesn't type in the proper one, it doesn't follow through the program
        
        System.out.println("Enter your password");
        String passwordEntered = sc.next();
        if(passwordEntered.equalsIgnoreCase("vanierstudent100")){
            while(repeat){
               
        System.out.println("Your current account balance is " + "" +checquing.getBalance() + "$");
        System.out.println("Type 'deposit' to deposit to another account");
        System.out.println("Type 'transfer' to transfer between account");
        System.out.println("Type 'withdraw' to withdraw money");
        
        //This uses a switch case, leaving the user typing what kind of transaction he wishes to do.
        
        String actionChosen = sc.next();
        switch(actionChosen) {
            case ("withdraw"):
                System.out.println("Enter how much money you want to withdraw");
                if(checquingBalance<=0){
                    System.out.println("You can't withdraw money. Insufficient funds.");
                }
                   
                //This uses least amount of bills possible using modulus and division
                double amount = sc.nextDouble();
                    checquing.withdraw(amount);
                   int modHundred = (int) amount/hundred;
                   int modFifty = (int) amount%hundred/fifty;
                   int modTwenty =(int) amount%hundred%fifty/twenty;
                   int modTen =(int) amount%hundred%fifty%twenty/ten;
                   int modFive = (int) amount%hundred%fifty%twenty%ten/five;
                   System.out.println(amount);
                   System.out.println("Amount of hundreds" +modHundred );
                   System.out.println("Amount of fifty" +modFifty );
                   System.out.println("Amount of twenty" +modTwenty );
                   System.out.println("Amount of tens" +modTen );
                   System.out.println("Amount of five" +modFive );
                   System.out.println(checquing.getBalance());
                    break;
                
            case ("deposit"):
                System.out.println("Emter how much money you want to deposit");
                checquing.deposit(sc.nextDouble());
                System.out.println(checquing.getBalance());
                break;
        
           //This transfers money between accounts from the defined class "Account"
            case("transfer"):
                System.out.println("Enter amount of money you want to transfer and which account you want to transfer to");
                checquing.transfer(sc.nextDouble(),checquing2);
                System.out.println(checquing2.getBalance());
                break;

        }
      
        //This prompts the user if he wishes to do another transaction. If not, it ends the program, if so, it restarts everything, updating the values. 
        System.out.println("Do you want to do another transaction? Y/N ");
        String anotherTransaction = sc.next();
        
             
             if(anotherTransaction.equals("N")) { 
                 anotherTransaction1=false;
                 System.out.println("Have a good day!");
                repeat=false;
              } else if(!anotherTransaction.equals("Y")) { System.out.println("Invalid input"); 
             
              } else{ 
                  anotherTransaction1=false;
              }
             }}             
             }
        }
        }
        
    
    