package substringMinWindow;
/*
 * 
 * 76. Minimum Window Substring
Given a string S and a string T, find the minimum window in S which will contain all the characters in T in complexity O(n).

For example,
S = "ADOBECODEBANC"
T = "ABC"
Minimum window is "BANC".

Note:
If there is no such window in S that covers all characters in T, return the empty string "".

If there are multiple such windows, you are guaranteed that there will always be only one unique minimum window in S.
 */
public class SubstringMinWindow {

	public static void main(String args[]) {
		String S = "AGBDECBFA";
//		String S = "ADBECFDEBAFC";
		String T = "ABC";

//		System.out.println("0123456789".substring(1, 5));
		System.out.println(minWindow(S, T));
	}

	public static String minWindow(String s, String t) {
		int[] tMap = new int[256];
		for (char c : t.toCharArray()) {
			tMap[c]++;
		}

		int min = Integer.MAX_VALUE, from = 0, total = t.length();
		for (int i = 0, j = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (tMap[ch] > 0) {
				total--;
			}
			tMap[ch]--;
			while (total == 0) { // total=0 means valid window
				if (i - j + 1 < min) {
					min = i - j + 1;
					from = j;
				}

				char ch2 = s.charAt(j);
				tMap[ch2]++;
				if (tMap[ch2] > 0) {
					total++;
				}

				j++;
			}
		}
		return (min == Integer.MAX_VALUE) ? "" : s.substring(from, from + min);
	}
}
