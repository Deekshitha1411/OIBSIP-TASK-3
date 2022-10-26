import java.util.Scanner;
class Atm {
    public static void main(String args[]){
        String username;
        String password;
        int balance=30000;
        int withdraw;
        int deposit;
        int transfer;
        int transaction=0;
        String th="";
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter login details");
        System.out.println("Enter the username");
        String un=sc.nextLine();
        System.out.println("Enter the password");
        String pw=sc.nextLine();
        if(un.equals("deekshitha")&&(pw.equals("psd"))){
            System.out.println("Logged successfully");

        }
        else{
            System.out.println("Incorrect username and password");

        }System.out.println();
        while(true){
            System.out.println("WELCOME");
            System.out.println("1 for withdraw");
            System.out.println("2 for deposit");
            System.out.println("3 for transfer");
            System.out.println("4 for check balance");
            System.out.println("5 for exit");
            System.out.println("Select the option");
            System.out.println();
            int ch=sc.nextInt();
            switch(ch){
                case 1:
                System.out.println("Enter the amount to withdraw:");
                withdraw=sc.nextInt();
                if(balance>=withdraw){
                    balance=balance-withdraw;
                    System.out.println("Collect your card and money");
                    System.out.println("Remaining balance is:"+balance);
                    System.out.println("Transaction History of withdrawn:"+withdraw);
                }
                else{
                    System.out.println("Insufficient funds are available");
                }
                System.out.println();
                break;
                case 2:
                System.out.println("Enter the money to be deposited");
                deposit=sc.nextInt();
                if(deposit<=balance){
                    balance=deposit+balance;
                    System.out.println("Your money has been successfully deposited");
                    System.out.println("Remaining balance is:"+deposit);
                    String trans2="\tRs deposited -"+balance;
                    System.out.println("Trnasaction history of deposit:"+deposit);
                }
                else{
                    System.out.println("Enter the minimum deposit balance to get deposited");
                }
                System.out.println();
                break;
                case 3:
                System.out.println("Enter the amount you want to tarnsfer");
                transfer=sc.nextInt();
                if(transfer<=balance){
                    balance-=transfer;
                    System.out.println("Your money has been successfully transfered");
                    System.out.println("After tarnsfer remaining balance is:"+balance);
                    String trans1="\tRs Tranferred ="+balance;
                    System.out.println("Transaction history of tranfer:"+transfer);
                
                }
                System.out.println();
                break;
                case 4:
                System.out.println("Total balance after all the transaction is:"+balance);
                System.out.println();
                break;
                case 5:
                System.out.println(0);
            }
        }


    }
    
}
