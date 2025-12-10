/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salvailnatale;

/**
 *
 * @author ironm
 */
public class Prodotto {
    private String nome;
    private int punteggioQualita;
    private String livelloQualita;

    public Prodotto(String nome, int punteggioQualita) {
        this.nome = nome;
        this.punteggioQualita = punteggioQualita;
        calcolaLivelloQualita();
    }

    private void calcolaLivelloQualita() {
        if (punteggioQualita >= 15) {
            livelloQualita = "Eccellente";
        } else if (punteggioQualita >= 10) {
            livelloQualita = "Buono";
        } else {
            livelloQualita = "Scadente";
        }
    }

    @Override
    public String toString() {
        return "Giocattolo: " + nome +
               " | Qualità: " + livelloQualita +
               " (Punti: " + punteggioQualita + ")";
    }
}
