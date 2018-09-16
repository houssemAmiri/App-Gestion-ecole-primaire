/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONNEXION;
   import java.sql.*;
/**
 *
 * @author Almia
 */
public class Connexion {
 
    Connection con;
    // Chemin du chargement de la pilote
    String urlPilote;//"oracle.jdbc.driver.Oracledriver";
    // Chemin d'accès à la base de donnée
    String urlBaseDonnees;//="jdbc:oracle:thin:@localhost:1521:xe";
    String username;
    String pwd;
    public Statement stm;
    
    public Connexion(String username,String pwd){
        // Chargement de pilote de connection
        // Connecter à la base de donnée
        this.urlPilote="oracle.jdbc.driver.Oracledriver";
        this.urlBaseDonnees="jdbc:oracle:thin:@localhost:1521:xe";
        this.username=username;
        this.pwd=pwd;
        try {
            Class.forName(urlPilote);
            System.out.println("Pilote chargée....");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage()); 
        }
        try {
            con=DriverManager.getConnection(urlBaseDonnees,this.username,this.pwd);
            stm=con.createStatement(); 
            //System.out.println("Connection à la base de donnée....");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
    }
    
    public Statement getstm(){
        return stm;
    }


    
  
}


   
