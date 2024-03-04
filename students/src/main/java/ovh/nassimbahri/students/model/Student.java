package ovh.nassimbahri.students.model;

import java.io.Serializable;

public class Student implements Serializable {

    private long matricule;
    private String nom;
    private String niveau;

    public long getMatricule() {
        return matricule;
    }

    public void setMatricule(long matricule) {
        this.matricule = matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    public Student(long matricule, String nom, String niveau) {
        this.matricule = matricule;
        this.nom = nom;
        this.niveau = niveau;
    }

    public Student() {
    }
}
