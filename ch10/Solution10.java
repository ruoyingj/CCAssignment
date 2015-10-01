package ch10;

public class Solution10 {
	static Node root = null;

	void track(int value) {
		if (root == null) {
			Node root = new Node(value);
		} else {
			root.insert(value);
		}
	}

	public static int getRankOfNumber(int value) {
		int result = root.NodeRank(value);
		return result;

	}

	class Node {
		public int value;
		public Node left;
		public Node right;

		public Node(int value) {
			this.value = value;
		}

		int size_left = 0;

		public void insert(int number) {
			if (number <= value) {
				if (left == null) {
					Node temp = new Node(number);
					left = temp;
					size_left += 1;
				} else
					left.insert(number);
			} else {
				if (right == null) {
					Node temp = new Node(number);
					right = temp;
				} else {
					right.insert(number);
				}
			}

		}

		public int NodeRank(int target) {
			if (value == target) {
				return size_left;
			} else if (value < target) {
				if (left == null) {
					return -1;
				} else return left.NodeRank(target);
			} else {
				int size_right;
				
				if (right == null) {
					size_right = -1;
				} else {
					size_right = right.NodeRank(target);
				}

				if (size_right == -1)return -1;
			    else return size_right + size_left + 1;
				

			}


		}
	}

}
