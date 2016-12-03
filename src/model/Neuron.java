package model;

import util.Util;

public class Neuron {

	private Double[] inputs;
	private Double[] weights;
	private Double net;

	public Neuron(int input_length) {
		weights = new Double[input_length + 1];

		for (int i = 0; i < weights.length; i++) {
			weights[i] = Util.randDouble(0.5);
		}
	}

	public Double[] getInputs() {
		return inputs;
	}

	public void setInputs(Double[] inputs) {
		this.inputs = inputs;
	}

	public Double[] getWeights() {
		return weights;
	}

	public void setWeights(Double[] weights) {
		this.weights = weights;
	}
	
	public int f(Double net) {
		return net > 0 ? 1 : 0; 
	} 

	public Double getNet() {		
		net = 0d;
		
		for (int i = 0; i < inputs.length; i++) {
			net += inputs[i] * weights[i];
		}

		return net;
	}

	public void setNet(Double net) {
		this.net = net;
	}

}
