package session1projects;

public class Car1 {
	
	private String model;
	private Integer year;
	
	
	public Car(Integer year, String model) {
		this.model = model;
		this.year = year;
	}
	
	public Car(String model, Integer year) {
		this.model = model;
		this.year = year;
	}

	//Encapsulation
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	
	public void setYear(Integer year) {
		if(year == 1900) {
			this.year = year;
		}
		if(year == 2000) {
			System.out.println("toto");
		}
		this.year = 1900;
	}

	
	

	@Override
	public String toString() {
		return "Car [model=" + model + ", year=" + year + "]";
	}
	
	//Alt + Shift + s
	
}
