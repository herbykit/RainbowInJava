package edu.ncsu.csc226crew;

import java.awt.Color;

import javax.swing.JFrame;

public class RainbowInJavaGUI {
        int red = 0;
        int green = 0;
        int blue = 0;
        int bright = 100;
        String which = "Mono";
        JFrame frame;
        
        public RainbowInJavaGUI()
        {
            // Initialise GUI
        }
         
//        private void TbRed_Scroll(Object sender, Event e) // Will convert these to Java once GUI is made
//        {												    // and can be interacted with
//            textRed.Text = tbRed.Value.ToString();		// Also need to make all references to outside methods static instead
//            red = tbRed.Value;
//            updateBackGround();
//        }
//
//        private void TbGreen_Scroll(object sender, EventArgs e)
//        {
//            textGreen.Text = tbGreen.Value.ToString();
//            green = tbGreen.Value;
//            updateBackGround();
//        }
//
//        private void TbBlue_Scroll(object sender, EventArgs e)
//        {
//            textBlue.Text = tbBlue.Value.ToString();
//            blue = tbBlue.Value;
//            updateBackGround();
//        }
//
//        private void TbBright_Scroll(object sender, EventArgs e)
//        {
//            textBright.Text = tbBright.Value.ToString();
//            bright = tbBright.Value;
//            updateBackGround();
//        }

//        private void Button1_Click(object sender, EventArgs e) // Will convert to Java once the GUI is created
//        {
//            if (checkText(textRed.Text, 255))
//            {
//                // change slider
//                red = Convert.ToInt16(textRed.Text);
//                tbRed.Value = red;
//            }
//            else
//            {
//                textRed.Text = "0";
//                tbRed.Value = 0;
//                red = 0;
//            }
//
//            if (checkText(textGreen.Text, 255))
//            {
//                // change slider
//                green = Convert.ToInt16(textGreen.Text);
//                tbGreen.Value = green;
//            }
//            else
//            {
//                textGreen.Text = "0";
//                tbGreen.Value = 0;
//                green = 0;
//            }
//
//            if (checkText(textBlue.Text, 255))
//            {
//                // change slider
//                blue = Convert.ToInt16(textBlue.Text);
//                tbBlue.Value = blue;
//            }
//            else
//            {
//                textBlue.Text = "0";
//                tbBlue.Value = 0;
//                blue = 0;
//            }
//
//            if (checkText(textBright.Text, 100))
//            {
//                // change slider
//                bright = Convert.ToInt16(textBright.Text);
//                tbBright.Value = bright;
//            }
//            else
//            {
//                textBright.Text = "100";
//                tbBright.Value = 100;
//                bright = 100;
//            }
//
//            // update background
//            updateBackGround();
//        }

//        private void BtnMono_Click(object sender, EventArgs e) // Will convert these to java once the GUI is made
//        {
//            int bRed = bright * red / 100;
//            int bGreen = bright * green / 100;
//            int bBlue = bright * blue / 100;
//            which = "Mono";
//            calcMono(Color.FromArgb(bRed, bGreen, bBlue));
//        }
//
//        private void BtnComplementary_Click(object sender, EventArgs e)
//        {
//            int bRed = bright * red / 100;
//            int bGreen = bright * green / 100;
//            int bBlue = bright * blue / 100;
//            which = "Complementary";
//            calcComplementary(Color.FromArgb(bRed, bGreen, bBlue));
//        }
//
//        private void BtnAnalogous_Click(object sender, EventArgs e)
//        {
//            int bRed = bright * red / 100;
//            int bGreen = bright * green / 100;
//            int bBlue = bright * blue / 100;
//            which = "Analogous";
//            calcAnalogous(Color.FromArgb(bRed, bGreen, bBlue));
//        }
//
//        private void BtnTriadic_Click(object sender, EventArgs e)
//        {
//            int bRed = bright * red / 100;
//            int bGreen = bright * green / 100;
//            int bBlue = bright * blue / 100;
//            which = "Triadic";
//            calcTriadic(Color.FromArgb(bRed, bGreen, bBlue));
//        }
}
