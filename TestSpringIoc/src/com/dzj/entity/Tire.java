package com.dzj.entity;

import java.io.Serializable;
/**
 * 上层控制下层  而不是下层控制上层
 * */
public class Tire implements Serializable {
	private static final long serialVersionUID = -3475694989197797809L;
	private int size;

	Tire(int size) {
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

}
