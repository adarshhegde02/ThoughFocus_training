package com.thought_focus.Morning.string;

public class StringTest {
	public static void main(String[] args) {
		String str1 = "Rahul";
		System.out.println(str1);
		System.out.println(str1.charAt(3));
		System.out.println(str1.length());
		String str2 = " Dravid";
		System.out.println(str1.concat(str2));
		String str3 = new String("Rahul");
		System.out.println(str1.compareTo(str3));
		String str4 = "vid";
		System.out.println(str2.contains(str4));
		String str5="Rahul Dravid";
		System.out.println(str5.split(" "));
	}
}
