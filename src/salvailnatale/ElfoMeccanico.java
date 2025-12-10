/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salvailnatale;

/**
 *
 * @author ironm
 */
public class ElfoMeccanico extends Elfo {
    public ElfoMeccanico(String nome) {
        super(nome, "Meccanico");
    }

    @Override
    protected void specializza() {
        this.meccanica = 10;
    }
}
