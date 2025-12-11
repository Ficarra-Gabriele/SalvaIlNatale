/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package salvailnatale;

/**
 *
 * @author ironm
 */
public class SalvaIlNatale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CatenaDiMontaggio catena = new CatenaDiMontaggio();
        
        
        Elfo e1 = new ElfoFalegname("Giulio");
        Elfo e2 = new ElfoPittore("Pino");
        Elfo e3 = new ElfoMeccanico("Mike");
        Elfo e4 = new ElfoMago("Leia");
        Elfo e5 = new ElfoFalegname("Jason"); 

        catena.aggiungiElfo(e1);
        catena.aggiungiElfo(e2);
        catena.aggiungiElfo(e3);
        catena.aggiungiElfo(e4);
        catena.aggiungiElfo(e5);
        
        
        Macchinario m1 = new Piallatrice();
        Macchinario m2 = new Verniciatrice();
        Macchinario m3 = new Smerigliatrice();
        Macchinario m4 = new Grimorio();
        
        catena.aggiungiMacchinario(m1);
        catena.aggiungiMacchinario(m2);
        catena.aggiungiMacchinario(m3);
        catena.aggiungiMacchinario(m4);
        
        catena.assegnaElfoAMacchinario(e1, m1);
        catena.assegnaElfoAMacchinario(e2, m2);
        catena.assegnaElfoAMacchinario(e3, m4);
        
        Prodotto p1 = catena.avviaProduzione("Automobile Classica", null);
        System.out.println("PRODOTTO OTTENUTO: " + p1.toString());
        System.out.println("Stato dopo Produzione (Usura Aumentata)");
        System.out.println(catena.toString());
        
        Evento eventoCasuale = Evento.generaEventoCasuale();
        
        Prodotto p2 = catena.avviaProduzione("Casa delle Bambole", eventoCasuale);
        
        System.out.println(eventoCasuale.toString());
        System.out.println("PRODOTTO OTTENUTO: " + p2.toString());
        System.out.println("Stato Finale (L'Evento ha applicato il suo effetto)");
        System.out.println(catena.toString());
        
        if (m1.necessitaRiparazione()) {
            m1.ripara();
            System.out.println("Manutenzione eseguita su: " + m1.getNome() + " (Usura resettata).");
        } 
        else {
            System.out.println(m1.getNome() + " non necessita ancora riparazione.");
        }
        
        System.out.println("Stato dopo Manutenzione");
        System.out.println(catena.toString());
    }
    
}
