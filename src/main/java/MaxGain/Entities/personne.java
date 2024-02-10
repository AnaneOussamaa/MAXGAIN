package MaxGain.Entities;

public class personne {
    private int id;
    private String nom,prenom,age;
    public personne(){

    }

    public personne(String nom, String prenom, String age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    public personne(int id, String nom, String prenom, String age) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getAge() {
        return age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "personne{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

}
