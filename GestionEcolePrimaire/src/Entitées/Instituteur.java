/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entitées;
import CONNEXION.Connexion;
import java.sql.*;
/**
 *
 * @author Almia
 */
public class Instituteur {
    private int NCIN;
    private String nom;
    private String prenom;
    private String dateN;
    private int tel;
    private String sexe;
    private String email;
    private String adr;
    private int codep;
    private String pays;
    private String ville;
    
    
    public Instituteur(int NCIN, String nom, String prenom, String dateN, String sexe,String pays, String ville, String adr, int codep, int tel, String email) {
        this.NCIN = NCIN;
        this.nom = nom;
        this.prenom = prenom;
        this.dateN = dateN;
        this.sexe = sexe;
        this.pays=pays;
        this.ville=ville;
        this.adr = adr;
        this.codep = codep;
        this.tel = tel;
        this.email = email;     
        
    }

    public int getNCIN() {
        return NCIN;
    }

    public void setNCIN(int NCIN) {
        this.NCIN = NCIN;
    
}

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getDateN() {
        return dateN;
    }

    public void setDateN(String dateN) {
        this.dateN = dateN;
    }
    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdr() {
        return adr;
    }

    public void setAdr(String adr) {
        this.adr = adr;
    }
    
    public int getCodep() {
        return codep;
    }

    public void setCodep(int codep) {
        this.codep = codep;
    }
    
    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }
    
    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public Instituteur() {
    }
    
    public boolean AjouterInstituteur()
    {
        Connexion con = new Connexion("root","root");
        String rqt="INSERT INTO INSTITUTEUR VALUES('"+getNCIN()+"','"+getNom()+"','"+getPrenom()+"','"+getDateN()+"','"+getSexe()+"','"+getPays()+"','"+getVille()+"','"+getAdr()+"','"+getCodep()+"','"+getTel()+"','"+getEmail()+"')"; 
        try {
                con.getstm().executeQuery(rqt);
            return true;
           
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
        
    }
    
    
    public boolean ModifierInstituteur(int numero){
        Connexion con = new Connexion("root","root");
        String rqt="UPDATE INSTITUTEUR SET NCIN ='"+getNCIN()+"',NOM='"+getNom()+"',PRENOM='"+getPrenom()+"',DATENAIS='"+getDateN()+"',SEXE='"+getSexe()+"',PAYS='"+getPays()+"',VILLE='"+getVille()+"',ADRESSE='"+getAdr()+"',CODEPOSTAL='"+getCodep()+"',NUMTLF='"+getTel()+"',EMAIL='"+getEmail()+"' WHERE NCIN='"+numero+"'";
        try {
            con.getstm().executeQuery(rqt);
            con.getstm().close();
            return true;
        } 
        catch (SQLException ex) {
          System.out.println(ex.getMessage());
            return false;}
        }
    
    public boolean SupprimerInstituteur(int numero){
        Connexion con = new Connexion("root","root");
        String rqt="DELETE FROM INSTITUTEUR WHERE NCIN ='"+numero+"'";
        try {
            con.getstm().executeQuery(rqt);
            con.getstm().close();
            return true;
        } 
        catch (SQLException ex) {
          System.out.println(ex.getMessage());
            return false;}
        }
    
    public static Instituteur ChargerInstituteur(int numero) {
        Connexion con = new Connexion("root","root");
        String rqt ="SELECT * FROM INSTITUTEUR WHERE NCIN='"+numero+"'";
        ResultSet rs;
        try {
            rs = con.getstm().executeQuery(rqt);
        
        Instituteur x=new Instituteur();
        while(rs.next())
        {
                x.NCIN=rs.getInt("NCIN");
                x.nom=rs.getString("NOM");
                x.prenom=rs.getString("PRENOM");
                x.dateN=rs.getString("DATENAIS");
                x.sexe=rs.getString("SEXE");
                x.pays=rs.getString("PAYS");
                x.ville=rs.getString("VILLE");
                x.adr=rs.getString("ADRESSE");
                x.codep=rs.getInt("CODEPOSTAL");
                x.tel=rs.getInt("NUMTLF");
                x.email=rs.getString("EMAIL");
        }
        return x;
        } 
        catch (SQLException ex) {
            return null;
        }
    }
    
    public static Instituteur[] RechercherInstituteurParNom(String nom){
        Connexion con = new Connexion("root","root");
        ResultSet rs=null;
        int i=0;
        String rqt="select * from instituteur where NOM='"+nom+"'";
        
        
        try {
            rs = con.getstm().executeQuery(rqt); 
            while (rs.next()){
            i++;
            }
            rs.close();
            
            rs = con.getstm().executeQuery(rqt); 
            Instituteur[] e = new Instituteur[i];
            i=0;
            while (rs.next()){
                Instituteur x = new Instituteur();
                x.NCIN=rs.getInt("NCIN");
                x.nom=rs.getString("NOM");
                x.prenom=rs.getString("PRENOM");
                x.dateN=rs.getString("DATENAIS");
                x.sexe=rs.getString("SEXE");
                x.pays=rs.getString("PAYS");
                x.ville=rs.getString("VILLE");
                x.adr=rs.getString("ADRESSE");
                x.codep=rs.getInt("CODEPOSTAL");
                x.tel=rs.getInt("NUMTLF");
                x.email=rs.getString("EMAIL");
                e[i]=x;
                i++;

        }
        rs.close();
        if(i==0)
            return null;
        return e;
           
        } catch (SQLException ex) {
            return null;
        }
    }
    
    
    public static Instituteur[] RechercherInstituteurParPrenom(String prenom){
        Connexion con = new Connexion("root","root");
        ResultSet rs=null;
        int i=0;
        String rqt="select * from instituteur where PRENOM='"+prenom+"'";
        
        
        try {
            rs = con.getstm().executeQuery(rqt); 
            while (rs.next()){
            i++;
            }
            rs.close();
            
            rs = con.getstm().executeQuery(rqt); 
            Instituteur[] e = new Instituteur[i];
            i=0;
            while (rs.next()){
                Instituteur x = new Instituteur();
                x.NCIN=rs.getInt("NCIN");
                x.nom=rs.getString("NOM");
                x.prenom=rs.getString("PRENOM");
                x.dateN=rs.getString("DATENAIS");
                x.sexe=rs.getString("SEXE");
                x.pays=rs.getString("PAYS");
                x.ville=rs.getString("VILLE");
                x.adr=rs.getString("ADRESSE");
                x.codep=rs.getInt("CODEPOSTAL");
                x.tel=rs.getInt("NUMTLF");
                x.email=rs.getString("EMAIL");
                e[i]=x;
                i++;
        }
        rs.close();
        if(i==0)
            return null;
        return e;
           
        } catch (SQLException ex) {
            return null;
        }
         
       
    
    }
    
     public static Instituteur[] AfficherInstituteurs(){
        Connexion con = new Connexion("root","root");
        ResultSet rs = null;
        int i=0;    
        String rqt ="select * from INSTITUTEUR";

        try {
            rs = con.getstm().executeQuery(rqt);
            while (rs.next()){
            i++;
            }
            rs.close();
            
            rs = con.getstm().executeQuery(rqt); 
            Instituteur[] e = new Instituteur[i];
            i=0;
            while (rs.next()){
                Instituteur x = new Instituteur();
                x.NCIN=rs.getInt("NCIN");
                x.nom=rs.getString("NOM");
                x.prenom=rs.getString("PRENOM");
                x.dateN=rs.getString("DATENAIS");
                x.sexe=rs.getString("SEXE");
                x.pays=rs.getString("PAYS");
                x.ville=rs.getString("VILLE");
                x.adr=rs.getString("ADRESSE");
                x.codep=rs.getInt("CODEPOSTAL");
                x.tel=rs.getInt("NUMTLF");
                x.email=rs.getString("EMAIL");
                e[i]=x;
                i++;
        }
        rs.close();
        if(i==0)
            return null;
        return e;
           
        } catch (SQLException ex) {
            return null;
        }
         
        
    
    } 
     
    

    
    
    
 
}
