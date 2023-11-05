package subscription;

public abstract class PaymentDecorator implements Payment {
    private Payment pay;

    public PaymentDecorator(Payment pay) {
    }

    @Override
    public String decorate(){
        return pay.decorate();
    }
}
