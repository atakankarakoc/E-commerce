public class Test {
    public static void main(String[] args) {

        CreditCard myCard = new CreditCard();
        CreditCard myCard2 = new CreditCard();

        User u1 = new User();

        Product p1 = new Product();
        Product p2 = new Product();

        Order o1 = new Order(u1,p1,myCard);
        Order o2 = new Order(u1,p2,myCard2);
        Order o3 = new Order(u1,p1,myCard);
        Order o4 = new Order(u1,p1,myCard);

        u1.addFav(p1);
    }
}
