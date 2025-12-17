/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salvailnatale;

/**
 *
 * @author ironm
 */

public class ElfoFalegname extends Elfo {
    public ElfoFalegname(String nome) {
        super(nome, "Falegname");
    }

    @Override
    protected void specializza() {
        this.ingegneria = 10;
    }
}
