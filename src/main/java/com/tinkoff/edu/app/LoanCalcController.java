package com.tinkoff.edu.app;

/**
 *
 */
public class LoanCalcController {
    /**
     * TODO Validate and logs request
     */
    public static int createRequest() {
        int localVar;
        //что то будет param validation
        //log request
        LoanCalcLog.log();
        return LoanCalcService.createRequest();
    }
}
