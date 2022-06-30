import java.awt.Color; //Importing classes required for the assignment
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class PizzaCalculator extends JFrame {
    //Frame for the Pizza Calculator
    private Frame frame;
    private JPanel line2 = new JPanel();

    String size; //String variable size

    double servings;

    //Constructor
    PizzaCalculator(){
        frame=new JFrame(); //Initializing frame
        JLabel title=new JLabel("Pizza Servings Calculator",SwingConstants.CENTER); //Creating title
        title.setForeground(Color.red); //Title color Red
        title.setFont(new Font("Serif", Font.BOLD, 25)); //Title Font family and Size
        JLabel inp_text=new JLabel("Enter the size of the pizza in inches: ");
        line2.add(inp_text);
        JTextField textField=new JTextField(4); //TextField object
        line2.add(textField);
        JButton calculate=new JButton("Calculate Servings"); //Calculate button
        JLabel lbl =new JLabel("",SwingConstants.CENTER);
        calculate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                size = textField.getText();
                servings = (Double.parseDouble(size)/8)*2;
                lbl.setText("A "+size+" inch pizza will serve "+servings+" people");
            }
        });

        //Adding components for the frame
        frame.add(title);
        frame.add(line2);
        frame.add(calculate);
        frame.add(lbl);
        frame.setLayout(new GridLayout(4,1));//Setting grid layout
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350,300);//Size for window
        frame.setTitle("Pizza Servings Calculator");//Title for the Window
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new PizzaCalculator();
    }
}