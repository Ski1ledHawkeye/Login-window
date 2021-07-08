import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class login implements ActionListener
{   
    private static JLabel userlabel;
    private static JTextField userText;
    private static JLabel passwordlabel;
    private static JPasswordField passwordText;
    private static JButton button;
    private static JLabel success;
    
    public static void main(String args[])
    {
      JPanel panel = new JPanel();
      JFrame frame = new JFrame();
      frame.setSize(350, 200);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
      frame.add(panel);
      
      panel.setLayout(null);
      
      //usernane
      userlabel = new JLabel("Username");
      userlabel.setBounds(10, 20, 80, 25);
      panel.add(userlabel);
      
      userText = new JTextField();
      userText.setBounds(100, 20, 165, 25);
      panel.add(userText);
      
      //password
      passwordlabel = new JLabel("Password");
      passwordlabel.setBounds(10, 50, 80, 25);
      panel.add(passwordlabel);
      
      passwordText = new JPasswordField();
      passwordText.setBounds(100, 50, 165, 25);
      panel.add(passwordText);
      
      //submit button
      button = new JButton("Login");
      button.setBounds(10, 80, 80, 25);
      button.addActionListener(new login());
      panel.add(button);
      
      //response
      success = new JLabel("");
      success.setBounds(10, 110, 300, 25);
      panel.add(success);
      
      frame.setVisible(true);
    }
    
    
    //event listner
    public void actionPerformed(ActionEvent e) {
        String user = userText.getText();
        String password = passwordText.getText();
        
        
        if(user.equals("Ski11edHawkeYe") && password.equals("abcde")){
            success.setText("Login successful :)");
            System.out.println(user);
        }
        else if(user.equals("Ski11edHawkeYe") && !password.equals("abcde")){
            success.setText("You entered wrong password :(");
        }
        else{
            success.setText("You entered wrong username & password :(");
        }
        }
    } 
