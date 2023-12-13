
package idoregesz;

import javax.swing.ImageIcon;


public class Idoregesz extends javax.swing.JFrame {

    ImageIcon kezdes = new ImageIcon("C:\\Users\\vikis\\OneDrive\\Asztali gép\\idoregesz\\haziverseny_EDAV\\src\\kepek\\01_kezdes.png");
    ImageIcon kastely = new ImageIcon("C:\\Users\\vikis\\OneDrive\\Asztali gép\\idoregesz\\haziverseny_EDAV\\src\\kepek\\Var.png");
    ImageIcon kamra = new ImageIcon("C:\\Users\\vikis\\OneDrive\\Asztali gép\\idoregesz\\haziverseny_EDAV\\src\\kepek\\Kamra.png");
    ImageIcon ajto1 = new ImageIcon("C:\\Users\\vikis\\OneDrive\\Asztali gép\\idoregesz\\haziverseny_EDAV\\src\\kepek\\09_kamra.png");
    ImageIcon ajto2 = new ImageIcon("C:\\Users\\vikis\\OneDrive\\Asztali gép\\idoregesz\\haziverseny_EDAV\\src\\kepek\\14_ajto.png");
    ImageIcon szerzetes = new ImageIcon("C:\\Users\\vikis\\OneDrive\\Asztali gép\\idoregesz\\haziverseny_EDAV\\src\\kepek\\06_szerzetes2.png");
    ImageIcon kut = new ImageIcon("C:\\Users\\vikis\\OneDrive\\Asztali gép\\idoregesz\\haziverseny_EDAV\\src\\kepek\\03_kut2.png");
    public Idoregesz() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlHatterSzin = new javax.swing.JPanel();
        pnlHatter = new javax.swing.JPanel();
        lblKep = new javax.swing.JLabel();
        lblEro = new javax.swing.JLabel();
        lblEroMennyiseg = new javax.swing.JLabel();
        lblIranytu = new javax.swing.JLabel();
        lblEgtaj = new javax.swing.JLabel();
        lblIrany = new javax.swing.JLabel();
        lblFelszereles = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaSzoveg = new javax.swing.JTextArea();
        txtfInput = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(774, 493));
        setMinimumSize(new java.awt.Dimension(774, 493));
        setResizable(false);

        pnlHatterSzin.setBackground(new java.awt.Color(204, 204, 255));
        pnlHatterSzin.setMaximumSize(new java.awt.Dimension(774, 493));
        pnlHatterSzin.setMinimumSize(new java.awt.Dimension(774, 493));

        pnlHatter.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lblKep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/Kamra.png"))); // NOI18N
        lblKep.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lblEro.setText("Erő:");

        lblEroMennyiseg.setText("10");

        lblIranytu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/Képernyőkép 2023-12-13 131939.png"))); // NOI18N
        lblIranytu.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lblEgtaj.setText("Észak");

        lblIrany.setText("irány:");

        lblFelszereles.setText("jLabel1");

        javax.swing.GroupLayout pnlHatterLayout = new javax.swing.GroupLayout(pnlHatter);
        pnlHatter.setLayout(pnlHatterLayout);
        pnlHatterLayout.setHorizontalGroup(
            pnlHatterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHatterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEro)
                .addGap(18, 18, 18)
                .addComponent(lblEroMennyiseg, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(lblKep)
                .addGap(18, 18, 18)
                .addGroup(pnlHatterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFelszereles)
                    .addComponent(lblIranytu)
                    .addGroup(pnlHatterLayout.createSequentialGroup()
                        .addComponent(lblIrany)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEgtaj)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlHatterLayout.setVerticalGroup(
            pnlHatterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHatterLayout.createSequentialGroup()
                .addGroup(pnlHatterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlHatterLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(pnlHatterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEgtaj)
                            .addComponent(lblIrany))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblIranytu)
                        .addGap(28, 28, 28)
                        .addComponent(lblFelszereles))
                    .addGroup(pnlHatterLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(pnlHatterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEro)
                            .addComponent(lblEroMennyiseg))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnlHatterLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblKep)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        txtaSzoveg.setEditable(false);
        txtaSzoveg.setColumns(20);
        txtaSzoveg.setRows(5);
        txtaSzoveg.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jScrollPane1.setViewportView(txtaSzoveg);

        txtfInput.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        javax.swing.GroupLayout pnlHatterSzinLayout = new javax.swing.GroupLayout(pnlHatterSzin);
        pnlHatterSzin.setLayout(pnlHatterSzinLayout);
        pnlHatterSzinLayout.setHorizontalGroup(
            pnlHatterSzinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHatterSzinLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlHatterSzinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlHatter, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtfInput))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlHatterSzinLayout.setVerticalGroup(
            pnlHatterSzinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHatterSzinLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlHatter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtfInput, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlHatterSzin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlHatterSzin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    public static void main(String args[]) {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Idoregesz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Idoregesz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Idoregesz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Idoregesz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Idoregesz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEgtaj;
    private javax.swing.JLabel lblEro;
    private javax.swing.JLabel lblEroMennyiseg;
    private javax.swing.JLabel lblFelszereles;
    private javax.swing.JLabel lblIrany;
    private javax.swing.JLabel lblIranytu;
    private javax.swing.JLabel lblKep;
    private javax.swing.JPanel pnlHatter;
    private javax.swing.JPanel pnlHatterSzin;
    private javax.swing.JTextArea txtaSzoveg;
    private javax.swing.JTextField txtfInput;
    // End of variables declaration//GEN-END:variables
}
