package org.system;

public class Desktop extends Computer {
	
	public void DesktopSize()
	{
	System.out.println("Desk top Size is 27u inch");	
	}
public static void main(String[] args) {
	
	Desktop desc=new Desktop();
	desc.computerModel();
	desc.DesktopSize();
	
}
}
