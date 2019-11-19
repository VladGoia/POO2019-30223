package javasmmr.zoowsome.models.employees;

import java.math.BigDecimal;

public class Manager extends Employee {

	public Manager() {
		this.name = "Manager";
		this.id = (long) -1;
		this.salary = new BigDecimal(2500);
		this.isDead = false;
	}

}