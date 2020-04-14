import javax.swing.*;
import java.awt.event.*;

public class Apiary implements ActionListener {   
    
    public static void main(String[]args) {
        JFrame frame = new JFrame("Apiary");
        frame.setSize(350, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel usernameLabel = new JLabel("Username");
        usernameLabel.setBounds(10,20,80,25);
        panel.add(usernameLabel);

        JTextField userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        panel.add(userText);

        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10,50,80,25);
        panel.add(passwordLabel);

        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(100,50,165,25);
        panel.add(passwordText);

        JButton loginButton = new JButton("Login");
        loginButton.setBounds(10, 80, 80, 25);
        panel.add(loginButton);
        
        Apiary apiary = new Apiary();
        loginButton.addActionListener(apiary);
        userText.addActionListener(apiary);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String usernameInput = userText.getText();
        System.out.println(usernameInput);
    }
}
