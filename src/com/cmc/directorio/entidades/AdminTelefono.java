package com.cmc.directorio.entidades;

public class AdminTelefono {
	
	public  Telefono activarMensajeria (Telefono t1) {
		if(t1.getOperadora()=="movi") {
			t1.setTieneWhatsapp(true);
			return t1;
		}
		
		return t1;
	}
	
	public String contarMovi(Telefono t1,Telefono t2,Telefono t3) {
		String  guardados = null;
		if(t1.getOperadora()=="movi") {
			guardados+=t1.getNumero();
		}
		if(t2.getOperadora()=="movi") {
			guardados+=t2.getNumero();
		}
		if(t3.getOperadora()=="movi") {
			guardados+=t3.getNumero();
		}
		return guardados;
	}
	
	public String contarClaro(Telefono t1,Telefono t2,Telefono t3,Telefono t4) {
		String  guardados = " ";
		if(t1.getOperadora()=="claro") {
			guardados+=t1.getNumero();
		}
		if(t2.getOperadora()=="claro") {
			guardados+=t2.getNumero();
		}
		if(t3.getOperadora()=="claro") {
			guardados+=t3.getNumero();
		}
		if(t4.getOperadora()=="claro") {
			guardados+=t3.getNumero();
		}
		return guardados;
	}
}
