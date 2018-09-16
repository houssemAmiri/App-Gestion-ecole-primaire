/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces.Instituteur;
import Plus.Conversion;
import Plus.Email;
import Entitées.Instituteur;
import Plus.LengthRestrictedDocument;
import Entitées.Enseigner;
import Entitées.Matiere;
import Interfaces.Emplois.InterfacePrincipaleEmplois;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Almia
 */
public class AjouterInstituteur extends javax.swing.JFrame {

    /**
     * Creates new form AjouterInstituteur
     */
    public static final void updateTableMat(){
        Matiere[] tabe=new Matiere[100];
        tabe=Matiere.AfficherMatieres();
        if(tabe!=null){
                DefaultTableModel d=(DefaultTableModel)jTableMatieres.getModel();
                for(int i=0;i<tabe.length;i++){
                    d.addRow(new Object[] {false,tabe[i].getNom()});
                }
                jTableMatieres.setModel(d);
            }
        else {
            DefaultTableModel m=(DefaultTableModel) jTableMatieres.getModel();
            m.setRowCount(0);
            jTableMatieres.setModel(m);JOptionPane.showMessageDialog(null, "Aucune matiere dans la Base!");
        }
    }
    
    public AjouterInstituteur() {
        initComponents();
        updateTableMat();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        jTextFieldNCIN.setDocument(new LengthRestrictedDocument(8));
        jTextFieldNOM.setDocument(new LengthRestrictedDocument(25));
        jTextFieldPRENOM.setDocument(new LengthRestrictedDocument(25));
        jTextFieldNUMTEL.setDocument(new LengthRestrictedDocument(8));
        jTextFieldCODEPOSTAL.setDocument(new LengthRestrictedDocument(4));
        jLabel12.setVisible(false);jLabel13.setVisible(false);jLabel14.setVisible(false);jLabel15.setVisible(false);jLabel16.setVisible(false);jLabel17.setVisible(false);jLabel18.setVisible(false);jLabel19.setVisible(false);jLabel20.setVisible(false);jLabel21.setVisible(false);jLabel22.setVisible(false);
         String[] jours=new String[] { "1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
         jComboBoxMOIS.addActionListener((e) -> {
            if(jComboBoxANNEE.getSelectedIndex()!=0){
            int x=jComboBoxJOUR.getItemCount()-1;
             for(int j=0;j<x;j++)
             jComboBoxJOUR.removeItemAt(1);
            switch(jComboBoxMOIS.getSelectedIndex()){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                for(int i=0;i<jours.length;i++)
                    jComboBoxJOUR.addItem(jours[i]);
                break;
                case 4:
                case 6:
                case 9:
                case 11:
                for(int i=0;i<30;i++)
                    jComboBoxJOUR.addItem(jours[i]);
                break;
                case 2:
                    int annee=Conversion.StringtoInt(jComboBoxANNEE.getSelectedItem().toString());
                    if( ((annee % 4 == 0) && !(annee % 100 == 0))    ||   (annee % 400 == 0)     )
                        for(int i=0;i<29;i++)
                           jComboBoxJOUR.addItem(jours[i]);
                    else for(int i=0;i<28;i++)
                           jComboBoxJOUR.addItem(jours[i]);
                break;
            }}
        });
        jComboBoxANNEE.addActionListener((e) -> {
            if(jComboBoxMOIS.getSelectedIndex()!=0){
            int x=jComboBoxJOUR.getItemCount()-1;
             for(int j=0;j<x;j++)
             jComboBoxJOUR.removeItemAt(1);
            switch(jComboBoxMOIS.getSelectedIndex()){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                for(int i=0;i<jours.length;i++)
                    jComboBoxJOUR.addItem(jours[i]);
                break;
                case 4:
                case 6:
                case 9:
                case 11:
                for(int i=0;i<30;i++)
                    jComboBoxJOUR.addItem(jours[i]);
                break;
                case 2:
                    int annee=Conversion.StringtoInt(jComboBoxANNEE.getSelectedItem().toString());
                    if( ((annee % 4 == 0) && !(annee % 100 == 0))    ||   (annee % 400 == 0)     )
                        for(int i=0;i<29;i++)
                           jComboBoxJOUR.addItem(jours[i]);
                    else for(int i=0;i<28;i++)
                           jComboBoxJOUR.addItem(jours[i]);
                break;
            }}
        });
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldNCIN = new javax.swing.JTextField();
        jTextFieldNOM = new javax.swing.JTextField();
        jTextFieldPRENOM = new javax.swing.JTextField();
        jTextFieldCODEPOSTAL = new javax.swing.JTextField();
        jTextFieldEMAIL = new javax.swing.JTextField();
        jTextFieldNUMTEL = new javax.swing.JTextField();
        jTextFieldADRESSE = new javax.swing.JTextField();
        jComboBoxPAYS = new javax.swing.JComboBox<>();
        jComboBoxSEXE = new javax.swing.JComboBox<>();
        jComboBoxANNEE = new javax.swing.JComboBox<>();
        jComboBoxMOIS = new javax.swing.JComboBox<>();
        jComboBoxJOUR = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jComboBoxVILLE = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jButtonENREGISTRER = new javax.swing.JButton();
        jButtonREINITIALISER = new javax.swing.JButton();
        jButtonANNULER = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMatieres = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Informations Instituteur", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel1.setText("N°CIN *");

        jLabel2.setText("Nom *");

        jLabel3.setText("Prenom *");

        jLabel4.setText("Date de Naissance *");

        jLabel5.setText("Sexe *");

        jLabel6.setText("Adresse *");

        jLabel7.setText("Code Postal");

        jLabel8.setText("Num Tel *");

        jLabel9.setText("E-Mail");

        jLabel10.setText("Pays *");

        jTextFieldNCIN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNCINKeyTyped(evt);
            }
        });

        jTextFieldNOM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNOMKeyTyped(evt);
            }
        });

        jTextFieldPRENOM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldPRENOMKeyTyped(evt);
            }
        });

        jTextFieldCODEPOSTAL.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldCODEPOSTALKeyTyped(evt);
            }
        });

        jTextFieldNUMTEL.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNUMTELKeyTyped(evt);
            }
        });

        jComboBoxPAYS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pays", "Tunisia" }));

        jComboBoxSEXE.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sexe", "Homme", "Femme" }));

        jComboBoxANNEE.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Année", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017" }));

        jComboBoxMOIS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mois", "Janvier", "Février", "Mars", "Avril", "Mai", "Juin", "Juilet", "Aout", "Septembre", "Octobre", "Novembre", "Decembre" }));

        jComboBoxJOUR.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jour", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29" }));

        jLabel11.setText("Ville");

        jComboBoxVILLE.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ville", "Ariana", "Béja", "Ben Arous", "Bizerte", "Gabès", "Gafsa", "Jendouba", "Kairouan", "Kasserine", "Kébili", "La Manouba", "Le Kef", "Mahdia", "Médenine", "Monastir", "Nabeul", "Sfax", "Sidi Bouzid", "Siliana", "Sousse", "Tataouine", "Tozeu", "Tunis", "Zaghouan" }));

        jLabel12.setForeground(new java.awt.Color(255, 102, 102));
        jLabel12.setText("ncin");

        jLabel13.setForeground(new java.awt.Color(255, 102, 102));
        jLabel13.setText("Erreur,champ vide");

        jLabel14.setForeground(new java.awt.Color(255, 102, 102));
        jLabel14.setText("Erreur,champ vide");

        jLabel15.setForeground(new java.awt.Color(255, 102, 102));
        jLabel15.setText("Veuillez indiquer la Date de naissance");

        jLabel16.setForeground(new java.awt.Color(255, 102, 102));
        jLabel16.setText("Veuillez indiquer le sexe");

        jLabel17.setForeground(new java.awt.Color(255, 102, 102));
        jLabel17.setText("Veuillez selectionner un pays");

        jLabel18.setForeground(new java.awt.Color(255, 102, 102));
        jLabel18.setText("Erreur,champ vide");

        jLabel19.setForeground(new java.awt.Color(255, 102, 102));
        jLabel19.setText("num tel");

        jLabel21.setForeground(new java.awt.Color(255, 102, 102));
        jLabel21.setText("Code Postal invalide");

        jLabel22.setForeground(new java.awt.Color(255, 102, 102));
        jLabel22.setText("E-mail invalide");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel10)
                                .addComponent(jLabel5)))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jComboBoxSEXE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextFieldNCIN, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jComboBoxPAYS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(76, 76, 76)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addGap(47, 47, 47)
                                                .addComponent(jTextFieldEMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel7)
                                                    .addComponent(jLabel11))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jComboBoxVILLE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jTextFieldCODEPOSTAL, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextFieldNOM)
                                            .addComponent(jTextFieldADRESSE, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                                            .addComponent(jTextFieldNUMTEL))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(94, 94, 94)
                                                .addComponent(jLabel3)
                                                .addGap(27, 27, 27)
                                                .addComponent(jTextFieldPRENOM, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxANNEE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxMOIS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxJOUR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldNCIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldNOM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPRENOM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBoxANNEE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxMOIS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxJOUR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBoxSEXE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jComboBoxPAYS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jComboBoxVILLE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldCODEPOSTAL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldADRESSE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel21))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jTextFieldEMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNUMTEL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel22))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jButtonENREGISTRER.setText("Enregistrer");
        jButtonENREGISTRER.setName(""); // NOI18N
        jButtonENREGISTRER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonENREGISTRERActionPerformed(evt);
            }
        });

        jButtonREINITIALISER.setText("Réinitialiser");
        jButtonREINITIALISER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonREINITIALISERActionPerformed(evt);
            }
        });

        jButtonANNULER.setText("Annuler");
        jButtonANNULER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonANNULERActionPerformed(evt);
            }
        });

        jLabel20.setForeground(new java.awt.Color(255, 102, 102));
        jLabel20.setText("Veuillez indiquer les matières");

        jTableMatieres.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "NOM"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableMatieres.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTableMatieres);
        if (jTableMatieres.getColumnModel().getColumnCount() > 0) {
            jTableMatieres.getColumnModel().getColumn(0).setResizable(false);
            jTableMatieres.getColumnModel().getColumn(0).setPreferredWidth(10);
            jTableMatieres.getColumnModel().getColumn(1).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonANNULER)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonREINITIALISER)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonENREGISTRER))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 860, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel20)
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(71, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonANNULER)
                    .addComponent(jButtonREINITIALISER)
                    .addComponent(jButtonENREGISTRER))
                .addGap(231, 231, 231))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNCINKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNCINKeyTyped
        // TODO add your handling code here:
        char input=evt.getKeyChar();
        if(!Character.isDigit(input)){
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldNCINKeyTyped

    private void jTextFieldNUMTELKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNUMTELKeyTyped
        // TODO add your handling code here:
        char input=evt.getKeyChar();
        if(!Character.isDigit(input)){
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldNUMTELKeyTyped

    private void jTextFieldCODEPOSTALKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCODEPOSTALKeyTyped
        // TODO add your handling code here:
        char input=evt.getKeyChar();
        if(!Character.isDigit(input)){
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldCODEPOSTALKeyTyped

    private void jTextFieldNOMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNOMKeyTyped
        // TODO add your handling code here:
        char input=evt.getKeyChar();
        if(!Character.isLetter(input)&& input!=' '){
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldNOMKeyTyped

    private void jTextFieldPRENOMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPRENOMKeyTyped
        // TODO add your handling code here:
        char input=evt.getKeyChar();
        if(!Character.isLetter(input)&& input!=' '){
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldPRENOMKeyTyped

    private void jButtonREINITIALISERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonREINITIALISERActionPerformed
        // TODO add your handling code here:
        jLabel12.setVisible(false);jLabel13.setVisible(false);jLabel14.setVisible(false);jLabel15.setVisible(false);jLabel16.setVisible(false);jLabel17.setVisible(false);jLabel18.setVisible(false);jLabel19.setVisible(false);jLabel20.setVisible(false);jLabel21.setVisible(false);jLabel22.setVisible(false);
        jTextFieldNCIN.setText("");jTextFieldNOM.setText("");jTextFieldPRENOM.setText("");jTextFieldCODEPOSTAL.setText("");jTextFieldEMAIL.setText("");jTextFieldNUMTEL.setText("");jTextFieldADRESSE.setText("");
        jComboBoxPAYS.setSelectedIndex(0);jComboBoxSEXE.setSelectedIndex(0);jComboBoxANNEE.setSelectedIndex(0);jComboBoxMOIS.setSelectedIndex(0);jComboBoxJOUR.setSelectedIndex(0);
        DefaultTableModel m=(DefaultTableModel) jTableMatieres.getModel();
            m.setRowCount(0);
        updateTableMat();
    }//GEN-LAST:event_jButtonREINITIALISERActionPerformed

    private void jButtonANNULERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonANNULERActionPerformed
        // TODO add your handling code here:
        if(JOptionPane.showConfirmDialog(this, "Voulez-vous vraiment Quitter ?","Attention",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
		   {
			   dispose();
		   }
    }//GEN-LAST:event_jButtonANNULERActionPerformed
 
    private void jButtonENREGISTRERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonENREGISTRERActionPerformed
        // TODO add your handling code here:
        int nb=Instituteur.ChargerInstituteur(Conversion.StringtoInt(jTextFieldNCIN.getText())).getNCIN();
        if(jTextFieldNCIN.getText().equals("")){
            jLabel12.setText("Erreur, champ vide");
            jLabel12.setVisible(true);
        }
        else if(jTextFieldNCIN.getText().length()<8)
            {jLabel12.setText("N°CIN Invalide");
            jLabel12.setVisible(true);}
        else if(nb==Conversion.StringtoInt(jTextFieldNCIN.getText()))
            {jLabel12.setText("N°CIN Invalide");
            jLabel12.setVisible(true);
            JOptionPane.showMessageDialog(null, "Un Instituteur avec le meme N°CIN est existant!");}
        else jLabel12.setVisible(false);
        
        if(jTextFieldNOM.getText().equals("")){
            jLabel13.setVisible(true);
        }
        else jLabel13.setVisible(false);
        
        if(jTextFieldPRENOM.getText().equals("")){
            jLabel14.setVisible(true);
        }
        else jLabel14.setVisible(false);
        
        if(jTextFieldADRESSE.getText().equals("")){
            jLabel18.setVisible(true);
        }
        else jLabel18.setVisible(false);
        
        if(jTextFieldCODEPOSTAL.getText().length()<4 && !(jTextFieldCODEPOSTAL.getText()).equals(""))
            jLabel21.setVisible(true);
        else jLabel21.setVisible(false);
        
        if(jTextFieldNUMTEL.getText().equals("")){
            jLabel19.setText("Erreur, champ vide");
            jLabel19.setVisible(true);
        }
        else if(jTextFieldNUMTEL.getText().length()<8)
            {jLabel19.setText("Num Tel invalide");
            jLabel19.setVisible(true);}
        else jLabel19.setVisible(false);
        
        if(!Email.isValidEmailAddress(jTextFieldEMAIL.getText())&& !(jTextFieldEMAIL.getText()).equals(""))
            jLabel22.setVisible(true);
        else jLabel22.setVisible(false);
        
        if(jComboBoxPAYS.getSelectedIndex()==0){
            jLabel17.setVisible(true);
        }
        else jLabel17.setVisible(false);
        
        if(jComboBoxSEXE.getSelectedIndex()==0){
            jLabel16.setVisible(true);
        }
        else jLabel16.setVisible(false);
        
        if(jComboBoxANNEE.getSelectedIndex()==0 || jComboBoxMOIS.getSelectedIndex()==0 || jComboBoxJOUR.getSelectedIndex()==0){
            jLabel15.setVisible(true);
        }
        else jLabel15.setVisible(false);
        
        DefaultTableModel d=(DefaultTableModel)jTableMatieres.getModel();
        int m=0;
        for(int i=0;i<d.getRowCount();i++){
            if((boolean)d.getValueAt(i,0)==true)
                m++;
        }
        
        if(m==0){
            jLabel20.setVisible(true);
        }
        else jLabel20.setVisible(false);
        
        
        if(jLabel12.isVisible()==false && jLabel13.isVisible()==false && jLabel14.isVisible()==false && jLabel15.isVisible()==false && jLabel16.isVisible()==false && jLabel17.isVisible()==false && jLabel18.isVisible()==false && jLabel19.isVisible()==false && jLabel20.isVisible()==false ){
            Instituteur e;
            
            e = new Instituteur(Conversion.StringtoInt(jTextFieldNCIN.getText())
                    ,jTextFieldNOM.getText()
                    ,jTextFieldPRENOM.getText()
                    ,jComboBoxANNEE.getSelectedItem().toString()+"+"+jComboBoxMOIS.getSelectedItem().toString()+"+"+jComboBoxJOUR.getSelectedItem().toString()
                    ,jComboBoxSEXE.getSelectedItem().toString()
                    ,jComboBoxPAYS.getSelectedItem().toString()
                    ,jComboBoxVILLE.getSelectedItem().toString()
                    ,jTextFieldADRESSE.getText()
                    ,Conversion.StringtoInt(jTextFieldCODEPOSTAL.getText())
                    ,Conversion.StringtoInt(jTextFieldNUMTEL.getText())
                    ,jTextFieldEMAIL.getText());
            if(e.AjouterInstituteur()){
                int i=jTableMatieres.getRowCount();
                Boolean b;
                int j=0;
                while(j<i)
                {b=(Boolean) jTableMatieres.getValueAt(j,0);
                 
                 if(!b)
                 j++;
                 else {
                     Enseigner ens=new Enseigner(0,Instituteur.ChargerInstituteur(Conversion.StringtoInt(jTextFieldNCIN.getText())),Matiere.ChargerMatiereParNom((String) jTableMatieres.getValueAt(j, 1)));
                     ens.AjouterEnseigner();
                 j++;
                 }
                }
                JOptionPane.showMessageDialog(null, "L'instituteur a été ajouté avec succes!");
                dispose();
                InterfacePrincipaleInstituteur.updateTableInst();
                InterfacePrincipaleEmplois.updateEmplois();
                
            }
            else JOptionPane.showMessageDialog(null, "Echec d'ajout d'Instituteur!");
                
        }
        
    }//GEN-LAST:event_jButtonENREGISTRERActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AjouterInstituteur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new AjouterInstituteur().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonANNULER;
    private javax.swing.JButton jButtonENREGISTRER;
    private javax.swing.JButton jButtonREINITIALISER;
    private javax.swing.JComboBox<String> jComboBoxANNEE;
    private javax.swing.JComboBox<String> jComboBoxJOUR;
    private javax.swing.JComboBox<String> jComboBoxMOIS;
    private javax.swing.JComboBox<String> jComboBoxPAYS;
    private javax.swing.JComboBox<String> jComboBoxSEXE;
    private javax.swing.JComboBox<String> jComboBoxVILLE;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTable jTableMatieres;
    private javax.swing.JTextField jTextFieldADRESSE;
    private javax.swing.JTextField jTextFieldCODEPOSTAL;
    private javax.swing.JTextField jTextFieldEMAIL;
    private javax.swing.JTextField jTextFieldNCIN;
    private javax.swing.JTextField jTextFieldNOM;
    private javax.swing.JTextField jTextFieldNUMTEL;
    private javax.swing.JTextField jTextFieldPRENOM;
    // End of variables declaration//GEN-END:variables
}
