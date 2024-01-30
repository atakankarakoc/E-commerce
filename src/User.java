import java.util.ArrayList;

public class User {
    private String userName;
    private String name;
    private String surname;
    private String dob;
    private String password;
    private String email;
    private String hadress;
    private String wadress;
    private ArrayList<Product> orderedProducts;
    private ArrayList<Product> favProducts;
    private CreditCard creditCard;

    public User(){}
    public User(String userName, String name, String surname, String dob, String password,
                String email, String hadress, String wadress, CreditCard creditCard) {
        this.userName = userName;
        this.name = name;
        this.surname = surname;
        this.dob = dob;
        this.password = password;
        this.email = email;
        this.hadress = hadress;
        this.wadress = wadress;
        this.orderedProducts = new ArrayList<Product>();
        this.favProducts = new ArrayList<Product>();
        this.creditCard = creditCard;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHadress() {
        return hadress;
    }

    public void setHadress(String hadress) {
        this.hadress = hadress;
    }

    public String getWadress() {
        return wadress;
    }

    public void setWadress(String wadress) {
        this.wadress = wadress;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public void orderingProduct(Product p){
        if(p.StockControl() == true){
            orderedProducts.add(p);
            p.StockCount();
        }
        /*else{
            System.out.println("There isn't enough product count.");
        }*/
    }

    public void addFav(Product p){
        favProducts.add(p);
    }

    @Override
    public String toString() {
        return "User Name = " + userName +"\n" + "Name = " + name + "\n" + "Surname = " +surname+"\n"
                +"Date of Bird = " + dob+ "\n"+ "Password = " + password +"\n"+ "Email = " + email +"\n"
                +"Home Adress = " + hadress+"\n"+ "Work Adress = " + wadress +"\n"
                +"OrderedProducts = " + orderedProducts+"\n" + "Favourite Products = " + favProducts+"\n"
                + "Credit Card = " + creditCard + '}';
    }

}

