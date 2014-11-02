package frame;

import gov.nasa.worldwind.WorldWindow;
import gov.nasa.worldwindx.examples.ApplicationTemplate.AppPanel;

import java.awt.*;

public class overview extends Frame
{

	public AppPanel wwjPanel;
	
	public overview()
	{
	    setTitle("Visualization Tool");
	    GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
	    setMaximizedBounds(env.getMaximumWindowBounds());
	    setExtendedState(this.getExtendedState() | this.MAXIMIZED_BOTH);
	    
	    setLayout(new FlowLayout());
	    setVisible(true);
	    init();
	    
	}
	
    protected AppPanel createAppPanel(Dimension canvasSize, boolean includeStatusBar)
    {
        return new AppPanel(canvasSize, includeStatusBar);
    }
    
    public WorldWindow getWwd()
    {
        return this.wwjPanel.getWwd();
    }
    
    public void init()
    {
    	Dimension canvasSize = new Dimension(this.getWidth(), this.getHeight());
    	wwjPanel = createAppPanel(canvasSize, true);
        wwjPanel.setPreferredSize(canvasSize);
        this.add(wwjPanel, BorderLayout.CENTER);
        
    }
    
	public static void main(String args[])
	{
		new overview();
	}

}
