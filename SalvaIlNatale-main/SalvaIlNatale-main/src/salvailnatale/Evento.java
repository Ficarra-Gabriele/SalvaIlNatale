/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salvailnatale;
import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author ironm
 */

public class Evento {
    
    private String nome;
    private String effetto;
    private int modificatoreQualita;
    private boolean aumentaUsura;

    private Evento(String nome, String effetto, int modificatoreQualita, boolean aumentaUsura) {
        this.nome = nome;
        this.effetto = effetto;
        this.modificatoreQualita = modificatoreQualita;
        this.aumentaUsura = aumentaUsura;
    }

    public static Evento generaEventoCasuale() {
        
        ArrayList<Evento> eventiDisponibili = new ArrayList<>();
        
        eventiDisponibili.add(new Evento("Guasto Improvviso", "Un macchinario si blocca. La qualita cala.", -5, true));
        eventiDisponibili.add(new Evento("Ispirazione Elfi", "Gli Elfi lavorano con gioia. La qualita aumenta.", 3, false));
        eventiDisponibili.add(new Evento("Controllo Qualita", "Ispezione a sorpresa. Macchinari piu usati.", -2, true));
        eventiDisponibili.add(new Evento("Caffe Elfico", "Super Bevanda! La produzione e piu rapida.", 2, false));

        Random rand = new Random();
        int i = rand.nextInt(eventiDisponibili.size());
        
        return eventiDisponibili.get(i);
    }

    public int getModificatoreQualita() {
        return modificatoreQualita;
    }

    public void applicaEffetto(CatenaDiMontaggio catena) {
        if (aumentaUsura) {
            for (Macchinario m : catena.getMacchinari()) {
                m.livelloUsura += 5; 
            }
        }
    }

    @Override
    public String toString() {
        return "evento: " + nome + " " + effetto;
    }
}
