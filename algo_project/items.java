package algo_project;

public class items {

	public double value, weight,perValue;
	public int id;
	public boolean used;

	public items(double value, double weight, int id) {
		super();
		this.value = value;
		this.weight = weight;
		this.perValue = value / weight;
		this.id = id;
	}

	public void print() {
		System.out.println("Value : " + value + " Weight : " + weight + " PerValue : " + perValue + " id : " + id + " used "+ used);
	}

	public double getPerValue() {
		return perValue;
	}

	public void setPerValue(double perValue) {
		this.perValue = perValue;
	}

}
