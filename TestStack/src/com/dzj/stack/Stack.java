package com.dzj.stack;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack {
     private Object[] elements;
     private int size = 0;
     private static final int DEFALULT_INITIAL_CAPACITY = 16;
     
     public Stack(){
    	 elements = new Object[DEFALULT_INITIAL_CAPACITY];
     }
     public Object pop(){
    	 if(size == 0)
    		 throw new EmptyStackException();
    	 Object result = elements[--size];
    	 elements[size] = null;
    	 return elements[--size];
     }
     public void push(Object e){
    	 ensureCapacity();
    	 elements[size ++] = e;
     }
     private void ensureCapacity(){
    	 if(elements.length == size){
    		 elements = Arrays.copyOf(elements, 2*size + 1);
    	 }
     }
}
