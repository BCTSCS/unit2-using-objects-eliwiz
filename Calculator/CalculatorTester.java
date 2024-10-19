import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorTester {
    //use static variables to update screen
     static JLabel resultLabel; 
     static Calculator calculator;
    public static void main(String[] args) {
        // Create the Calculator object
        calculator = new Calculator();

        // Create the frame
        JFrame frame = new JFrame("Calculator GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        // Create two text fields for number input
        JTextField num1Field = new JTextField(10);
        JTextField num2Field = new JTextField(10);

        // Create a label for displaying results
        resultLabel = new JLabel("Result: ");


        // Create a panel for number input
        JPanel input = new JPanel(new GridLayout(1,5));
        input.add(new JLabel("Num 1:"));
        input.add(num1Field);
        input.add(new JLabel("Num 2:"));
        input.add(num2Field);
        input.add(resultLabel);
        
        // Create a panel for operation buttons 4 row 1 columns
        JPanel calculate = new JPanel(new GridLayout(4,1));
        // Create buttons for operations
        JButton addButton = new JButton("+");
        JButton subtractButton = new JButton("-");
        JButton multiplyButton = new JButton("*");
        JButton divideButton = new JButton("/");

        // Add buttons to panel for display
        calculate.add(addButton);
        calculate.add(subtractButton);
        calculate.add(multiplyButton);
        calculate.add(divideButton);

        // Add panels to the frame
        frame.setLayout(new GridLayout(2,1));
        frame.add(input);
        frame.add(calculate);

        // Action listener to handle all button clicks
        ActionListener actionListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //e refers to detected Event
                // Get input numbers
                //double num1 = Double.parseDouble(num1Field.getText());
                //double num2 =  Double.parseDouble(num2Field.getText());

                // Check which button was clicked and perform the operation
               // if (e.getSource() == addButton) {
                 ///   calculator.add(num1, num2);
                //} 
                System.out.println(e.getSource());
            }
        };

        // Add action listener to the buttons
        addButton.addActionListener(actionListener);
        subtractButton.addActionListener(actionListener);
        multiplyButton.addActionListener(actionListener);
        divideButton.addActionListener(actionListener);
        //num1Field.addActionListener(actionListener);
        //num2Field.addActionListener(actionListener);
     

        // Set frame to be visible
        frame.setVisible(true);
    }
}
