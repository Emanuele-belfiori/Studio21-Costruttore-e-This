public class Main {
    public static void main(String[] args) {
        System.out.println("Costruttore");
        System.out.println();

        /*
        * COSTRUTTORE:
        *
        * - Cos'è un costruttore?
        *
        * - Creiamone uno
        *
        * - Parola chiave this
         */

/*------------------------------------------------------------------------------------------------------*/

        // COS'É IL COSTRUTTORE?:
        /*
        Il costruttore riassunto in modo metaforico è creare una pagina bianca con degli attributi
        all'interno ad esempio di una classe chiamata Persona, ma con la possibilità di poter inserire
        noi i parametri di questi attributi ad esempio creando più persone.
        Come si intuisce a differenza del metodo richiamato senza avere il costruttore alle spalle, dove sì,
        possiamo creare molteplici persone, ma con dei parametri fissi e preimpostati per ogni nuova persona
        creata, può essere utile ma non sempre.
        Potremmo dover o voler inserire dei parametri diversi dei: nome, cognome ed età ad ogni creazione
        di una persona nuova e questo lo faremo per mezzo del costruttore.
        NELLA CLASSE PERSONA VERRà DESCRITTO COME CREARLO!
        INOLTRE VERRÀ SPIEGATO IL THIS!
         */

/*-------------------------------------------------------------------------------------------------------*/

        // COMPILAZIONE (inserimento parametri) DOPO LA CREAZIONE DELL'OGGETTO:
        /*
        Dopo la creazione dell'oggetto, all'interno delle parentesi in ordine come impostato nel costruttore,
        inseriremo i valori dei singoli parametri (passando il puntatore all'interno delle parentesi, ci verrà
        proposto a video l'inserimento con i valori che abbiamo assegnato agli attributi) se string ("") per
        i valori numerici e sufficiente inserire solo i numeri, dopo ogni valore inserito, dobbiamo in modo
        categorico separarli con virgola ("Luca", 30);
         */

        Persona persona1 = new Persona("Emanuele", "Belfiori", 42, "Viola");
        System.out.println(persona1.nome + " " + persona1.cognome);
        Persona persona2 = new Persona("Jose", "Monella", 41, "Rosa");
        System.out.println(persona2.nome + " " + persona2.cognome);
        // Come potete notare a video dopo la stampa appariranno due persone con identità diverse
    }
}