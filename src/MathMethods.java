/*
Mouner Dabjan]
November 2 2018
Math Methods 
 */

/**
 *
 * @author modab5310
 */
public class MathMethods extends javax.swing.JFrame {

    /**
     * Creates new form MathMethods
     */
    public MathMethods() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        instructions1 = new javax.swing.JLabel();
        input1 = new javax.swing.JTextField();
        input2 = new javax.swing.JTextField();
        largest = new javax.swing.JButton();
        outputlargest = new javax.swing.JLabel();
        instructions2 = new javax.swing.JLabel();
        input3 = new javax.swing.JTextField();
        input4 = new javax.swing.JTextField();
        smallest = new javax.swing.JButton();
        output2 = new javax.swing.JLabel();
        instructions3 = new javax.swing.JLabel();
        input5 = new javax.swing.JTextField();
        input6 = new javax.swing.JTextField();
        power = new javax.swing.JButton();
        output3 = new javax.swing.JLabel();
        instructions4 = new javax.swing.JLabel();
        input7 = new javax.swing.JTextField();
        input8 = new javax.swing.JTextField();
        hypotenuse = new javax.swing.JButton();
        output4 = new javax.swing.JLabel();
        instructions5 = new javax.swing.JLabel();
        input9 = new javax.swing.JTextField();
        roundeddown = new javax.swing.JButton();
        output5 = new javax.swing.JLabel();
        instructions6 = new javax.swing.JLabel();
        input11 = new javax.swing.JTextField();
        roundedup = new javax.swing.JButton();
        output6 = new javax.swing.JLabel();
        instructions7 = new javax.swing.JLabel();
        input13 = new javax.swing.JTextField();
        squareroot = new javax.swing.JButton();
        output7 = new javax.swing.JLabel();
        instructions8 = new javax.swing.JLabel();
        input15 = new javax.swing.JTextField();
        inradians = new javax.swing.JButton();
        output8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));
        jPanel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        title.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        title.setText("MAGICAL MATH METHODS ");

        instructions1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        instructions1.setText("Enter two numbers and click the button. THe program will display the largest of them. ");

        largest.setText("Largest");
        largest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                largestActionPerformed(evt);
            }
        });

        instructions2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        instructions2.setText("Enter two numbers and click the button. THe program will display the smallest of them.");

        smallest.setText("Smallest");
        smallest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smallestActionPerformed(evt);
            }
        });

        instructions3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        instructions3.setText("Enter two numbers and click the buttion. The prgoram will display the first number to the second number");

        power.setText("To the power of");
        power.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                powerActionPerformed(evt);
            }
        });

        instructions4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        instructions4.setText("Enter the  length of two sides of a  right angle triangle. The program will display the hypotenuse of the triangle   ");

        hypotenuse.setText("Hypotenuse");
        hypotenuse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hypotenuseActionPerformed(evt);
            }
        });

        instructions5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        instructions5.setText("Enter a decimal value. The program will display the value rounded down to the nearest integer ");

        roundeddown.setText("Rounded Down ");
        roundeddown.setToolTipText("");
        roundeddown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roundeddownActionPerformed(evt);
            }
        });

        instructions6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        instructions6.setText("Enter a decimal value. The program will display the value rounded up to the nearest integer ");

        roundedup.setText("Rounded Up");
        roundedup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roundedupActionPerformed(evt);
            }
        });

        instructions7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        instructions7.setText("Enter an integer. The program will display the square root of the integer. ");

        squareroot.setText("Sqaure Root");
        squareroot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                squarerootActionPerformed(evt);
            }
        });

        instructions8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        instructions8.setText("Enter an angle in degrees. The program will display the angle in radians  ");

        inradians.setText("In Radians");
        inradians.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inradiansActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(input1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(input2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96)
                .addComponent(largest)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(outputlargest, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(instructions1)
                            .addComponent(instructions2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(input3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(input4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101)
                        .addComponent(smallest)
                        .addGap(81, 81, 81)
                        .addComponent(output2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(instructions3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(title))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(input5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(input6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85)
                        .addComponent(power)
                        .addGap(114, 114, 114)
                        .addComponent(output3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(instructions4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(input7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(input8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(hypotenuse)
                        .addGap(105, 105, 105)
                        .addComponent(output4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(instructions5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(input9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(152, 152, 152)
                        .addComponent(roundeddown)
                        .addGap(78, 78, 78)
                        .addComponent(output5, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(instructions6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(input11, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(166, 166, 166)
                        .addComponent(roundedup)
                        .addGap(75, 75, 75)
                        .addComponent(output6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(instructions8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(input13, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(169, 169, 169)
                                .addComponent(squareroot))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(instructions7)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(output7, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(input15, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(172, 172, 172)
                        .addComponent(inradians)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(output8, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(143, 143, 143)))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(title)
                .addGap(18, 18, 18)
                .addComponent(instructions1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(input2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(largest)
                    .addComponent(outputlargest))
                .addGap(18, 18, 18)
                .addComponent(instructions2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(input4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(smallest)
                    .addComponent(output2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(instructions3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(input6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(power)
                    .addComponent(output3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(instructions4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(input8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hypotenuse)
                    .addComponent(output4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(instructions5)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roundeddown)
                    .addComponent(output5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(instructions6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roundedup)
                    .addComponent(output6))
                .addGap(18, 18, 18)
                .addComponent(instructions7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(input13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(squareroot))
                    .addComponent(output7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(instructions8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inradians)
                    .addComponent(output8))
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void largestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_largestActionPerformed

        //variables
        int num1;
        int num2;
        int value;
        
        num1 = Integer.parseInt(input1.getText());
        num2 = Integer.parseInt(input2.getText());
        
        //algorithm
        
        value = Math.max(num1,num2);
        
        // output
        
        outputlargest.setText(String.valueOf(value)); 
        
       
        
    }//GEN-LAST:event_largestActionPerformed

    private void smallestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smallestActionPerformed

        //variables
        int num3;
        int num4;
        int value;
        
        num3 = Integer.parseInt(input3.getText());
        num4 = Integer.parseInt(input4.getText());
        
        //algorithm
        
        value = Math.min(num3,num4);
        
        // output
        
        output2.setText(String.valueOf(value));
    }//GEN-LAST:event_smallestActionPerformed

    private void powerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_powerActionPerformed

        //variable
        int num5;
        int num6;
        int value;
        num5 = Integer.parseInt(input5.getText());
        num6 = Integer.parseInt(input6.getText());
        
        //algorithm
        value = (int) Math.pow(num5,num6);
        
        
        //output
        
        output3.setText(String.valueOf(value));
        
    }//GEN-LAST:event_powerActionPerformed

    private void hypotenuseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hypotenuseActionPerformed

        //variables
        int sideA;
        int sideB;
        int value;
        
        sideA= Integer.parseInt(input7.getText());
        sideB = Integer.parseInt(input8.getText()); 
        
        //algorithm
        value = (int) Math.hypot(sideA,sideB); 
        
        //output
        
        output4.setText(String.valueOf(value));
    }//GEN-LAST:event_hypotenuseActionPerformed

    private void roundeddownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roundeddownActionPerformed

        //variables
        double number;
        double value;
        
        number = Double.parseDouble(input9.getText());
        
        // algorithm
        
        value = Math.floor(number); 
        
        
        // output
        
        output5.setText(String.valueOf(value)); 
    }//GEN-LAST:event_roundeddownActionPerformed

    private void roundedupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roundedupActionPerformed

        //variables 
        double number;
        double value; 
        
        number = Double.parseDouble(input11.getText());
        
        //algorithm
        
        value = Math.round(number); 
        
        // output
        
        output6.setText(String.valueOf(value));
    }//GEN-LAST:event_roundedupActionPerformed

    private void squarerootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_squarerootActionPerformed

        //variables
        
        double number;
        double value; 
        
        number = Double.parseDouble(input13.getText());
        
        //algorithm
        
        value = Math.sqrt(number); 
        
        // output 
        
        output7.setText(String.valueOf(value));
    }//GEN-LAST:event_squarerootActionPerformed

    private void inradiansActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inradiansActionPerformed

        //variable
        
        double angle;
        double value;
        
        angle = Double.parseDouble(input15.getText());
        
        //algorithm
        value = Math.toRadians(angle); 
        
        //output
        
        output8.setText(String.valueOf(value));
    }//GEN-LAST:event_inradiansActionPerformed

    /**
     * @param args the command line arguments
     */
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MathMethods.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MathMethods.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MathMethods.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MathMethods.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MathMethods().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton hypotenuse;
    private javax.swing.JTextField input1;
    private javax.swing.JTextField input11;
    private javax.swing.JTextField input13;
    private javax.swing.JTextField input15;
    private javax.swing.JTextField input2;
    private javax.swing.JTextField input3;
    private javax.swing.JTextField input4;
    private javax.swing.JTextField input5;
    private javax.swing.JTextField input6;
    private javax.swing.JTextField input7;
    private javax.swing.JTextField input8;
    private javax.swing.JTextField input9;
    private javax.swing.JButton inradians;
    private javax.swing.JLabel instructions1;
    private javax.swing.JLabel instructions2;
    private javax.swing.JLabel instructions3;
    private javax.swing.JLabel instructions4;
    private javax.swing.JLabel instructions5;
    private javax.swing.JLabel instructions6;
    private javax.swing.JLabel instructions7;
    private javax.swing.JLabel instructions8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton largest;
    private javax.swing.JLabel output2;
    private javax.swing.JLabel output3;
    private javax.swing.JLabel output4;
    private javax.swing.JLabel output5;
    private javax.swing.JLabel output6;
    private javax.swing.JLabel output7;
    private javax.swing.JLabel output8;
    private javax.swing.JLabel outputlargest;
    private javax.swing.JButton power;
    private javax.swing.JButton roundeddown;
    private javax.swing.JButton roundedup;
    private javax.swing.JButton smallest;
    private javax.swing.JButton squareroot;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
