package ch5;

import java.util.List;

public class Solution04 {
	int endIndex(List<Integer> list, int target) {
		int i = 0;
		while (list.get(i) < target && list.get(i) != -1) {
			i = i * 2;
		}
		return i;
	}

	int search(List<Integer> list, int target, int left, int right) {
		while (left <= right) {
			int mid = (left + right) / 2;
			if (list.get(mid) == target) {
				return mid;
			} else if (list.get(mid) == -1) {
				right = mid - 1;
			} else if (list.get(mid) > target) {
				right = mid - 1;
			} else if (list.get(mid) < target) {
				left = mid + 1;
			}
		}
		return -1;
	}

}
