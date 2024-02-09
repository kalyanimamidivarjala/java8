package com.sathya.java8;
interface Operations{
	public void mul(int num1,int num2);
		
	}

public class Ass2 {

	public static void main(String[] args) {
		Operations op1=(int num1,int num2)->System.out.println(num1*num2);
		op1.mul(20, 6);
		Operations op2=(int num1,int num2)->System.out.println(num1*num2);
		op2.mul(22, 6);

	}

}
