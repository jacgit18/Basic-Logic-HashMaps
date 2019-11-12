import java.util.HashMap;
import java.util.Map;

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
	
	
	
	}

}
