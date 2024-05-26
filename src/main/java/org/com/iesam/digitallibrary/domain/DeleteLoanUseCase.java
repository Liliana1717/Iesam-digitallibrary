package org.com.iesam.digitallibrary.domain;

import org.com.iesam.digitallibrary.data.UserDataRepository;

public class DeleteLoanUseCase {
    public DeleteLoanUseCase(UserRepository userRepository) {


    }

    public DeleteLoanUseCase(LoanRepository loanRepository) {
    }

    public void execute (Integer LoanId){
        LoanRepository.deleteLoan(LoanId);
    }

}




