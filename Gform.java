import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Gform extends JFrame {

  private int currCard = 1;

  private CardLayout crd;

  public Gform() {
    setTitle("Google Form");

    setBounds(300, 90, 900, 600);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setResizable(false);

    JPanel cPanel = new JPanel();

    crd = new CardLayout();

    cPanel.setLayout(crd);

    JPanel jPanel1 = new JPanel();

    JLabel title = new JLabel("Registration Form");
    title.setFont(new Font("Arial", Font.PLAIN, 30));
    title.setSize(300, 30);
    title.setLocation(300, 30);
    jPanel1.add(title);

    JLabel name = new JLabel("Name");
    name.setFont(new Font("Arial", Font.PLAIN, 20));
    name.setLocation(200, 200);
    name.setSize(100, 20);
    name.setLocation(400, 400);
    jPanel1.add(name);

    JTextField tname = new JTextField();
    tname.setFont(new Font("Arial", Font.PLAIN, 15));
    tname.setSize(390, 320);
    tname.setLocation(300, 300);
    tname.setColumns(6);
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
    tenroll.setColumns(6);
    jPanel1.add(tenroll);

    JPanel jPanel2 = new JPanel();

    JPanel jPanel3 = new JPanel();

    JPanel jPanel4 = new JPanel();

    JLabel jLabel1 = new JLabel("C1");

    JLabel jLabel2 = new JLabel("C2");

    JLabel jLabel3 = new JLabel("C3");

    JLabel jLabel4 = new JLabel("C4");

    // jPanel1.add(jLabel1);

    jPanel2.add(jLabel2);

    jPanel3.add(jLabel3);

    jPanel4.add(jLabel4);

    cPanel.add(jPanel1, "1");

    cPanel.add(jPanel2, "2");

    cPanel.add(jPanel3, "3");

    cPanel.add(jPanel4, "4");

    JPanel btnPanel = new JPanel();

    JButton firstButton = new JButton("First");

    JButton nextButton = new JButton("->");

    JButton previousButton = new JButton("<-");

    JButton lastButton = new JButton("Last");

    btnPanel.add(firstButton);

    btnPanel.add(nextButton);

    btnPanel.add(previousButton);

    btnPanel.add(lastButton);

    firstButton.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent ae) {
          crd.first(cPanel);

          currCard = 1;
        }
      }
    );

    lastButton.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent ae) {
          crd.last(cPanel);

          currCard = 4;
        }
      }
    );

    nextButton.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent ae) {
          if (currCard < 4) {
            currCard = currCard + 1;

            crd.show(cPanel, "" + (currCard));
          }
        }
      }
    );

    previousButton.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent ae) {
          if (currCard > 1) {
            currCard = currCard - 1;

            crd.show(cPanel, "" + (currCard));
          }
        }
      }
    );

    getContentPane().add(cPanel,);

    getContentPane().add(btnPanel, BorderLayout.SOUTH);
  }

  public static void main(String argvs[]) {
    Gform cll = new Gform();

    cll.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    cll.setVisible(true);
  }
}
