package model;

import java.util.Random;

public class Input {
	
	private int value;
	private double weight;
	
	public Input(int value) {
		this.setValue(value);
		this.setWeight(new Random().nextGaussian());
	}

	public double getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

}
