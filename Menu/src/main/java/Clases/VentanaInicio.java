package Clases;

/**
 *
 * @author Trifunski
 */

public class VentanaInicio extends javax.swing.JFrame {
    
    AñadirPersona añadirPersonas;

    public VentanaInicio() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        TituloFondo = new javax.swing.JLabel();
        BarraMenu = new javax.swing.JMenuBar();
        Inicio = new javax.swing.JMenu();
        Menu = new javax.swing.JMenu();
        AñadirPersonas = new javax.swing.JMenuItem();
        Salir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));

        Fondo.setBackground(new java.awt.Color(0, 0, 0));
        Fondo.setPreferredSize(new java.awt.Dimension(1100, 900));

        TituloFondo.setFont(new java.awt.Font("Arial Black", 1, 148)); // NOI18N
        TituloFondo.setForeground(new java.awt.Color(255, 255, 255));
        TituloFondo.setText("MENU");

        javax.swing.GroupLayout FondoLayout = new javax.swing.GroupLayout(Fondo);
        Fondo.setLayout(FondoLayout);
        FondoLayout.setHorizontalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGap(291, 291, 291)
                .addComponent(TituloFondo)
                .addContainerGap(297, Short.MAX_VALUE))
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGap(313, 313, 313)
                .addComponent(TituloFondo)
                .addContainerGap(378, Short.MAX_VALUE))
        );

        BarraMenu.setBackground(new java.awt.Color(0, 0, 0));
        BarraMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        BarraMenu.setForeground(new java.awt.Color(0, 0, 0));

        Inicio.setForeground(new java.awt.Color(255, 255, 255));
        Inicio.setText("INICIO");
        Inicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Inicio.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        Inicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InicioMouseClicked(evt);
            }
        });
        BarraMenu.add(Inicio);

        Menu.setForeground(new java.awt.Color(255, 255, 255));
        Menu.setText("MENU");
        Menu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Menu.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N

        AñadirPersonas.setText("AñadirPersona");
        AñadirPersonas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AñadirPersonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AñadirPersonasActionPerformed(evt);
            }
        });
        Menu.add(AñadirPersonas);

        BarraMenu.add(Menu);

        Salir.setBackground(new java.awt.Color(255, 255, 255));
        Salir.setForeground(new java.awt.Color(255, 255, 255));
        Salir.setText("SALIR");
        Salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Salir.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        Salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalirMouseClicked(evt);
            }
        });
        BarraMenu.add(Salir);

        setJMenuBar(BarraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_SalirMouseClicked

    private void AñadirPersonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AñadirPersonasActionPerformed
        añadirPersonas = new AñadirPersona();
        añadirPersonas.setVisible(false);
        this.getContentPane().add(añadirPersonas);
        TituloFondo.setVisible(false);
        Fondo.setVisible(false);
        añadirPersonas.setVisible(true);
        Inicio.setText("VOLVER");
        this.pack();
    }//GEN-LAST:event_AñadirPersonasActionPerformed

    private void InicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InicioMouseClicked
        Inicio.setText("INICIO");
        añadirPersonas.setVisible(false);
        TituloFondo.setVisible(true);
        Fondo.setVisible(true);
    }//GEN-LAST:event_InicioMouseClicked

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AñadirPersonas;
    private javax.swing.JMenuBar BarraMenu;
    private javax.swing.JPanel Fondo;
    private javax.swing.JMenu Inicio;
    private javax.swing.JMenu Menu;
    private javax.swing.JMenu Salir;
    private javax.swing.JLabel TituloFondo;
    // End of variables declaration//GEN-END:variables
}
