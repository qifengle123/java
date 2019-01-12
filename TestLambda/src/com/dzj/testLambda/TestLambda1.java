package com.dzj.testLambda;

public class TestLambda1 {
	public static void main(String[] args) {
           AppleRedAndHeavyPredicate predicate = new AppleRedAndHeavyPredicate();
           predicate.test(apple);
	}
}
