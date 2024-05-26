public class Domanda {
    private String testoDomanda;
    private String[] opzioni;
    private int rispostaCorretta;

    public Domanda(String testoDomanda, String[] opzioni, int rispostaCorretta) {
        this.testoDomanda = testoDomanda;
        this.opzioni = opzioni;
        this.rispostaCorretta = rispostaCorretta;
    }

    public String getTestoDomanda() {
        return testoDomanda;
    }

    public String getOpzione(int index) {
        return opzioni[index];
    }

    public int getRispostaCorretta() {
        return rispostaCorretta;
    }
}