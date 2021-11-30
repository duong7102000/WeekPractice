package GUI;

import javax.swing.*;

public class App extends JFrame{
    private JButton runButton;
    private JPanel panel1;
    private JTextField textFieldBai;
    private JTextField textFieldWeek;

    public App(String title) {
        super(title);
        this.setTitle(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panel1);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
        runButton.addActionListener(actionEvent -> {
            RuntimeExec r = new RuntimeExec();
            String s = r.process(textFieldWeek.getText(), textFieldBai.getText());
            if (s=="Error"){
                JOptionPane.showMessageDialog(this, "Xin mời bạn nhập lại");
            }
            else {
                JOptionPane.showMessageDialog(this, s, textFieldWeek.getText() + " " + textFieldBai.getText(), JOptionPane.PLAIN_MESSAGE);
            }
        });
    }

    public static void main(String[] args) {
        App a = new App("App");
    }
}
