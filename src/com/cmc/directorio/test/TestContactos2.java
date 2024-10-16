package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContactos2 {

	public static void main(String[] args) {
		Contacto resultado;
		boolean resultado2;
		
		Telefono telef=new Telefono(123,"movi","098818411",false);
		Contacto c1=new Contacto("Palacion",telef,1.53);
		
		Telefono telef2=new Telefono(525,"claro","098818223",false);
		Contacto c2=new Contacto("Patroclo",telef,1.52);
		
		AdminContactos contactos=new AdminContactos();
		
		
		resultado=contactos.buscarMasPesado(c1, c2);
		
		System.out.println("El mas pesado es: "+resultado.getPeso());
		
		resultado2=contactos.compararOperadoras(c1, c2);
		
		System.out.println("SON LAS MISMAS OPERADORAS?: "+resultado2);
		
	}

}
