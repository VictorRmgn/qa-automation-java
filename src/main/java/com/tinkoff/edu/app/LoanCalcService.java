package com.tinkoff.edu.app;


public class LoanCalcService {
    private LoanCalcRepository repo = new LoanCalcRepository();

    /**
     * TODO Loan Calc
     *
     * @return
     */
    public int createRequest(LoanRequest request) {
        // расчеты if()
        return repo.save(request);
    }
}
