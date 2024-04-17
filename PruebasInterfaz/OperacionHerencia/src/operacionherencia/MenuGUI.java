package operacionherencia;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuGUI extends JFrame implements ActionListener {
    private Division division;
    private JTextField num1Field, num2Field;
    private JButton sumaButton, restaButton, multiplicacionButton, divisionButton, salirButton;

    public MenuGUI() {
        division = new Division();
        
        setTitle("Calculadora");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        num1Field = new JTextField(10);
        num2Field = new JTextField(10);

        sumaButton = new JButton("Suma");
        restaButton = new JButton("Resta");
        multiplicacionButton = new JButton("Multiplicación");
        divisionButton = new JButton("División");
        salirButton = new JButton("Salir");

        sumaButton.addActionListener(this);
        restaButton.addActionListener(this);
        multiplicacionButton.addActionListener(this);
        divisionButton.addActionListener(this);
        salirButton.addActionListener(this);

        panel.add(num1Field);
        panel.add(num2Field);
        panel.add(sumaButton);
        panel.add(restaButton);
        panel.add(multiplicacionButton);
        panel.add(divisionButton);
        panel.add(salirButton);

        add(panel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == sumaButton) {
            double n1 = Double.parseDouble(num1Field.getText());
            double n2 = Double.parseDouble(num2Field.getText());
            double result = division.suma(n1, n2);
            JOptionPane.showMessageDialog(this, "La suma es: " + result);
        } else if (e.getSource() == restaButton) {
            double n1 = Double.parseDouble(num1Field.getText());
            double n2 = Double.parseDouble(num2Field.getText());
            double result = division.resta(n1, n2);
            JOptionPane.showMessageDialog(this, "La resta es: " + result);
        } else if (e.getSource() == multiplicacionButton) {
            double n1 = Double.parseDouble(num1Field.getText());
            double n2 = Double.parseDouble(num2Field.getText());
            double result = division.multiplicacion(n1, n2);
            JOptionPane.showMessageDialog(this, "La multiplicación es: " + result);
        } else if (e.getSource() == divisionButton) {
            double n1 = Double.parseDouble(num1Field.getText());
            double n2 = Double.parseDouble(num2Field.getText());
            double result = division.division(n1, n2);
            if (result != Double.POSITIVE_INFINITY && result != Double.NEGATIVE_INFINITY) {
                JOptionPane.showMessageDialog(this, "La división es: " + result);
            }
        } else if (e.getSource() == salirButton) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MenuGUI menu = new MenuGUI();
            menu.setVisible(true);
        });
    }
}
