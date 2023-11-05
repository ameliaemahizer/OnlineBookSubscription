package subscription;

public class ApplePay extends PaymentDecorator{
    public ApplePay(Payment pay){
        super(pay);
    }

    public String decorate() {
        return super.decorate() + decorateWithApplePay();
    }

    public String decorateWithApplePay(){
        return "\n3. Apple Pay";
    }

}
