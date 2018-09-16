/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces.Instituteur;
import Plus.Conversion;
import Plus.Email;
import Plus.LengthRestrictedDocument;
import Entitées.Enseigner;
import Entitées.Instituteur;
import Entitées.Matiere;
import Interfaces.Emplois.InterfacePrincipaleEmplois;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Almia
 */
public class ModifierInstituteur extends javax.swing.JFrame {

    /**
     * Creates new form ModifierInstituteur
     */
    private int inst;

    public int getInst() {
        return inst;
    }

    public void setInst(int inst) {
        this.inst = inst;
    }

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
    
    public ModifierInstituteur() {       
        initComponents();
        updateTableMat();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        jTextFieldCIN.setDocument(new LengthRestrictedDocument(8));
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
        jTextFieldCIN = new javax.swing.JTextField();
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
        jLabel15 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jButtonANNULER = new javax.swing.JButton();
        jButtonREINITIALISER = new javax.swing.JButton();
        jButtonENREGISTRER = new javax.swing.JButton();
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

        jTextFieldCIN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldCINKeyTyped(evt);
            }
        });

        jTextFieldNOM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNOMKeyTyped(evt);
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

        jLabel15.setForeground(new java.awt.Color(255, 102, 102));
        jLabel15.setText("Veuillez indiquer la Date de naissance");

        jLabel12.setForeground(new java.awt.Color(255, 102, 102));
        jLabel12.setText("Erreur,champ vide");

        jLabel14.setForeground(new java.awt.Color(255, 102, 102));
        jLabel14.setText("Erreur,champ vide");

        jLabel16.setForeground(new java.awt.Color(255, 102, 102));
        jLabel16.setText("Veuillez indiquer le sexe");

        jLabel17.setForeground(new java.awt.Color(255, 102, 102));
        jLabel17.setText("Veuillez selectionner un pays");

        jLabel19.setForeground(new java.awt.Color(255, 102, 102));
        jLabel19.setText("Erreur,champ vide");

        jLabel13.setForeground(new java.awt.Color(255, 102, 102));
        jLabel13.setText("ncin");

        jLabel18.setForeground(new java.awt.Color(255, 102, 102));
        jLabel18.setText("num tel");

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
                                .addComponent(jTextFieldCIN, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextFieldNOM)
                                            .addComponent(jTextFieldADRESSE, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                                            .addComponent(jTextFieldNUMTEL))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(85, 85, 85)
                                                .addComponent(jLabel3))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jComboBoxSEXE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jComboBoxPAYS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(65, 65, 65)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel7)
                                                    .addComponent(jLabel11)
                                                    .addComponent(jLabel9)))
                                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(14, 14, 14)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxVILLE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jTextFieldEMAIL, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                                            .addComponent(jTextFieldCODEPOSTAL, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel21)
                                            .addComponent(jLabel22)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jTextFieldPRENOM, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxANNEE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxMOIS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxJOUR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldCIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldNOM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPRENOM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel19))
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
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jTextFieldEMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNUMTEL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel22))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        jButtonANNULER.setText("Annuler");
        jButtonANNULER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonANNULERActionPerformed(evt);
            }
        });

        jButtonREINITIALISER.setText("Réinitialiser");
        jButtonREINITIALISER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonREINITIALISERActionPerformed(evt);
            }
        });

        jButtonENREGISTRER.setText("Enregistrer");
        jButtonENREGISTRER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonENREGISTRERActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonANNULER)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonREINITIALISER)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonENREGISTRER))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel20)
                        .addGap(76, 76, 76))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonENREGISTRER)
                    .addComponent(jButtonREINITIALISER)
                    .addComponent(jButtonANNULER))
                .addContainerGap(426, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCINKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCINKeyTyped
        // TODO add your handling code here:
        char input=evt.getKeyChar();
        if(!Character.isDigit(input)){
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldCINKeyTyped

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

    private void jButtonREINITIALISERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonREINITIALISERActionPerformed
        // TODO add your handling code here:
        jLabel12.setVisible(false);jLabel13.setVisible(false);jLabel14.setVisible(false);jLabel15.setVisible(false);jLabel16.setVisible(false);jLabel17.setVisible(false);jLabel18.setVisible(false);jLabel19.setVisible(false);jLabel20.setVisible(false);jLabel21.setVisible(false);jLabel22.setVisible(false);
        jTextFieldCIN.setText("");jTextFieldNOM.setText("");jTextFieldPRENOM.setText("");jTextFieldCODEPOSTAL.setText("");jTextFieldEMAIL.setText("");jTextFieldNUMTEL.setText("");jTextFieldADRESSE.setText("");
        jComboBoxPAYS.setSelectedIndex(0);jComboBoxSEXE.setSelectedIndex(0);jComboBoxANNEE.setSelectedIndex(0);jComboBoxMOIS.setSelectedIndex(0);jComboBoxJOUR.setSelectedIndex(0);
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
        int nb=Instituteur.ChargerInstituteur(Conversion.StringtoInt(jTextFieldCIN.getText())).getNCIN();
        if(jTextFieldCIN.getText().equals("")){
            jLabel13.setText("Erreur, champ vide");
            jLabel13.setVisible(true);
        }
        else if(jTextFieldCIN.getText().length()<8)
            {jLabel13.setText("N°CIN Invalide");
            jLabel13.setVisible(true);}
        else if(nb==Conversion.StringtoInt(jTextFieldCIN.getText()) && nb!=Conversion.StringtoInt(jTextFieldCIN.getText()))
            {jLabel13.setText("N°CIN Invalide");
            jLabel13.setVisible(true);
            JOptionPane.showMessageDialog(null, "Un Instituteur avec le meme N°CIN est existant!");}
        else jLabel13.setVisible(false);
        
        if(jTextFieldNOM.getText().equals("")){
            jLabel14.setVisible(true);
        }
        else jLabel14.setVisible(false);
        
        if(jTextFieldPRENOM.getText().equals("")){
            jLabel19.setVisible(true);
        }
        else jLabel19.setVisible(false);
        
        if(jTextFieldADRESSE.getText().equals("")){
            jLabel12.setVisible(true);
        }
        else jLabel12.setVisible(false);
        
        if(jTextFieldCODEPOSTAL.getText().length()<4 && !(jTextFieldCODEPOSTAL.getText()).equals(""))
            jLabel21.setVisible(true);
        else jLabel21.setVisible(false);
        
        if(jTextFieldNUMTEL.getText().equals("")){
            jLabel18.setText("Erreur, champ vide");
            jLabel18.setVisible(true);
        }
        else if(jTextFieldNUMTEL.getText().length()<8)
            {jLabel18.setText("Num Tel invalide");
            jLabel18.setVisible(true);}
        else jLabel18.setVisible(false);
        
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
            Enseigner.SupprimerTTEnseigner(Conversion.StringtoInt(jTextFieldCIN.getText()));            
            int i=jTableMatieres.getRowCount();
            Boolean b;
                int j=0;
                while(j<i)
                {b=(Boolean) jTableMatieres.getValueAt(j,0);
                 
                 if(!b)
                 j++;
                 else {
                     Enseigner ens=new Enseigner(0,Instituteur.ChargerInstituteur(Conversion.StringtoInt(jTextFieldCIN.getText())),Matiere.ChargerMatiereParNom((String) jTableMatieres.getValueAt(j, 1)));
                     ens.AjouterEnseigner();
                 j++;
                 }
                }
                
            
            
            e = new Instituteur(Conversion.StringtoInt(jTextFieldCIN.getText())
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
            if(e.ModifierInstituteur(inst)){
                JOptionPane.showMessageDialog(null, "L'instituteur a été Modifié avec succes!");
                dispose();
                InterfacePrincipaleInstituteur.updateTableInst();
                InterfacePrincipaleEmplois.updateEmplois();
                    
            }
            else JOptionPane.showMessageDialog(null, "Echec de modification de l'Instituteur!");
                
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
            java.util.logging.Logger.getLogger(ModifierInstituteur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ModifierInstituteur().setVisible(true);
        });
    }

    public JComboBox<String> getjComboBoxANNEE() {
        return jComboBoxANNEE;
    }

    public JComboBox<String> getjComboBoxJOUR() {
        return jComboBoxJOUR;
    }

    public JComboBox<String> getjComboBoxMOIS() {
        return jComboBoxMOIS;
    }

    public JComboBox<String> getjComboBoxPAYS() {
        return jComboBoxPAYS;
    }

    public JComboBox<String> getjComboBoxSEXE() {
        return jComboBoxSEXE;
    }

    public JComboBox<String> getjComboBoxVILLE() {
        return jComboBoxVILLE;
    }

    public static JTable getjTableMatieres() {
        return jTableMatieres;
    }

    public JTextField getjTextFieldADRESSE() {
        return jTextFieldADRESSE;
    }

    public JTextField getjTextFieldCIN() {
        return jTextFieldCIN;
    }

    public JTextField getjTextFieldCODEPOSTAL() {
        return jTextFieldCODEPOSTAL;
    }

    public JTextField getjTextFieldEMAIL() {
        return jTextFieldEMAIL;
    }

    public JTextField getjTextFieldNOM() {
        return jTextFieldNOM;
    }

    public JTextField getjTextFieldNUMTEL() {
        return jTextFieldNUMTEL;
    }

    public JTextField getjTextFieldPRENOM() {
        return jTextFieldPRENOM;
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
    private javax.swing.JTextField jTextFieldCIN;
    private javax.swing.JTextField jTextFieldCODEPOSTAL;
    private javax.swing.JTextField jTextFieldEMAIL;
    private javax.swing.JTextField jTextFieldNOM;
    private javax.swing.JTextField jTextFieldNUMTEL;
    private javax.swing.JTextField jTextFieldPRENOM;
    // End of variables declaration//GEN-END:variables
}
