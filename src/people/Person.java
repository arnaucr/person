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

    /*


    _______      ____        _______ ,---------.   ___    _    .-'''-.          _______   .-------.       ____    ,---.   .--.    _______   .---.  .---.
   /   __  \   .'  __ `.    /   __  \\          \.'   |  | |  / _     \        \  ____  \ |  _ _   \    .'  __ `. |    \  |  |   /   __  \  |   |  |_ _|
  | ,_/  \__) /   '  \  \  | ,_/  \__)`--.  ,---'|   .'  | | (`' )/`--'        | |    \ | | ( ' )  |   /   '  \  \|  ,  \ |  |  | ,_/  \__) |   |  ( ' )
,-./  )       |___|  /  |,-./  )         |   \   .'  '_  | |(_ o _).           | |____/ / |(_ o _) /   |___|  /  ||  |\_ \|  |,-./  )       |   '-(_{;}_)
\  '_ '`)        _.-`   |\  '_ '`)       :_ _:   '   ( \.-.| (_,_). '.         |   _ _ '. | (_,_).' __    _.-`   ||  _( )_\  |\  '_ '`)     |      (_,_)
 > (_)  )  __ .'   _    | > (_)  )  __   (_I_)   ' (`. _` /|.---.  \  :        |  ( ' )  \|  |\ \  |  |.'   _    || (_ o _)  | > (_)  )  __ | _ _--.   |
(  .  .-'_/  )|  _( )_  |(  .  .-'_/  ) (_(=)_)  | (_ (_) _)\    `-'  |        | (_{;}_) ||  | \ `'   /|  _( )_  ||  (_,_)\  |(  .  .-'_/  )|( ' ) |   |
 `-'`-'     / \ (_ o _) / `-'`-'     /   (_I_)    \ /  . \ / \       /         |  (_,_)  /|  |  \    / \ (_ o _) /|  |    |  | `-'`-'     / (_{;}_)|   |
   `._____.'   '.(_,_).'    `._____.'    '---'     ``-'`-''   `-...-'          /_______.' ''-'   `'-'   '.(_,_).' '--'    '--'   `._____.'  '(_,_) '---'



     */

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
