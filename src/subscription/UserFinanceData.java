package subscription;

public class UserFinanceData {
    private int cash = 1000;

    public int updateFinanceInfo(){
        cash -= 60;
        return cash;
    }

    public int getCash() {
        return cash;
    }
}
