package org.com.iesam.digitallibrary.domain;

import java.util.ArrayList;

public interface LoanRepository {
    static ArrayList<Loan> obtainloans() {

        return obtainloans();
    }

    static void deleteLoan(Integer loanId) {
    }


    Loan obtainLoan(Integer loanId);
}
