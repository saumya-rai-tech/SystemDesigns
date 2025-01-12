public class Card {
    private String cardNumber;
    private String pin;
    private String cardHolderName;

    public Card(String cardNumber, String pin, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.cardHolderName = cardHolderName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getPin() {
        return pin;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }
}
