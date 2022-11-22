import java.awt.*;
import java.util.Scanner;
import java.awt.event.*;
import javax.swing.*;
public class Window{
    Scanner input = new Scanner(System.in);
    JFrame f;
    JTextArea names;
    Window(){
        f=new JFrame("Birthdays");
        final JLabel label = new JLabel();
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setSize(390,400);
        JButton b=new JButton("Show");
        b.setBounds(250,100,75,20);
        String names[] = {"Monika Nedelkova", "Magda Nikolova", "Georgi Ivanov",
        "Ivan Georgiev", "Elena Marinova"};
        String days[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9",
                "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20",
                "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31",};
        String month[] = {"January", "February", "March", "April", "May", "Juny",
        "July", "August", "September", "October", "November", "December"};
        final JComboBox cb = new JComboBox(names);
        final JComboBox ab = new JComboBox(days);
        final JComboBox ca = new JComboBox(month);
        cb.setBounds(50, 50,160,20);
        f.add(cb); f.add(label); f.add(b);
        f.setLayout(null);
        f.setSize(350,350);
        f.setVisible(true);
        cb.setBounds(50, 50, 160, 20);
        f.add(cb);
        ab.setBounds(50, 100, 160, 20);
        f.add(ab);
        ca.setBounds(50, 150, 160, 20);
        f.add(ca);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String data = " "
                        + cb.getItemAt(cb.getSelectedIndex()) + " Birthday: " + ab.getItemAt(ab.getSelectedIndex())
                        + " " + ca.getItemAt(ca.getSelectedIndex());
                label.setText(data);
            }
        });
    }
    public static void main(String[] args) {
       Window window = new Window();
    }
}
