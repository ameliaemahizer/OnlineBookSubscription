package subscription;

public class DebitCredit extends PaymentDecorator{
    public DebitCredit(Payment pay){
        super(pay);
    }

    public String decorate() {
        return super.decorate() + decorateWithDebitCredit();
    }

    public String decorateWithDebitCredit(){
        return "\n2. Debit or Credit Card";
    }
}
