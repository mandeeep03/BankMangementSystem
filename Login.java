package BankMangementSystem;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Login extends JFrame implements ActionListener {//jframe is a classs  for window and Action listener is a interface to impliment 

    //global declaration of the variables that needed to be used by other fuctions
    JButton login, clear,signUp;
    JTextField cardTextField;
    JPasswordField pinTextField;
    Login() {
        // Adding image to Frame 
        setLayout(null);//removing default layout 
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT);//formating image size 
        ImageIcon i3 = new ImageIcon(i2);//converting image to image icon so that we can use it in jlabel
        JLabel label = new JLabel(i3);
        label.setBounds(180,25,70,70);//set position  on frame
        getContentPane().setBackground(Color.WHITE);//set frame bgcolor
        add(label);

        //Adding text 
        JLabel text = new JLabel("Welcome to ATM");
        text.setFont(new Font("Osward",Font.BOLD,35));
        text.setBounds(260,40,300,40);
        add(text);

        JLabel cardNo = new JLabel("Card No   :");
        cardNo.setFont(new Font("Raleway", Font.BOLD, 20));
        cardNo.setBounds(200, 120, 300, 40);
        add(cardNo);

        //adding textfeilds to enter info
        cardTextField = new JTextField();
        cardTextField.setBounds(310,127,300,30);
        add(cardTextField); 

        JLabel pin = new JLabel("Pin           :");
        pin.setFont(new Font("Raleway", Font.BOLD, 20));
        pin.setBounds(200, 200 , 300, 40);
        add(pin);

        pinTextField = new JPasswordField();
        pinTextField.setBounds(310, 210, 300, 30);
        add(pinTextField);

        //adding buttons signup or clear
        login = new JButton("SIGN IN");
        login.setBounds(300 ,300,100,30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);

        clear = new JButton("CLEAR");
        clear.setBounds(450, 300, 100, 30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);

        signUp = new JButton("SIGNUP");
        signUp.setBounds(300, 350, 250, 30);
        signUp.setBackground(Color.BLACK);
        signUp.setForeground(Color.WHITE);
        signUp.addActionListener(this);
        add(signUp);

        setTitle("ATM");
        setSize(800, 600);
        setVisible(true);
        setLocation(300, 200);
    }

    //overwriting the abstract menthod defined inside the actionsListner interface
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==clear){
            cardTextField.setText("");
            pinTextField.setText("");
        }
        else if(ae.getSource()==login){
           
        }
        else if(ae.getSource()==signUp){
            
        }
    }
    public static void main(String[] args) {
        new Login();
    }
}
