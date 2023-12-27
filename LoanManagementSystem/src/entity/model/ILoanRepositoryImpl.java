package entity.model;

import java.util.HashMap;
import java.util.Map;
public class ILoanRepositoryImpl implements ILoanRepository {
    private Map<Integer, Loan> loans = new HashMap<>();
    private int nextLoanId = 1;

    @Override
    public boolean applyLoan(int customerID, float principalAmount, float interestRate, int loanTerm, String loanType) {
        // Implementation for applying a loan
        int loanId = nextLoanId++;
        Loan newLoan = new Loan(loanId, customerID, principalAmount, interestRate, loanTerm, loanType);
        loans.put(loanId, newLoan);
        return true;
    }

    @Override
    public float calculateInterest(int loanId) {
       
        Loan loan = loans.get(loanId);
        if (loan != null) {
           
        }
        return 0.0f; 
    }

    @Override
    public void loanStatus(int loanId) {
        
        Loan loan = loans.get(loanId);
        if (loan != null) {
            
        }
    }

   

    private static class Loan {
        public Loan(int loanId2, int customerID2, float principalAmount2, float interestRate2, int loanTerm2,
				String loanType2) {
        }	
		private int loanId;
        private int customerID;
        private float principalAmount;
        private float interestRate;
        private int loanTerm;
        private String loanType;

        
    }

	@Override
	public void calculateEMI(int loanId) {
		
		
	}

	@Override
	public void loanRepayment(int loanId, float amount) {
		
		
	}

	@Override
	public void getAllLoan() {
		
		
	}

	@Override
	public void getLoanById(int loanId) {
		
	}
}