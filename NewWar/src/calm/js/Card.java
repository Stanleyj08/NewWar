package calm.js;

public class Card {
	private String cardType;
	
	private int value;

	public Card (String cardType, int value)	{
		this.cardType = cardType;
				this.value = value;
	}
	
	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	public void describe()	{
		System.out.println(cardType);
	}
	//public Card(String cardType, String cardValue){

	public static void remove(int i) {
		// TODO Auto-generated method stub
		
	}
}
