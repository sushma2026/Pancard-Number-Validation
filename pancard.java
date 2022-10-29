import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class pancard{
    public static void main(String args[]){
        new pancard();
    }
    private JFrame frame;
    private JTextField numberField;
    private JLabel validLabel;
    private JButton verifyButton;
    public pancard(){
        frame =new  JFrame("Pancard Number Verifier");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(350,400));
        numberField=new JTextField(10);
        validLabel = new JLabel("not yet verified");
        verifyButton= new JButton("Verify Pancard Number");

        verifyButton.addActionListener(new VerifyListener());

        frame.setLayout(new FlowLayout());
        frame.add(numberField);
        frame.add(verifyButton);
        frame.add(validLabel);
        frame.setVisible(true);
    }
       public static boolean  IsValidPanCardNumber(String number) {
       if(number.matches ("[A-Z]{5}[0-9]{4}[A-Z]{1}"))
        {
            return true;
        }
        else
        {
           return false;
        }
}
        

    
    public class VerifyListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            String number = numberField.getText();
            if ( IsValidPanCardNumber(number)) {
                validLabel.setText("Valid number!");
            } else {
                validLabel.setText("Invalid number.");
            }
        }
        }
    }
