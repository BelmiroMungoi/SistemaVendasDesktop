
package view;

/**
 *
 * @author Belmiro-Mungoi
 */
public class InfoForm extends javax.swing.JFrame {


    public InfoForm() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sobre o Sistema");
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 17)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Sistema de Vendas e Gestao de Stock");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 40, 360, 23);

        jLabel2.setFont(new java.awt.Font("Dialog", 3, 17)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("Desenvolvido por Belmiro Mungoi");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 80, 290, 23);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setText("Sob a licenca GPL");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 120, 139, 21);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gpl.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(410, 0, 180, 250);

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(255, 255, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 51, 51));
        jTextArea1.setRows(5);
        jTextArea1.setText("OBS: Esse foi um projecto desenvovido por questões\nde estudo, o autor recomeda que o use com\nresponsabilidade, o mesmo não se \nresponsabilizará por quaisquer danos causados.  ");
        jTextArea1.setAutoscrolls(false);
        jTextArea1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jTextArea1.setCaretColor(new java.awt.Color(255, 255, 255));
        jTextArea1.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jTextArea1.setRequestFocusEnabled(false);
        jTextArea1.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        jTextArea1.setSelectionColor(new java.awt.Color(255, 255, 255));
        jTextArea1.setVerifyInputWhenFocusTarget(false);
        jScrollPane1.setViewportView(jTextArea1);
        jTextArea1.getAccessibleContext().setAccessibleParent(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 140, 350, 110);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fundoBrancoPainel.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(1, -4, 590, 270);

        setSize(new java.awt.Dimension(606, 294));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
