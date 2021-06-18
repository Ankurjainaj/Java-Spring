package SpringDemo.atop_temp;

import org.springframework.stereotype.Component;

@Component
public class PaymentService {
    int makePayment()
    {
        System.out.println("Processing Debit");
        System.out.println("Processing Credit");
        return 1;
    }
    int makePayment( int amt)
    {

        System.out.printf("Processing Debit [%d]\n",amt);
        System.out.printf("Processing Credit [%d]\n",amt);
        return 2;
    }
}
