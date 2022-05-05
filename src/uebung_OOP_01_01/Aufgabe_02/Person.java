package uebung_OOP_01_01.Aufgabe_02;

public class Person {

    private String nachname;
    private String vorname;
    private int alter;


    public Person(String nachname, String vorname, int alter) {
        this.nachname = nachname;
        this.vorname = vorname;
        this.alter = alter;
    }

    public Person() {this("Müller", "hans", 18); }

    public void printInformation(){System.out.println("%s, %s, %d", this.nachname, this.vorname, this.alter);
    }
}
