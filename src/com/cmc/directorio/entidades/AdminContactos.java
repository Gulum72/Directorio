package com.cmc.directorio.entidades;

public class AdminContactos {

	public Contacto buscarMasPesado(Contacto c1,Contacto c2) {
		if(c1.getPeso()>c2.getPeso()) {
			return c1;
		}else if(c2.getPeso()>c1.getPeso()) {
			return c2;
		}else {
		return null;
		}
		
	}
	
	public boolean compararOperadoras(Contacto c1,Contacto c2) {
		String dato1 = c1.getTelefono().getOperadora();
		String dato2 = c2.getTelefono().getOperadora();
		if(dato1==dato2) {
			return true;
		}else if(c1.getTelefono().getOperadora()!=c2.getTelefono().getOperadora()){
		return false;
		}
		return false;
		
	}
	
	public void activarUsuario(Contacto c1) {
		if(c1.getTelefono().getTieneWhatsapp()==true) {
		c1.setActivo(true)	;
		}
	}
}
