import javax.swing.JOptionPane;

public class calcTwinsTix {

	public static void main(String[] args) {
		final double TICKET = 75, FEE = 20, TAX = .07;
		String tixString;
		int tixNum;
		tixString = JOptionPane.showInputDialog(null, "How many Twins tickets would you like to purchase?");
		tixNum = Integer.parseInt(tixString);
		double price;
		double total;
		price = ((tixNum * TICKET) + FEE);
		total = (price + (price * TAX));
		JOptionPane.showMessageDialog(null, "Your total is $" + String.format("%.2f", total));

	}

}
