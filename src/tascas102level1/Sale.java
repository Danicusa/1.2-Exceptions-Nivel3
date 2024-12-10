package tascas102level1;

import java.util.ArrayList;

public class Sale {
	private ArrayList<Product> products;
	  private double totalSalePrice;

	  public Sale(double totalSalePrice) {
	    this.products = new ArrayList<Product>();
	    this.totalSalePrice = totalSalePrice;
	  }

	  public ArrayList<Product> getProducts() {
	    return this.products;
	  }

	  public double getTotalSalePrice() {
	    return this.totalSalePrice;
	  }

	  public void setTotalSalePrice(double totalSalePrice) {
	    this.totalSalePrice = totalSalePrice;
	  }

	  public void addProduct(Product product) {
	    this.products.add(product);
	  }

	  public String calculateTotal() throws EmptySaleException {
	    String result = "";
	    if (products.size() == 0) {
	      throw new EmptySaleException();
	    } else {
	      for (Product product : products) {
	        totalSalePrice += product.getPrice();
	        result = "Total sale price: " + totalSalePrice;
	      }
	    }
	    return result;
	  }
}
