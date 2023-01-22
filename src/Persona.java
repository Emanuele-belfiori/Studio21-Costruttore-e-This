public class Persona {

    // CLSSE CRETA: ORA LAVORIAMO SULLA CLASSE PERSONA INSERENDO LE CARATTERISTICHE

    // Attributi ma solo dichiarati = caratteristiche della classe
    String nome;
    String cognome;
    int eta;
    String coloPreferito;

/*-------------------------------------------------------------------------------------------------------*/

    // COME SI CREA IL COSTRUTTORE:
    /*
    Per creare il costruttore ci sono 3 modi il 4 modo è il costruttore di default che crea in automatico Java:

    1-) Il primo modo e quello di scriverlo noi lasciandolo vuoto e inserendo a nostra volta i parametri
        al suo interno, MA COSÌ FACENDO SI PERDEREBBE IL FINE DELLA PROGRAMMAZIONE AD OGGETTI.

    2-) Secondo modo scriverlo noi e passando all'interno delle parentesi () gli attributi che verranno poi
        passati in fase di richiamo nel Main per attribuire dei valori, così da dare valori diversi ad ogni
        persona che vogliamo creare.

    3-) Il terzo modo è quello di creare il costruttore in modo automatico attraverso le opzioni che Java ci
        mette a disposizione: mettiamo il cursore in una nuova riga sotto gli attributi che abbiamo dichiarato
        clicchiamo il tasto destro del mouse, clicchiamo sull'opzione generate (genera) e poi clicchiamo su
        constructor (costruttore); ci verrà poi chiesto quali attributi vogliamo che il costruttore inserisca
        al suo interno nella lista che appare.
        Abbiamo svariate scelte:
        1- lasciarlo vuoto cliccando sul pallino azzurro con il nome della classe.
        2- Prenderne uno o più a nostra scelta (con ctrl possiamo scegliere quali aggiungere)
        3- Volendo prenderli tutti si puo anche utilizzare il tasto shift selezionandoli tutti.
        in automatico verrà generato il costruttore con tutti parametri inseriti e naturalmente con public
        davanti al nome del costruttore, spiegheremo in futuro il perché va apposto public.
     */

/*--------------------------------------------------------------------------------------------------------*/

    // PAROLA CHIAVE THIS:
    /*La parola this. va apposta prima del nome dell'attributo perché?
      Quando nel Main andiamo a creare l'oggetto/istanza e ne creiamo più di uno, essendo che anche se sono
      differenti, appartengono alla stessa classe di provenienza (Persona in questo caso) gli attributi,
      saranno i medesimi.
      Volendo attribuire dei valori diversi ad ognuna persona creata (compito del
      costruttore) ma il ruolo chiave lo ha il this. perché ha il compito di poter differenziare i valori
      che noi daremo ad ogni singola persona creata, senza che si generi nessun problema e fraintendimento
      durante lo svolgimento del programma.
     */

/*-------------------------------------------------------------------------------------------------------*/

    // CREAZIONE DEL COSTRUTTORE E USO DEL THIS.

    Persona(String nome, String cognome, int eta, String coloPreferito) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.coloPreferito = coloPreferito;
    }
}
