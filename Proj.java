import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame extends JFrame {

  int currCard = 1;
  Container cPane;
  CardLayout crd;

  public MyFrame() {
    setTitle("Google Form Project");
    setBounds(300, 90, 900, 600);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setResizable(false);

    JPanel cPanel = new JPanel();
    cPane = getContentPane();
    crd = new CardLayout();

    cPanel.setLayout(crd);
    

    JPanel jPanel1 = new JPanel();
    JPanel jPanel2 = new JPanel();
	JPanel jPanel3 = new JPanel();
	JPanel jPanel4 = new JPanel();

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
    tname.setColumns(4);
    jPanel1.add(tname);

    JLabel enroll = new JLabel("Enrollment No");
    enroll.setFont(new Font("Arial", Font.PLAIN, 20));
    enroll.setSize(100, 20);
    enroll.setLocation(100, 100);
    jPanel1.add(enroll);

    JTextField tenroll = new JTextField();
    tenroll.setFont(new Font("Arial", Font.PLAIN, 15));
    tenroll.setSize(190, 20);
    tenroll.setLocation(200, 100);
    tenroll.setColumns(4);
    jPanel1.add(tenroll);

    JButton nextbutton = new JButton("Next");
    jPanel1.add(nextbutton);

    // jPanel1.setVisible(true);

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
	ButtonGroup gengp = new ButtonGroup();
		gengp.add(male);
		gengp.add(female);
		gengp.add(other);

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
	ButtonGroup geng = new ButtonGroup();
		geng.add(CSE);
		geng.add(IT);
		geng.add(ECE);
		geng.add(EEE);

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
	
	ButtonGroup gen = new ButtonGroup();
		gen.add(ADA);
		gen.add(IM);
		gen.add(DC);
		gen.add(Java);

    JButton SUBMIT = new JButton("Submit");
	jPanel3.add(SUBMIT);
	
	JTextField result = new JTextField();
    result.setFont(new Font("Arial", Font.PLAIN, 15));
    result.setSize(190, 20);
    result.setLocation(200, 100);
	result.setColumns(10);
	result.setEditable(false);
    jPanel4.add(result);

   
    cPanel.add(jPanel1, "1");

    cPanel.add(jPanel2, "2");

	cPanel.add(jPanel3, "3");
	cPanel.add(jPanel4, "4");

    nextbutton.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent ae) {
          
            

            crd.show(cPanel, "2");
          
        }
      }
	);
	nextbutton1.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent ae) {
          
			crd.show(cPanel, "3");
          
        }
      }
	);
	SUBMIT.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent ae) {
          
			crd.show(cPanel, "4");
          
        }
      }
    );
    getContentPane().add(cPanel);
  }
}

public class Proj {

  public static void main(String[] args) throws Exception {
    MyFrame f = new MyFrame();
    f.setVisible(true);
  }
}
