/**
 * La classe Persona aiuta la sviluppatore a creare oggetti Persona
 * @author Meratti
 * @since JDK1.0
 */

public class Persona {
    private String nome;
    private String cognome;
    private String codice;

    /**
     * costrisce un oggetto dato il nome, cognome e il codice fiscale
     * (trasformato in automatico in maiuscolo). Se il codice fiscale non e' valido allora verra' 
     * creato un oggetto Persona con tutti gli attributi con stringa vuota.
     * <b>CONTROLLO sul CODICE FISCALE:</b>
     * <ul>
     *  <li> Il codice deve essere di 16 caratteri alfanumerici </li>
     *  <li> Il codice non deve contenere spazi </li>
     *  <li> I prime 6 caratteri devono essere delle consonanti </li>
     *  <li> Settimo e ottavo carattere devono essere numeri </li>
     * </ul>
     * Consulta la <a href="https://docs.oracle.com/javase/7/docs/api/java/lang/String.html">Documentazione ufficiale String</a>
     * @param nome stringa qualsiasi da assegnare come nome di un nuovo oggetto Persona
     * @param cognome stringa qualsiasi da assegnare come cognome di un nuovo oggetto Persona
     * @param codice stringa che rappresenta il nuovo codice fiscale dell'oggetto Persona
     */
    public Persona(String nome, String cognome, String codice){
        this.nome = nome;
        this.cognome = cognome;
        try{
            setCodice(codice);
        }
        catch(Exception ex){
            this.nome = "";
            this.cognome = "";
            this.codice = "";
        }
    }

    /**
     * restituisce una Stringa contenente il nome della persona
     * @return il nome di un oggetto Persona
     */
    public String getNome(){
        return this.codice;
    }

    /**
     * assegna una Stringa come nome di una persona
     * @param nome Stringa da assegnare come nome
     */
    public void setNome(String nome){
        this.nome = nome;
    }


    /**
     * restituisce una Stringa contenente il cognome della persona
     * @return il cognome di un oggetto Persona
     */
    public String getCognome(){
        return this.cognome;
    }
   
    /**
     * assegna una Stringa come cognome di una persona
     * @param cognome nuova stringa da assegnare come cognome a un oggetto Persona gia'  esistente
     */
    public void setCognome(String cognome){
        this.cognome = cognome;
    }

    /**
     * Il metodo stabilisce se due persone sono omonime; Restituisce un booleano: VERO se 
     * le due persone hanno lo stesso nome (senza distinzione di maiuscole e minuscole) 
     * altrimenti FALSO
     * @param p oggetto Persona
     * @return Vero se le due persone confrontate hanno lo stesso nome, altrimenti falso
     */
    public boolean isOmonimo(Persona p){
        return this.nome.equalsIgnoreCase(p.nome);
    }

    /**
     * Restituisce una rappresentazione testuale di un oggetto Persona
     * @return La rappresentazione testuale di un oggetto Persona
     */
    @Override
    public String toString(){
        return "Nome: " + this.nome + "\nCognome: " + this.cognome + 
                "\nCodice Fiscale: " + this.codice;
    }

    private void setCodice(String codice) throws IllegalArgumentException
    {
        if (codice == null || !codice.matches("(?i)[bcdfghj-np-tv-z]{6}[0-9]{2}[a-z-0-9]{8}"))
            throw new IllegalArgumentException("Codice non è valido");
        else{
            this.codice = codice;
        }
    }
}
