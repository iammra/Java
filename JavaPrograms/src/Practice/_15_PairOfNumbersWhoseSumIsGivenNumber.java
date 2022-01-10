package Practice;

import java.util.HashMap;
import java.util.Map;

public class _15_PairOfNumbersWhoseSumIsGivenNumber {

	public static void main(String args[]) {
		int[] inputNumber = { 4, 6, 5, -10, 8, 5, 20 };
		int sum = 10;

		System.out.println("Pairs of elements whose sum is " + sum + " are : ");

		for (int i = 0; i < inputNumber.length; i++) {
			for (int j = i + 1; j < inputNumber.length; j++) {
				if (inputNumber[i] + inputNumber[j] == sum) {
					System.out.println(inputNumber[i] + " + " + inputNumber[j] + " = " + sum);
				}
			}
		}
		
		int[] nums = { 8, 7, 2, 5, 3, 1 };
		int target = 10;
		findPair(nums, target);
		
	}

	// Function to find a pair in an array with a given sum using hashing
	public static void findPair(int[] nums, int target) {
		
		// create an empty HashMap
		Map<Integer, Integer> map = new HashMap<>();

		// do for each element
		for (int i = 0; i < nums.length; i++) {
			// check if pair (nums[i], target-nums[i]) exists

			// if the difference is seen before, print the pair
			if (map.containsKey(target - nums[i])) {
				System.out.printf("Pair found (%d, %d)", nums[map.get(target - nums[i])], nums[i]);
				return;
			}

			// store index of the current element in the map
			map.put(nums[i], i);
		}

		// we reach here if the pair is not found
		System.out.println("Pair not found");

	}
}
