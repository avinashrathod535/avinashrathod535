package com.pathlock;

public class Trainer {
	private String trainername;

	public Trainer() {
		super();
		System.out.println("I am in trainner default");
	}

	public Trainer(String trainername) {
		super();
		this.trainername = trainername;
	}

	public String getTrainername() {
		return trainername;
	}

	public void setTrainername(String trainername) {
		this.trainername = trainername;
	}

	@Override
	public String toString() {
		return "Trainer [trainername=" + trainername + "]";
	}

}
