package com.fiona.test;

public class ReplaceString {

	public static void main(String[] args) {

		String str = "java转义(补遗)";
		String replaceStr = str.replaceFirst("\\(补遗\\)", "");
		// replaceStr = str.replaceFirst("(补遗)", "");
		System.out.println(replaceStr);

	}
}
