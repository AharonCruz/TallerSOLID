/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Leche;
import Postres.*;
/**
 *
 * @author Pedro Mendoza
 */
public class LecheDeslactosada extends LecheEntera {
    
	public void usarPostre(Postre postre) {
		if(postre.getClass() == Pastel.class)
			System.out.println("No se puede usar leche deslactosada en el pastel");
		else
			System.out.println("Usando leche deslactosada");
	}
        
}
