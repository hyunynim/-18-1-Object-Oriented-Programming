import java.util.ArrayList;
import java.util.Scanner;

public class Account1 extends Account {
	private String name;
	private ArrayList<Transaction> transactions = new ArrayList<Transaction>();
		
	Account1(){
		super();
	}
	
	Account1(String name, int id, double balance ){
		super(id, balance);
		super.setAnnualInterestRate(1.6);
		this.name = name;
	}
	
	@Override
	public void withdraw(double amount) {
		if(amount > getBalance())
			System.out.printf("Amount is greater then balance\n");
		else {
			transactions.add(new Transaction('W', amount, getBalance() - amount, "description"));
			setBalance(getBalance() - amount);
		}
	  }
	
	@Override
	public void deposit(double amount) {
			transactions.add(new Transaction('D', amount, getBalance() + amount, "description"));
			setBalance(getBalance() + amount);
	  }
	  
	public void printInformation() {
		System.out.printf("Name : %s\n",  name);
		System.out.printf("Annual interest rate: %.2f\n", getAnnualInterestRate());
		System.out.printf("Balance: %.2f\n",  getBalance());
		System.out.printf("%-35s%-15s%-10s%-10s%-30s\n", "Date", "Type", "Amount", "Balance", "Description");
		for(int i = 0; i<transactions.size(); ++i) {
			System.out.printf("%-35s%-15c%-10.2f%-10.2f%-30s\n", transactions.get(i).getDate(), transactions.get(i).getType(), transactions.get(i).getAmount(), transactions.get(i).getBalance(), transactions.get(i).getDescription());
		}
	}
	
	public static void main(String[] args) {
			// TODO Auto-generated method stub
			Account1 acc = new Account1("¾ÈÈ«Çö", 17101222, 1000.0);
			double amount = 0;
			Scanner input = new Scanner(System.in);
			while(true) {
				System.out.printf("1. Widthdraw\n");
				System.out.printf("2. Deposit\n");
				System.out.printf("3. Print Transactions\n");
				System.out.printf("4. Exit\n");
				System.out.printf("input menu: ");
				int menu = input.nextInt();
				switch(menu) {
				case 1:
					System.out.printf("Input amount: ");
					amount = input.nextDouble();
					acc.withdraw(amount);
					break;
				case 2:
					System.out.printf("Input amount: ");
					amount = input.nextDouble();
					acc.deposit(amount);
					break;
				case 3:
					acc.printInformation();
					break;
				}
				System.out.println("");
				if(menu == 4)
					break;
				
			}
	}
}