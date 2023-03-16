package Assignment.Strategy;

public class PaymentServiceBHIM {
    private BHIM service;
    PaymentServiceBHIM(BHIM payee){
        this.service = payee;
    }
    void setService(String s){
        if(s.equals("credit")){
            service.credit();
        }
        else {
            service.debit();
        }
    }
}
