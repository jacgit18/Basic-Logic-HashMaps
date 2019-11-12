
public class Stock {

	private String name;
	private float price;
	private float divYield;


	public Stock(String name, float price, float divYield) {
		super();
		this.name = name;
		this.price = price;
		this.divYield = divYield;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getDivYield() {
		return divYield;
	}

	public void setDivYield(float divYield) {
		this.divYield = divYield;
	}


	@Override
	public String toString() {
		return "Stock [name=" + name + ", price=" + price + ", divYield=" + divYield + "]";
	}
}
