import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class Day3H1 extends JFrame {
	private JSlider slider;
	private Day3H myPanel;
	
	public Day3H1() {
		super("The Title");
		myPanel = new Day3H();
		myPanel.setBackground(Color.ORANGE);
		
		slider = new JSlider(SwingConstants.HORIZONTAL, 0, 200, 10);
		slider.setMajorTickSpacing(10);
		slider.setPaintTicks(true);
		
		slider.addChangeListener(
				new ChangeListener() {
					public void stateChanged(ChangeEvent e) {
						myPanel.setD(slider.getValue());
					}
				}
				
				);
		
		add(slider,BorderLayout.SOUTH);
		add(myPanel,BorderLayout.CENTER);
		
		
	}

}
