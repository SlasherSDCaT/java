package practiePac.practice4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class App extends JFrame {
    int milanScore=0, realScore = 0;
    JButton milanBtn = new JButton("AC Milan");
    JButton realBtn = new JButton("Real Madrid");
    JLabel resLabel = new JLabel("Result: " + milanScore+" X "+realScore, SwingConstants.CENTER);
    JLabel lastScorer = new JLabel("Last Scorer: N/A", SwingConstants.CENTER);
    JLabel lbl = new JLabel("Winner: DRAW", SwingConstants.CENTER);
    JPanel subPanel = new JPanel();
    Font font = new Font("Area", Font.BOLD, 16);

    public App() {
        setLayout(null);
        resLabel.setFont(font);
        lastScorer.setFont(font);
        lbl.setFont(font);
        subPanel.setLayout(new BorderLayout());
        subPanel.add(resLabel, BorderLayout.NORTH);
        subPanel.add(lastScorer, BorderLayout.CENTER);
        subPanel.add(lbl, BorderLayout.SOUTH);
        subPanel.setBounds(40, 30, 200, 100);
        add(subPanel);

        milanBtn.setBounds(20, 170, 110, 60);
        add(milanBtn);

        realBtn.setBounds(160, 170, 110, 60);
        add(realBtn);

        setSize(300, 300);
        setResizable(false);
        setVisible(true);

        milanBtn.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                milanScore++;
                resLabel.setText("Result: " + milanScore+" X "+realScore);
                lastScorer.setText("Last Scorer: AC Milan");
                if (milanScore > realScore) lbl.setText("Winner: AC Milan");
                else if (milanScore < realScore) lbl.setText("Winner: Real Madrid");
                else lbl.setText("Winner: DRAW");
            }
            public void mousePressed(MouseEvent e) {}
            public void mouseReleased(MouseEvent e) {}
            public void mouseEntered(MouseEvent e) {}
            public void mouseExited(MouseEvent e) {}
        });

        realBtn.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                realScore++;
                resLabel.setText("Result: " + milanScore+" X "+realScore);
                lastScorer.setText("Last Scorer: Real Madrid");
                if (milanScore > realScore) lbl.setText("Winner: AC Milan");
                else if (milanScore < realScore) lbl.setText("Winner: Real Madrid");
                else lbl.setText("Winner: DRAW");
            }
            public void mousePressed(MouseEvent e) {}
            public void mouseReleased(MouseEvent e) {}
            public void mouseEntered(MouseEvent e) {}
            public void mouseExited(MouseEvent e) {}
        });
    }

    public static void main(String[] args) {
        new App();
    }

}