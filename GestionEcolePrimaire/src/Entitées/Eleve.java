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
public class Eleve {
private int id;    
private String nom; 
private String prenom;
private String dateN;   
private String sexe;   
private String pays;
private String ville;
private String adresse;
private int codePostal;
private String niveau;

private String nomRes;
private String prenomRes;
private String professionRes;
private String relation;
private String adresseRes;
private int codePostalRes;
private int telephoneRes;
private String emailRes;
private int NCINRes;

        
        
    public Eleve(int id,String nom, String prenom, String dateN, String sexe, String pays, String ville, String adresse, int codePostal, String niveau, int NCINRes, String nomRes, String prenomRes, String professionRes, String relation, String adresseRes, int codePostalRes, int telephoneRes, String emailRes) {
        this.id=id;
        this.nom = nom;
        this.prenom = prenom;
        this.dateN = dateN;
        this.sexe = sexe;
        this.pays = pays;
        this.ville = ville;
        this.adresse = adresse;
        this.codePostal = codePostal;
        this.niveau = niveau;
        this.nomRes = nomRes;
        this.prenomRes = prenomRes;
        this.professionRes = professionRes;
        this.relation = relation;
        this.adresseRes = adresseRes;
        this.codePostalRes = codePostalRes;
        this.telephoneRes = telephoneRes;
        this.emailRes = emailRes;
        this.NCINRes = NCINRes;
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

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getDateN() {
        return dateN;
    }

    public void setDateN(String dateN) {
        this.dateN = dateN;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
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

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    public String getNomRes() {
        return nomRes;
    }

    public void setNomRes(String nomRes) {
        this.nomRes = nomRes;
    }

    public String getPrenomRes() {
        return prenomRes;
    }

    public void setPrenomRes(String prenomRes) {
        this.prenomRes = prenomRes;
    }

    public String getProfessionRes() {
        return professionRes;
    }

    public void setProfessionRes(String professionRes) {
        this.professionRes = professionRes;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public String getAdresseRes() {
        return adresseRes;
    }

    public void setAdresseRes(String adresseRes) {
        this.adresseRes = adresseRes;
    }

    public int getCodePostalRes() {
        return codePostalRes;
    }

    public void setCodePostalRes(int codePostalRes) {
        this.codePostalRes = codePostalRes;
    }

    public int getTelephoneRes() {
        return telephoneRes;
    }

    public void setTelephoneRes(int telephoneRes) {
        this.telephoneRes = telephoneRes;
    }

    public String getEmailRes() {
        return emailRes;
    }

    public void setEmailRes(String emailRes) {
        this.emailRes = emailRes;
    }

    public int getNCINRes() {
        return NCINRes;
    }

    public void setNCINRes(int NCINRes) {
        this.NCINRes = NCINRes;
    }
    
       
    public Eleve(){
    }

    public boolean AjouterEleve()
    {Connexion con = new Connexion("root","root");
        String rqt; 
    rqt = "INSERT INTO ELEVE VALUES('"+"0"+"','"+getNom()+"','"+getPrenom()+"','"+getDateN()+"','"+getSexe()+"','"+getPays()+"','"+getVille()+"','"+getAdresse()+"','"+getCodePostal()+"','"+getNiveau()+"','"+getNCINRes()+"','"+getNomRes()+"','"+getPrenomRes()+"','"+getProfessionRes()+"','"+getRelation()+"','"+getAdresse()+"','"+getCodePostalRes()+"','"+getTelephoneRes()+"','"+getEmailRes()+"',"+null+")";
        try {
                con.getstm().executeQuery(rqt);
            return true;
           
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
        
    }   
    
    
    public boolean ModifierEleve(int id){
        Connexion con = new Connexion("root","root");
        String rqt="UPDATE ELEVE SET ID ='"+getId()+"',NOM='"+getNom()+"',PRENOM='"+getPrenom()+"',DATENAIS='"+getDateN()+"',SEXE='"+getSexe()+"',PAYS='"+getPays()+"',VILLE='"+getVille()+"',ADRESSE='"+getAdresse()+"',CODEPOSTAL='"+getCodePostal()+"',NIVEAU='"+getNiveau()+"',NCINRES='"+getNCINRes()+"',NOMRES='"+getNomRes()+"',PRENOMRES='"+getPrenomRes()+"',PROFESSIONRES='"+getProfessionRes()+"',RELATION='"+getRelation()+"',ADRESSERES='"+getAdresseRes()+"',TELEPHONERES='"+getTelephoneRes()+"',EMAILRES='"+getEmailRes()+"' WHERE ID='"+id+"'";
        try {
            con.getstm().executeQuery(rqt);
            con.getstm().close();
            return true;
        } 
        catch (SQLException ex) {
          System.out.println(ex.getMessage());
            return false;}
        }
    
    public static boolean SupprimerEleve(int numero){
        String rqt="DELETE FROM ELEVE WHERE ID ='"+numero+"'";
        Connexion con = new Connexion("root","root");
        try {
            con.getstm().executeQuery(rqt);
            con.getstm().close();
            return true;
        } 
        catch (SQLException ex) {
          System.out.println(ex.getMessage());
            return false;}
        }
    
    public static int ChargerClasseEleve(int numero) {
        String rqt ="SELECT * FROM ELEVE WHERE ID='"+numero+"'";
        ResultSet rs;
         
        Connexion con = new Connexion("root","root");
        
        try{
        rs = con.getstm().executeQuery(rqt);

        int x=0;
        while(rs.next())
        {
             x=rs.getInt("CLASSE");
        }
        return x;
    }catch(SQLException e){
        return 0;
    }
    }
    
    public static Eleve ChargerEleve(int numero) {
        String rqt ="SELECT * FROM ELEVE WHERE ID='"+numero+"'";
        ResultSet rs;
        Connexion con = new Connexion("root","root");
        
        try{
        rs = con.getstm().executeQuery(rqt);

        Eleve x=new Eleve();
        while(rs.next())
        {
                x.id=rs.getInt("ID");
                x.nom=rs.getString("NOM");
                x.prenom=rs.getString("PRENOM");
                x.dateN=rs.getString("DATENAIS");
                x.sexe=rs.getString("SEXE");
                x.pays=rs.getString("PAYS");
                x.ville=rs.getString("VILLE");
                x.adresse=rs.getString("ADRESSE");
                x.codePostal=rs.getInt("CODEPOSTAL");
                x.niveau=rs.getString("NIVEAU");
                x.NCINRes=rs.getInt("NCINRES");
                x.nomRes=rs.getString("NOMRES");
                x.prenomRes=rs.getString("PRENOMRES");
                x.professionRes=rs.getString("PROFESSIONRES");
                x.relation=rs.getString("RELATION");
                x.adresseRes=rs.getString("ADRESSERES");
                x.codePostalRes=rs.getInt("CODEPOSTALRES");
                x.telephoneRes=rs.getInt("TELEPHONERES");
                x.emailRes=rs.getString("EMAILRES");
        }
        return x;
    }catch(SQLException e){
        return null;
    }
    }
     
    public static Eleve[] RechercherEleveParNom(String nom){
        ResultSet rs=null;
        Connexion con = new Connexion("root","root");
        int i=0;
        String rqt="select * from eleve where nom='"+nom+"'";
        
        
        try {
            rs = con.getstm().executeQuery(rqt); 
            while (rs.next()){
            i++;
            }
            rs.close();
            
            rs = con.getstm().executeQuery(rqt); 
            Eleve[] e=new Eleve[i];
            i=0;
            while (rs.next()){
                Eleve x = new Eleve();
                x.id=rs.getInt("ID");
                x.nom=rs.getString("NOM");
                x.prenom=rs.getString("PRENOM");
                x.dateN=rs.getString("DATENAIS");
                x.sexe=rs.getString("SEXE");
                x.pays=rs.getString("PAYS");
                x.ville=rs.getString("VILLE");
                x.adresse=rs.getString("ADRESSE");
                x.codePostal=rs.getInt("CODEPOSTAL");
                x.niveau=rs.getString("NIVEAU");
                x.NCINRes=rs.getInt("NCINRES");
                x.nomRes=rs.getString("NOMRES");
                x.prenomRes=rs.getString("PRENOMRES");
                x.professionRes=rs.getString("PROFESSIONRES");
                x.relation=rs.getString("RELATION");
                x.adresseRes=rs.getString("ADRESSERES");
                x.codePostalRes=rs.getInt("CODEPOSTALRES");
                x.telephoneRes=rs.getInt("TELEPHONERES");
                x.emailRes=rs.getString("EMAILRES");
                e[i]=x;
                i++;

        }
        rs.close();
        if(i==0)
            
        return null;
        else
            System.out.print(e.length);
            return e;
           
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
            return null;
        }
         
        
    
    }

    
    public static Eleve[] RechercherEleveParPrenom(String prenom){
        ResultSet rs=null;
        int i=0;
        String rqt="select * from eleve where prenom='"+prenom+"'";
        Connexion con = new Connexion("root","root");
        
        try {
            rs = con.getstm().executeQuery(rqt); 
            while (rs.next()){
            i++;
            }
            rs.close();
            
            rs = con.getstm().executeQuery(rqt); 
            Eleve[] e = new Eleve[i];
            i=0;
            while (rs.next()){
                Eleve x = new Eleve();
                x.id=rs.getInt("ID");
                x.nom=rs.getString("NOM");
                x.prenom=rs.getString("PRENOM");
                x.dateN=rs.getString("DATENAIS");
                x.sexe=rs.getString("SEXE");
                x.pays=rs.getString("PAYS");
                x.ville=rs.getString("VILLE");
                x.adresse=rs.getString("ADRESSE");
                x.codePostal=rs.getInt("CODEPOSTAL");
                x.niveau=rs.getString("NIVEAU");
                x.NCINRes=rs.getInt("NCINRES");
                x.nomRes=rs.getString("NOMRES");
                x.prenomRes=rs.getString("PRENOMRES");
                x.professionRes=rs.getString("PROFESSIONRES");
                x.relation=rs.getString("RELATION");
                x.adresseRes=rs.getString("ADRESSERES");
                x.codePostalRes=rs.getInt("CODEPOSTALRES");
                x.telephoneRes=rs.getInt("TELEPHONERES");
                x.emailRes=rs.getString("EMAILRES");
                e[i]=x;
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
    
    
 public static Eleve[] AfficherEleves() {
    
        ResultSet rs = null;
        int i=0;    
        String rqt ="select * from eleve";
        Connexion con = new Connexion("root","root");
        try {
            rs=con.getstm().executeQuery(rqt);
            while (rs.next()){
                i++;
            }
            rs.close();
            
            rs = con.getstm().executeQuery(rqt); 
            Eleve[] e=new Eleve[i];
            i=0;
            while (rs.next()){
                Eleve x = new Eleve();
                x.id=rs.getInt("ID");
                x.nom=rs.getString("NOM");
                x.prenom=rs.getString("PRENOM");
                x.dateN=rs.getString("DATENAIS");
                x.sexe=rs.getString("SEXE");
                x.pays=rs.getString("PAYS");
                x.ville=rs.getString("VILLE");
                x.adresse=rs.getString("ADRESSE");
                x.codePostal=rs.getInt("CODEPOSTAL");
                x.niveau=rs.getString("NIVEAU");
                x.NCINRes=rs.getInt("NCINRES");
                x.nomRes=rs.getString("NOMRES");
                x.prenomRes=rs.getString("PRENOMRES");
                x.professionRes=rs.getString("PROFESSIONRES");
                x.relation=rs.getString("RELATION");
                x.adresseRes=rs.getString("ADRESSERES");
                x.codePostalRes=rs.getInt("CODEPOSTALRES");
                x.telephoneRes=rs.getInt("TELEPHONERES");
                x.emailRes=rs.getString("EMAILRES");
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
 
     public static Eleve[] RechercherEleveParNIVEAU(String niv){
        ResultSet rs=null;
        Connexion con = new Connexion("root","root");
        int i=0;
        String rqt="select * from eleve where niveau='"+niv+"'";
        
        
        try {
            rs = con.getstm().executeQuery(rqt); 
            while (rs.next()){
            i++;
            }
            rs.close();
            
            rs = con.getstm().executeQuery(rqt); 
            Eleve[] e=new Eleve[i];
            i=0;
            while (rs.next()){
                Eleve x = new Eleve();
                x.setId(rs.getInt("ID"));
                x.setNom(rs.getString("NOM"));
                x.setPrenom(rs.getString("PRENOM"));
                x.setDateN(rs.getString("DATENAIS"));
                x.setSexe(rs.getString("SEXE"));
                x.setPays(rs.getString("PAYS"));
                x.setVille(rs.getString("VILLE"));
                x.setAdresse(rs.getString("ADRESSE"));
                x.setCodePostal(rs.getInt("CODEPOSTAL"));
                x.setNiveau(rs.getString("NIVEAU"));
                x.setNCINRes(rs.getInt("NCINRES"));
                x.setNomRes(rs.getString("NOMRES"));
                x.setPrenomRes(rs.getString("PRENOMRES"));
                x.setProfessionRes(rs.getString("PROFESSIONRES"));
                x.setRelation(rs.getString("RELATION"));
                x.setAdresseRes(rs.getString("ADRESSERES"));
                x.setCodePostalRes(rs.getInt("CODEPOSTALRES"));
                x.setTelephoneRes(rs.getInt("TELEPHONERES"));
                x.setEmailRes(rs.getString("EMAILRES"));
                e[i]=x;
                i++;

        }
        rs.close();
        if(i==0) 
        return null;
        else
            return e;
           
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
            return null;
        }  
    }
    
    
    public static Eleve[] RechercherEleveParClasse(int id){
        ResultSet rs=null;
        Connexion con = new Connexion("root","root");
        int i=0;
        String rqt="SELECT * FROM ELEVE WHERE CLASSE ='"+id+"'";
        
        
        try {
            rs = con.getstm().executeQuery(rqt); 
            while (rs.next()){
            i++;
            }
            rs.close();
            
            rs = con.getstm().executeQuery(rqt); 
            Eleve[] e=new Eleve[i];
            i=0;
            while (rs.next()){
                Eleve x = new Eleve();
                x.setId(rs.getInt("ID"));
                x.setNom(rs.getString("NOM"));
                x.setPrenom(rs.getString("PRENOM"));
                x.setDateN(rs.getString("DATENAIS"));
                x.setSexe(rs.getString("SEXE"));
                x.setPays(rs.getString("PAYS"));
                x.setVille(rs.getString("VILLE"));
                x.setAdresse(rs.getString("ADRESSE"));
                x.setCodePostal(rs.getInt("CODEPOSTAL"));
                x.setNiveau(rs.getString("NIVEAU"));
                x.setNCINRes(rs.getInt("NCINRES"));
                x.setNomRes(rs.getString("NOMRES"));
                x.setPrenomRes(rs.getString("PRENOMRES"));
                x.setProfessionRes(rs.getString("PROFESSIONRES"));
                x.setRelation(rs.getString("RELATION"));
                x.setAdresseRes(rs.getString("ADRESSERES"));
                x.setCodePostalRes(rs.getInt("CODEPOSTALRES"));
                x.setTelephoneRes(rs.getInt("TELEPHONERES"));
                x.setEmailRes(rs.getString("EMAILRES"));
                e[i]=x;
                i++;

        }
        rs.close();
        if(i==0) 
        return null;
        else
            return e;
           
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
            return null;
        }

    }
    
    
    
        
    
   
   
}
    
