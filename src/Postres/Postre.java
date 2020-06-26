package Postres;

import java.util.ArrayList;

import Adicionales.Aderezo;

public class Postre {
	protected String sabor;
	protected double precioParcial;
	protected ArrayList<Aderezo> aderezos;

	public Postre(String sabor) {
		aderezos = new ArrayList<>();
		this.sabor = sabor;
	}
	
	public  void addAderezo(Aderezo aderezo){
        this.getAderezos().add(aderezo);
    }
    
    public  void quitarAderezo(Aderezo aderezo){
        this.getAderezos().remove(aderezo);
    }
    
	public ArrayList<Aderezo> getAderezos() {
		return aderezos;
	}
	public double getPrecioParcial(){
		return precioParcial;
	}

}
