import java.util.*;
 class Amount{
      static int am=1000;
}
class ATM_Machine extends Amount{
     public static void main(String args[]){
        atm b1 = new atm();
        Scanner p = new Scanner(System.in);
        System.out.print("Note: To proceed for transaction Generate your pin with 4 digits:");
        final int pin=p.nextInt();
        Take(pin);
     }
        public static void Take(int pin){
        atm b1 = new atm();
        Scanner n = new Scanner(System.in);
        System.out.println("1.Withdrawl"+"      "+"2.Deposit");
        System.out.println("3.Checkbalance"+"   "+"4.Exit");
        System.out.print("Please enter your option:");
        int a=n.nextInt();
        switch(a){
            case 1:
                System.out.print("enter amount to withdraw:");
                int amount=n.nextInt();
                if(amount<=am){
                b1.Withdrawl(amount,pin);
                }
                else{
                    System.out.println("Insufficient funds");
                    System.out.println("Transaction Failed");
                    System.exit(a);
                }
                System.out.println("Do you want to continue\n 1.Yes 2.No:");
                int o=n.nextInt();
                if(o==1){
                    Take(pin);
                }
                break;
            case 2:
                b1.Deposit(pin);
                System.out.println("Do you want to continue\n 1.Yes 2.No:");
                int h=n.nextInt();
                if(h==1){
                    Take(pin);
                }
                break;
            case 3:
                b1.CheckBalance(pin);
                System.out.println("Your account balance is:"+am);
                System.out.print("\nDo you want to continue\n 1.Yes 2.No:");
                int z=n.nextInt();
                if(z==1){
                    Take(pin);
                }
                break;
            case 4:
                break;
            default:
               System.out.println("wrong option Please enter options below");
               Take(pin);
        }

    }
     }

 class atm extends Amount{
     public static void Withdrawl(int amount, int pin){
         if(amount<=50000){
            Scanner z=new Scanner(System.in);
            System.out.print("enter your pin:");
            int pi=z.nextInt();
            z.nextLine();
            if(pi!=pin){
                System.out.println("invalid pin");
                System.out.println("Transaction Failed");
                System.exit(pi);
            }
            am-=amount;
            System.out.print("please collect cash and enter ok:");
            String j=z.nextLine();
                System.out.println("Transaction Successful");
     }
     else{
        System.out.println("Enter amount below 50 thousand");
        Withdrawl(amount,pin);
     }
    }
     public static void Deposit(int pin){
            Scanner x1 = new Scanner(System.in);
            System.out.print("enter amount to deposit:");
            int amount1=x1.nextInt();
            if(amount1<=50000&&amount1>=100){
            System.out.print("Enter your pin:");
            final int l=x1.nextInt();
            x1.nextLine();
            if(l!=pin){
                System.out.println("invalid pin");
                System.out.println("Transaction Failed");
                System.exit(l);
            }
            am+=amount1;
            System.out.println("Keep cash in machine and enter ok");
            final String q=x1.nextLine();
            
                System.out.println("Transaction Successful");
         }
         else{
            System.out.println("You can Deposit amount between 100 and 50000 only");
            Deposit(pin);
         }
    }

     public static void CheckBalance(int pin){
        Amount f = new Amount();
        Scanner uv = new Scanner(System.in);
        System.out.print("Enter your pin:");
        int xc=uv.nextInt();
        if(xc!=pin){
            System.out.println("Invalid pin");
            System.out.println("Transaction Failed");
            System.exit(xc);
        }
       
     }
    
}
 

