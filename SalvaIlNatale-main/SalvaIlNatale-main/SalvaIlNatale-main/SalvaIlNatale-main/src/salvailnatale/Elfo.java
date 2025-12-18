/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salvailnatale;

/**
 *
 * @author ironm
 */
public abstract class Elfo {
    protected String nome;
    protected String tipo;
    protected int meccanica;
    protected int pittura;
    protected int ingegneria;
    protected int magia;

    public Elfo(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
        this.meccanica = (int) (Math.random() * 4) + 2; // Valori 2-5
        this.pittura = (int) (Math.random() * 4) + 2;
        this.ingegneria = (int) (Math.random() * 4) + 2;
        this.magia = (int) (Math.random() * 4) + 2;
        specializza();
    }

    protected abstract void specializza();

    public String getTipo() {
        return tipo;
    }

    public int getStatistica(String statistica) {
        return switch (statistica) {
            case "meccanica" -> meccanica;
            case "pittura" -> pittura;
            case "ingegneria" -> ingegneria;
            case "magia" -> magia;
            default -> 0;
        };
    }
    
    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Elfo " + tipo + " " + nome +
               " [Mec: " + meccanica + ", Pit: " + pittura +
               ", Ing: " + ingegneria + ", Mag: " + magia + "]";
    }
}
