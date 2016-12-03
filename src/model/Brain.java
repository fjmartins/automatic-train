package model;

import java.util.ArrayList;
import java.util.List;

public class Brain {

	public static final int threshold = 1;
	public static final double alpha = 0.2;

	private Neuron neuron;

	private Double[][] inputs = { { 0d, 0d }, { 0d, 1d }, { 1d, 0d }, { 1d, 1d } };

	private Double[] desired = { 0d, 0d, 0d, 1d };

	public Brain() {
		setNeuron(new Neuron(inputs[0].length));
	}

	public void think() {
		//Setting inputs to neurons
		int counter = 0;
		while(counter < 10) {			
			for (int i = 0; i < this.inputs.length; i++) {
				List<Double> inputs = new ArrayList<Double>();
				inputs.add(1d);
				for (int j = 0; j < this.inputs[i].length; j++) {
					inputs.add(this.inputs[i][j]);
				}
				
				neuron.setInputs(inputs.toArray(this.inputs[i]));
				double net = neuron.getNet();
				int fnet = neuron.f(net);
				boolean madeMistake = fnet == desired[i] ? false : true;
				
				if(madeMistake) {
					System.out.println("I made a mistake! Error: " + (desired[i]- net));
					learn(fnet, i);				
				} else {
					System.out.println("I got it! " + (desired[i]- net));
				} 
			}
			counter++;
		}
	}
	
	public void learn(double fnet, int iteration) {
		for(int j = 0; j < neuron.getWeights().length; j++) {
			neuron.getWeights()[j] = neuron.getWeights()[j] + alpha * (fnet - desired[iteration]) * neuron.getInputs()[j]; 
		}
	}

	public Neuron getNeuron() {
		return neuron;
	}

	public void setNeuron(Neuron neuron) {
		this.neuron = neuron;
	}

}