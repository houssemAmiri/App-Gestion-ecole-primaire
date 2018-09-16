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
public class Note {
    private Eleve elv;
    private Matiere mat;
    private int sem;
    private double note;
    
    public Note() {
    }

    public Note(Eleve elv, Matiere mat, int sem, double note) {
        this.elv = elv;
        this.mat = mat;
        this.sem = sem;
        this.note = note;
    }

    public Eleve getElv() {
        return elv;
    }

    public void setElv(Eleve elv) {
        this.elv = elv;
    }

    public Matiere getMat() {
        return mat;
    }

    public void setMat(Matiere mat) {
        this.mat = mat;
    }

    public int getSem() {
        return sem;
    }

    public void setSem(int sem) {
        this.sem = sem;
    }

    public double getNote() {
        return note;
    }

    public void setNote(double note) {
        this.note = note;
    }
    
    public boolean AjouterNote() 
    {
        Connexion con = new Connexion("root","root");
        String rqt="INSERT INTO NOTE VALUES('"+this.elv.getId()+"','"+this.mat.getId()+"','"+this.sem+"','"+this.note+"')";
             try {
                con.getstm().executeQuery(rqt);
            return true;
       
           
             } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
    
    public boolean ModifierNote(int elv,int mt,int sm){
        Connexion con = new Connexion("root","root");
        String rqt="UPDATE NOTE SET ELEVE ='"+this.elv.getId()+"',MATIERE='"+this.mat.getId()+"',SEMESTRE='"+this.sem+"',NOTE='"+this.note+"' WHERE ELEVE='"+elv+"' AND MATIERE='"+mt+"' AND SEMESTRE='"+sm+"'";
        try {
            con.getstm().executeQuery(rqt);
            con.getstm().close();
            return true;
        } 
        catch (SQLException ex) {
          System.out.println(ex.getMessage());
            return false;}
        }
    
    public static Note ChargerNoteParEleve(int elv,int sem,int mat) {
        String rqt ="SELECT * FROM NOTE WHERE ELEVE='"+elv+"' AND SEMESTRE='"+sem+"' AND MATIERE='"+mat+"'";
        ResultSet rs;
        Connexion con = new Connexion("root","root");
        
        try{
        rs = con.getstm().executeQuery(rqt);

        Note x=new Note();
        while(rs.next())
        {
               x.setElv(Eleve.ChargerEleve(rs.getInt("ELEVE")));
               x.setMat(Matiere.ChargerMatiere(rs.getInt("MATIERE")));
               x.setSem(rs.getInt("SEMESTRE"));
               x.setNote(rs.getDouble("NOTE"));
        }
        return x;
    }catch(SQLException e){
        return null;
    }
    }
    
    public static Note[] ChargerNoteParClasse(int cls,int sem) {
        Connexion con = new Connexion("root","root");
        ResultSet rs = null;
        int i=0;    
        String rqt ="SELECT * FROM NOTE";       
        try {
            rs=con.getstm().executeQuery(rqt);
            while(rs.next()){
            i++;
            }
            rs.close();
            
            rs =con.getstm().executeQuery(rqt); 
            Note[] e=new Note[i];
            i=0;
            while (rs.next()){
                Note x = new Note();
                x.setElv(Eleve.ChargerEleve(rs.getInt("ELEVE")));
                x.setMat(Matiere.ChargerMatiere(rs.getInt("MATIERE")));
                x.setSem(rs.getInt("SEMESTRE"));
                x.setNote(rs.getDouble("NOTE"));
                if(Eleve.ChargerClasseEleve(x.getElv().getId())==cls && x.getSem()==sem){
                e[i]= x;
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
    
}
