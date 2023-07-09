package finalodevi2;

import java.awt.Color;
import java.awt.Graphics2D;
import javax.swing.JOptionPane;

public class Arayuz extends javax.swing.JFrame {

    static Graph g = new Graph();
    Panel p;
    Graphics2D gra;

    public Arayuz() {
        initComponents();
        setLocationRelativeTo(null);
        
        p = new Panel();
        p.setBounds(0, 0, 700, 350);
        p.setBackground(Color.WHITE);
        
        add(p);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel3 = new javax.swing.JPanel();
        vertex = new javax.swing.JTextField();
        box1 = new javax.swing.JComboBox<>();
        box2 = new javax.swing.JComboBox<>();
        agirlik = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cizdir = new javax.swing.JButton();
        vertexEkle = new javax.swing.JButton();
        kenarEkle = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Graph");
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(51, 102, 255));

        vertex.setBackground(new java.awt.Color(255, 255, 255));

        agirlik.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Vertex : ");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("From : ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("To :");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ağırlık :");

        cizdir.setBackground(new java.awt.Color(255, 255, 255));
        cizdir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cizdir.setForeground(new java.awt.Color(51, 102, 255));
        cizdir.setText("Çizdir");
        cizdir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cizdirActionPerformed(evt);
            }
        });

        vertexEkle.setBackground(new java.awt.Color(255, 255, 255));
        vertexEkle.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        vertexEkle.setForeground(new java.awt.Color(51, 102, 255));
        vertexEkle.setText("Vertex Ekle");
        vertexEkle.setToolTipText("");
        vertexEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vertexEkleActionPerformed(evt);
            }
        });

        kenarEkle.setBackground(new java.awt.Color(255, 255, 255));
        kenarEkle.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        kenarEkle.setForeground(new java.awt.Color(51, 102, 255));
        kenarEkle.setText("Kenar Ekle");
        kenarEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kenarEkleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cizdir, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(287, 287, 287))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vertex, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(vertexEkle))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(box1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(box2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(agirlik, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(kenarEkle)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vertex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(box1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(box2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(agirlik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kenarEkle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vertexEkle)
                .addGap(20, 20, 20)
                .addComponent(cizdir, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(350, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kenarEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kenarEkleActionPerformed
        
        if (!box1.getSelectedItem().equals(box2.getSelectedItem())) {
            if (!agirlik.getText().equals("") && (box1.getSelectedItem() != null || box2.getSelectedItem() != null)) {
                char c1 = box1.getSelectedItem().toString().charAt(0);
                char c2 = box2.getSelectedItem().toString().charAt(0);
                g.kenarEkle(g.getIndex(c1), g.getIndex(c2), Integer.parseInt(agirlik.getText()));
                agirlik.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "Vertex yada Ağırlık Girilmemiş !!");
            }
        }
    }//GEN-LAST:event_kenarEkleActionPerformed

    private void vertexEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vertexEkleActionPerformed
        char c = vertex.getText().charAt(0);
        
        if ((int) c >= 97 && (int) c <= 122) {
            c = (char) (c - 32);
        }

        if (!vertex.getText().equals("") && !g.doluMu()) {
            if (((int) c >= 97 && (int) c <= 122) || ((int) c >= 65 && (int) c <= 90)) {
                if (!g.varMi(c)) {
                    g.vertexEkle(c);
                    box1.addItem(Character.toString(c));
                    box2.addItem(Character.toString(c));
                }
            }else {
                JOptionPane.showMessageDialog(null, "Lütfen Sadece Karakter Giriniz");
            }
        }else if(g.doluMu()){
                JOptionPane.showMessageDialog(null, "En Fazla 6 Düğüm Olabilir.");
            } else {
            JOptionPane.showMessageDialog(null, "Vertex Ekleyin !!");
        }

        vertex.setText("");
    }//GEN-LAST:event_vertexEkleActionPerformed

    private void cizdirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cizdirActionPerformed
        repaint();
        g.printGraph();
    }//GEN-LAST:event_cizdirActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Arayuz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Arayuz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Arayuz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Arayuz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Arayuz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField agirlik;
    private javax.swing.JComboBox<String> box1;
    private javax.swing.JComboBox<String> box2;
    private javax.swing.JButton cizdir;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JButton kenarEkle;
    private javax.swing.JTextField vertex;
    private javax.swing.JButton vertexEkle;
    // End of variables declaration//GEN-END:variables

}
