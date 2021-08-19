package com.tinkoff.edu.app;

public class LoanCalcRepository {
    private static int requestId;

    /**
     * TODO persist request
     *
     * @return
     * @retern Request Id
     */
    public static int save() {
        return ++requestId;
    }
}
