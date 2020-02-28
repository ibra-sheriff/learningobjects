import java.util.UUID;

public class Transaction {
	public static final int ADDING = 0;
	public static final int DEDUCTING = 1;

	private final String ID;
	private final int TYPE;
	private final double AMOUNT;

	public Transaction(int type, double amount) {
		ID = UUID.randomUUID().toString();
		TYPE = type;
		AMOUNT = amount;
	}

	public String getID() {
		return ID;
	}

	public int getType() {
		return TYPE;
	}

	public double getAmount() {
		return AMOUNT;
	}

	public String toString() {
		return "id: " + ID + " type: " + TYPE + " amount: " + AMOUNT;
	}

}
