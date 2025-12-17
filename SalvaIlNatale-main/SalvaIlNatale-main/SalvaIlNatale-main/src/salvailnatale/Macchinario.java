/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salvailnatale;

/**
 *
 * @author ironm
 */

public abstract class Macchinario {
    protected String nome;
    protected String tipoSpecializzazione;
    protected String statisticaRiferimento;
    protected int livelloUsura;
    protected static final int massimoUsura = 20;
    protected Elfo elfoAssegnato;

    public Macchinario(String nome, String tipoSpecializzazione, String statisticaRiferimento) {
        this.nome = nome;
        this.tipoSpecializzazione = tipoSpecializzazione;
        this.statisticaRiferimento = statisticaRiferimento;
        this.livelloUsura = 0;
        this.elfoAssegnato = null;
    }

    public String getNome() {
        return nome;
    }

    public void assegnaElfo(Elfo elfo) {
        this.elfoAssegnato = elfo;
    }

    public Elfo getElfoAssegnato() {
        return elfoAssegnato;
    }

    public String getTipoSpecializzazione() {
        return tipoSpecializzazione;
    }

    public String getStatisticaRiferimento() {
        return statisticaRiferimento;
    }

    public int getLivelloUsura() {
        return livelloUsura;
    }

    public void applicaUsura() {
        this.livelloUsura += (int) (Math.random() * 3) + 1; // Usura casuale 1-3
        if (livelloUsura > massimoUsura) {
            livelloUsura = massimoUsura;
        }
    }

    public void ripara() {
        this.livelloUsura = 0;
    }
    
    public boolean necessitaRiparazione() {
        return livelloUsura >= massimoUsura * 0.75;
    }

    @Override
    public String toString() {
        String statoElfo = elfoAssegnato != null ? elfoAssegnato.getNome() + " (" + elfoAssegnato.getTipo() + ")" : "Nessuno";
        return nome + " (Spec: " + tipoSpecializzazione + ") | Elfo: " + statoElfo + " | Usura: " + livelloUsura + "/" + massimoUsura;
    }
}