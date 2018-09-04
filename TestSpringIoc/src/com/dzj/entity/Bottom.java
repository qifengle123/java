package com.dzj.entity;

import java.io.Serializable;

public class Bottom implements Serializable {

	private static final long serialVersionUID = 5246935796041757732L;
	private Tire tire;
    
	Bottom(Tire tire) {
		this.tire = tire;
	}

	public Tire getTire() {
		return tire;
	}

	public void setTire(Tire tire) {
		this.tire = tire;
	}
    
}
