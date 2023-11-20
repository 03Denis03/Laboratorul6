public class ContBancar {
    int balance;
    int id;
    ContBancar(int balance1, int id1){
        balance = balance1;
        id = id1;
    }
    public int getBalance(){
        return balance;
    }
    public int getId(){
        return id;
    }
    public void withdrow(int amount){
        if(amount > balance){
            System.out.println("Fonduri insuficiente");
        }
        else{
            balance = balance-amount;
            System.out.println("Banii au fost extrasi cu succes");
        }
    }
    public void deposit(int amount){
        balance = balance + amount;
        System.out.println("Banii au fost depusi cu succes.");
    }
}
