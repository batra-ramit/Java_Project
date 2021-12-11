
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame extends JFrame {

  int Score = 0;

  public MyFrame() {
    setTitle("Google Form Project");
    setBounds(300, 90, 1130, 500);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setResizable(false);

    JPanel cPanel = new JPanel();

    CardLayout crd;
    crd = new CardLayout(35, 150);
    cPanel.setLayout(crd);

    JPanel jPanel1 = new JPanel();
    JPanel jPanel2 = new JPanel();
    JPanel jPanel3 = new JPanel();
    JPanel jPanel4 = new JPanel();

    JLabel name = new JLabel("Name");
    name.setFont(new Font("Arial", Font.PLAIN, 20));
    jPanel1.add(name);

    JTextField tname = new JTextField("");
    tname.setFont(new Font("Arial", Font.PLAIN, 15));

    tname.setColumns(10);
    jPanel1.add(tname);

    JLabel enroll = new JLabel("Enrollment No");
    enroll.setFont(new Font("Arial", Font.PLAIN, 20));

    enroll.setBounds(300, 20, 100, 100);
    jPanel1.add(enroll);

    JTextField tenroll = new JTextField();
    tenroll.setFont(new Font("Arial", Font.PLAIN, 15));

    tenroll.setColumns(10);
    jPanel1.add(tenroll);

    JButton nextbutton = new JButton("Next");
    jPanel1.add(nextbutton);

    cPanel.setAlignmentX(Component.LEFT_ALIGNMENT);

    JLabel Q1 = new JLabel("Q1. Which city is the capital city of India ?");
    Q1.setFont(new Font("Arial", Font.PLAIN, 20));

    jPanel2.add(Q1);

    JRadioButton Delhi = new JRadioButton("Delhi");
    Delhi.setFont(new Font("Arial", Font.PLAIN, 15));
    Delhi.setSelected(false);

    jPanel2.add(Delhi);

    JRadioButton Mumbai = new JRadioButton("Mumbai");
    Mumbai.setFont(new Font("Arial", Font.PLAIN, 15));
    Mumbai.setSelected(false);

    jPanel2.add(Mumbai);

    JRadioButton Kolkata = new JRadioButton("Kolkata");
    Kolkata.setFont(new Font("Arial", Font.PLAIN, 15));
    Kolkata.setSelected(false);

    jPanel2.add(Kolkata);

    JRadioButton Chandigarh = new JRadioButton("Chandigarh");
    Chandigarh.setFont(new Font("Arial", Font.PLAIN, 15));
    Chandigarh.setSelected(false);

    jPanel2.add(Chandigarh);

    ButtonGroup gengp = new ButtonGroup();
    gengp.add(Delhi);
    gengp.add(Mumbai);
    gengp.add(Kolkata);
    gengp.add(Chandigarh);

    JLabel Q2 = new JLabel("Q2. Who is the current President of India ?");
    Q2.setFont(new Font("Arial", Font.PLAIN, 20));

    jPanel2.add(Q2);

    JRadioButton RamNathKovind = new JRadioButton("Mr. Ram Nath Kovind");
    RamNathKovind.setFont(new Font("Arial", Font.PLAIN, 15));
    RamNathKovind.setSelected(false);

    jPanel2.add(RamNathKovind);

    JRadioButton Kalam = new JRadioButton("Dr. APJ Abdul Kalam");
    Kalam.setFont(new Font("Arial", Font.PLAIN, 15));
    Kalam.setSelected(false);

    jPanel2.add(Kalam);

    JRadioButton Ppatil = new JRadioButton("Mrs Pratibha Patil");
    Ppatil.setFont(new Font("Arial", Font.PLAIN, 15));
    Ppatil.setSelected(false);

    jPanel2.add(Ppatil);

    JRadioButton Namo = new JRadioButton("Mr Narendra Modi");
    Namo.setFont(new Font("Arial", Font.PLAIN, 15));
    Namo.setSelected(false);

    jPanel2.add(Namo);

    ButtonGroup geng = new ButtonGroup();
    geng.add(RamNathKovind);
    geng.add(Kalam);
    geng.add(Ppatil);
    geng.add(Namo);

    JButton Previous = new JButton("Previous");
    jPanel2.add(Previous);

    JButton nextbutton1 = new JButton("Next");
    jPanel2.add(nextbutton1);

    JLabel Q3 = new JLabel("Q3. When did India become a Republic ?");
    Q3.setFont(new Font("Arial", Font.PLAIN, 20));

    jPanel3.add(Q3);

    JRadioButton year47 = new JRadioButton("1947");
    year47.setFont(new Font("Arial", Font.PLAIN, 15));
    year47.setSelected(false);

    jPanel3.add(year47);

    JRadioButton year50 = new JRadioButton("1950");
    year50.setFont(new Font("Arial", Font.PLAIN, 15));
    year50.setSelected(false);

    jPanel3.add(year50);

    JRadioButton year35 = new JRadioButton("1935");
    year35.setFont(new Font("Arial", Font.PLAIN, 15));
    year35.setSelected(false);

    jPanel3.add(year35);

    JRadioButton year49 = new JRadioButton("1949");
    year49.setFont(new Font("Arial", Font.PLAIN, 15));
    year49.setSelected(false);

    jPanel3.add(year49);

    ButtonGroup gen = new ButtonGroup();
    gen.add(year35);
    gen.add(year49);
    gen.add(year47);
    gen.add(year50);

    JButton Previous1 = new JButton("Previous");
    jPanel3.add(Previous1);

    JButton SUBMIT = new JButton("Submit");
    jPanel3.add(SUBMIT);

    JTextField result = new JTextField();
    result.setFont(new Font("Arial", Font.PLAIN, 15));

    result.setColumns(40);
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
    Previous.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent ae) {
          crd.show(cPanel, "1");
        }
      }
    );
    Previous1.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent ae) {
          crd.show(cPanel, "2");
        }
      }
    );
    SUBMIT.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent ae) {
          String namedata = tname.getText();
          String Enrolldata = tenroll.getText();

          if (year50.isSelected() == true) Score++;
          if (RamNathKovind.isSelected() == true) Score++;
          if (Delhi.isSelected() == true) Score++;
          String Final =
            "The marks of " +
            namedata +
            " with " +
            Enrolldata +
            " are " +
            Score +
            " out of 3";
          result.setText(Final);
          crd.show(cPanel, "4");
        }
      }
    );
    getContentPane().add(cPanel);
  }
}

public class FinalProj{

  public static void main(String[] args) throws Exception {
    MyFrame f = new MyFrame();
    f.setVisible(true);
  }
}
