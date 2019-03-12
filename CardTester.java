/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card card = new Card("Spades", "Two", 2);
                Card card2 = new Card("Hearts", "Three", 3);
                Card card3 = new Card("Diamonds", "Six", 6);
                
                card.toString();
                card2.toString();
                card3.toString();

                System.out.println(card);
                System.out.println(card2);
                System.out.println(card3);
	}
}
