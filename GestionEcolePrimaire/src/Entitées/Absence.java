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
public class Absence {
    private Eleve eleve;
    private String date;
    private String periode;

    public Absence() {
    }

    public Absence(Eleve eleve, String date, String periode) {
        this.eleve = eleve;
        this.date = date;
        this.periode = periode;
    }

    public Eleve getEleve() {
        return eleve;
    }

    public void setEleve(Eleve eleve) {
        this.eleve = eleve;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPeriode() {
        return periode;
    }

    public void setPeriode(String periode) {
        this.periode = periode;
    }

    
    
    public boolean AjouterAbsence() 
    {
        Connexion con = new Connexion("root","root");
        String rqt="INSERT INTO ABSENCE VALUES("+getEleve().getId()+",'"+getDate()+"','"+getPeriode()+"')";
             try {
                con.getstm().executeQuery(rqt);
            return true;
       
           
             } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
    
    public boolean ModifierAbsence(int elv,String dt){
        Connexion con = new Connexion("root","root");
        String rqt="UPDATE ABSENCE SET ID='"+elv+"',\"DATE\"='"+dt+"',PERIODE='"+getPeriode()+"' WHERE ID='"+elv+"' AND \"DATE\"='"+dt+"'";
        try {
            con.getstm().executeQuery(rqt);
            con.getstm().close();
            
            return true;
        } 
        catch (SQLException ex) {
          System.out.println(ex.getMessage());
            return false;}    

        }
    
    public static Absence ChargerAbsence(int numero,String date) {
        String rqt ="SELECT * FROM ABSENCE WHERE ID='"+numero+"' AND DATE='"+date+"'";
        ResultSet rs;
        Connexion con = new Connexion("root","root");
        
        try{
        rs = con.getstm().executeQuery(rqt);

        Absence x=new Absence();
        while(rs.next())
        {
               x.eleve=Eleve.ChargerEleve(rs.getInt("ID"));
               x.date=rs.getString("DATE");
               x.periode=rs.getString("PERIODE");
        }
        return x;
    }catch(SQLException e){
        return null;
    }
    }
    
    public static Absence[] ChargerAbsencesEleve(int num) {
        Connexion con = new Connexion("root","root");
        ResultSet rs = null;
        int i=0;    
        String rqt ="SELECT * FROM ABSENCE WHERE ID='"+num+"'";       
        try {
            rs=con.getstm().executeQuery(rqt);
            while(rs.next()){
            i++;
            }
            rs.close();
            
            rs =con.getstm().executeQuery(rqt); 
            Absence[] e=new Absence[i];
            i=0;
            while (rs.next()){
                Absence x = new Absence();
                x.eleve=Eleve.ChargerEleve(rs.getInt("ID"));
                x.date=rs.getString("DATE");
                x.periode=rs.getString("PERIODE");
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
    
    public static Absence[] AfficherAbsences(int cls,String dt) {
        Connexion con = new Connexion("root","root");
        ResultSet rs = null;
        int i=0;    
        String rqt ="SELECT * FROM ABSENCE";       
        try {
            rs=con.getstm().executeQuery(rqt);
            while(rs.next()){
            i++;
            }
            rs.close();
            
            rs =con.getstm().executeQuery(rqt); 
            Absence[] e=new Absence[i];
            i=0;
            while (rs.next()){
                Absence x = new Absence();
                x.eleve=Eleve.ChargerEleve(rs.getInt("ID"));
                x.date=rs.getString("DATE");
                x.periode=rs.getString("PERIODE");
                if(Eleve.ChargerClasseEleve(x.eleve.getId())==cls && x.date.equals(dt))
                {e[i]= x;               
                i++;}
        }
        
        rs.close();
        if(i==0)
            return null;
        return e;
           
        } catch (SQLException ex) {
            return null;
        }
    }
    
    public static boolean SupprimerAbsence(int numero,String dt){
        Connexion con = new Connexion("root","root");
        String rqt="DELETE FROM ABSENCE WHERE ID='"+numero+"' AND \"DATE\"='"+dt+"'";
        try {
            con.getstm().executeQuery(rqt);
            con.getstm().close();
            return true;
        } 
        catch (SQLException ex) {
          System.out.println(ex.getMessage());
        return false;}
    }
    
    
}
