package org.com.iesam.digitallibrary.presentation;

import org.com.iesam.digitallibrary.domain.Loan;

public class LoanPresentation {
    public static void main(String[] args) {

        Loan loan = new Loan(123, "user001", "2023-05-25", 1, "2023-06-25");


        System.out.println("Loan Details:");
        System.out.println("Book ID: " + loan.getBookId());
        System.out.println("User ID: " + loan.getUserId());
        System.out.println("Loan Date: " + loan.getLoanDate());
        System.out.println("Loan ID: " + loan.getLoanId());
        System.out.println("Return Date: " + loan.getReturnDate());


        loan.setReturnDate("2024-06-30");


        System.out.println("Updated Return Date: " + loan.getReturnDate());
    }
}
