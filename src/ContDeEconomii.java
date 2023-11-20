public class ContDeEconomii extends ContBancar{
    ContDeEconomii(int balanace1, int id){
        super(balanace1, id);
    }
    public void withdrow(int amount){
        int limit = balance - 2*balance/3;
        if(amount <= limit){
            System.out.println("Tranzactie finalizata");
        }
        else{
            System.out.println("Ati atins limita");
        }
    }
}
