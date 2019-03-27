import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class myPanel extends JPanel
{

		public myPanel()
		{
			
			setLayout(new GridBagLayout());
			GridBagConstraints gbc = new GridBagConstraints();
			
			JButton button1 = new JButton("Hello");
			gbc.gridx=0;
			gbc.gridy=0;
			button1.setPreferredSize(new Dimension(300,600));
			add(button1,gbc); //gbc=tells computer how to add  it
			
			
		}
}
