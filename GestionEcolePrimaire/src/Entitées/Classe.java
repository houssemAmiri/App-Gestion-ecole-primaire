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
public class Classe {
 
    private int id;
    private String niveau;
    private String nom;
    private Eleve[] liste;

    public Classe() {
    }

    public Classe(int id,String niveau, String nom) {
        this.id = id;
        this.niveau=niveau;
        this.nom = nom;
        this.liste=new Eleve[30];
    }

    public Eleve[] getListe() {
        return liste;
    }

    public void setListe(Eleve[] liste) {
        this.liste = liste;
    }

    
    public int getId() {
        return id;
    }

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    
    
    public boolean AjouterClasse() 
    {
        Connexion con = new Connexion("root","root");
        String rqt="INSERT INTO CLASSE VALUES("+1+",'"+getNiveau()+"','"+getNom()+"')";
             try {
                con.getstm().executeQuery(rqt);
            return true;
       
           
             } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
    
    public boolean ModifierClasse(int id){
        Connexion con = new Connexion("root","root");
        String rqt="UPDATE CLASSE SET ID ='"+id+"',NIVEAU='"+getNiveau()+"',NOM='"+getNom()+"' WHERE ID='"+id+"'";
        try {
            con.getstm().executeQuery(rqt);
            con.getstm().close();
            return true;
        } 
        catch (SQLException ex) {
          System.out.println(ex.getMessage());
            return false;}
        }
    
    public boolean SupprimerClasse(int numero){
        Connexion con = new Connexion("root","root");
        String rqt="DELETE FROM CLASSE WHERE ID ='"+numero+"'";
        try {
            con.getstm().executeQuery(rqt);
            con.getstm().close();
            return true;
        } 
        catch (SQLException ex) {
          System.out.println(ex.getMessage());
        return false;}
    }
    
    public static Classe ChargerClasse(int id) {
        String rqt ="SELECT * FROM CLASSE WHERE ID='"+id+"'";
        ResultSet rs;
        Connexion con = new Connexion("root","root");
        
        try{
        rs = con.getstm().executeQuery(rqt);

        Classe x=new Classe();
        while(rs.next())
        {
                x.id=rs.getInt("ID");
                x.niveau=rs.getString("NIVEAU");
                x.nom=rs.getString("NOM");
                x.liste=Eleve.RechercherEleveParClasse(x.id);
        }
        
        return x;
        
    }catch(SQLException e){
        return null;
    }
    }
    
    public static Classe ChargerClasseParNom(String nom) {
        String rqt ="SELECT * FROM CLASSE WHERE NOM='"+nom+"'";
        ResultSet rs;
        Connexion con = new Connexion("root","root");
        
        try{
        rs = con.getstm().executeQuery(rqt);

        Classe x=new Classe();
        while(rs.next())
        {
                x.id=rs.getInt("ID");
                x.niveau=rs.getString("NIVEAU");
                x.nom=rs.getString("NOM");
                x.liste=Eleve.RechercherEleveParClasse(x.id);
        }
        
        return x;
        
    }catch(SQLException e){
        return null;
    }
    }
    
    public static Classe[] ChargerClassesParNiveau(String niv) {
        String rqt ="SELECT * FROM CLASSE WHERE NIVEAU='"+niv+"'";
        ResultSet rs;
        Connexion con = new Connexion("root","root");
        int i=0;       
        try{
            rs = con.getstm().executeQuery(rqt); 
            while (rs.next()){
            i++;
            }
            rs.close();
        rs = con.getstm().executeQuery(rqt);

        Classe[] e=new Classe[i];
        i=0;
        while(rs.next())
        {
                Classe x = new Classe();
                x.id=rs.getInt("ID");
                x.niveau=rs.getString("NIVEAU");
                x.nom=rs.getString("NOM");
                e[i]=x;
                i++;
        }rs.close();
        if(i==0)
        return null;
        else return e;
        
        
    }catch(SQLException ex){
        return null;
    }
    }
       
    public static Classe[] AfficherClasses() {
        Connexion con = new Connexion("root","root");
        ResultSet rs = null;
        int i=0;    
        String rqt ="SELECT * FROM CLASSE";       
        try {
            rs=con.getstm().executeQuery(rqt);
            while(rs.next()){
            i++;
            }
            rs.close();
            
            rs =con.getstm().executeQuery(rqt); 
            Classe[] e=new Classe[i];
            i=0;
            while (rs.next()){
                Classe x = new Classe();
                x.id=rs.getInt("ID");
                x.niveau=rs.getString("NIVEAU");
                x.nom=rs.getString("NOM");
                               
                e[i]= x;
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
    
    public boolean AjouterEleveClasse(int eid){
        Connexion con = new Connexion("root","root");
        String rqt="UPDATE ELEVE SET CLASSE='"+this.id+"' WHERE ID='"+eid+"'";
             try {
                con.getstm().executeQuery(rqt);
              return true;
           
             } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            
        }
        
            
        return false;
    }
    
    public boolean suppElevesClasse(int c){
        Connexion con = new Connexion("root","root");
        String rqt="UPDATE ELEVE SET CLASSE="+null+" WHERE CLASSE='"+c+"'";
             try {
                con.getstm().executeQuery(rqt);
              return true;
           
             } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            
        }
        
            
        return false;
    }
    
}
