package com;

import java.util.*;

public class Palindrome {

public static boolean Number(int num) {
		
		int remainder, storeOriginalNumber, sum;
		sum = 0;
		
		storeOriginalNumber = num;
		
		while(num > 0) {
			
			remainder = num % 10;
			sum = (sum*10) + remainder;
			num = num / 10;
			
		}
		
		if(storeOriginalNumber != sum) {
			return false;
		}
		
		return true;
	}

}
