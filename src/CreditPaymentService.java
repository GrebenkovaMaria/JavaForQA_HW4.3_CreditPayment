public class CreditPaymentService {
    public double calculate( double sum, float rate, int period) {
float monthlyRate = rate / 12  ;
int months = period * 12 ;
long monthlyPayment = (long) (sum * (monthlyRate * (Math.pow((monthlyRate / 100 + 1), months)) /((Math.pow((monthlyRate / 100 + 1), months))-1) / 100));
return monthlyPayment ;
    }
}
