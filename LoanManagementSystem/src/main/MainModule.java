package main;


import java.util.Scanner;


import entity.model.ILoanRepositoryImpl;


public class MainModule {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		System.out.println("1.Apply Loan");
		System.out.println("2.Get all Loan Details");
		System.out.println("3.Get Loan");
		System.out.println("4.Loan Repayment");
		System.out.println("5.Exit");
		System.out.println("Enter your choice");
		int choice=scan.nextInt();
		ILoanRepositoryImpl l1=new ILoanRepositoryImpl();
		switch(choice){
		case 1:
			System.out.println("Enter CustomerID");
			int id=scan.nextInt();
			System.out.println("Enter Principal Amount");
			float amt=scan.nextFloat();
			System.out.println("Enter Interest Rate");
			float ir=scan.nextFloat();
			System.out.println("Enter Loan Term in months");
			int lt=scan.nextInt();
			System.out.println("Enter Loan Type");
			String ltype=scan.next();
			boolean result=l1.applyLoan(id, amt,ir,lt,ltype);
			if(result) {
				System.out.println("Loan Applied");
			}
			else {
				System.out.println("Loan Denied");
				
			}
			break;
		case 2:
			l1.getAllLoan();
			break;
		case 3:
			System.out.println("Enter LoanID");
			int lid=scan.nextInt();
			l1.getLoanById(lid);
			break;
		case 4:
			System.out.println("Enter LoanID");
			int lnid=scan.nextInt();
			System.out.println("Enter Amount");
			float amount=scan.nextFloat();
			l1.loanRepayment(lnid,amount);
			break;
		case 5:
			System.exit(0);
			break;
		default:
			System.out.println("You have entered an Invalid option. Please Try Again");
			break;
		}
	}
}
