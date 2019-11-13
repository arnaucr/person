package people;

public class Person {
    int edad;
    String nom;
    String DNI;

    public Person(int edad, String nom, String DNI) {
        this.edad = edad;
        this.nom = nom;
        this.DNI = DNI;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    @Override
    public String toString() {
        return "Person{" +
                "edad=" + edad +
                ", nom='" + nom + '\'' +
                ", DNI='" + DNI + '\'' +
                '}';
    }
}
