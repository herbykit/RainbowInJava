package net.ddns.kaigrealms;

import java.awt.Color;

import javax.swing.JFrame;

public class RainbowInJava {
	static int red = 0;
	static int green = 0;
	static int blue = 0;
	static int bright = 100;
	static String which = "Mono";
	static JFrame frame;

	private static void updateBackground() {
		int bRed = bright * red / 100;
		int bGreen = bright * green / 100;
		int bBlue = bright * blue / 100;
		frame.setBackground(new Color(255, bRed, bGreen, bBlue));
		switch (which) {
		case "Mono":
			calcMono(frame.getBackground());
			break;
		case "Complementary":
			calcComplementary(frame.getBackground());
			break;
		case "Analogous":
			calcAnalogous(frame.getBackground());
			break;
		case "Triadic":
			calcTriadic(frame.getBackground());
			break;
		}
	}

	private String makeRGBString(Color c) { // To get the R G B values
		return c.getRed() + "-" + c.getGreen() + "-" + c.getBlue();
	}

	private String makeHexString(Color c) { // To get the hexadecimal
		return "#" + Integer.toHexString(c.getRed()) + Integer.toHexString(c.getGreen())
				+ Integer.toHexString(c.getBlue());
	}

	private boolean checkText(String txt, int max) { // Checks if the typed text in the text box is valid (not negative, not over 255)
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

	private static void calcComplementary(Color c) {
		Color[] panelColors = new Color[4];
		int tempRed = bright * red / 100;
		int tempGreen = bright * green / 100;
		int tempBlue = bright * blue / 100;

		int compRed = 255 - tempRed;
		int compGreen = 255 - tempGreen;
		int compBlue = 255 - tempBlue;

		panelColors[0] = new Color(255, compRed * 2 / 3, compGreen * 2 / 3, compBlue * 2 / 3);
		panelColors[1] = new Color(255, compRed + (255 - compRed) * 3 / 4, compGreen + (255 - compGreen) * 3 / 4,
				compBlue + (255 - compBlue) * 3 / 4);
		panelColors[2] = new Color(255, tempRed * 2 / 3, tempGreen * 2 / 3, tempBlue * 2 / 3);
		panelColors[3] = new Color(255, tempRed + (255 - tempRed) * 3 / 4, tempGreen + (255 - tempGreen) * 3 / 4,
				tempBlue + (255 - tempBlue) * 3 / 4);

		// panel2
		/**
		 * tlHex tlRgb
		 */
		// panel1.BackColor = panelColors[0]; // Will have to define these later
		// tlRgb.Text = makeRGBString(panelColors[0]);
		// tlHex.Text = makeHexString(panelColors[0]);

		// panel1
		/**
		 * trHex trRgb //
		 */
		// panel2.BackColor = panelColors[1];
		// trRgb.Text = makeRGBString(panelColors[1]);
		// trHex.Text = makeHexString(panelColors[1]);

		// panel4
		/**
		 * blHex blRgb //
		 */
		// panel3.BackColor = panelColors[2];
		// blRgb.Text = makeRGBString(panelColors[2]);
		// blHex.Text = makeHexString(panelColors[2]);

		// panel3
		/**
		 * brHex brRgb //
		 */
		// panel4.BackColor = panelColors[3];
		// brRgb.Text = makeRGBString(panelColors[3]);
		// brHex.Text = makeHexString(panelColors[3]);

	}

	private static void calcAnalogous(Color c) {
		Color[] panelColors = new Color[4];
		int tempRed = bright * red / 100;
		int tempGreen = bright * green / 100;
		int tempBlue = bright * blue / 100;

		int tempRedA = (tempRed * 3 + tempGreen * 2) / 5;
		int tempGreenA = (tempBlue * 2 + tempGreen * 3) / 5;
		int tempBlueA = (tempRed * 2 + tempBlue * 3) / 5;

		int tempRedB = (tempRed * 3 + tempBlue * 2) / 5;
		int tempGreenB = (tempRed * 2 + tempGreen * 3) / 5;
		int tempBlueB = (tempGreen * 2 + tempBlue * 3) / 5;

		panelColors[0] = new Color(255, tempRedA * 2 / 3, tempGreenA * 2 / 3, tempBlueA * 2 / 3);
		panelColors[1] = new Color(255, tempRedA + (255 - tempRedA) * 5 / 6, tempGreenA + (255 - tempGreenA) * 5 / 6,
				tempBlueA + (255 - tempBlueA) * 5 / 6);
		panelColors[2] = new Color(255, tempRedB * 8 / 9, tempGreenB * 8 / 9, tempBlueB * 8 / 9);
		panelColors[3] = new Color(255, tempRedB + (255 - tempRedB) * 1 / 2, tempGreenB + (255 - tempGreenB) * 1 / 2,
				tempBlueB + (255 - tempBlueB) * 1 / 2);

		// panel2
		/**
		 * tlHex tlRgb
		 */
		// panel1.BackColor = panelColors[0];
		// tlRgb.Text = makeRGBString(panelColors[0]);
		// tlHex.Text = makeHexString(panelColors[0]);

		// panel1
		/**
		 * trHex trRgb //
		 */
		// panel2.BackColor = panelColors[1];
		// trRgb.Text = makeRGBString(panelColors[1]);
		// trHex.Text = makeHexString(panelColors[1]);

		// panel4
		/**
		 * blHex blRgb
		 */
		// panel3.BackColor = panelColors[2];
		// blRgb.Text = makeRGBString(panelColors[2]);
		// blHex.Text = makeHexString(panelColors[2]);

		// panel3
		/**
		 * brHex brRgb
		 */
		// panel4.BackColor = panelColors[3];
		// brRgb.Text = makeRGBString(panelColors[3]);
		// brHex.Text = makeHexString(panelColors[3]);

	}

	private static void calcMono(Color c) {

		Color[] panelColors = new Color[4];
		int tempRed = bright * red / 100;
		int tempGreen = bright * green / 100;
		int tempBlue = bright * blue / 100;

		panelColors[0] = new Color(255, tempRed * 1 / 3, tempGreen * 1 / 3, tempBlue * 1 / 3);
		panelColors[1] = new Color(255, tempRed * 2 / 3, tempGreen * 2 / 3, tempBlue * 2 / 3);
		panelColors[2] = new Color(255, tempRed + (255 - tempRed) * 1 / 2, tempGreen + (255 - tempGreen) * 1 / 2,
				tempBlue + (255 - tempBlue) * 1 / 2);
		panelColors[3] = new Color(255, tempRed + (255 - tempRed) * 4 / 5, tempGreen + (255 - tempGreen) * 4 / 5,
				tempBlue + (255 - tempBlue) * 4 / 5);

		// panel2
		/**
		 * tlHex tlRgb
		 */
		// panel1.BackColor = panelColors[0];
		// tlRgb.Text = makeRGBString(panelColors[0]);
		// tlHex.Text = makeHexString(panelColors[0]);

		// panel1
		/**
		 * trHex trRgb
		 */
		// panel2.BackColor = panelColors[1];
		// trRgb.Text = makeRGBString(panelColors[1]);
		// trHex.Text = makeHexString(panelColors[1]);

		// panel4
		/**
		 * blHex blRgb
		 */
		// panel3.BackColor = panelColors[2];
		// blRgb.Text = makeRGBString(panelColors[2]);
		// blHex.Text = makeHexString(panelColors[2]);

		// panel3
		/**
		 * brHex brRgb
		 */
		// panel4.BackColor = panelColors[3];
		// brRgb.Text = makeRGBString(panelColors[3]);
		// brHex.Text = makeHexString(panelColors[3]);
	}

	private static void calcTriadic(Color c) {

		Color[] panelColors = new Color[4];
		int tempRed = bright * red / 100;
		int tempGreen = bright * green / 100;
		int tempBlue = bright * blue / 100;

		panelColors[0] = new Color(255, tempGreen * 2 / 3, tempBlue * 2 / 3, tempRed * 2 / 3);
		panelColors[1] = new Color(255, tempGreen + (255 - tempGreen) * 3 / 5, tempBlue + (255 - tempBlue) * 3 / 5,
				tempRed + (255 - tempRed) * 3 / 5);
		panelColors[2] = new Color(255, tempBlue * 2 / 3, tempRed * 2 / 3, tempGreen * 2 / 3);
		panelColors[3] = new Color(255, tempBlue + (255 - tempBlue) * 3 / 5, tempRed + (255 - tempRed) * 3 / 5,
				tempGreen + (255 - tempGreen) * 3 / 5);

		// panel2
		/**
		 * tlHex tlRgb //
		 */
		// panel1.BackColor = panelColors[0];
		// tlRgb.Text = makeRGBString(panelColors[0]);
		// tlHex.Text = makeHexString(panelColors[0]);

		// panel1
		/**
		 * trHex trRgb
		 */
		// panel2.BackColor = panelColors[1];
		// trRgb.Text = makeRGBString(panelColors[1]);
		// trHex.Text = makeHexString(panelColors[1]);

		// panel4
		/**
		 * blHex blRgb
		 */
		// panel3.BackColor = panelColors[2];
		// blRgb.Text = makeRGBString(panelColors[2]);
		// blHex.Text = makeHexString(panelColors[2]);

		// panel3
		/**
		 * brHex brRgb
		 */
		// panel4.BackColor = panelColors[3];
		// brRgb.Text = makeRGBString(panelColors[3]);
		// brHex.Text = makeHexString(panelColors[3]);
	}

}
