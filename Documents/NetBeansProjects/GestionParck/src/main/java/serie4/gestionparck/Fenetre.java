/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package serie4.gestionparck;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class Fenetre extends javax.swing.JFrame {
       
       ArrayList<Vehicule> vehicules;
       DefaultListModel modelList ;
       File fichier;
       FileWriter fw;
       PrintWriter pw;
   
    public Fenetre() {
        initComponents();
        vehicules = new ArrayList<>();
        modelList = new DefaultListModel();
        
           try {
               fichier = new File("fichier.veh");
               fw = new FileWriter(fichier);
               pw = new PrintWriter(fw);
           } catch (IOException ex) {
              ex.printStackTrace();
           }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        btnAjouter = new javax.swing.JButton();
        btnSupprimer = new javax.swing.JButton();
        btnModifier = new javax.swing.JButton();
        btnFermer = new javax.swing.JButton();
        btnEnregister = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(jList1);

        btnAjouter.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAjouter.setText("Ajouter");
        btnAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjouterActionPerformed(evt);
            }
        });

        btnSupprimer.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSupprimer.setText("Supprimer");
        btnSupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupprimerActionPerformed(evt);
            }
        });

        btnModifier.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnModifier.setText("Modifier");

        btnFermer.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnFermer.setText("Fermer");
        btnFermer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFermerActionPerformed(evt);
            }
        });

        btnEnregister.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnEnregister.setText("Enregister");
        btnEnregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnregisterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 735, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(btnAjouter, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSupprimer)
                .addGap(43, 43, 43)
                .addComponent(btnModifier, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEnregister, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnFermer, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAjouter, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModifier, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSupprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFermer, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEnregister, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupprimerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSupprimerActionPerformed

    private void btnEnregisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnregisterActionPerformed
       
    }//GEN-LAST:event_btnEnregisterActionPerformed

    private void btnFermerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFermerActionPerformed
         int choix = JOptionPane.showConfirmDialog(this,"Etes-Vous sur de vouloir sortir ?", "Confirmation"
                 , JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
         if(choix == 0)
             System.exit(0);
    }//GEN-LAST:event_btnFermerActionPerformed

    private void btnAjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjouterActionPerformed
        Vehicule vehicule = null;
        String marque ,model,immatriculation ,type;
        int nombrePortes,vitesseMax,choix= 0;
        boolean remoque;
         type = JOptionPane.showInputDialog(this, "Entrez type du vehicule (Voiture /Camion / Moto)"
                ,"Type",JOptionPane.PLAIN_MESSAGE); 
        
          
        if(type.equalsIgnoreCase("Voiture")){
            marque = JOptionPane.showInputDialog(this, "Entrez la marque du vehicule"
                ,"Marque",JOptionPane.PLAIN_MESSAGE);
        model = JOptionPane.showInputDialog(this, "Entrez le model du vehicule"
                ,"Model",JOptionPane.PLAIN_MESSAGE);
        immatriculation = JOptionPane.showInputDialog(this, "Entrez l'immtriculation du vehicule"
                ,"Immatriculation",JOptionPane.PLAIN_MESSAGE);
        nombrePortes = Integer.parseInt(JOptionPane.showInputDialog(this, "Entrez nombre du ports "
                ,"Nombre de Ports",JOptionPane.PLAIN_MESSAGE));
        vehicule = new Voiture(marque, model, immatriculation, nombrePortes);
        vehicules.add(vehicule);
        modelList.add(0, vehicule);
        jList1.setModel(modelList);
        
        }
            
        else if(type.equalsIgnoreCase("Moto")){
             marque = JOptionPane.showInputDialog(this, "Entrez la marque du vehicule"
                ,"Marque",JOptionPane.PLAIN_MESSAGE);
             model = JOptionPane.showInputDialog(this, "Entrez le model du vehicule"
                ,"Model",JOptionPane.PLAIN_MESSAGE);
             immatriculation = JOptionPane.showInputDialog(this, "Entrez l'immtriculation du vehicule"
                ,"Immatriculation",JOptionPane.PLAIN_MESSAGE);
            vitesseMax = Integer.parseInt(JOptionPane.showInputDialog(this, "entre la vitesse maximal "
                ,"Vitesse maximal",JOptionPane.PLAIN_MESSAGE));
            vehicule = new Moto(marque, model, immatriculation, vitesseMax);
            vehicules.add(vehicule);
            modelList.add(0, vehicule);
        }
        else if(type.equalsIgnoreCase("Camoin")){
             marque = JOptionPane.showInputDialog(this, "Entrez la marque du vehicule"
                ,"Marque",JOptionPane.PLAIN_MESSAGE);
             model = JOptionPane.showInputDialog(this, "Entrez le model du vehicule"
                ,"Model",JOptionPane.PLAIN_MESSAGE);
             immatriculation = JOptionPane.showInputDialog(this, "Entrez l'immtriculation du vehicule"
                ,"Immatriculation",JOptionPane.PLAIN_MESSAGE);
             choix = JOptionPane.showConfirmDialog(this, "le camion a-t-il un remoque","remoque"
                    ,JOptionPane.YES_NO_OPTION);
           if(choix == 0)remoque = true;
           else remoque = false;
           vehicule = new Camion(marque, model, immatriculation, remoque);
           vehicules.add(vehicule);
           modelList.add(0, vehicule);
        }
        else {
            JOptionPane.showConfirmDialog(this,"votree choix inncorrect","choix incorrect "
                    ,JOptionPane.OK_OPTION);
        }
           
                   
    }//GEN-LAST:event_btnAjouterActionPerformed

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
            java.util.logging.Logger.getLogger(Fenetre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fenetre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fenetre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fenetre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               Fenetre f = new Fenetre();
               f.setVisible(true);
               f.setTitle("la Gestion d'un Parcking");
               f.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAjouter;
    private javax.swing.JButton btnEnregister;
    private javax.swing.JButton btnFermer;
    private javax.swing.JButton btnModifier;
    private javax.swing.JButton btnSupprimer;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
