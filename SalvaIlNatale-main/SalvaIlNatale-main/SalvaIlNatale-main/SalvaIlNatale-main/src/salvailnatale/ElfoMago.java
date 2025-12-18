/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salvailnatale;

/**
 *
 * @author ironm
 */

public class ElfoMago extends Elfo {
    public ElfoMago(String nome) {
        super(nome, "Mago");
    }

    @Override
    protected void specializza() {
        this.magia = 10;
    }
}
