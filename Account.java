import java.util.ArrayList;

public class Account {
	private double balance;
	private ArrayList<Transaction> transactions;

	public Account(double balance) {
		this.balance = balance;
		transactions = new ArrayList<Transaction>();
	}

	public double getBalance() {
		return this.balance;
	}

	public Transaction getTransaction(String id) {
		for (Transaction t: transactions) {
			if (t.getID.equals(id)) {
				return t;
			}
		}

		return null;
	}

	public Transaction getTransactions(int index) {
		return transactions.get(index);
	}

	public void addTransaction(Transaction t) {
		if (t.getType() == Transaction.ADDING) {
			balance = balance + t.getAmount();
		} else if (t.getType() == Transaction.DEDUCTING) {
			balance = balance - t.getAmount();
		}
		transactions.add(t);
	}

	public String toString() {
		String temp = "Balance is: " + balance + "\n";

		for (Transaction t: transactions) {
			temp = temp + t + "\n";
		}
		return temp;
	}
}
