package edu.ncsu.csc226crew;

import java.awt.Color;

public class RainbowInJava {

	public static Color[] updateBackground(Color color, int bright, String which) { // return panelcolors
		int bRed = bright * color.getRed() / 100;
		int bGreen = bright * color.getGreen() / 100;
		int bBlue = bright * color.getBlue() / 100;
		
		switch (which) { // first call to Mono
		case "Mono":
			return calcMono(color, bRed, bGreen, bBlue); // add in the panels that frame has for the 3 generated related colours
		case "Complementary":
			return calcComplementary(color, bRed, bGreen, bBlue);
		case "Analogous":
			return calcAnalogous(color, bRed, bGreen, bBlue);
		case "Triadic":
			return calcTriadic(color, bRed, bGreen, bBlue);
		default:
			return calcMono(color, bRed, bGreen, bBlue);
		}
	}

	public static String makeRGBString(Color c) { // To get the R G B values
		return c.getRed() + "-" + c.getGreen() + "-" + c.getBlue();
	}

	public static String makeHexString(Color c) { // To get the hexadecimal
		return "#" + Integer.toHexString(c.getRed()) + Integer.toHexString(c.getGreen())
				+ Integer.toHexString(c.getBlue());
	}

	public static boolean checkText(String txt, int max) { // Checks if the typed text in the text box is valid (not negative, not over 255)
		if (txt.equals(""))
			return false;
		try {
			int a = Integer.parseInt(txt);
			if (a < 0 || a > max) {
				return false;
			}
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public static Color[] calcComplementary(Color c, int tempRed, int tempGreen, int tempBlue) {
		Color[] panelColors = new Color[4];
		
		int compRed = 255 - tempRed;
		int compGreen = 255 - tempGreen;
		int compBlue = 255 - tempBlue;

		panelColors[0] = new Color(compRed * 2 / 3, compGreen * 2 / 3, compBlue * 2 / 3);
		panelColors[1] = new Color(compRed + (255 - compRed) * 3 / 4, compGreen + (255 - compGreen) * 3 / 4,
				compBlue + (255 - compBlue) * 3 / 4);
		panelColors[2] = new Color(tempRed * 2 / 3, tempGreen * 2 / 3, tempBlue * 2 / 3);
		panelColors[3] = new Color(tempRed + (255 - tempRed) * 3 / 4, tempGreen + (255 - tempGreen) * 3 / 4,
				tempBlue + (255 - tempBlue) * 3 / 4);
		
		return panelColors;

	}

	public static Color[] calcAnalogous(Color c, int tempRed, int tempGreen, int tempBlue) {
		Color[] panelColors = new Color[4];

		int tempRedA = (tempRed * 3 + tempGreen * 2) / 5;
		int tempGreenA = (tempBlue * 2 + tempGreen * 3) / 5;
		int tempBlueA = (tempRed * 2 + tempBlue * 3) / 5;

		int tempRedB = (tempRed * 3 + tempBlue * 2) / 5;
		int tempGreenB = (tempRed * 2 + tempGreen * 3) / 5;
		int tempBlueB = (tempGreen * 2 + tempBlue * 3) / 5;

		panelColors[0] = new Color(tempRedA * 2 / 3, tempGreenA * 2 / 3, tempBlueA * 2 / 3);
		panelColors[1] = new Color(tempRedA + (255 - tempRedA) * 5 / 6, tempGreenA + (255 - tempGreenA) * 5 / 6,
				tempBlueA + (255 - tempBlueA) * 5 / 6);
		panelColors[2] = new Color(tempRedB * 8 / 9, tempGreenB * 8 / 9, tempBlueB * 8 / 9);
		panelColors[3] = new Color(tempRedB + (255 - tempRedB) * 1 / 2, tempGreenB + (255 - tempGreenB) * 1 / 2,
				tempBlueB + (255 - tempBlueB) * 1 / 2);
		
		return panelColors;

	}

	public static Color[] calcMono(Color c, int tempRed, int tempGreen, int tempBlue) {
		Color[] panelColors = new Color[4];

		panelColors[0] = new Color(tempRed * 1 / 3, tempGreen * 1 / 3, tempBlue * 1 / 3);
		panelColors[1] = new Color(tempRed * 2 / 3, tempGreen * 2 / 3, tempBlue * 2 / 3);
		panelColors[2] = new Color(tempRed + (255 - tempRed) * 1 / 2, tempGreen + (255 - tempGreen) * 1 / 2,
				tempBlue + (255 - tempBlue) * 1 / 2);
		panelColors[3] = new Color(tempRed + (255 - tempRed) * 4 / 5, tempGreen + (255 - tempGreen) * 4 / 5,
				tempBlue + (255 - tempBlue) * 4 / 5);
		
		return panelColors;
	}

	public static Color[] calcTriadic(Color c, int tempRed, int tempGreen, int tempBlue) {

		Color[] panelColors = new Color[4];

		panelColors[0] = new Color(tempGreen * 2 / 3, tempBlue * 2 / 3, tempRed * 2 / 3);
		panelColors[1] = new Color(tempGreen + (255 - tempGreen) * 3 / 5, tempBlue + (255 - tempBlue) * 3 / 5,
				tempRed + (255 - tempRed) * 3 / 5);
		panelColors[2] = new Color(tempBlue * 2 / 3, tempRed * 2 / 3, tempGreen * 2 / 3);
		panelColors[3] = new Color(tempBlue + (255 - tempBlue) * 3 / 5, tempRed + (255 - tempRed) * 3 / 5,
				tempGreen + (255 - tempGreen) * 3 / 5);
		
		return panelColors;
	}

}