package Basic;


class mobile{
	public int ram;
	public int storage;
	public double display;
	public int price;
	public String model;
	
	mobile(){
		
	}
	mobile (int ram,int storage,double display,int price,String model){
		this.ram = ram;
		this.storage = storage;
		this.display = display;
		this.price = price;
		this.model = model;
		
	}
	
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getRam() {
		return ram;
	}
	
	
	
	
	public void setStorage(int storage) {
		this.storage = storage;
	}
	public int getstorage() {
		return storage;
	}
	
	
	public void setPrice(int price) {
		this.price = price;
	}
	public int getprice() {
		return price;
	}
	
	
	public void setDisplay(double display) {
		this.display = display;
	}
	public double getDisplay() {
		return display;
	}
	
	
	public void setModel(String model) {
		this.model = model;
	}
	public String getModel() {
		return model;
	}
	
	public String toString() {
		return "ram : "+ram+" storage : "+storage+ "price : "+price+" display : "+display+" model : "+model;
	}
}


public class practical9 {
	public static void main(String[] args) {
		
		mobile m = new mobile();
		m.setDisplay(15.7);
		m.setModel("MI");
		m.setPrice(15000);
		m.setRam(8);
		m.setStorage(32);
		System.out.println("Display :" +m.getDisplay());
		System.out.println("Model :" +m.getModel());
		System.out.println("Price :" +m.getprice());
		System.out.println("Ram :" +m.getRam());
		System.out.println("Storage :" +m.getstorage());
		
		
		
		
	}

}
