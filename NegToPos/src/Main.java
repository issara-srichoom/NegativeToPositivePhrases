import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class Main {
    private JFrame frame;
    private JTextArea textArea;
    private JLabel counterLabel;

    public Main() {
        frame = new JFrame("B Checker");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        JPanel panel = new JPanel(new BorderLayout());
        textArea = new JTextArea();
        textArea.setLineWrap(true);
        panel.add(new JScrollPane(textArea), BorderLayout.CENTER);

        counterLabel = new JLabel("never");
        panel.add(counterLabel, BorderLayout.SOUTH);

        frame.add(panel);

        textArea.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {

                String currentText = textArea.getText();

                ArrayList<String> splitText = StringParse.sentenceToArrayList(currentText);

                System.out.println(splitText);

                //counterLabel.setText("Number of 'b's: " + bCount);

            }
        });

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}