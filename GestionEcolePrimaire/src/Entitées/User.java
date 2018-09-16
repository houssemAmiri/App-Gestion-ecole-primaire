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
public class User {
    private String username;
    private String password ;
    private String nom,prenom,email;
    private String acces;

    public User() {
    }

    public User(String username, String password, String nom, String prenom, String email, String acces) {
        this.username = username;
        this.password = password;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.acces = acces;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAcces() {
        return acces;
    }

    public void setAcces(String acces) {
        this.acces = acces;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    

    public boolean AjouterUser(){
        Connexion con = new Connexion("root","root");
        String rqt; 
        rqt = "INSERT INTO USERS VALUES('"+getUsername()+"','"+getPassword()+"','"+getNom()+"','"+getPrenom()+"','"+getAcces()+"','"+getEmail()+"')";
        try {
                con.getstm().executeQuery(rqt);
            return true;
           
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }  
    } 
    
    public boolean ModifierUser(String util){
        Connexion con = new Connexion("root","root");
        String rqt="UPDATE USERS SET USERNAME='"+getUsername()+"',PASSWORD='"+getPassword()+"',NOM='"+getNom()+"',PRENOM='"+getPrenom()+"',ACCES='"+getAcces()+"',EMAIL='"+getEmail()+"' WHERE USERNAME='"+util+"'";
        try {
            con.getstm().executeQuery(rqt);
            con.getstm().close();
            return true;
        } 
        catch (SQLException ex) {
          System.out.println(ex.getMessage());
            return false;
        }
    }
    
    public boolean ModifierMP(String pass){
        Connexion con = new Connexion("root","root");
        String rqt="UPDATE USERS SET PASSWORD='"+pass+"' WHERE USERNAME='"+getUsername()+"'";
        try {
            con.getstm().executeQuery(rqt);
            con.getstm().close();
            return true;
        } 
        catch (SQLException ex) {
          System.out.println(ex.getMessage());
            return false;
        }
    }
    
    public static boolean SupprimerUser(String util){
        String rqt="DELETE FROM USERS WHERE USERNAME ='"+util+"'";
        Connexion con = new Connexion("root","root");
        try {
            con.getstm().executeQuery(rqt);
            con.getstm().close();
            return true;
        } 
        catch (SQLException ex) {
          System.out.println(ex.getMessage());
            return false;
        }
    }
    
    public static User ChargerUser(String util) {
        String rqt ="SELECT * FROM USERS WHERE USERNAME='"+util+"'";
        ResultSet rs;
        Connexion con = new Connexion("root","root");
        
        try{
        rs = con.getstm().executeQuery(rqt);

        User x=new User();
        while(rs.next())
        {
                x.username=rs.getString("USERNAME");
                x.password=rs.getString("PASSWORD");
                x.nom=rs.getString("NOM");
                x.prenom=rs.getString("PRENOM");
                x.acces=rs.getString("ACCES");
                x.email=rs.getString("EMAIL");
                        
        }
        return x;
    }catch(SQLException e){
        return null;}
    }
    
    public static User ChargerUserParEmail(String mail) {
        String rqt ="SELECT * FROM USERS WHERE EMAIL='"+mail+"'";
        ResultSet rs;
        Connexion con = new Connexion("root","root");
        
        try{
        rs = con.getstm().executeQuery(rqt);

        User x=new User();
        while(rs.next())
        {
                x.username=rs.getString("USERNAME");
                x.password=rs.getString("PASSWORD");
                x.nom=rs.getString("NOM");
                x.prenom=rs.getString("PRENOM");
                x.acces=rs.getString("ACCES");
                x.email=rs.getString("EMAIL");
                        
        }
        return x;
    }catch(SQLException e){
        return null;}
    }
    
    public static User[] ChargerParNom(String nom) {
    
        ResultSet rs = null;
        int i=0;    
        String rqt ="SELECT * FROM USERS WHERE NOM='"+nom+"'";
        Connexion con = new Connexion("root","root");
        try {
            rs=con.getstm().executeQuery(rqt);
            while (rs.next()){
                i++;
            }
            rs.close();
            
            rs = con.getstm().executeQuery(rqt); 
            User[] e=new User[i];
            i=0;
            while (rs.next()){
                User x = new User();
                x.username=rs.getString("USERNAME");
                x.password=rs.getString("PASSWORD");
                x.nom=rs.getString("NOM");
                x.prenom=rs.getString("PRENOM");
                x.acces=rs.getString("ACCES");
                x.email=rs.getString("EMAIL");
                
                e[i]= x;
                i++;
                
            }
            
            
            rs.close();
            if(i==0)
                return null;
            return e;
            
        } catch (SQLException ex) {
            System.out.print(ex);
        }
        return null;
    }
    
    public static User[] AfficherUsers() {
    
        ResultSet rs = null;
        int i=0;    
        String rqt ="SELECT * FROM USERS";
        Connexion con = new Connexion("root","root");
        try {
            rs=con.getstm().executeQuery(rqt);
            while (rs.next()){
                i++;
            }
            rs.close();
            
            rs = con.getstm().executeQuery(rqt); 
            User[] e=new User[i];
            i=0;
            while (rs.next()){
                User x = new User();
                x.username=rs.getString("USERNAME");
                x.password=rs.getString("PASSWORD");
                x.nom=rs.getString("NOM");
                x.prenom=rs.getString("PRENOM");
                x.acces=rs.getString("ACCES");
                x.email=rs.getString("EMAIL");
                
                e[i]= x;
                i++;
                
            }
            
            
            rs.close();
            if(i==0)
                return null;
            return e;
            
        } catch (SQLException ex) {
            System.out.print(ex);
        }
        return null;
    }
    
    public static User[] ChargerParPrenom(String pre) {
    
        ResultSet rs = null;
        int i=0;    
        String rqt ="SELECT * FROM USERS WHERE PRENOM='"+pre+"'";
        Connexion con = new Connexion("root","root");
        try {
            rs=con.getstm().executeQuery(rqt);
            while (rs.next()){
                i++;
            }
            rs.close();
            
            rs = con.getstm().executeQuery(rqt); 
            User[] e=new User[i];
            i=0;
            while (rs.next()){
                User x = new User();
                x.username=rs.getString("USERNAME");
                x.password=rs.getString("PASSWORD");
                x.nom=rs.getString("NOM");
                x.prenom=rs.getString("PRENOM");
                x.acces=rs.getString("ACCES");
                x.email=rs.getString("EMAIL");
                
                e[i]= x;
                i++;
                
            }
            
            
            rs.close();
            if(i==0)
                return null;
            return e;
            
        } catch (SQLException ex) {
            System.out.print(ex);
        }
        return null;
    } 
    
    
    
}
