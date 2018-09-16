/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interfaces.Eleve;
import Entitées.Absence;
import Plus.Conversion;
import Entitées.Eleve;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
/**
 *
 * @author Almia
 */

public class InterfacePrincipaleEleve extends javax.swing.JPanel {

    /**
     * Creates new form InterfacePrincipaleEleve
     */
    public final static void updateTableEl(){
        Eleve[] tabe=new Eleve[1000];
        tabe=Eleve.AfficherEleves();
        if(tabe!=null){
             int i=0;
             Object[][]o=new Object[tabe.length][3];
             while (i<tabe.length){
             o[i][0]=tabe[i].getId();
             o[i][1]=tabe[i].getNom();
             o[i][2]=tabe[i].getPrenom();
             i++;
             
             }
            DefaultTableModel model = new DefaultTableModel(o,new Object[] {"ID", "NOM" ,"PRENOM"}  );
            jTableELEVE.setModel(model);   }
        else {DefaultTableModel m=(DefaultTableModel) jTableELEVE.getModel();
            m.setRowCount(0);
            jTableELEVE.setModel(m);  
            
        }
    }
     
    public InterfacePrincipaleEleve() {
        initComponents();
        if(Eleve.AfficherEleves()!=null)
        updateTableEl();
   
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
        jTableELEVE = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextFieldRECHERCHE = new javax.swing.JTextField();
        jButtonAJOUTER = new javax.swing.JButton();
        jButtonMODIFIER = new javax.swing.JButton();
        jButtonSUPPRIMER = new javax.swing.JButton();
        jButtonCONSULTER = new javax.swing.JButton();
        jButtonREFRESH = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButtonAbsence = new javax.swing.JButton();

        jTableELEVE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOM", "PRENOM"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableELEVE.setMaximumSize(new java.awt.Dimension(32767, 32767));
        jTableELEVE.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTableELEVE);
        if (jTableELEVE.getColumnModel().getColumnCount() > 0) {
            jTableELEVE.getColumnModel().getColumn(0).setResizable(false);
            jTableELEVE.getColumnModel().getColumn(1).setResizable(false);
            jTableELEVE.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel1.setText("Recherche par:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Id", "Nom", "Prenom" }));

        jTextFieldRECHERCHE.setText("rechercher");
        jTextFieldRECHERCHE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldRECHERCHEMouseClicked(evt);
            }
        });

        jButtonAJOUTER.setText("Ajouter");
        jButtonAJOUTER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAJOUTERActionPerformed(evt);
            }
        });

        jButtonMODIFIER.setText("Modifier");
        jButtonMODIFIER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMODIFIERActionPerformed(evt);
            }
        });

        jButtonSUPPRIMER.setText("Supprimer");
        jButtonSUPPRIMER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSUPPRIMERActionPerformed(evt);
            }
        });

        jButtonCONSULTER.setText("Consulter");
        jButtonCONSULTER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCONSULTERActionPerformed(evt);
            }
        });

        jButtonREFRESH.setText("Refresh");
        jButtonREFRESH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonREFRESHActionPerformed(evt);
            }
        });

        jButton1.setText("Rechercher");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButtonAbsence.setText("Notifier responsable des Absences");
        jButtonAbsence.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAbsenceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(511, 511, 511)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldRECHERCHE, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(171, 171, 171))
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonREFRESH)
                        .addGap(425, 425, 425)
                        .addComponent(jButtonAJOUTER)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonMODIFIER)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonSUPPRIMER)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonCONSULTER)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonAbsence)
                .addGap(209, 209, 209))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldRECHERCHE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonREFRESH)
                    .addComponent(jButtonAJOUTER)
                    .addComponent(jButtonMODIFIER)
                    .addComponent(jButtonSUPPRIMER)
                    .addComponent(jButtonCONSULTER))
                .addGap(18, 18, 18)
                .addComponent(jButtonAbsence)
                .addGap(27, 27, 27))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAJOUTERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAJOUTERActionPerformed
        // TODO add your handling code here:
        JFrame x=new AjouterEleve();
        x.setVisible(true);
            
    }//GEN-LAST:event_jButtonAJOUTERActionPerformed

    private void jButtonMODIFIERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMODIFIERActionPerformed
        // TODO add your handling code here:
        if(jTableELEVE.getSelectedRow()!=-1){
            int id;
            int index=jTableELEVE.getSelectedRow();
            TableModel model = jTableELEVE.getModel();
            String z= model.getValueAt(index, 0).toString();
            id=Integer.parseInt(z);
            ModifierEleve x=new ModifierEleve();
            Eleve i=new Eleve();
            
                i=Eleve.ChargerEleve(id);
                
                x.setNdoss(id);
                x.getjTextFieldNOM().setText(i.getNom());
                x.getjTextFieldPRENOM().setText(i.getPrenom());
                x.getjTextFieldADRESSE().setText(i.getAdresse());
                String string = i.getDateN();
                String[] parts= string.split("\\+");
                x.getjComboBoxANNEE().setSelectedItem(parts[0]);
                x.getjComboBoxMOIS().setSelectedItem(parts[1]);
                x.getjComboBoxJOUR().setSelectedItem(parts[2]);
                x.getjComboBoxsexe().setSelectedItem(i.getSexe());
                x.getjComboBoxPAYS().setSelectedItem(i.getPays());
                x.getjComboBoxNIVEAU().setSelectedItem(i.getNiveau());
                x.getjComboBoxVILLE().setSelectedItem(i.getVille());
                if(i.getCodePostal()!=0)
                x.getjTextFieldCODEPOSTAL().setText(Integer.toString(i.getCodePostal()));
                x.getjTextFieldNOMRES().setText(i.getNomRes());
                x.getjTextFieldPRENOMRES().setText(i.getPrenomRes());
                x.getjTextFieldADRESSERES().setText(i.getAdresseRes());
                x.getjTextFieldNUMTEL().setText(Integer.toString(i.getTelephoneRes()));
                x.getjTextFieldEMAIL().setText(i.getEmailRes());
                if(i.getCodePostalRes()!=0)
                x.getjTextFieldCODEPOSTALRES().setText(Integer.toString(i.getCodePostalRes()));
                x.getjTextFieldPROFESSIONRES().setText(i.getProfessionRes());
                x.getjTextFieldRELATION().setText(i.getRelation());
                x.getjTextFieldNCINRES().setText(Integer.toString(i.getNCINRes()));
            x.setVisible(true);
            
        }
        else JOptionPane.showMessageDialog(null, "Veuillez selectionner un élève!");
    }//GEN-LAST:event_jButtonMODIFIERActionPerformed

    private void jButtonCONSULTERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCONSULTERActionPerformed
        // TODO add your handling code here:
        if(jTableELEVE.getSelectedRow()!=-1){
            int index=jTableELEVE.getSelectedRow();
            TableModel model = jTableELEVE.getModel();
            String z= model.getValueAt(index, 0).toString();
            int id=Integer.parseInt(z);
            ConsulterEleve x=new ConsulterEleve();
            Eleve i=new Eleve();
           
                i=Eleve.ChargerEleve(id);
            
                x.getjTextFieldNOM().setText(i.getNom());
                x.getjTextFieldPRENOM().setText(i.getPrenom());
                x.getjTextFieldADRESSE().setText(i.getAdresse());
                String string = i.getDateN();
                String[] parts= string.split("\\+");
                x.getjTextFieldANNEE().setText(parts[0]);
                x.getjTextFieldMOIS().setText(parts[1]);
                x.getjTextFieldJOUR().setText(parts[2]);
                x.getjTextFieldSEXE().setText(i.getSexe());
                x.getjTextFieldPAYS().setText(i.getPays());
                x.getjTextFieldNIVEAU().setText(i.getNiveau());
                x.getjTextFieldVILLE().setText(i.getVille());
                if(i.getCodePostal()!=0)
                x.getjTextFieldCODEPOSTAL().setText(Integer.toString(i.getCodePostal()));
                x.getjTextFieldNOMRES().setText(i.getNomRes());
                x.getjTextFieldPRENOMRES().setText(i.getPrenomRes());
                x.getjTextFieldADRESSERES().setText(i.getAdresseRes());
                x.getjTextFieldNUMTELRES().setText(Integer.toString(i.getTelephoneRes()));
                x.getjTextFieldEMAIL().setText(i.getEmailRes());
                if(i.getCodePostalRes()!=0)
                x.getjTextFieldCODEPOSTALRES().setText(Integer.toString(i.getCodePostalRes()));
                x.getjTextFieldPROFESSIONRES().setText(i.getProfessionRes());
                x.getjTextFieldRELATION().setText(i.getRelation());
                x.getjTextFieldCINRES().setText(Integer.toString(i.getNCINRes()));
            x.setVisible(true);
            
        }
        else JOptionPane.showMessageDialog(null, "Veuillez selectionner un élève!");
        
    }//GEN-LAST:event_jButtonCONSULTERActionPerformed

    private void jButtonSUPPRIMERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSUPPRIMERActionPerformed
        // TODO add your handling code here:
        if(jTableELEVE.getSelectedRow()!=-1){
            int index=jTableELEVE.getSelectedRow();
            TableModel model = jTableELEVE.getModel();
            String z= model.getValueAt(index, 0).toString();
            int id=Integer.parseInt(z);
            SupprimerEleve x=new SupprimerEleve();
            Eleve i=new Eleve();
          
                i=Eleve.ChargerEleve(id);
            
            x.getjTextFieldNOM().setText(i.getNom());
            x.getjTextFieldPRENOM().setText(i.getPrenom());
            x.getjTextFieldID().setText(Integer.toString(i.getId()));
            x.setVisible(true);
        }
        else JOptionPane.showMessageDialog(null, "Veuillez selectionner un Eleve!");
    }//GEN-LAST:event_jButtonSUPPRIMERActionPerformed

    private void jButtonREFRESHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonREFRESHActionPerformed
        // TODO add your handling code here:
        updateTableEl();
    }//GEN-LAST:event_jButtonREFRESHActionPerformed

    private void jTextFieldRECHERCHEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldRECHERCHEMouseClicked
        // TODO add your handling code here:
        jTextFieldRECHERCHE.setText("");
    }//GEN-LAST:event_jTextFieldRECHERCHEMouseClicked

    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Eleve e=new Eleve();
        Eleve[] tabe=new Eleve[1000];
        if(jComboBox1.getSelectedItem().toString()=="Id")
        {e=Eleve.ChargerEleve(Conversion.StringtoInt(jTextFieldRECHERCHE.getText()));
        if(e.getId()!=0)
        {Object[][]o=new Object[][]{{e.getId(),e.getNom(),e.getPrenom()}};
        DefaultTableModel f=new DefaultTableModel(o, new Object[] {"ID", "NOM" ,"PRENOM"  });
        jTableELEVE.setModel(f);}
        else JOptionPane.showMessageDialog(null, "Aucun élève avec cet Id!");
        }
         else if (jComboBox1.getSelectedItem().toString()=="Nom" ){
             tabe=Eleve.RechercherEleveParNom(jTextFieldRECHERCHE.getText().toString());
             if(tabe!=null)
             {int i=0;
             Object[][]o=new Object[tabe.length][3];
             while (i<tabe.length){
             o[i][0]=tabe[i].getId();
             o[i][1]=tabe[i].getNom();
             o[i][2]=tabe[i].getPrenom();
             i++;
             }
            DefaultTableModel model = new DefaultTableModel(o,new Object[] {"ID", "NOM" ,"PRENOM"}  );
            jTableELEVE.setModel(model);}
             else JOptionPane.showMessageDialog(null, "Aucun élève avec ce Nom!");

        }
        else if(jComboBox1.getSelectedItem().toString()=="Prenom" ){
            tabe=Eleve.RechercherEleveParPrenom(jTextFieldRECHERCHE.getText().toString());
            if(tabe!=null)
            {int i=0;
             Object[][]o=new Object[tabe.length][3];
             while (i<tabe.length){
             o[i][0]=tabe[i].getId();
             o[i][1]=tabe[i].getNom();
             o[i][2]=tabe[i].getPrenom();
             i++;
             }
            DefaultTableModel model = new DefaultTableModel(o,new Object[] {"ID", "NOM" ,"PRENOM"}  );
            jTableELEVE.setModel(model);}
            else JOptionPane.showMessageDialog(null, "Aucun élève avec ce Prenom!");
        }
        
     
            
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonAbsenceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAbsenceActionPerformed
        // TODO add your handling code here:
        if(jTableELEVE.getSelectedRow()!=-1){
            int index=jTableELEVE.getSelectedRow();
            TableModel model = jTableELEVE.getModel();
            String z= model.getValueAt(index, 0).toString();
            int id=Integer.parseInt(z);
            AfficherAbsence x=new AfficherAbsence();
            Eleve i=new Eleve();
          
                i=Eleve.ChargerEleve(id);
            
            x.getjTextFieldNom().setText(i.getNom());
            x.getjTextFieldPrenom().setText(i.getPrenom());
            x.getjTextFieldId().setText(Integer.toString(i.getId()));
            Absence tabe[]=new Absence[100];
            tabe=Absence.ChargerAbsencesEleve(i.getId());
            DefaultTableModel mod=(DefaultTableModel) x.getjTableAbsences().getModel();
            x.setVisible(true);
            if(tabe!=null){
            for(int j=0;j<tabe.length;j++){
              mod.addRow(new Object[]{false,tabe[j].getDate(),false,false,false,false,false});  
              String a=tabe[j].getPeriode();
                          int k=0;
                          while(k<a.length()){
                          int b=Character.getNumericValue(a.charAt(k))+1;
                          mod.setValueAt(true,j,b);
                          k++;}
            }}
            else JOptionPane.showMessageDialog(null, "Aucune Absence pour cet élève!");     
        }
        else JOptionPane.showMessageDialog(null, "Veuillez selectionner un Eleve!");
    }//GEN-LAST:event_jButtonAbsenceActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAJOUTER;
    private javax.swing.JButton jButtonAbsence;
    private javax.swing.JButton jButtonCONSULTER;
    private javax.swing.JButton jButtonMODIFIER;
    private javax.swing.JButton jButtonREFRESH;
    private javax.swing.JButton jButtonSUPPRIMER;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTable jTableELEVE;
    private javax.swing.JTextField jTextFieldRECHERCHE;
    // End of variables declaration//GEN-END:variables
}
