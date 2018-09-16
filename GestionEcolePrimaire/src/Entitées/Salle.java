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
public class Salle {
    int id;
    String nom;
    String type;

    public Salle(int id,String nom, String type) {
        this.id=id;
        this.nom = nom;
        this.type = type;
    }
    
    public Salle(){
        
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public boolean AjouterSalle() 
    {
        Connexion con = new Connexion("root","root");
        String rqt="INSERT INTO SALLE VALUES("+0+",'"+getNom()+"','"+getType()+"')";
             try {
                con.getstm().executeQuery(rqt);
            return true;
       
           
             } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
    
    public boolean ModifierSalle(int id){
        Connexion con = new Connexion("root","root");
        String rqt="UPDATE SALLE SET ID ='"+getId()+"',TYPE='"+getType()+"',NOM='"+getNom()+"' WHERE ID='"+id+"'";
        try {
            con.getstm().executeQuery(rqt);
            con.getstm().close();
            return true;
        } 
        catch (SQLException ex) {
          System.out.println(ex.getMessage());
            return false;}
        }
    
    public boolean SupprimerSalle(int numero){
        Connexion con = new Connexion("root","root");
        String rqt="DELETE FROM SALLE WHERE ID ='"+numero+"'";
        try {
            con.getstm().executeQuery(rqt);
            con.getstm().close();
            return true;
        } 
        catch (SQLException ex) {
          System.out.println(ex.getMessage());
        return false;}
    }
          
    
    public static Salle ChargerSalle(int numero) {
        String rqt ="SELECT * FROM SALLE WHERE ID='"+numero+"'";
        ResultSet rs;
        Connexion con = new Connexion("root","root");
        
        try{
        rs = con.getstm().executeQuery(rqt);

        Salle x=new Salle();
        while(rs.next())
        {
               x.id=rs.getInt("ID");
               x.nom=rs.getString("NOM");
               x.type=rs.getString("Type");
        }
        return x;
    }catch(SQLException e){
        return null;
    }
    }
    
    public static Salle RechercherSalleParNom(String nom) {
        String rqt ="SELECT * FROM SALLE WHERE NOM='"+nom+"'";
        ResultSet rs;
        Connexion con = new Connexion("root","root");
        
        try{
        rs = con.getstm().executeQuery(rqt);

        Salle x=new Salle();
        while(rs.next())
        {
               x.id=rs.getInt("ID");
               x.nom=rs.getString("NOM");
               x.type=rs.getString("Type");
        }
        return x;
    }catch(SQLException e){
        return null;
    }
    }
    
    public static Salle[] RechercherSalleParType(String type){
        Connexion con = new Connexion("root","root");
        ResultSet rs=null;
        int i=0;
        String rqt="SELECT * FROM SALLE WHERE TYPE='"+type+"'";
        
        
        try {
            rs = con.getstm().executeQuery(rqt); 
            while (rs.next()){
            i++;
            }
            rs.close();
            
            rs = con.getstm().executeQuery(rqt); 
            Salle[] e = new Salle[i];
            i=0;
            while (rs.next()){
                Salle x = new Salle();
                x.id=rs.getInt("ID");
                x.nom=rs.getString("NOM");
                x.type=rs.getString("TYPE"); 
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
    
    
    public static Salle[] AfficherSalles() {
        Connexion con = new Connexion("root","root");
        ResultSet rs = null;
        int i=0;    
        String rqt ="SELECT * FROM SALLE";       
        try {
            rs=con.getstm().executeQuery(rqt);
            while(rs.next()){
            i++;
            }
            rs.close();
            
            rs =con.getstm().executeQuery(rqt); 
            Salle[] e=new Salle[i];
            i=0;
            while (rs.next()){
                Salle x = new Salle();
                x.id=rs.getInt("ID");
                x.nom=rs.getString("NOM");
                x.type=rs.getString("Type");               
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
