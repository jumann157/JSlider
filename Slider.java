import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class Slider implements ChangeListener {
	
	JFrame frame;
	JPanel panel;
	JPanel textPanel;
	JLabel colorLabel;
	JLabel redLabel;
	JLabel greenLabel;
	JLabel blueLabel;
	JSlider redSlider;
	JSlider greenSlider;
	JSlider blueSlider;
	
	Slider() {
		
		frame = new JFrame("RGB Slider");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		
		panel = new JPanel();
		panel.setLayout(new GridLayout(0,1,0,0));
		
		colorLabel = new JLabel();
		redLabel = new JLabel();
		greenLabel = new JLabel();
		blueLabel = new JLabel();
	    
		redLabel.setText("Red: ");
		redSlider = new JSlider(0,255,0);
		redSlider.setPreferredSize(new Dimension(400,200));
		redSlider.setPaintTicks(true); //adds ticks to the redSlider track
		redSlider.setPaintTrack(true); //makes the redSlider track visible
		redSlider.setMinorTickSpacing(17);
		redSlider.setMajorTickSpacing(51);
		redSlider.setPaintLabels(true);
		redSlider.addChangeListener(this);
		
		greenLabel.setText("Green: ");
		greenSlider = new JSlider(0,255,0);
		greenSlider.setPreferredSize(new Dimension(400,200));
		greenSlider.setPaintTicks(true); //adds ticks to the greenSlider track
		greenSlider.setPaintTrack(true); //makes the greenSlider track visible
		greenSlider.setMinorTickSpacing(17);
		greenSlider.setMajorTickSpacing(51);
		greenSlider.setPaintLabels(true);
		greenSlider.addChangeListener(this);
		
		blueLabel.setText("Blue: ");
		blueSlider = new JSlider(0,255,0);
		blueSlider.setPreferredSize(new Dimension(400,200));
		blueSlider.setPaintTicks(true); //adds ticks to the blueSlider track
		blueSlider.setPaintTrack(true); //makes the blueSlider track visible
		blueSlider.setMinorTickSpacing(17);
		blueSlider.setMajorTickSpacing(51);
		blueSlider.setPaintLabels(true);
		blueSlider.addChangeListener(this);
		
		colorLabel.setText("This is the colour:   " + redSlider.getValue() + ", " + greenSlider.getValue() + ", " + blueSlider.getValue());
		colorLabel.setHorizontalTextPosition(JLabel.CENTER);
		colorLabel.setForeground(new Color(redSlider.getValue(),greenSlider.getValue(),blueSlider.getValue()));
		
		panel.add(redLabel);
		panel.add(redSlider);
		panel.add(greenLabel);
		panel.add(greenSlider);
		panel.add(blueLabel);
		panel.add(blueSlider);
		
		
		textPanel = new JPanel();
		textPanel.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
		textPanel.add(colorLabel);
		
		frame.add(panel, BorderLayout.CENTER);
		frame.add(textPanel, BorderLayout.SOUTH);
		frame.setVisible(true);
		
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		
		colorLabel.setText("This is the colour:   " + redSlider.getValue() + ", " + greenSlider.getValue() + ", " + blueSlider.getValue());
		colorLabel.setForeground(new Color(redSlider.getValue(),greenSlider.getValue(),blueSlider.getValue()));
		
	}

}
