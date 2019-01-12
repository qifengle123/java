package com.dzj.testLambda;

public class AppleRedAndHeavyPredicate implements ApplePredicate{

	@Override
	public boolean test(Apple apple) {
		
		return "red".equals(apple.getColors()) && apple.getWeight() >150;
	}

}
