/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Procesos;


import Leche.LecheDescremada;
import Leche.LecheDeslactosada;
import Leche.LecheEntera;
import Postres.*;

/**
 *
 * @author Pedro Mendoza
 */
public class ManejadorDeLeche {
	LecheEntera leche;
	
	public ManejadorDeLeche(LecheEntera leche_entera){
		if(leche_entera instanceof LecheDescremada)
			this.leche = (LecheDescremada) leche_entera;
		else
			this.leche = (LecheDeslactosada) leche_entera;
	}
    
    public void cambiarTipoLeche(Postre postre){
        // Cambiar tipo de leche en la preparación de los postres, usar leche deslactosada
    	LecheEntera newLeche;
    	if(this.leche.getClass() == LecheDescremada.class)
    		newLeche = new LecheDeslactosada();
    	else
    		newLeche = new LecheDescremada();
        System.out.println(postre.getClass());
        System.out.println(Pastel.class);
        
        newLeche.usarPostre(postre);
    }
    
}
