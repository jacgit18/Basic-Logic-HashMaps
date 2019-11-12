import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class DriverStockLookUp {

	public static void main(String[] args) {
		// Maps and Hashmaps
		
		Map<String, Float> stockLookUp = new HashMap<>();
		
		stockLookUp.put("IBM", 140f);
		stockLookUp.put("SAN", 4f);
		stockLookUp.put("TD", 50f);

		System.out.println(stockLookUp);
		
		
		float price = stockLookUp.get("IBM");
		System.out.println(price);
		
		
	Map<String, Stock> advStockLookUp = new HashMap<>();
		
	
	BiConsumer<Integer, Integer> x = DriverStockLookUp::boobboo;
	
	Consumer<Float> y = DriverStockLookUp::boo;
	// before parameters where <T t> this just represent datatype of object and its name and for the other part
	// with the methods passing functions 
	
	advStockLookUp.put("IBM", new Stock ("IBM", 140f, .03f) );
	advStockLookUp.put("SAN", new Stock ("SAN", 4f, .05f) );
	advStockLookUp.put("TD", new Stock ("TD", 50f, .0325f) );
	
	advStockLookUp.forEach( (k,v) ->{
		System.out.println(k + " " + v);
	});
	

	
	
	}
	
	public static void boobboo(int a, int b) {
		
	}
	
	public static void boo(float x) {

}
	
}
