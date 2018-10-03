package sticks;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author RCBG
 */
public class SticksUI extends javax.swing.JFrame {
    private ImageIcon image;
    private int stick_counter;
    
    public SticksUI() {
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        image=new ImageIcon(getClass().getResource("0.png"));
        sticksLBL = new JLabel(image);
        oneBTN = new javax.swing.JButton();
        threeBTN = new javax.swing.JButton();
        twoBTN = new javax.swing.JButton();
        fourBTN = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        logTA = new javax.swing.JTextArea();
        startBTN = new javax.swing.JButton();
        loadingTF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("21 Sticks");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(40, 40, 40));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        jPanel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPanel1KeyPressed(evt);
            }
        });

        sticksLBL.setMaximumSize(new java.awt.Dimension(464, 215));
        sticksLBL.setMinimumSize(new java.awt.Dimension(464, 215));

        oneBTN.setFont(new java.awt.Font("Vrinda", 0, 11)); // NOI18N
        oneBTN.setText("1");
        oneBTN.setEnabled(false);
        oneBTN.setFocusable(false);
        oneBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneBTNActionPerformed(evt);
            }
        });

        threeBTN.setFont(new java.awt.Font("Vrinda", 0, 11)); // NOI18N
        threeBTN.setText("3");
        threeBTN.setEnabled(false);
        threeBTN.setFocusable(false);
        threeBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeBTNActionPerformed(evt);
            }
        });

        twoBTN.setFont(new java.awt.Font("Vrinda", 0, 11)); // NOI18N
        twoBTN.setText("2");
        twoBTN.setEnabled(false);
        twoBTN.setFocusable(false);
        twoBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoBTNActionPerformed(evt);
            }
        });

        fourBTN.setFont(new java.awt.Font("Vrinda", 0, 11)); // NOI18N
        fourBTN.setText("4");
        fourBTN.setEnabled(false);
        fourBTN.setFocusable(false);
        fourBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourBTNActionPerformed(evt);
            }
        });

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        logTA.setEditable(false);
        logTA.setBackground(new java.awt.Color(204, 204, 204));
        logTA.setColumns(20);
        logTA.setFont(new java.awt.Font("Vrinda", 0, 11)); // NOI18N
        logTA.setRows(5);
        logTA.setFocusable(false);
        jScrollPane1.setViewportView(logTA);

        startBTN.setFont(new java.awt.Font("Vrinda", 0, 11)); // NOI18N
        startBTN.setText("Start Game");
        startBTN.setFocusable(false);
        startBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startBTNActionPerformed(evt);
            }
        });

        loadingTF.setEditable(false);
        loadingTF.setBackground(new java.awt.Color(204, 204, 204));
        loadingTF.setFont(new java.awt.Font("Segoe UI", 2, 11)); // NOI18N
        loadingTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        loadingTF.setText("--");
        loadingTF.setFocusable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sticksLBL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(startBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(threeBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(fourBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(oneBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(twoBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(loadingTF)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE))))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(sticksLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startBTN)
                    .addComponent(loadingTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(oneBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(twoBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fourBTN, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                            .addComponent(threeBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(1, 1, 1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startBTNActionPerformed
        startBTN.setEnabled(false);
        oneBTN.setEnabled(true);
        twoBTN.setEnabled(true);
        threeBTN.setEnabled(true);
        fourBTN.setEnabled(true);
        stick_counter=0;
        updateLabel();
        logTA.setText("Game started.");
    }//GEN-LAST:event_startBTNActionPerformed

    private void oneBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneBTNActionPerformed
        logTA.append("\nUser picked up 1 stick.");
        logTA.setCaretPosition(logTA.getDocument().getLength());
        stick_counter+=1;
        updateLabel();
        checkUserWin();
    }//GEN-LAST:event_oneBTNActionPerformed

    private void twoBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoBTNActionPerformed
        logTA.append("\nUser picked up 2 sticks.");
        logTA.setCaretPosition(logTA.getDocument().getLength());
        stick_counter+=2;
        updateLabel();
        checkUserWin();
    }//GEN-LAST:event_twoBTNActionPerformed

    private void threeBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeBTNActionPerformed
        logTA.append("\nUser picked up 3 sticks.");
        logTA.setCaretPosition(logTA.getDocument().getLength());
        stick_counter+=3;
        updateLabel();
        checkUserWin();
    }//GEN-LAST:event_threeBTNActionPerformed

    private void fourBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourBTNActionPerformed
        logTA.append("\nUser picked up 4 sticks.");
        logTA.setCaretPosition(logTA.getDocument().getLength());
        stick_counter+=4;
        updateLabel();
        checkUserWin();
    }//GEN-LAST:event_fourBTNActionPerformed

    private void jPanel1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel1KeyPressed
        System.exit(0);
    }//GEN-LAST:event_jPanel1KeyPressed

    private void computerMove(){ //computer AI
        if(16-stick_counter<=4&&16-stick_counter>=1){
            if(16-stick_counter==1){
                logTA.append("\nComputer picked up 1 stick.");
            }else{
                logTA.append("\nComputer picked up "+(16-stick_counter)+" sticks.");
            }
            stick_counter+=(16-stick_counter);
        }else if(21-stick_counter<=4&&21-stick_counter>=1){
            if(21-stick_counter==1){
                logTA.append("\nComputer picked up 1 stick.");
            }else{
                logTA.append("\nComputer picked up "+(21-stick_counter)+" sticks.");
            }
            stick_counter+=(21-stick_counter);
            logTA.append("\nComputer won the game.");
            startBTN.setEnabled(true);
            buttonDisable();
        }else{
            Random r=new Random();
            int random=r.nextInt(4)+1;
            if(random==1){
                logTA.append("\nComputer picked up 1 stick.");
            }else{
                logTA.append("\nComputer picked up "+random+" sticks.");
            }
            stick_counter+=random;
        }
        logTA.setCaretPosition(logTA.getDocument().getLength());
    }
    
    private void buttonEnable(){
        oneBTN.setEnabled(true);
        twoBTN.setEnabled(true);
        threeBTN.setEnabled(true);
        fourBTN.setEnabled(true);
    }
    
    private void buttonDisable(){
        oneBTN.setEnabled(false);
        twoBTN.setEnabled(false);
        threeBTN.setEnabled(false);
        fourBTN.setEnabled(false);
    }
    
    private void buttonLimit(){  //limits buttons enabled when sticks remaining are less than 4
        if(stick_counter>=18){
            if(stick_counter==18){
                fourBTN.setEnabled(false);
            }else if(stick_counter==19){
                fourBTN.setEnabled(false);
                threeBTN.setEnabled(false);
            }else if(stick_counter==20){
                fourBTN.setEnabled(false);
                threeBTN.setEnabled(false);
                twoBTN.setEnabled(false);
            }
        }
    }
    
    private void updateLabel(){ //change picture after each picked up sticks
        String filenames[]={"0.png","1.png","2.png","3.png","4.png","5.png","6.png","7.png","8.png"
                ,"9.png","10.png","11.png","12.png","13.png","14.png","15.png","16.png","17.png"
                ,"18.png","19.png","20.png","21.png"};
        image=new ImageIcon(getClass().getResource(filenames[21-stick_counter]));
        sticksLBL.setIcon(image);
    }
    
    private void checkUserWin(){
        if(stick_counter==21){
            logTA.append("\nUser won the game.");
            logTA.setCaretPosition(logTA.getDocument().getLength());
            startBTN.setEnabled(true);
            buttonDisable();
        }else{
            new ComputerThread().start();
        }
    }
    
    class ComputerThread extends Thread{
        @Override
        public void run(){
            buttonDisable();
            loadingTF.setText("Computer thinking.....");
            try {
                sleep(1500);
            } catch (InterruptedException ex) {
                Logger.getLogger(SticksUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            buttonEnable();
            computerMove();
            loadingTF.setText("--");
            updateLabel();
            buttonLimit();
        }
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SticksUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SticksUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton fourBTN;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField loadingTF;
    private javax.swing.JTextArea logTA;
    private javax.swing.JButton oneBTN;
    private javax.swing.JButton startBTN;
    private javax.swing.JLabel sticksLBL;
    private javax.swing.JButton threeBTN;
    private javax.swing.JButton twoBTN;
    // End of variables declaration//GEN-END:variables
}
