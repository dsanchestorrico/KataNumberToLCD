package com.tdd.lcd;

import java.util.HashMap;
import java.util.Map;

public class Drawer {
	private static final String _NONE = "   ";
	private static final String _LEFT = "  |";
	private static final String _MIDL = " _ ";
	private static final String _MDLT = " _|";
	private static final String _MDRT = "|_ ";
	private static final String _FULL = "|_|";
	private static final String _BOTH = "| |";

	private static final Map<Integer, String[]> _SEGMENTS_FOR = new HashMap<Integer, String[]>() {
		{
			put(new Integer(1), new String[] { _NONE, _LEFT, _LEFT });
			put(new Integer(2), new String[] { _MIDL, _MDLT, _MDRT });
			put(new Integer(3), new String[] { _MIDL, _MDLT, _MDLT });
			put(new Integer(4), new String[] { _NONE, _FULL, _LEFT });
			put(new Integer(5), new String[] { _MIDL, _MDRT, _MDLT });
			put(new Integer(6), new String[] { _MIDL, _MDRT, _FULL });
			put(new Integer(7), new String[] { _MIDL, _LEFT, _LEFT });
			put(new Integer(8), new String[] { _MIDL, _FULL, _FULL });
			put(new Integer(9), new String[] { _MIDL, _FULL, _MDLT });
			put(new Integer(0), new String[] { _MIDL, _BOTH, _FULL });
		}
	};

	public static String ToLCDNumber(int number) {
		String[][] segments = getSegmentsForEachDigit(number);
		String[] result = Utils.arrangeHorizontally(segments);
		return toTextLines(result);
	}

	private static String toTextLines(String[] result) {
		return Utils.join(result, '\n');
	}

	private static String[][] getSegmentsForEachDigit(int number) {
		String digits = Integer.toString(number);
		String[][] result = new String[digits.length()][];
		for (int digitIndex = 0; digitIndex < digits.length(); digitIndex++) {
			result[digitIndex] = segmentsFor(digitAt(digits, digitIndex));
		}
		return result;
	}

	private static int digitAt(String digits, int i) {
		return Integer.parseInt(Character.toString(digits.charAt(i)));
	}

	private static String[] segmentsFor(int number) {
		String result[] = _SEGMENTS_FOR.get(new Integer(number));
		if (null == result)
			throw new RuntimeException(String.format("Digit %d not found", number));
		return result;
	}
}

