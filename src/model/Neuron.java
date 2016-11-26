package model;

import java.util.List;

public class Neuron {
	
	private List<Input> inputs;
	private double expectedOutput;
	private double output = 0;
	
	public Neuron(List<Input> inputs, double expectedOutput) {
		setInputs(inputs);
		this.setExpectedOutput(expectedOutput);
		think();
	}

	public double getOutput() {
		return output;
	}

	public void setOutput(double output) {
		this.output = output;
	}

	public List<Input> getInputs() {
		return inputs;
	}

	public void setInputs(List<Input> inputs) {
		this.inputs = inputs;
	}
	
	public double getExpectedOutput() {
		return expectedOutput;
	}
	
	public void setExpectedOutput(double expectedOutput) {
		this.expectedOutput = expectedOutput;
	}
	
	public void think() {
		for(Input input : inputs) {
			output += input.getValue() * input.getWeight();			
		}
		
	}
	
}
