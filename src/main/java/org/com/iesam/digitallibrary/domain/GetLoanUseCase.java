package org.com.iesam.digitallibrary.domain;

import java.util.ArrayList;

public class GetLoanUseCase {
    private LoanRepository loanRepository;

    public GetLoanUseCase(LoanRepository LoanRepository) {
        this.loanRepository = loanRepository;
    }

    public ArrayList<Loan> obtainloans() {
        return LoanRepository.obtainloans();
    }

    public Loan obtainLoan(Integer loanId) {
        return loanRepository.obtainLoan(loanId);
    }

    public ArrayList<Loan> execute() {
        return obtainLoans();
    }

    private ArrayList<Loan> obtainLoans() {
        return obtainloans();
    }
}




