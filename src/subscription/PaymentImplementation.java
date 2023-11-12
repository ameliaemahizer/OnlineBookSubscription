package subscription;

public class PaymentImplementation implements Payment{

    @Override
    public String decorate(){
        return "Payment Methods";
    }
}
