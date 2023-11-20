public class ContDeCredit extends ContBancar{

    ContDeCredit(int balance1, int id1) {
        super(balance1, id1);
    }

    @Override
    public void withdrow(int amount) {

        if(amount <= balance){
            System.out.println("Ati extras cu succes");
            balance = balance - amount;
        }
        else{

        }
    }
}
