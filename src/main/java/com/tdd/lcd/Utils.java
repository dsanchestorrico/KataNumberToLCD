package com.tdd.lcd;

public class Utils {

	public static String join(String[] strings, char delim) {
		StringBuffer sb = new StringBuffer();
		for (String string : strings) {
			if (sb.length() > 0)
				sb.append(delim);
			sb.append(string);
		}
		return sb.toString();
	}

	public static String[] arrangeHorizontally(String[][] data) {
		assert data.length > 0;

		String[] result = data[0].clone();
		for (int row = 1; row < data.length; row++) {
			for (int col = 0; col < data[row].length; col++)
				result[col] += data[row][col];
		}
		return result;
	}

}
