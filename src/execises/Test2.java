package execises;

/**
 * Given an array of positive integers (excluding zero) and a target number.
 * Detect whether there is a set of consecutive elements in the array that add
 * up to the target.
 * <p>
 * Example: a = {1, 3, 5, 7, 9} <br>
 * target = 8 <br>
 * output = true, {3, 5}
 * <p>
 * or target = 15 <br>
 * output = true, {3, 5, 7}
 * <p>
 * but if target = 6, output would be false. since 1 and 5 are not next to each
 * other.
 */

public class Test2 {
	public static final boolean consecutiveSubsetThatSumsTargetExists(int array[], int target) {
		main: for (int i = 0; i < array.length - 1; i++) {
			int acc = 0;
			for (int j = i; j < array.length - 1; j++) {
				if (array[j] == target || array[j] + acc == target)
					return true;
				if (array[j] > target || acc > array[j])
					continue main;
				acc += array[j];
			}
		}
		return false;
	}
}