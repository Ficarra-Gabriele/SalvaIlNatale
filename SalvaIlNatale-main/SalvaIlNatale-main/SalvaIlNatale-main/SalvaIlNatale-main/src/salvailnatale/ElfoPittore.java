/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salvailnatale;

/**
 *
 * @author ironm
 */
public class ElfoPittore extends Elfo {
    public ElfoPittore(String nome) {
        super(nome, "Pittore");
    }

    @Override
    protected void specializza() {
        this.pittura = 10;
    }
}
