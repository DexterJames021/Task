import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login extends JFrame {
    private JButton submitButton;
    private JTextField inputF;
    private JPanel container;

    public login() {
        setContentPane(container);
        setTitle("Is Even or Odd");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 300);
        setVisible(true);
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int input = Integer.parseInt(inputF.getText());
                System.out.println("INPUT::::::::" + input);
                if(inputF.getText() == null){
                    JOptionPane.showMessageDialog(login.this, "NULL");
                }
                if(input % 2 == 0){
                    JOptionPane.showMessageDialog(login.this, "EVEN");
                }else {
                    JOptionPane.showMessageDialog(login.this, "ODD");
                }

            }
        });
    }

    public static void main(String[] args) {
        new login();
    }
}
