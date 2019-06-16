package edu.ncsu.csc226crew;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class RainbowInJavaGUI {
	int red = 0;
	int green = 0;
	int blue = 0;
	int bright = 100;
	String which = "Mono";

	public static void main(String[] args) {
		aRainbowInJavaGUI();
	}
	
	@SuppressWarnings("deprecation")
	public static void aRainbowInJavaGUI() {
		
		JFrame frame = new JFrame("Rainbow");
		frame.setSize(1200, 500);
		
		JPanel topPanel = new JPanel();
		topPanel.setSize(1200, 400);
		topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.X_AXIS));
		
			JPanel panelLeft = new JPanel();
			panelLeft.setSize(500,  300);
			panelLeft.setLayout(new BoxLayout(panelLeft, BoxLayout.Y_AXIS));
			
				JLabel clrValues = new JLabel("Color Values");
				
				JPanel redValues = new JPanel();
				redValues.setSize(500, 100);
				redValues.setBackground(new Color(255,0,0));
				
					// the stuff inside it
				
//				JSlider test = new JSlider();
//				test.setValue(0); // use for the sliders
				
				JPanel greenValues = new JPanel();
				greenValues.setSize(500, 100);
				greenValues.setBackground(new Color(0, 255, 0));
				
					// same stuff, cause javax swing is annoying and makes you make a new one every time even
					// though complaining about it is useless because it actually makes more sense
				
				JPanel blueValues = new JPanel();
				blueValues.setSize(500, 100);
				blueValues.setBackground(new Color(0, 0, 255));
				
					// dot dot dot
				
				JPanel brightValues = new JPanel();
				brightValues.setSize(500, 100);
				brightValues.setBackground(new Color(255, 255, 255));
				
					// yadda yadda yadda
				
				JButton useValues = new JButton("Use Text Values");
				useValues.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO call the function from RainbowInJava to update
						// RainbowInJava.updateBackground();
					}
					
				});
		
		panelLeft.add(clrValues);
		panelLeft.add(redValues);
		panelLeft.add(greenValues);
		panelLeft.add(blueValues);
		panelLeft.add(brightValues);
		panelLeft.add(useValues);

		////////////////////////////// right panel ///////////////////////////////////
		JPanel panelRight = new JPanel();
		panelRight.setSize(500, 300);
		panelRight.setLayout(new BoxLayout(panelRight, BoxLayout.Y_AXIS));
		
			// jtext on top
			JLabel clrScheme = new JLabel("Color Scheme");

				JPanel top = new JPanel();
				top.setLayout(new BoxLayout(top, BoxLayout.X_AXIS));
				top.setSize(500, 150); // 250/2 = 125, 125/2 = 60 + 5/2 = 62.5

					JPanel topLeftText = new JPanel();
					topLeftText.setBackground(new Color(255, 0, 0));
					topLeftText.setSize(62, 150);
//					topLeftText.setLayout(new BoxLayout(topLeftText, BoxLayout.Y_AXIS));
					// add the texts at top and bottom, these will also be referenced to update
					
					JPanel topLeftColor = new JPanel(); // make a square
					topLeftColor.setBackground(new Color(0, 255, 0));
					topLeftColor.setSize(63, 150);
					// set the size, reference this in the updater method (observer)
					
					JPanel topRightText = new JPanel();
					topRightText.setBackground(new Color(0, 0, 255)); // this one doesn't show
					topRightText.setLayout(new BoxLayout(topRightText, BoxLayout.Y_AXIS));
					topRightText.setSize(62, 150);
					
					JLabel topRightTopText = new JLabel("klajsd;asjsd"); // will be changed anyways
					topRightTopText.setSize(62, 75);
					JLabel topRightBottomText = new JLabel("alsjdklasoijaldsdc"); // same as above
					topRightBottomText.setSize(62, 75);
					
					topRightText.add(topRightTopText);
					topRightText.add(topRightBottomText);
					
					JPanel topRightColor = new JPanel(); // refer to above
					topRightColor.setBackground(new Color(255, 255, 255));
					topRightColor.setSize(63, 150);
					
					top.add(topLeftText);
					top.add(topLeftColor);
					top.add(topRightText);
					top.add(topRightColor);
			
				JPanel bottom = new JPanel();
				bottom.setLayout(new BoxLayout(bottom, BoxLayout.X_AXIS));
				bottom.setSize(500, 150); // 125 -> 75
	
					JPanel bottomLeftText = new JPanel();
					bottomLeftText.setSize(62, 150);
					bottomLeftText.setLayout(new BoxLayout(bottomLeftText, BoxLayout.Y_AXIS));
					
						JLabel bottomLeftTopText = new JLabel("klajsd;asjsd"); // will be changed anyways
						bottomLeftTopText.setSize(62, 75);
						JLabel bottomLeftBottomText = new JLabel("alsjdklasoijaldsdc"); // same as above
						bottomLeftBottomText.setSize(62, 75);
					
					bottomLeftText.add(bottomLeftTopText);
					bottomLeftText.add(bottomLeftBottomText);
					// add the texts at top and bottom, these will also be referenced to update
					
					JPanel bottomLeftColor = new JPanel(); // make a square
					bottomLeftColor.setSize(63, 150);
					// set the size, reference this in the updater method (observer)
					
					JPanel bottomRightText = new JPanel();
					bottomRightText.setSize(62, 150);
					bottomRightText.setLayout(new BoxLayout(bottomRightText, BoxLayout.Y_AXIS));
					
					JPanel bottomRightColor = new JPanel(); // refer to above
					bottomRightColor.setSize(63, 150);
					
					bottom.add(bottomLeftText);
					bottom.add(bottomLeftColor);
					bottom.add(bottomRightText);
					bottom.add(bottomRightColor);
				
				panelRight.add(clrScheme);
				panelRight.add(top);
				panelRight.add(bottom);

				// bottom four buttons, connected to the mouseclick event
				
				
		topPanel.add(panelLeft);
		topPanel.add(panelRight);
		
		frame.add(topPanel);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.show(); // idc that there's a more reasonable way to do it
	}

	
	//
	// private void BtnTriadic_Click(object sender, EventArgs e)
	// {
	// int bRed = bright * red / 100;
	// int bGreen = bright * green / 100;
	// int bBlue = bright * blue / 100;
	// which = "Triadic";
	// calcTriadic(Color.FromArgb(bRed, bGreen, bBlue));
	// } // Keeping this as a reminder to remember to send in the brightness altered RGB instead of exact RGB
}
