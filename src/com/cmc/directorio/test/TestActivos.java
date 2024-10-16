package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestActivos {

	public static void main(String[] args) {
		Telefono con1=new Telefono(13,"movi","",false);
		Contacto c1=new Contacto("Sanchez",con1,1.21);
		AdminContactos contactos=new AdminContactos();
		
	
		
		System.out.println("El usuario: "+c1.getApellido()+" Esta activo en Whatsapp?: "+c1.getTelefono().getTieneWhatsapp());
	}

}
