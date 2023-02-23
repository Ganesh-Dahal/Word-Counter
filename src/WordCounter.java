import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WordCounter extends JFrame implements ActionListener {

    private JTextField textField;
    private JLabel wordCountLabel;

    public WordCounter() {
        super("Word Counter Saurab Dahal");
        setSize(600, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel(new BorderLayout());
        JPanel textPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));

        textField = new JTextField(20);
        wordCountLabel = new JLabel("0 words");

        JButton countButton = new JButton("Count Words");
        countButton.addActionListener(this);

        textPanel.add(new JLabel("Enter Text: "));
        textPanel.add(textField);


        buttonPanel.add(countButton);
        buttonPanel.add(wordCountLabel);

        mainPanel.add(textPanel, BorderLayout.NORTH);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        setContentPane(mainPanel);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Count Words")) {
            String text = textField.getText().trim();
            if (text.isEmpty()) {
                wordCountLabel.setText("0 words");
            } else {
                int wordCount = text.split("\\s+").length;
                wordCountLabel.setText(wordCount + " words");
            }
        }
    }
    public static void main(String[] args) {
        new WordCounter();
    }
}
