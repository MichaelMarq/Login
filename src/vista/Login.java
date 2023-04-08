
package vista;

import javax.swing.JOptionPane;






public class Login extends javax.swing.JFrame {

    //Atributos
    private String usuario = "user";
    private String password = "password";

    //Constructor
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        lbFondoUser = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        txtUser = new javax.swing.JTextField();
        lbUser = new javax.swing.JLabel();
        lbPassword = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();
        lbFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);

        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalir.setBackground(new java.awt.Color(204, 204, 255));
        btnSalir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        panel.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 90, 30));

        lbFondoUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user.png"))); // NOI18N
        panel.add(lbFondoUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 128, 128));

        txtPassword.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        panel.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 120, -1));

        txtUser.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        panel.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 120, -1));

        lbUser.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        lbUser.setText("Usuario");
        panel.add(lbUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 90, -1));

        lbPassword.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        lbPassword.setText("Contraseña");
        panel.add(lbPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 90, -1));

        btnIngresar.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        btnIngresar.setText("Iniciar sesión");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        panel.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, 140, 40));

        lbFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo.png"))); // NOI18N
        panel.add(lbFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-9, -4, 391, 460));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

        //Salir del programa
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        // Boton iniciar sesion
        String contra = "";
        for(char password : txtPassword.getPassword()){
            contra +=password;
        }
        
        // Validacion para iniciar sesion
        if(txtUser.getText().equals(usuario) && contra.equals(password)){
            JOptionPane.showMessageDialog(null, "Ingreso exitoso");
            System.out.println("Ingreso exitoso");
        }
        else{
            JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecto");
            System.out.println("Usuario o contraseña incorrecto");
        }
                
        
    }//GEN-LAST:event_btnIngresarActionPerformed


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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel lbFondo;
    private javax.swing.JLabel lbFondoUser;
    private javax.swing.JLabel lbPassword;
    private javax.swing.JLabel lbUser;
    private javax.swing.JPanel panel;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
