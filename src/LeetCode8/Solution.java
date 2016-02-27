package LeetCode8;

//Requirements for atoi:
//The function first discards as many whitespace characters as necessary until the first non-whitespace character is found. Then, starting from this character, takes an optional initial plus or minus sign followed by as many numerical digits as possible, and interprets them as a numerical value.
//
//The string can contain additional characters after those that form the integral number, which are ignored and have no effect on the behavior of this function.
//
//If the first sequence of non-whitespace characters in str is not a valid integral number, or if no such sequence exists because either str is empty or it contains only whitespace characters, no conversion is performed.
//
//If no valid conversion could be performed, a zero value is returned. If the correct value is out of the range of representable values, INT_MAX (2147483647) or INT_MIN (-2147483648) is returned.

import java.util.*;

public class Solution {
	public static int myAtoi(String str){
		char[] splitStr =  str.toCharArray();
		int length = splitStr.length;
		int iter = 0;
		Boolean flagStart = false;
		Character startChar = null;
		List<Character> storeStringList =  new ArrayList<Character>();
		while (iter < length) {
			if (flagStart == false && splitStr[iter] == ' ') {
				iter++;
				continue;
			}else if (!(splitStr[iter]== ' ') && flagStart == false) {
				flagStart = true;
				if (splitStr[iter] > '9'|| splitStr[iter] < '0') {
					startChar = splitStr[iter];
				}else {
					storeStringList.add(splitStr[iter]);
				}
			}else if ((splitStr[iter] > '9'|| splitStr[iter] < '0') && flagStart == true){
				break;
			}else {
				storeStringList.add(splitStr[iter]);
			};
			iter ++;
		}
		if (flagStart == false){
			return 0;
		}
		
		if (!(startChar == null||startChar == '+' || startChar == '-' || (startChar <= '9' && startChar >= '0'))) {
			return 0;
		}
		Long sum = (long) 0;
		for (int i = storeStringList.size() - 1; i >= 0; i--) {
			int tempInt = Integer.parseInt(String.valueOf(storeStringList.get(i)));
			Long tempMultiply = (long) tempInt;
			int multiCount = i;
		
//			while (multiCount < storeStringList.size() - 1) {
//				tempMultiply = tempMultiply * 10;
//				multiCount = multiCount + 1;
//			}
			sum = sum * 10 + tempMultiply;
			
			if (startChar == null) {
				if (sum > Integer.MAX_VALUE) {
					return Integer.MAX_VALUE;
				}
			}else if (startChar == '-') {
				if (-sum < Integer.MIN_VALUE) {
					return Integer.MIN_VALUE;
				} 
			}else {
				if (sum > Integer.MAX_VALUE) {
					return Integer.MAX_VALUE;
				}
			}
		}
		
		if (startChar == null) {
			return (int) (long)sum;
		}else if (startChar == '-') {
				return (int) -(long)sum;
		}else {
				return (int) (long)sum;
		}
	}
	
	public static void main(String[] args){
		 
//		System.out.println(new String("   -112255809ssstt  ").trim());
//		Integer.MAX_VALUE
		System.out.println(Integer.MAX_VALUE);
		System.out.println(- 9 % 10);
		System.out.println(Integer.MIN_VALUE);
//		System.out.println(myAtoi("  44444sssss"));
	}
}
