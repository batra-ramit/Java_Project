import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class MyFrame
        extends JFrame 
        {
            private CardLayout crd;  
    
    public MyFrame()
	{
		setTitle("Google Form Project");
		setBounds(300, 90, 900, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        JPanel cPanel = new JPanel();

		crd = new CardLayout();    
		cPanel.setLayout(crd);

        JPanel jPanel1 = new JPanel();
        JPanel jPanel2 = new JPanel();
        JPanel jPanel3 = new JPanel();
        


        JLabel title = new JLabel("Registration Form");
		title.setFont(new Font("Arial", Font.PLAIN, 30));
		title.setSize(300, 30);
		title.setLocation(300, 30);
		jPanel1.add(title);

		JLabel name = new JLabel("Name");
		name.setFont(new Font("Arial", Font.PLAIN, 20));
		name.setSize(100, 20);
		name.setLocation(100, 100);
		jPanel1.add(name);

		JTextField tname = new JTextField();
		tname.setFont(new Font("Arial", Font.PLAIN, 15));
		tname.setSize(190, 20);
		tname.setLocation(200, 100);
        jPanel1.add(tname);
        
        JLabel enroll = new JLabel("Name");
		enroll.setFont(new Font("Arial", Font.PLAIN, 20));
		enroll.setSize(100, 20);
		enroll.setLocation(100, 100);
		jPanel1.add(enroll);

		JTextField tenroll = new JTextField();
		tenroll.setFont(new Font("Arial", Font.PLAIN, 15));
		tenroll.setSize(190, 20);
		tenroll.setLocation(200, 100);
        jPanel1.add(tenroll);
        
        JButton nextbutton = new JButton("Next");
        jPanel1.add(nextbutton);

        cPanel.add(jPanel1, "1");

        JLabel Gender = new JLabel("Gender");
		name.setFont(new Font("Arial", Font.PLAIN, 20));
		name.setSize(100, 20);
		name.setLocation(100, 100);
        jPanel2.add(Gender);
        
        JRadioButton male = new JRadioButton("Male");
		male.setFont(new Font("Arial", Font.PLAIN, 15));
		male.setSelected(true);
		male.setSize(75, 20);
		male.setLocation(200, 200);
        jPanel2.add(male);

        JRadioButton female = new JRadioButton("Female");
		female.setFont(new Font("Arial", Font.PLAIN, 15));
		female.setSelected(false);
		female.setSize(80, 20);
		female.setLocation(275, 200);
        jPanel2.add(female);

        JRadioButton other = new JRadioButton("Rather Not Say");
		other.setFont(new Font("Arial", Font.PLAIN, 15));
		other.setSelected(false);
		other.setSize(80, 20);
		other.setLocation(350, 200);
        jPanel2.add(other);



        JLabel branch = new JLabel("Branch");
		branch.setFont(new Font("Arial", Font.PLAIN, 20));
		branch.setSize(100, 20);
		branch.setLocation(100, 200);
        jPanel2.add(branch);
        
        JRadioButton CSE = new JRadioButton("CSE");
		CSE.setFont(new Font("Arial", Font.PLAIN, 15));
		CSE.setSelected(true);
		CSE.setSize(75, 20);
		CSE.setLocation(200, 300);
        jPanel2.add(CSE);

        JRadioButton IT = new JRadioButton("IT");
		IT.setFont(new Font("Arial", Font.PLAIN, 15));
		IT.setSelected(false);
		IT.setSize(80, 20);
		IT.setLocation(275, 300);
        jPanel2.add(IT);

        JRadioButton ECE = new JRadioButton("ECE");
		ECE.setFont(new Font("Arial", Font.PLAIN, 15));
		ECE.setSelected(false);
		ECE.setSize(80, 20);
		ECE.setLocation(350, 300);
        jPanel2.add(ECE);

        JRadioButton EEE = new JRadioButton("EEE");
		EEE.setFont(new Font("Arial", Font.PLAIN, 15));
		EEE.setSelected(false);
		EEE.setSize(80, 20);
		EEE.setLocation(425, 300);
        jPanel2.add(EEE);


        JButton nextbutton1 = new JButton("Next");
        jPanel2.add(nextbutton1);


        JLabel Subject = new JLabel("Subject");
		Subject.setFont(new Font("Arial", Font.PLAIN, 20));
		Subject.setSize(100, 20);
		Subject.setLocation(100, 100);
        jPanel3.add(Subject);
        
        JRadioButton Java = new JRadioButton("Java");
		Java.setFont(new Font("Arial", Font.PLAIN, 15));
		Java.setSelected(true);
		Java.setSize(75, 20);
		Java.setLocation(200, 200);
        jPanel3.add(Java);

        JRadioButton ADA = new JRadioButton("ADA");
		ADA.setFont(new Font("Arial", Font.PLAIN, 15));
		ADA.setSelected(false);
		ADA.setSize(80, 20);
		ADA.setLocation(275, 200);
        jPanel3.add(ADA);

        JRadioButton DC = new JRadioButton("DC");
		DC.setFont(new Font("Arial", Font.PLAIN, 15));
		DC.setSelected(false);
		DC.setSize(80, 20);
		DC.setLocation(350, 200);
        jPanel3.add(DC);

        JRadioButton IM = new JRadioButton("IM");
		IM.setFont(new Font("Arial", Font.PLAIN, 15));
		IM.setSelected(false);
		IM.setSize(80, 20);
		IM.setLocation(425, 200);
        jPanel3.add(IM);


        JButton SUBMIT = new JButton("Submit");
        jPanel3.add(SUBMIT);


        cPanel.add(jPanel1, "1");

        


        setVisible(true);
    
    
    }





        }




public class Proj {
    public static void main(String[] args) throws Exception
	{
        MyFrame f = new MyFrame();
        f.setVisible(true);
	}
}