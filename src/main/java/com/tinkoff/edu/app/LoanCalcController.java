package com.tinkoff.edu.app;


public class LoanCalcController {
    private LoanCalcService loanCalcService = new LoanCalcService();

    /**
     * TODO Validate and logs request
     */
    public int createRequest(LoanRequest request) {
        //что то будет param validation
        //log request


        return loanCalcService.createRequest(request);
    }
}
