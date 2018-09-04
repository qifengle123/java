package com.dzj.entity;

import java.io.Serializable;

public class Framwork implements Serializable {

	private static final long serialVersionUID = 485413362216237393L;

	private Bottom bottom;

	public Framwork(int size) {
		this.bottom = new Bottom(size);
	}

	public Bottom getBottom() {
		return bottom;
	}

	public void setBottom(Bottom bottom) {
		this.bottom = bottom;
	}

}
