/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salvailnatale;
import java.util.ArrayList;

/**
 *
 * @author ironm
 */


public class CatenaDiMontaggio {
    
    private ArrayList<Macchinario> macchinari;
    private ArrayList<Elfo> magazzinoElfi;
    private ArrayList<Prodotto> prodottiFiniti;

    public CatenaDiMontaggio() {
        this.macchinari = new ArrayList<>();
        this.magazzinoElfi = new ArrayList<>();
        this.prodottiFiniti = new ArrayList<>();
    }

    public ArrayList<Macchinario> getMacchinari() {
        return macchinari;
    }
    
    public ArrayList<Elfo> getMagazzinoElfi() {
        return magazzinoElfi;
    }

    public void aggiungiMacchinario(Macchinario m) {
        macchinari.add(m);
    }
    
    public void aggiungiElfo(Elfo e) {
        magazzinoElfi.add(e);
    }

    public boolean assegnaElfoAMacchinario(Elfo elfo, Macchinario macchinario) {
        if (magazzinoElfi.contains(elfo) && macchinari.contains(macchinario)) {
            macchinario.assegnaElfo(elfo);
            magazzinoElfi.remove(elfo);
            return true;
        }
        return false;
    }

    public Prodotto avviaProduzione(String nomeProdotto, Evento evento) {
        int punteggioTotale = 0;
        
        for (Macchinario m : macchinari) {
            if (m.getElfoAssegnato() != null) {
                Elfo e = m.getElfoAssegnato();
                
                String stat = m.getStatisticaRiferimento();
                int valoreStatistica = e.getStatistica(stat);
                
                int moltiplicatore = 1;
                if (e.getTipo().equals(m.getTipoSpecializzazione())) {
                    moltiplicatore = 2;
                }
                
                int contributoMacchinario = (valoreStatistica * moltiplicatore) - m.getLivelloUsura();
                if (contributoMacchinario < 0) contributoMacchinario = 0;
                
                punteggioTotale += contributoMacchinario;
                
                m.applicaUsura();
            }
        }
        
        if (evento != null) {
            punteggioTotale += evento.getModificatoreQualita();
            evento.applicaEffetto(this);
        }
        
        if (punteggioTotale < 0) punteggioTotale = 0;
        
        Prodotto nuovoProdotto = new Prodotto(nomeProdotto, punteggioTotale);
        prodottiFiniti.add(nuovoProdotto);
        return nuovoProdotto;
    }

    @Override
public String toString() {
    String s = "--- Stato Catena -- ";
    s += "Macchine: ";
    for (Macchinario m : macchinari) {
        s += m.toString() + "; ";
    }
    s += "Elfi Liberi: ";
    for (Elfo e : magazzinoElfi) {
        s += e.toString() + "; ";
    }
    s += "Prodotti Finiti (" + prodottiFiniti.size() + "): ";
    if (!prodottiFiniti.isEmpty()) {
        for (Prodotto p : prodottiFiniti) {
            s += p.toString() + "; ";
        }
    } else {
        s += "(Nessun prodotto)";
    }
    return s;
    }
}
