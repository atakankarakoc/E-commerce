public class Order {
    public User orderingUser;
    public  Product orderedProduct;
    public CreditCard creditCard;

    public Order(){}
    public Order(User orderingUser, Product orderedProduct, CreditCard creditCard) {
        this.orderingUser = orderingUser;
        this.orderedProduct = orderedProduct;
        this.creditCard = creditCard;
        order(orderedProduct,orderingUser);
    }

    public User getOrderingUser() {
        return orderingUser;
    }

    public void setOrderingUser(User orderingUser) {
        this.orderingUser = orderingUser;
    }

    public Product getOrderedProduct() {
        return orderedProduct;
    }

    public void setOrderedProduct(Product orderedProduct) {
        this.orderedProduct = orderedProduct;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public void order(Product p, User c){
        if((p.StockControl() == true)){
            if(c.getCreditCard() == creditCard){
                this.orderingUser.orderingProduct(orderedProduct);
                System.out.println("Order Information: " );
                System.out.println(toString()+"\n");

            }
            else{
                System.out.println("Credit Card isn't defined for this user. Purchase failed. \n");
            }
        }
        else{
            System.out.println("There isn't enough product count. Purchase failed. \n");
        }
    }

    @Override
    public String toString() {
        return "Username = " + orderingUser.getUserName() +
                " Product Name = "+ orderedProduct.getProductName()
                + " Credit Card = "+ creditCard.getCreditCardNumber() + '}';
    }
}

