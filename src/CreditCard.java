public class CreditCard {

    private String creditCardNumber;
    private String creditCardUser;
    private int securiytCode;
    private String expirationDate;

    public CreditCard(){}
    public CreditCard(String creditCardNumber, String creditCardUser, int securiytCode, String expirationDate) {
        this.creditCardNumber = creditCardNumber;
        this.creditCardUser = creditCardUser;
        this.securiytCode = securiytCode;
        this.expirationDate = expirationDate;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public String getCreditCardUser() {
        return creditCardUser;
    }

    public void setCreditCardUser(String creditCardUser) {
        this.creditCardUser = creditCardUser;
    }

    public int getSecuriytCode() {
        return securiytCode;
    }

    public void setSecuriytCode(int securiytCode) {
        this.securiytCode = securiytCode;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return  "Credit Card Number = " + creditCardNumber+"\n"+ "Credit Card User = " + creditCardUser+"\n"+
                "Securiyt Code = " + securiytCode+"\n"+ "Expiration Date = " + expirationDate;
    }
}

