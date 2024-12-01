package com.arth;

public class Calculator {
	
	public static void main(String[] args) {
		
		int out=sumOfTwoNumbers(1, 2);
		System.out.println(out);
		
		System.out.println(isPrime(7));
	}
	
	public static int sumOfTwoNumbers(int n1,int n2) {
		return n1+n2;
	}
	
	public static boolean isPrime(int n){
		int i,f=0;
		for(i=2;i<=n/2;i++){
			if(n%i==0){
				f=1;
				break;
			}
		}
		if(f==0){
			return true;
		}else{
			return false;
		}
	}

}
