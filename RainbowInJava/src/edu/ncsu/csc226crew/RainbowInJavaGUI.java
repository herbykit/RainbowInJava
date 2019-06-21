package edu.ncsu.csc226crew;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.SoftBevelBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class RainbowInJavaGUI {
	static int rednum = 0;
	static int greennum = 0;
	static int bluenum = 0;
	static int brightnum = 100;
	static String which = "Mono";

	public static void main(String[] args) {
		aRainbowInJavaGUI();
	}

	@SuppressWarnings("deprecation")
	private static void aRainbowInJavaGUI() {

		JFrame frame = new JFrame("Rainbow");
		frame.setSize(1200, 600);

		JPanel topPanel = new JPanel();
		topPanel.setSize(1200, 400);
		topPanel.setLayout(new GridBagLayout());

		JPanel panelLeft = new JPanel();
		panelLeft.setSize(400, 200);
		panelLeft.setBorder(new SoftBevelBorder(0, panelLeft.getBackground(), panelLeft.getBackground()));
		panelLeft.setLayout(new GridBagLayout()); // grid layout

		GridBagConstraints c = new GridBagConstraints();

		JLabel clrValues = new JLabel("Color Values");

		c.weightx = .5;
		c.gridx = 1;
		c.gridy = 0;
		c.ipady = 20;
		panelLeft.add(clrValues, c);

		JLabel red = new JLabel("Red");
		JTextField redText = new JTextField("0     ");
		redText.setAlignmentX(SwingConstants.RIGHT);
		redText.setSize(20, 15);
		JSlider redSlide = new JSlider();
		redSlide.setValue(0);
		redSlide.setMaximum(255);

		c.weightx = .25;
		c.gridx = 0;
		c.gridy = 1;
		panelLeft.add(red, c);

		c.weightx = .25;
		c.gridx = 1;
		c.gridy = 1;
		panelLeft.add(redText, c);

		c.weightx = .5;
		c.gridx = 2;
		c.gridy = 1;
		panelLeft.add(redSlide, c);

		JLabel green = new JLabel("Green");
		JTextField greenText = new JTextField("0     ");

		JSlider greenSlide = new JSlider();
		greenSlide.setValue(0);
		greenSlide.setMaximum(255);

		c.weightx = .25;
		c.gridx = 0;
		c.gridy = 2;
		panelLeft.add(green, c);

		c.weightx = .25;
		c.gridx = 1;
		c.gridy = 2;
		panelLeft.add(greenText, c);

		c.weightx = .5;
		c.gridx = 2;
		c.gridy = 2;
		panelLeft.add(greenSlide, c);

		JLabel blue = new JLabel("Blue");
		JTextField blueText = new JTextField("0     ");

		JSlider blueSlide = new JSlider();
		blueSlide.setValue(0);
		blueSlide.setMaximum(255);

		c.weightx = .25;
		c.gridx = 0;
		c.gridy = 3;
		panelLeft.add(blue, c);

		c.weightx = .25;
		c.gridx = 1;
		c.gridy = 3;
		panelLeft.add(blueText, c);

		c.weightx = .5;
		c.gridx = 2;
		c.gridy = 3;
		panelLeft.add(blueSlide, c);

		JLabel bright = new JLabel("Bright");
		JTextField brightText = new JTextField("100");
		JSlider brightSlide = new JSlider();
		brightSlide.setValue(100);
		brightSlide.setMaximum(100);

		c.weightx = .25;
		c.gridx = 0;
		c.gridy = 4;
		panelLeft.add(bright, c);

		c.weightx = .25;
		c.gridx = 1;
		c.gridy = 4;
		panelLeft.add(brightText, c);

		c.weightx = .5;
		c.gridx = 2;
		c.gridy = 4;
		panelLeft.add(brightSlide, c);

		JButton useValues = new JButton("Use Text Values");

		c.weightx = .5;
		c.gridx = 1;
		c.gridy = 5;
		panelLeft.add(useValues, c);

		////////////////////////////// right panel ///////////////////////////////////
		JPanel panelRight = new JPanel();
		panelRight.setSize(500, 500);

		JPanel container = new JPanel();
		container.setLayout(new GridLayout(7, 5));
		container.setSize(500, 500); // 250/2 = 125, 125/2 = 60 + 5/2 = 62.5

		// jtext on top
		JLabel blank = new JLabel();
		JLabel blank1 = new JLabel();
		JLabel clrScheme = new JLabel("Color Scheme");
		JLabel blank2 = new JLabel();
		JLabel blank3 = new JLabel();

		container.add(blank);
		container.add(blank1);
		container.add(clrScheme);
		container.add(blank2);
		container.add(blank3);

		JPanel topLeftText = new JPanel();
		topLeftText.setSize(62, 150);
		topLeftText.setLayout(new BoxLayout(topLeftText, BoxLayout.Y_AXIS));
		// add the texts at top and bottom, these will also be referenced to update

		JLabel topLeftTopText = new JLabel("hex"); // will be changed anyways
		topLeftTopText.setSize(62, 75);
		JLabel topLeftBottomText = new JLabel("rgb"); // same as above
		topLeftTopText.setSize(62, 75);
		// labels top RGB bottom HEX

		topLeftText.add(topLeftTopText);
		topLeftText.add(topLeftBottomText);

		JPanel topLeftColor = new JPanel(); // make a square
		topLeftColor.setSize(63, 150);
		topLeftColor.setBackground(new Color(0, 0, 0));
		// set the size, reference this in the updater method (observer)

		JPanel topMiddle = new JPanel();
		topMiddle.setSize(20, 150);

		JPanel topRightText = new JPanel();
		topRightText.setLayout(new BoxLayout(topRightText, BoxLayout.Y_AXIS));
		topRightText.setSize(62, 150);

		JLabel topRightTopText = new JLabel("hex"); // will be changed anyways
		topRightTopText.setSize(62, 75);
		topRightTopText.setAlignmentX(SwingConstants.RIGHT);

		JLabel topRightBottomText = new JLabel("rgb"); // same as above
		topRightBottomText.setSize(62, 75);
		topRightBottomText.setAlignmentX(SwingConstants.RIGHT);

		topRightText.add(topRightTopText);
		topRightText.add(topRightBottomText);

		JPanel topRightColor = new JPanel(); // refer to above
		topRightColor.setSize(63, 150);
		topRightColor.setBackground(new Color(0, 0, 0));

		container.add(topLeftText);
		container.add(topLeftColor);
		container.add(topMiddle);
		container.add(topRightColor);
		container.add(topRightText);

		JPanel clrMiddle0 = new JPanel();
		JPanel topLeftColorBottom = new JPanel(); // top left
		topLeftColorBottom.setBackground(new Color(0, 0, 0));
		JPanel clrMiddle02 = new JPanel();
		JPanel topRightColorBottom = new JPanel(); // top right
		topRightColorBottom.setBackground(new Color(0, 0, 0));
		JPanel clrMiddle04 = new JPanel();

		container.add(clrMiddle0);
		container.add(topLeftColorBottom);
		container.add(clrMiddle02);
		container.add(topRightColorBottom);
		container.add(clrMiddle04);

		JPanel clrMiddle1 = new JPanel();
		JPanel clrMiddle11 = new JPanel();
		JPanel clrMiddle12 = new JPanel();
		JPanel clrMiddle13 = new JPanel();
		JPanel clrMiddle14 = new JPanel();

		container.add(clrMiddle1);
		container.add(clrMiddle11);
		container.add(clrMiddle12);
		container.add(clrMiddle13);
		container.add(clrMiddle14);

		JPanel clrMiddle2 = new JPanel();
		JPanel bottomLeftColorBottom = new JPanel(); // bottom left
		bottomLeftColorBottom.setBackground(new Color(0, 0, 0));
		JPanel clrMiddle22 = new JPanel();
		JPanel bottomRightColorBottom = new JPanel(); // bottom right
		bottomRightColorBottom.setBackground(new Color(0, 0, 0));
		JPanel clrMiddle24 = new JPanel();

		container.add(clrMiddle2);
		container.add(bottomLeftColorBottom);
		container.add(clrMiddle22);
		container.add(bottomRightColorBottom);
		container.add(clrMiddle24);

		JPanel bottomLeftText = new JPanel();
		bottomLeftText.setSize(62, 150);
		bottomLeftText.setLayout(new BoxLayout(bottomLeftText, BoxLayout.Y_AXIS));

		JLabel bottomLeftTopText = new JLabel("hex"); // will be changed anyways
		bottomLeftTopText.setSize(62, 75);
		JLabel bottomLeftBottomText = new JLabel("rgb"); // same as above
		bottomLeftBottomText.setSize(62, 75);

		bottomLeftText.add(bottomLeftTopText);
		bottomLeftText.add(bottomLeftBottomText);
		// add the texts at top and bottom, these will also be referenced to update

		// labels top RGB bottom HEX

		JPanel bottomLeftColor = new JPanel(); // make a square
		bottomLeftColor.setSize(63, 150);
		bottomLeftColor.setBackground(new Color(0, 0, 0));
		// set the size, reference this in the updater method (observer)

		JPanel botMiddle = new JPanel();
		botMiddle.setSize(20, 150);

		JPanel bottomRightText = new JPanel();
		bottomRightText.setSize(62, 150);
		bottomRightText.setLayout(new BoxLayout(bottomRightText, BoxLayout.Y_AXIS));

		// labels top RGB bottom HEX

		JLabel bottomRightTopText = new JLabel("hex"); // will be changed anyways
		bottomRightTopText.setSize(62, 75);
		bottomRightTopText.setAlignmentX(SwingConstants.RIGHT);
		JLabel bottomRightBottomText = new JLabel("rgb"); // same as above
		bottomRightBottomText.setSize(62, 75);
		bottomRightBottomText.setAlignmentX(SwingConstants.RIGHT);

		bottomRightText.add(bottomRightTopText);
		bottomRightText.add(bottomRightBottomText);

		JPanel bottomRightColor = new JPanel(); // refer to above
		bottomRightColor.setSize(63, 150);
		bottomRightColor.setBackground(new Color(0, 0, 0));

		container.add(bottomLeftText);
		container.add(bottomLeftColor);
		container.add(botMiddle);
		container.add(bottomRightColor);
		container.add(bottomRightText);

		// jtext on top
		JLabel blank10 = new JLabel();
		JLabel blank11 = new JLabel();
		JLabel clrScheme1 = new JLabel();
		JLabel blank20 = new JLabel();
		JLabel blank30 = new JLabel();

		container.add(blank10);
		container.add(blank11);
		container.add(clrScheme1);
		container.add(blank20);
		container.add(blank30);

		// panelRight.add(clrScheme);
		panelRight.add(container);
		// panelRight.add(clrMiddle);

		JPanel middle1 = new JPanel();
		middle1.setSize(100, 100);

		c.weightx = .3;
		c.gridx = 0;
		c.gridy = 0;
		topPanel.add(panelLeft);

		c.gridx = 1;
		c.gridy = 0;
		topPanel.add(middle1);

		c.weightx = .3;
		c.gridx = 2;
		c.gridy = 0;
		topPanel.add(panelRight);

		JPanel cont = new JPanel();
		cont.setSize(1400, 500);
		cont.setLayout(new BoxLayout(cont, BoxLayout.Y_AXIS));

		JPanel one = new JPanel();
		one.setSize(500, 500);
		JPanel two = new JPanel();
		two.setSize(500, 500);

		//////// Bottom panel ///////////
		JPanel bot = new JPanel();
		bot.setSize(1000, 100);
		bot.setLayout(new BoxLayout(bot, BoxLayout.X_AXIS));
		
		JPanel[] bgs = new JPanel[] { cont, middle1, topPanel, one, two, bot };
		JPanel[] tL = new JPanel[] { topLeftColor, topLeftColorBottom };
		JPanel[] tR = new JPanel[] { topRightColor, topRightColorBottom };
		JPanel[] bL = new JPanel[] { bottomLeftColor, bottomLeftColorBottom };
		JPanel[] bR = new JPanel[] { bottomRightColor, bottomRightColorBottom };

		JButton mono = new JButton("Monochromatic");
		mono.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				which = "Mono";
				Color[] update = RainbowInJava.updateBackground(new Color(rednum, greennum, bluenum), brightnum, which);
				int bRed = brightnum * rednum / 100;
				int bGreen = brightnum * greennum / 100;
				int bBlue = brightnum * bluenum / 100;
				
				for(int i = 0; i < bgs.length; i++) {
					bgs[i].setBackground(new Color(bRed, bGreen, bBlue));
				}
				
				for(int i = 0; i < tL.length; i++) {
					tL[i].setBackground(update[0]);
				}
				topLeftTopText.setText(RainbowInJava.makeRGBString(update[0]));
				topLeftBottomText.setText(RainbowInJava.makeHexString(update[0]));
				
				
				for(int i = 0; i < tR.length; i++) {
					tR[i].setBackground(update[1]);
				}
				topRightTopText.setText(RainbowInJava.makeRGBString(update[1]));
				topRightBottomText.setText(RainbowInJava.makeHexString(update[1]));
				
				for(int i = 0; i < bL.length; i++) {
					bL[i].setBackground(update[2]);
				}
				bottomLeftTopText.setText(RainbowInJava.makeRGBString(update[2]));
				bottomLeftBottomText.setText(RainbowInJava.makeHexString(update[2]));
				
				for(int i = 0; i < bR.length; i++) {
					bR[i].setBackground(update[3]);
				}
				bottomRightTopText.setText(RainbowInJava.makeRGBString(update[3]));
				bottomRightBottomText.setText(RainbowInJava.makeHexString(update[3]));
				
				frame.validate();
			}

		});

		JButton triad = new JButton("Triadic");
		triad.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				which = "Triadic";
				Color[] update = RainbowInJava.updateBackground(new Color(rednum, greennum, bluenum), brightnum, which);
				int bRed = brightnum * rednum / 100;
				int bGreen = brightnum * greennum / 100;
				int bBlue = brightnum * bluenum / 100;
				
				for(int i = 0; i < bgs.length; i++) {
					bgs[i].setBackground(new Color(bRed, bGreen, bBlue));
				}
				
				for(int i = 0; i < tL.length; i++) {
					tL[i].setBackground(update[0]);
				}
				topLeftTopText.setText(RainbowInJava.makeRGBString(update[0]));
				topLeftBottomText.setText(RainbowInJava.makeHexString(update[0]));
				
				
				for(int i = 0; i < tR.length; i++) {
					tR[i].setBackground(update[1]);
				}
				topRightTopText.setText(RainbowInJava.makeRGBString(update[1]));
				topRightBottomText.setText(RainbowInJava.makeHexString(update[1]));
				
				for(int i = 0; i < bL.length; i++) {
					bL[i].setBackground(update[2]);
				}
				bottomLeftTopText.setText(RainbowInJava.makeRGBString(update[2]));
				bottomLeftBottomText.setText(RainbowInJava.makeHexString(update[2]));
				
				for(int i = 0; i < bR.length; i++) {
					bR[i].setBackground(update[3]);
				}
				bottomRightTopText.setText(RainbowInJava.makeRGBString(update[3]));
				bottomRightBottomText.setText(RainbowInJava.makeHexString(update[3]));
				
				frame.validate();
			}

		});

		JButton comp = new JButton("Complementary");
		comp.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				which = "Complementary";
				Color[] update = RainbowInJava.updateBackground(new Color(rednum, greennum, bluenum), brightnum, which);
				int bRed = brightnum * rednum / 100;
				int bGreen = brightnum * greennum / 100;
				int bBlue = brightnum * bluenum / 100;
				
				for(int i = 0; i < bgs.length; i++) {
					bgs[i].setBackground(new Color(bRed, bGreen, bBlue));
				}
				
				for(int i = 0; i < tL.length; i++) {
					tL[i].setBackground(update[0]);
				}
				topLeftTopText.setText(RainbowInJava.makeRGBString(update[0]));
				topLeftBottomText.setText(RainbowInJava.makeHexString(update[0]));
				
				
				for(int i = 0; i < tR.length; i++) {
					tR[i].setBackground(update[1]);
				}
				topRightTopText.setText(RainbowInJava.makeRGBString(update[1]));
				topRightBottomText.setText(RainbowInJava.makeHexString(update[1]));
				
				for(int i = 0; i < bL.length; i++) {
					bL[i].setBackground(update[2]);
				}
				bottomLeftTopText.setText(RainbowInJava.makeRGBString(update[2]));
				bottomLeftBottomText.setText(RainbowInJava.makeHexString(update[2]));
				
				for(int i = 0; i < bR.length; i++) {
					bR[i].setBackground(update[3]);
				}
				bottomRightTopText.setText(RainbowInJava.makeRGBString(update[3]));
				bottomRightBottomText.setText(RainbowInJava.makeHexString(update[3]));

				frame.validate();
			}

		});

		JButton ana = new JButton("Analogous");
		ana.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				which = "Analogous";
				Color[] update = RainbowInJava.updateBackground(new Color(rednum, greennum, bluenum), brightnum, which);
				int bRed = brightnum * rednum / 100;
				int bGreen = brightnum * greennum / 100;
				int bBlue = brightnum * bluenum / 100;
				
				for(int i = 0; i < bgs.length; i++) {
					bgs[i].setBackground(new Color(bRed, bGreen, bBlue));
				}
				
				for(int i = 0; i < tL.length; i++) {
					tL[i].setBackground(update[0]);
				}
				topLeftTopText.setText(RainbowInJava.makeRGBString(update[0]));
				topLeftBottomText.setText(RainbowInJava.makeHexString(update[0]));
				
				
				for(int i = 0; i < tR.length; i++) {
					tR[i].setBackground(update[1]);
				}
				topRightTopText.setText(RainbowInJava.makeRGBString(update[1]));
				topRightBottomText.setText(RainbowInJava.makeHexString(update[1]));
				
				for(int i = 0; i < bL.length; i++) {
					bL[i].setBackground(update[2]);
				}
				bottomLeftTopText.setText(RainbowInJava.makeRGBString(update[2]));
				bottomLeftBottomText.setText(RainbowInJava.makeHexString(update[2]));
				
				for(int i = 0; i < bR.length; i++) {
					bR[i].setBackground(update[3]);
				}
				bottomRightTopText.setText(RainbowInJava.makeRGBString(update[3]));
				bottomRightBottomText.setText(RainbowInJava.makeHexString(update[3]));

				frame.validate();
			}

		});

		// bottom four buttons, connected to the mouseclick event

		// below is the rest of the listeners
		useValues.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// get each text value in the text boxes
				JTextField[] texts = new JTextField[] { redText, greenText, blueText, brightText };
				for(int i = 0; i < 4; i++) {
					// run checkText method on the text
					// update the colors on the sliders
					if(i < 3 && RainbowInJava.checkText(texts[i].getText(), 255)) {
						switch(i) {
						case 0:
							redSlide.setValue(Integer.parseInt(texts[i].getText()));
						case 1:
							greenSlide.setValue(Integer.parseInt(texts[i].getText()));
						case 2:
							blueSlide.setValue(Integer.parseInt(texts[i].getText()));
						}
					} else if (i == 3 && RainbowInJava.checkText(texts[i].getText(), 100)) {
						brightSlide.setValue(Integer.parseInt(texts[i].getText()));
					} else {
						texts[i].setText("0");
					}
				}
				
				Color[] update = RainbowInJava.updateBackground(new Color(rednum, greennum, bluenum), brightnum, which);
				int bRed = brightnum * rednum / 100;
				int bGreen = brightnum * greennum / 100;
				int bBlue = brightnum * bluenum / 100;
				
				for(int i = 0; i < bgs.length; i++) {
					bgs[i].setBackground(new Color(bRed, bGreen, bBlue));
				}
				
				for(int i = 0; i < tL.length; i++) {
					tL[i].setBackground(update[0]);
				}
				topLeftTopText.setText(RainbowInJava.makeRGBString(update[0]));
				topLeftBottomText.setText(RainbowInJava.makeHexString(update[0]));
				
				
				for(int i = 0; i < tR.length; i++) {
					tR[i].setBackground(update[1]);
				}
				topRightTopText.setText(RainbowInJava.makeRGBString(update[1]));
				topRightBottomText.setText(RainbowInJava.makeHexString(update[1]));
				
				for(int i = 0; i < bL.length; i++) {
					bL[i].setBackground(update[2]);
				}
				bottomLeftTopText.setText(RainbowInJava.makeRGBString(update[2]));
				bottomLeftBottomText.setText(RainbowInJava.makeHexString(update[2]));
				
				for(int i = 0; i < bR.length; i++) {
					bR[i].setBackground(update[3]);
				}
				bottomRightTopText.setText(RainbowInJava.makeRGBString(update[3]));
				bottomRightBottomText.setText(RainbowInJava.makeHexString(update[3]));
				
				frame.revalidate();
			}

		});
		
		brightSlide.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				brightnum = brightSlide.getValue();
				brightText.setText(Integer.toString(brightSlide.getValue()));
				Color[] update = RainbowInJava.updateBackground(new Color(rednum, greennum, bluenum), brightnum, which);
				int bRed = brightnum * rednum / 100;
				int bGreen = brightnum * greennum / 100;
				int bBlue = brightnum * bluenum / 100;
				
				for(int i = 0; i < bgs.length; i++) {
					bgs[i].setBackground(new Color(bRed, bGreen, bBlue));
				}
				
				for(int i = 0; i < tL.length; i++) {
					tL[i].setBackground(update[0]);
				}
				topLeftTopText.setText(RainbowInJava.makeRGBString(update[0]));
				topLeftBottomText.setText(RainbowInJava.makeHexString(update[0]));
				
				
				for(int i = 0; i < tR.length; i++) {
					tR[i].setBackground(update[1]);
				}
				topRightTopText.setText(RainbowInJava.makeRGBString(update[1]));
				topRightBottomText.setText(RainbowInJava.makeHexString(update[1]));
				
				for(int i = 0; i < bL.length; i++) {
					bL[i].setBackground(update[2]);
				}
				bottomLeftTopText.setText(RainbowInJava.makeRGBString(update[2]));
				bottomLeftBottomText.setText(RainbowInJava.makeHexString(update[2]));
				
				for(int i = 0; i < bR.length; i++) {
					bR[i].setBackground(update[3]);
				}
				bottomRightTopText.setText(RainbowInJava.makeRGBString(update[3]));
				bottomRightBottomText.setText(RainbowInJava.makeHexString(update[3]));
				
				frame.revalidate();
			}

		});
		
		blueSlide.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				bluenum = blueSlide.getValue();
				blueText.setText(Integer.toString(blueSlide.getValue()));
				Color[] update = RainbowInJava.updateBackground(new Color(rednum, greennum, bluenum), brightnum, which);
				int bRed = brightnum * rednum / 100;
				int bGreen = brightnum * greennum / 100;
				int bBlue = brightnum * bluenum / 100;
				
				for(int i = 0; i < bgs.length; i++) {
					bgs[i].setBackground(new Color(bRed, bGreen, bBlue));
				}
				
				for(int i = 0; i < tL.length; i++) {
					tL[i].setBackground(update[0]);
				}
				topLeftTopText.setText(RainbowInJava.makeRGBString(update[0]));
				topLeftBottomText.setText(RainbowInJava.makeHexString(update[0]));
				
				
				for(int i = 0; i < tR.length; i++) {
					tR[i].setBackground(update[1]);
				}
				topRightTopText.setText(RainbowInJava.makeRGBString(update[1]));
				topRightBottomText.setText(RainbowInJava.makeHexString(update[1]));
				
				for(int i = 0; i < bL.length; i++) {
					bL[i].setBackground(update[2]);
				}
				bottomLeftTopText.setText(RainbowInJava.makeRGBString(update[2]));
				bottomLeftBottomText.setText(RainbowInJava.makeHexString(update[2]));
				
				for(int i = 0; i < bR.length; i++) {
					bR[i].setBackground(update[3]);
				}
				bottomRightTopText.setText(RainbowInJava.makeRGBString(update[3]));
				bottomRightBottomText.setText(RainbowInJava.makeHexString(update[3]));
				
				frame.revalidate();
			}

		});
		
		blueText.addFocusListener(new FocusListener() {

			@Override
			public void focusGained(FocusEvent e) {
				if (blueText.getText().equals("0     ")) {
					blueText.selectAll();
				}
			}

			@Override
			public void focusLost(FocusEvent e) {
				// do nothing
			}

		});
		
		greenSlide.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				greennum = greenSlide.getValue();
				greenText.setText(Integer.toString(greenSlide.getValue()));
				Color[] update = RainbowInJava.updateBackground(new Color(rednum, greennum, bluenum), brightnum, which);
				int bRed = brightnum * rednum / 100;
				int bGreen = brightnum * greennum / 100;
				int bBlue = brightnum * bluenum / 100;
				
				for(int i = 0; i < bgs.length; i++) {
					bgs[i].setBackground(new Color(bRed, bGreen, bBlue));
				}
				
				for(int i = 0; i < tL.length; i++) {
					tL[i].setBackground(update[0]);
				}
				topLeftTopText.setText(RainbowInJava.makeRGBString(update[0]));
				topLeftBottomText.setText(RainbowInJava.makeHexString(update[0]));
				
				
				for(int i = 0; i < tR.length; i++) {
					tR[i].setBackground(update[1]);
				}
				topRightTopText.setText(RainbowInJava.makeRGBString(update[1]));
				topRightBottomText.setText(RainbowInJava.makeHexString(update[1]));
				
				for(int i = 0; i < bL.length; i++) {
					bL[i].setBackground(update[2]);
				}
				bottomLeftTopText.setText(RainbowInJava.makeRGBString(update[2]));
				bottomLeftBottomText.setText(RainbowInJava.makeHexString(update[2]));
				
				for(int i = 0; i < bR.length; i++) {
					bR[i].setBackground(update[3]);
				}
				bottomRightTopText.setText(RainbowInJava.makeRGBString(update[3]));
				bottomRightBottomText.setText(RainbowInJava.makeHexString(update[3]));
				
				frame.revalidate();
			}

		});
		
		greenText.addFocusListener(new FocusListener() {

			@Override
			public void focusGained(FocusEvent e) {
				if (greenText.getText().equals("0     ")) {
					greenText.selectAll();
				}
			}

			@Override
			public void focusLost(FocusEvent e) {
				// do nothing
			}

		});
		
		redSlide.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				rednum = redSlide.getValue();
				redText.setText(Integer.toString(redSlide.getValue()));
				Color[] update = RainbowInJava.updateBackground(new Color(rednum, greennum, bluenum), brightnum, which);
				int bRed = brightnum * rednum / 100;
				int bGreen = brightnum * greennum / 100;
				int bBlue = brightnum * bluenum / 100;
				
				for(int i = 0; i < bgs.length; i++) {
					bgs[i].setBackground(new Color(bRed, bGreen, bBlue));
				}
				
				for(int i = 0; i < tL.length; i++) {
					tL[i].setBackground(update[0]);
				}
				topLeftTopText.setText(RainbowInJava.makeRGBString(update[0]));
				topLeftBottomText.setText(RainbowInJava.makeHexString(update[0]));
				
				
				for(int i = 0; i < tR.length; i++) {
					tR[i].setBackground(update[1]);
				}
				topRightTopText.setText(RainbowInJava.makeRGBString(update[1]));
				topRightBottomText.setText(RainbowInJava.makeHexString(update[1]));
				
				for(int i = 0; i < bL.length; i++) {
					bL[i].setBackground(update[2]);
				}
				bottomLeftTopText.setText(RainbowInJava.makeRGBString(update[2]));
				bottomLeftBottomText.setText(RainbowInJava.makeHexString(update[2]));
				
				for(int i = 0; i < bR.length; i++) {
					bR[i].setBackground(update[3]);
				}
				bottomRightTopText.setText(RainbowInJava.makeRGBString(update[3]));
				bottomRightBottomText.setText(RainbowInJava.makeHexString(update[3]));
				
				frame.revalidate();
			}

		});
		
		redText.addFocusListener(new FocusListener() {

			@Override
			public void focusGained(FocusEvent e) {
				if (redText.getText().equals("0     ")) {
					redText.selectAll();
				}
			}

			@Override
			public void focusLost(FocusEvent e) {
				// do nothing
			}

		});

		bot.add(mono);
		bot.add(triad);
		bot.add(comp);
		bot.add(ana);
		
		cont.setBackground(new Color(0, 0, 0));
		middle1.setBackground(new Color(0, 0, 0));
		topPanel.setBackground(new Color(0, 0, 0));
		one.setBackground(new Color(0, 0, 0));
		two.setBackground(new Color(0, 0, 0));
		bot.setBackground(new Color(0, 0, 0));

		cont.add(bot);
		cont.add(one);
		cont.add(topPanel);
		cont.add(two);

		frame.add(cont);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.show(); // idc that there's a more reasonable way to do it

	}
}
