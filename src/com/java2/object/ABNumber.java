package com.java2.object;

public class ABNumber {
	String number ;
	public ABNumber( String number) {
		this.number = number;
	}
	//validate 只是用來表達驗證,可自己改別的名稱
	public int validate(String secret) {
		int result = 0;
		int length = secret.length();
		for(int i=0; i<number.length(); i++) {
			char c = number.charAt(i);
			for(int j=0; j<secret.length();j++) {
				if(c == secret.charAt(j)) {
					if(i == j) {
						result = result +10;
					}else {
						result += 1;
					}
					break;
				}
			}
		}
		return result;
	}
}

