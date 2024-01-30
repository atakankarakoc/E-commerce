public class Product {

    private String productName;
    private String productColor;
    private String productCategory;
    private int productStockInf;
    private int productWeight;
    private String productDesInf;

    public Product(){}
    public Product(String productName, String productColor, String productCategory,
                   int productStockInf, int productWeight, String productDesInf) {
        this.productName = productName;
        this.productColor = productColor;
        this.productCategory = productCategory;
        this.productStockInf = productStockInf;
        this.productWeight = productWeight;
        this.productDesInf = productDesInf;

    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductColor() {
        return productColor;
    }

    public void setProductColor(String productColor) {
        this.productColor = productColor;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public int getProductStockInf() {
        return productStockInf;
    }

    public void setProductStockInf(int productStockInf) {
        this.productStockInf = productStockInf;
    }

    public int getProductWeight() {
        return productWeight;
    }

    public void setProductWeight(int productWeight) {
        this.productWeight = productWeight;
    }

    public String getProductDesInf() {
        return productDesInf;
    }

    public void setProductDesInf(String productDesInf) {
        this.productDesInf = productDesInf;
    }

    public boolean StockControl(){
        if(productStockInf > 0){
            return true;
        }
        else{
            return false;
        }
    }

    public void StockCount(){
        this.setProductStockInf(this.getProductStockInf()-1);
    }

    @Override
    public String toString() {
        return "\nProduct Name = " + productName+"\n"+ "Product Color = " + productColor+"\n"+
                "Product Category = " + productCategory+"\n"+ "Product Stock Information = "
                +productStockInf+"\n"+ "Product Weight = " + productWeight+"\n"+
                "Product Description Information = " + productDesInf ;
    }
}
