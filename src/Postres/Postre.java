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

	public double calcularPrecioFinal() {
		double precioFinal;
		precioFinal = (precioParcial + (precioParcial * 0.12)) + (aderezos.size() * 0.50);
		return precioFinal;
	}
	
	
	public  void anadirAderezoHelado(Aderezo aderezo){
        this.getAderezos().add(aderezo);
    }
    
    public  void quitarAderezoHelado(Aderezo aderezo){
        this.getAderezos().remove(aderezo);
    }
    
    public  void anadirAderezoPastel(Aderezo aderezo){
        this.getAderezos().add(aderezo);
    }
    
    public void quitarAderezoPastel(Aderezo aderezo){
        this.getAderezos().remove(aderezo);
    }

	public ArrayList<Aderezo> getAderezos() {
		return aderezos;
	}
	public double getPrecioParcial(){
		return precioParcial;
	}


	public String showPrecioFinal() {
		return "Precio Final: $ " + calcularPrecioFinal();
	}
	
	
}
