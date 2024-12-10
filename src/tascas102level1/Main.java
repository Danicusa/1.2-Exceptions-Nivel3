package tascas102level1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String result = "";
	    Sale venta1 = new Sale(0d);
	    Product product1 = new Product("Producto 1", 10d);
	    // venta1.getProducts().add(product1); 
	    try {
	      result = venta1.calculateTotal();
	    } catch (EmptySaleException e) {
	      System.out.println("Excepción capturada: " + e.getMessage());
	    }
	    System.out.println(result);
	  }
}
