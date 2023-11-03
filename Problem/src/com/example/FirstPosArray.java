package com.example;

import java.util.Arrays;
import java.util.List;
//import java.util.Optional;

public class FirstPosArray {

	public static void main(String[] args) {
		List<String> list=Arrays.asList("a","b","c");
		Object findFirst = list.stream().findFirst();
		System.out.println(findFirst);

	}

}
