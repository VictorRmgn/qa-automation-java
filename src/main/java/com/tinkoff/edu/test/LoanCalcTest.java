package com.tinkoff.edu.test;

import com.tinkoff.edu.app.LoanCalcController;
import com.tinkoff.edu.app.LoanRequest;
import com.tinkoff.edu.app.LoanType;


/**
 * Loan Calc Tests!
 */
public class LoanCalcTest {
    public static void main(String... args) {
        LoanRequest request = new LoanRequest(LoanType.PERSON, 10, 2000);
        LoanCalcController loanCalcController = new LoanCalcController();

        int requestId = loanCalcController.createRequest(request);
        //int requestId=createRequest(new LoanRequest(10,2000));
        //int requestId = createRequest();

        System.out.println(request.toString());
        System.out.println ("Request: " + request);
        System.out.println(requestId + " mast be 1");
    }
}
