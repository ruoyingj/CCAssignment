package ch5;

public class Solution05 {

	/* (n - 1) means that from the rightmost 1, change it to 0
	 * If the bits on the right of 1 has 0s, change all the 0s to 1.
	 * n && (n-1) == 0 means that there are no common bit in two bit sequnces.
	 * From the rightmost 1 which we changed to the end, all the bits are different.
	 * If n && (n-1) == 0, which means from the left to the rightmose 1, all the bits is 0.
	 * So that we can find n is the power of 2.
	 * 
	 */
}
