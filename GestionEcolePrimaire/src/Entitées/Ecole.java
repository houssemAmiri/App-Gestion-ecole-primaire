/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entitées;

import CONNEXION.Connexion;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Almia
 */
public class Ecole {
private String nom;
private String ville;
private String adresse;
private int codePostal;
private int telephone;
private String siteWeb;
private String email;
private int fax;

    public Ecole() {
    }

    public Ecole(String nom, String ville, String adresse, int codePostal, int telephone, String siteWeb, String email, int fax) {
        this.nom = nom;
        this.ville = ville;
        this.adresse = adresse;
        this.codePostal = codePostal;
        this.telephone = telephone;
        this.siteWeb = siteWeb;
        this.email = email;
        this.fax = fax;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(int codePostal) {
        this.codePostal = codePostal;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public String getSiteWeb() {
        return siteWeb;
    }

    public void setSiteWeb(String siteWeb) {
        this.siteWeb = siteWeb;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getFax() {
        return fax;
    }

    public void setFax(int fax) {
        this.fax = fax;
    }
    
    public boolean SaisirInfo()
    {Connexion con = new Connexion("root","root");
        String rqt; 
    rqt = "INSERT INTO ECOLE VALUES('"+getNom()+"','"+getVille()+"','"+getAdresse()+"','"+getCodePostal()+"','"+getTelephone()+"','"+getFax()+"','"+getSiteWeb()+"','"+getEmail()+"')";
        try {
                con.getstm().executeQuery(rqt);
            return true;
           
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
    
    public boolean ModifierInfoEcole(){
        Connexion con = new Connexion("root","root");
        String rqt="UPDATE ECOLE SET NOM='"+getNom()+"',VILLE='"+getVille()+"',ADRESSE='"+getAdresse()+"',CODEPOSTAL='"+getCodePostal()+"',TELEPHONE='"+getTelephone()+"',FAX='"+getFax()+"',SITEWEB='"+getSiteWeb()+"',EMAIL='"+getEmail()+"'";
        try {
            con.getstm().executeQuery(rqt);
            con.getstm().close();
            return true;
        } 
        catch (SQLException ex) {
          System.out.println(ex.getMessage());
            return false;}
        }
    
     public static Ecole ChargerEcole() {
        String rqt ="SELECT * FROM ECOLE";
        ResultSet rs;
        Connexion con = new Connexion("root","root");
        
        try{
        rs = con.getstm().executeQuery(rqt);

        Ecole x=new Ecole();
        while(rs.next())
        {
                x.setNom(rs.getString("NOM"));
                x.setVille(rs.getString("VILLE"));
                x.setAdresse(rs.getString("ADRESSE"));
                x.setCodePostal(rs.getInt("CODEPOSTAL"));
                x.setTelephone(rs.getInt("TELEPHONE"));
                x.setFax(rs.getInt("FAX"));
                x.setSiteWeb(rs.getString("SITEWEB"));
                x.setEmail(rs.getString("EMAIL"));
        }
        
        return x;
        
    }catch(SQLException e){
        return null;
    }
    }


}
