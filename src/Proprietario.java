public class Proprietario
{
    private String nome;
    private String cognome;
    private String CodiceFiscale;
    public Proprietario(String nome, String cognome, String CodiceFiscale)
    {
        this.nome=nome;
        this.cognome=cognome;
        this.CodiceFiscale=CodiceFiscale;
    }
    public String toString()
    {
        return "Proprietario: " + nome +"," + cognome + "," + CodiceFiscale;
    }
}
