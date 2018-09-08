package com.dzj.study.testHashCodeAndEquals;

import java.io.Serializable;

public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6120811298965304951L;

	private String name;

	private String idCard;

	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean equals(Object obj) {
		if (obj instanceof User) {
			User user = (User) obj;
			if (user.getIdCard().equals(this.idCard) && user.getName().equals(this.name) && user.getAge() == this.age) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}

	}
    public int hashCode(){
    	int result = name.hashCode();
    	result = 31*result + idCard.hashCode();
    	result = 31*result + age;
    	return result;
    }
}
