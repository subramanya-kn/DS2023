import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class FrameTest {

	public static void main(String[] args) {
		
		//3
		MyFrame myFrame1 = new MyFrame("Counter1",650,100,50,100);
		MyFrame myFrame2 = new MyFrame("Counter2",650,100,50,300);
		MyFrame myFrame3 = new MyFrame("Counter3",650,100,50,600);

		//Frame myFrame2 = new MyFrame("Counter2",550,200,450,400);
		//Frame myFrame3 = new MyFrame("Counter3",550,200,850,500);
		//Thread t1 = new Thread(myFrame1);
		//t1.start();
		
		//4 create object java.lang.Thread class
		
		Thread t1 = new Thread(myFrame1);
		Thread t2 = new Thread(myFrame2);
		Thread t3 = new Thread(myFrame3);
		
		t1.start();
		t2.start();
		t3.start();

		
			
	}
}

class MyFrame extends JFrame implements Runnable //1
{
	JTextField field = new JTextField();
	JButton ok = new JButton("OK");
	
	MyFrame(String title, int w, int h, int x, int y) {
		setTitle(title);
		setSize(w,h);
		setLocation(x,y);
		setVisible(true);
		add(field);
		setLayout(new FlowLayout());
		add(field); add(ok);
	}
	
	public void run() { //2
		for(int i=1;i<=1000000;i++) {
			field.setText(""+i);
			//System.out.println("i "+i);
		}
	}
}
