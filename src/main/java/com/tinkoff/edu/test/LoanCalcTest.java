package com.tinkoff.edu.test;

import com.tinkoff.edu.app.LoanCalcController;
import com.tinkoff.edu.app.LoanRequest;
import static com.tinkoff.edu.app.LoanType.*;


/**
 * Loan Calc Tests!
 */
public class LoanCalcTest {
    public static void main(String... args) {
        LoanRequest request = new LoanRequest(PERSON, 10, 2000);
        LoanCalcController loanCalcController = new LoanCalcController();

        int requestId = loanCalcController.createRequest(request);

        System.out.println(request);
        System.out.println("Request: " + request);
        System.out.println(requestId + " must be 1");
    }
}
