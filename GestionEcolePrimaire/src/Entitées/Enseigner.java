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
public class Enseigner {
    private int id;
    private Instituteur inst;
    private Matiere mat;

    public Enseigner() {
    }

    public Enseigner(int id, Instituteur inst, Matiere mat) {
        this.id = id;
        this.inst = inst;
        this.mat = mat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Matiere getMat() {
        return mat;
    }

    public Instituteur getInst() {
        return inst;
    }

    public void setInst(Instituteur inst) {
        this.inst = inst;
    }

    public void setMat(Matiere mat) {
        this.mat= mat;
    }

    
    
    public boolean AjouterEnseigner() 
    {
        Connexion con = new Connexion("root","root");
        String rqt="INSERT INTO ENSEIGNER VALUES('"+0+"','"+getInst().getNCIN()+"','"+getMat().getId()+"')";
             try {
                con.getstm().executeQuery(rqt);
            return true;
       
           
             } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
    
    public static boolean SupprimerTTEnseigner(int inst){
        Connexion con = new Connexion("root","root");
        String rqt="DELETE FROM ENSEIGNER WHERE NCIN ='"+inst+"'";
        try {
            con.getstm().executeQuery(rqt);
            con.getstm().close();
            return true;
        } 
        catch (SQLException ex) {
          System.out.println(ex.getMessage());
        return false;}
    }
    
    public static Enseigner ChargerEnseignerParId(int id) {
        String rqt ="SELECT * FROM ENSEIGNER WHERE ID='"+id+"'";
        ResultSet rs;
        Connexion con = new Connexion("root","root");
        
        try{
        rs = con.getstm().executeQuery(rqt);

        Enseigner x=new Enseigner();
        while(rs.next())
        {
               x.id=rs.getInt("ID");
               x.inst=Instituteur.ChargerInstituteur(rs.getInt("NCIN"));
               x.mat=Matiere.ChargerMatiere(rs.getInt("MAT"));
        }
        return x;
    }catch(SQLException e){
        return null;
    }
    }
    
    public static Enseigner ChargerEnseigner(int inst,int mat) {
        String rqt ="SELECT * FROM ENSEIGNER WHERE NCIN='"+inst+"' AND MAT='"+mat+"'";
        ResultSet rs;
        Connexion con = new Connexion("root","root");
        
        try{
        rs = con.getstm().executeQuery(rqt);

        Enseigner x=new Enseigner();
        while(rs.next())
        {
               x.id=rs.getInt("ID");
               x.inst=Instituteur.ChargerInstituteur(rs.getInt("NCIN"));
               x.mat=Matiere.ChargerMatiere(rs.getInt("MAT"));
        }
        return x;
    }catch(SQLException e){
        return null;
    }
    }
    
     public static Enseigner[] RechercherEnseignerParInst(int ncin){
        Connexion con = new Connexion("root","root");
        ResultSet rs=null;
        int i=0;
        String rqt="SELECT * FROM ENSEIGNER WHERE NCIN='"+ncin+"'";
        
        
        try {
            rs = con.getstm().executeQuery(rqt); 
            while (rs.next()){
            i++;
            }
            rs.close();
            
            rs = con.getstm().executeQuery(rqt); 
            Enseigner[] e = new Enseigner[i];
            i=0;
            while (rs.next()){
                Enseigner x = new Enseigner();
                x.id=rs.getInt("ID");
                x.inst=Instituteur.ChargerInstituteur(rs.getInt("NCIN"));
                x.mat=Matiere.ChargerMatiere(rs.getInt("MAT")); 
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
