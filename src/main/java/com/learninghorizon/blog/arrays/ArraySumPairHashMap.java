package com.learninghorizon.blog.arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class ArraySumPairHashMap {

	public static void matchingTargetSumPair(int[] input, int target) {
		Map<Integer, Integer> targetMap = new HashMap<Integer, Integer>();
		for (int i = 0; i < input.length; i++) {
			targetMap.put(input[i], target - input[i]);
			if (targetMap.containsKey(target - input[i])) {
				System.out.println("Mathcing Pair: " + (target - input[i]) + " , " + input[i]);
			}
		}
	}

	public static void main(String[] args) {
		int[] targetInput = { 1, 4, 45, 6, 10, 8 };
		int target = 16;
//		matchingTargetSumPair(targetInput, target);

		IntStream intStream = IntStream.of(targetInput);
		targetInput[3] = 9000;
		intStream.forEach(System.out::println);

	}

}
