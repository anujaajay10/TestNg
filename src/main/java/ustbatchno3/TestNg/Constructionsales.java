package ustbatchno3.TestNg;

public class Constructionsales {
	private String city;
	private int pricewithoutmaterial;
	private int pricewithmaterial;
	public Constructionsales(String city, int pricewithoutmaterial, int pricewithmaterial) {
		super();
		this.city = city;
		this.pricewithoutmaterial = pricewithoutmaterial;
		this.pricewithmaterial = pricewithmaterial;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPricewithoutmaterial() {
		return pricewithoutmaterial;
	}
	public void setPricewithoutmaterial(int pricewithoutmaterial) {
		this.pricewithoutmaterial = pricewithoutmaterial;
	}
	public int getPricewithmaterial() {
		return pricewithmaterial;
	}
	public void setPricewithmaterial(int pricewithmaterial) {
		this.pricewithmaterial = pricewithmaterial;
	}
	@Override
	public String toString() {
		return "Price [city=" + city + ", pricewithoutmaterial=" + pricewithoutmaterial + ", pricewithmaterial="
				+ pricewithmaterial + "]";
	}
	
}
