package com.tinkoff.edu.app;


import static com.tinkoff.edu.app.LoanCalcLog.log;

public class LoanCalcController {
    /**
     * TODO Validate and logs request
     */
    public static int createRequest(int months) {
        months = 3;
        //что то будет param validation
        //log request
        log();
        return LoanCalcService.createRequest();
    }
}
