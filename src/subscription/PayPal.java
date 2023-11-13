package subscription;

public class PayPal extends PaymentDecorator {
    public PayPal(Payment pay){
        super(pay);
    }

    public String decorate() {
        return super.decorate() + decorateWithPayPal();
    }

    public String decorateWithPayPal(){
        return "\n1. Pay Pal";
    }

}
