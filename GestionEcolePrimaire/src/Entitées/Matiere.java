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
public class Matiere {
    private int id;
    private String nom;

    public Matiere() {
    }

    public Matiere(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    
    public boolean AjouterMatiere() 
    {
        Connexion con = new Connexion("root","root");
        String rqt="INSERT INTO MATIERE VALUES("+0+",'"+getNom()+"')";
             try {
                con.getstm().executeQuery(rqt);
            return true;
       
           
             } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
    
    public boolean ModifierMatiere(int id){
        Connexion con = new Connexion("root","root");
        String rqt="UPDATE MATIERE SET ID ='"+getId()+"',NOM='"+getNom()+"' WHERE ID='"+id+"'";
        try {
            con.getstm().executeQuery(rqt);
            con.getstm().close();
            return true;
        } 
        catch (SQLException ex) {
          System.out.println(ex.getMessage());
            return false;}
        }
    
    public boolean SupprimerMatiere(int numero){
        Connexion con = new Connexion("root","root");
        String rqt="DELETE FROM MATIERE WHERE ID ='"+numero+"'";
        try {
            con.getstm().executeQuery(rqt);
            con.getstm().close();
            return true;
        } 
        catch (SQLException ex) {
          System.out.println(ex.getMessage());
        return false;}
    }
    
    public static Matiere ChargerMatiere(int id) {
        String rqt ="SELECT * FROM MATIERE WHERE ID='"+id+"'";
        ResultSet rs;
        Connexion con = new Connexion("root","root");
        
        try{
        rs = con.getstm().executeQuery(rqt);

        Matiere x=new Matiere();
        while(rs.next())
        {
               x.id=rs.getInt("ID");
               x.nom=rs.getString("NOM");
        }
        return x;
    }catch(SQLException e){
        return null;
    }
    }
    
    public static Matiere ChargerMatiereParNom(String nom) {
        String rqt ="SELECT * FROM MATIERE WHERE NOM='"+nom+"'";
        ResultSet rs;
        Connexion con = new Connexion("root","root");
        
        try{
        rs = con.getstm().executeQuery(rqt);

        Matiere x=new Matiere();
        while(rs.next())
        {
               x.id=rs.getInt("ID");
               x.nom=rs.getString("NOM");
        }
        return x;
    }catch(SQLException e){
        return null;
    }
    }
    
    public static Matiere[] AfficherMatieres() {
        Connexion con = new Connexion("root","root");
        ResultSet rs = null;
        int i=0;    
        String rqt ="SELECT * FROM MATIERE";       
        try {
            rs=con.getstm().executeQuery(rqt);
            while(rs.next()){
            i++;
            }
            rs.close();
            
            rs =con.getstm().executeQuery(rqt); 
            Matiere[] e=new Matiere[i];
            i=0;
            while (rs.next()){
                Matiere x = new Matiere();
                x.id=rs.getInt("ID");
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
}
