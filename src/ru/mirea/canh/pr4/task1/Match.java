package ru.mirea.canh.pr4.task1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Match extends JFrame implements ActionListener {
    JButton jbACM, jbRM, reset, end;
    JLabel jlResult, jlLastScorer, logo_acm, logo_rm, fc;
    Label lWinner, Info;
    JTextField jtACM, jtRM, jtLS, jtW;

    String LastScorer = "N/A";
    String TheWinner = "DRAW";
    int acm = 0;
    int rm = 0;
    Container cont;
    JPanel header, body, footer;


    public Match(String nameProgram) {
        super(nameProgram);
        cont = this.getContentPane(); /*Lấy lớp ContentPane để đặt các đối tượng hiển thị*/

        // Header
        Info = new Label("AC Milan vs Real Madrid");
        end = new JButton("End");
        end.setBackground(Color.RED);
        end.setPreferredSize(new Dimension(55, 20));

        header = new JPanel();
        header.add(Info);
        header.add(end);

        // Body
        fc = new JLabel("FC", SwingConstants.CENTER);
        logo_acm = new JLabel(new ImageIcon("src/images/logo_acm.png"));
        logo_rm = new JLabel(new ImageIcon("src/images/logo_rm.png"));

        reset = new JButton("Reset");
        reset.setBackground(Color.CYAN);
        jbACM = new JButton("AC Milan");
        jbRM = new JButton("Real Madrid");
        jlResult = new JLabel("Result: ", SwingConstants.CENTER);
        jtACM = new JTextField();
        jtACM.setEditable(false);
        jtRM = new JTextField();
        jtRM.setEditable(false);

        jtACM.setText(String.valueOf(acm));
        jtRM.setText(String.valueOf(rm));

        body = new JPanel(new GridLayout(3, 3));
        body.add(fc);
        body.add(logo_acm);
        body.add(logo_rm);

        body.add(reset);
        body.add(jbACM);
        body.add(jbRM);
        body.add(jlResult);
        body.add(jtACM);
        body.add(jtRM);


        // Footer
        jlLastScorer = new JLabel("Last Scorer: ", SwingConstants.CENTER);
        jtLS = new JTextField();
        jtLS.setEditable(false);

        lWinner = new Label("Winner: ");

        jtW = new JTextField();
        jtW.setEditable(false);

        jtLS.setText(LastScorer);
        jtW.setText(TheWinner);

        footer = new JPanel(new GridLayout(2, 2));
        footer.add(jlLastScorer);
        footer.add(jtLS);
        footer.add(lWinner);
        footer.add(jtW);

        cont.add(header, "North");
        cont.add(body, "Center");
        cont.add(footer, "South");

        end.addActionListener(this);
        jbACM.addActionListener(this);
        jbRM.addActionListener(this);
        reset.addActionListener(this);

        //setSize(480, 320);
        this.pack();
        this.setVisible(true);
    }

    public void goalACM() {

        acm ++;
        jtACM.setText(String.valueOf(acm));
    }

    public void goalRM() {

        rm ++;
        jtRM.setText(String.valueOf(rm));
    }

    public void resetAll() {
        this.LastScorer = "N/A";
        this.TheWinner = "DRAW";
        this.acm = 0;
        this.rm = 0;
        jtACM.setText(String.valueOf(acm));
        jtRM.setText(String.valueOf(rm));
        jtLS.setText(LastScorer);
        jtW.setText(TheWinner);

        JOptionPane.showMessageDialog(null, "Reset Successful!!!", "Alert", JOptionPane.INFORMATION_MESSAGE);
    }

    public void checkWinner() {
        if(acm > rm)
            jtW.setText("AC Milan");
        else if(rm > acm)
            jtW.setText("Real Madrid");
        else
            jtW.setText("DRAW");
    }

    public void endMatch() {
        if(acm > rm)
            JOptionPane.showMessageDialog(null, "AC Milan won Real Madrid with the score:" +
                    " \n                            " + acm +
                    " : " + rm, "Finish the match", JOptionPane.INFORMATION_MESSAGE);
        else if(rm > acm)
            JOptionPane.showMessageDialog(null, "Real Madrid won AC Milan with the score:" +
                    " \n                            " + rm +
                    " : " + acm, "Finish the match", JOptionPane.INFORMATION_MESSAGE);
        else
            JOptionPane.showMessageDialog(null, "The match ended with a draw:" +
                    "\n                     " + acm + " : " + rm , "Finish the match", JOptionPane.INFORMATION_MESSAGE);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand() == "Reset")
            resetAll();
        if(e.getActionCommand() == "AC Milan") {
            goalACM();
            jtLS.setText("AC Milan");
            checkWinner();
        }

        if(e.getActionCommand() == "Real Madrid") {
            goalRM();
            jtLS.setText("Real Madrid");
            checkWinner();
        }
        if(e.getActionCommand() == "End") {
            endMatch();
            resetAll();
        }

    }
    public static void main(String[] args) {
        Match mat = new Match("Match Football");
        mat.setDefaultCloseOperation(EXIT_ON_CLOSE);
        mat.setLocationRelativeTo(null); // displays the window in the middle of the screen.
    }

}
