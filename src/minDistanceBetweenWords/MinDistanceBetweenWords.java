package minDistanceBetweenWords;

public class MinDistanceBetweenWords {

	public static void main(String[] args) {
		String[] strArray = {"the","quick","brown","fox","quick"};
	    String str1 = "quick";
	    String str2 = "fox";
	    minDistance(strArray,str1,str2);
	}

	public static void minDistance(String[] strings, String one, String two) {
		int index1 = -1;
		int index2 = -1;
		int minDistance = Integer.MAX_VALUE;
		int tempDistance = 0;

		for (int x = 0; x < strings.length; x++) {
			if (strings[x].equals(one)) {
				index1 = x;
			}
			if (strings[x].equals(two)) {
				index2 = x;
			}
			if (index1 != -1 && index2 != -1) { // both words have to be found
				tempDistance = (int) Math.abs(index2 - index1);
				if (tempDistance < minDistance) {
					minDistance = tempDistance;
				}
			}
		}

		System.out.println("Distance:\t" + minDistance);
	}
}
