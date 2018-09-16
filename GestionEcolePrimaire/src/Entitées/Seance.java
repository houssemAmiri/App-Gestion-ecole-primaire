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
public class Seance {
    private Enseigner ens;
    private int jour;
    private String periode;
    private Salle salle;
    private Classe classe;

    public Seance() {
    }

    public Seance(Enseigner ens, int jour, String periode, Salle salle, Classe classe) {
        this.ens = ens;
        this.jour = jour;
        this.periode = periode;
        this.salle = salle;
        this.classe = classe;
    }

    public Enseigner getEns() {
        return ens;
    }

    public void setEns(Enseigner ens) {
        this.ens = ens;
    }

    public int getJour() {
        return jour;
    }

    public void setJour(int jour) {
        this.jour = jour;
    }

    public String getPeriode() {
        return periode;
    }

    public void setPeriode(String periode) {
        this.periode = periode;
    }

    public Salle getSalle() {
        return salle;
    }

    public void setSalle(Salle salle) {
        this.salle = salle;
    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }
    
    public boolean AjouterSeance(){
        Connexion con = new Connexion("root","root");
        String rqt="INSERT INTO SEANCE VALUES('"+getEns().getId()+"','"+getJour()+"','"+getPeriode()+"','"+getSalle().getId()+"','"+getClasse().getId()+"')";
             try {
                con.getstm().executeQuery(rqt);
            return true;
       
           
             } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
    
    public boolean ModifierSeance(int id,int jr,String per){
        Connexion con = new Connexion("root","root");
        String rqt="UPDATE SEANCE SET ID='"+getEns().getId()+"',JOUR='"+getJour()+"',PERIODE='"+getPeriode()+"',SALLE='"+getSalle().getId()+"',CLASSE='"+getClasse().getId()+"' WHERE PERIODE='"+per+"' AND JOUR='"+jr+"' AND ID='"+id+"'";
        try {
            con.getstm().executeQuery(rqt);
            con.getstm().close();
            return true;
        } 
        catch (SQLException ex) {
          System.out.println(ex.getMessage());
            return false;}
        }
    
    public boolean SupprimerSeance(int numero,int jr,String per){
        Connexion con = new Connexion("root","root");
        String rqt="DELETE FROM SEANCE WHERE ID ='"+numero+"' AND JOUR='"+jr+"' AND PERIODE='"+per+"'";
        try {
            con.getstm().executeQuery(rqt);
            con.getstm().close();
            return true;
        } 
        catch (SQLException ex) {
          System.out.println(ex.getMessage());
        return false;}
    }
    
    public boolean SupprimerTTSeance(int numero){
        Connexion con = new Connexion("root","root");
        String rqt="DELETE FROM SEANCE WHERE ID ='"+numero+"'";
        try {
            con.getstm().executeQuery(rqt);
            con.getstm().close();
            return true;
        } 
        catch (SQLException ex) {
          System.out.println(ex.getMessage());
        return false;}
    }
    
    public static Seance ChargerSeanceParClasse(int jr,String per,int cls) {
        Connexion con = new Connexion("root","root");
        String rqt="SELECT * FROM SEANCE WHERE PERIODE='"+per+"' AND JOUR='"+jr+"' AND CLASSE='"+cls+"'";
        ResultSet rs;              
        try{
        rs = con.getstm().executeQuery(rqt);

        Seance x=new Seance();
        while(rs.next())
        {
               x.ens=Enseigner.ChargerEnseignerParId(rs.getInt("ID"));
               x.jour=rs.getInt("JOUR");
               x.periode=rs.getString("PERIODE");
               x.salle=Salle.ChargerSalle(rs.getInt("SALLE"));
               x.classe=Classe.ChargerClasse(rs.getInt("CLASSE"));
        }
        return x;
    }catch(SQLException e){
        return null;
    }}
    
    public static Seance ChargerSeanceParSalle(int jr,String per,int sls) {
        Connexion con = new Connexion("root","root");
        String rqt="SELECT * FROM SEANCE WHERE PERIODE='"+per+"' AND JOUR='"+jr+"' AND SALLE='"+sls+"'";
        ResultSet rs;              
        try{
        rs = con.getstm().executeQuery(rqt);

        Seance x=new Seance();
        while(rs.next())
        {
               x.ens=Enseigner.ChargerEnseignerParId(rs.getInt("ID"));
               x.jour=rs.getInt("JOUR");
               x.periode=rs.getString("PERIODE");
               x.salle=Salle.ChargerSalle(rs.getInt("SALLE"));
               x.classe=Classe.ChargerClasse(rs.getInt("CLASSE"));
        }
        return x;
    }catch(SQLException e){
        return null;
    }}
    
    public static Seance ChargerSeanceParId(int id){
        Connexion con = new Connexion("root","root");
        ResultSet rs=null;
        String rqt="SELECT * FROM SEANCE WHERE ID='"+id+"'";
        
        
        try {  
            rs = con.getstm().executeQuery(rqt);
            Seance x = new Seance(); 
            while (rs.next()){
                
                x.ens=Enseigner.ChargerEnseignerParId(rs.getInt("ID"));
                x.jour=rs.getInt("JOUR");
                x.periode=rs.getString("PERIODE");
                x.salle=Salle.ChargerSalle(rs.getInt("SALLE"));
                x.classe=Classe.ChargerClasse(rs.getInt("CLASSE"));
        }
        return x;
           
        } catch (SQLException ex) {
            return null;
        }
    }
    
    public static Seance[] ChargerSeancesClasse(int cls) {
        Connexion con = new Connexion("root","root");
        ResultSet rs = null;
        int i=0;    
        String rqt ="SELECT * FROM SEANCE WHERE CLASSE='"+cls+"'";       
        try {
            rs=con.getstm().executeQuery(rqt);
            while(rs.next()){
            i++;
            }
            rs.close();
            
            rs =con.getstm().executeQuery(rqt); 
            Seance[] e=new Seance[i];
            i=0;
            while (rs.next()){
                Seance x=new Seance();
                x.ens=Enseigner.ChargerEnseignerParId(rs.getInt("ID"));
                x.jour=rs.getInt("JOUR");
                x.periode=rs.getString("PERIODE");
                x.salle=Salle.ChargerSalle(rs.getInt("SALLE"));
                x.classe=Classe.ChargerClasse(rs.getInt("CLASSE"));            
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
