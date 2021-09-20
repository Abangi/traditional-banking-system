public class Main {
    public static void main(String[]args){
        CreditCard[]wallet = new CreditCard[3];
        wallet[0]= new CreditCard("Derick Abangi","Nairobi Savings",
                                 "4 5678 5943 4567",5000);
        wallet[1]= new CreditCard("Stephene Njoroge","Nakuru Savings",
                                  "8795 4567 2134 3456",20000);
        wallet[2]= new CreditCard("Valary Biketi","Narok Savings",
                                  "8795 3456 7980 5678",900000);
        for (int val = 1;val<=16;val++){
            wallet[0].charge(3*val);
            wallet[1].charge(2*val);
            wallet[2].charge(val);
        }
        for (CreditCard card : wallet){
            CreditCard.printSummary(card);
            while (card.getBalance()>2000);{
                card.makePayment(2000);
                System.out.println("New balance ="+card.getBalance());
            }
        }
    }
}
