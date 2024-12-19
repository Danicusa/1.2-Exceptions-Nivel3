package Level1Ex1;

public class Main {

	public static void main(String[] args) {
		String result = "";
	    Sale venta1 = new Sale(0d);
	    Product product1 = new Product("Producto 1", 10d);
	    try {
	      result = venta1.calculateTotal();
	    } catch (EmptySaleException e) {
	      System.out.println("Excepción capturada: " + e.getMessage());
	    }
	    System.out.println(result);
	  }
}
