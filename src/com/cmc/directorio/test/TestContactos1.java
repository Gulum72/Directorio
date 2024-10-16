package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContactos1 {

	public static void main(String[] args) {
		Contacto resultado;
		boolean resultado2;
		
		Telefono telef=new Telefono(12,"movi","09881882",false);
		Contacto c=new Contacto("Sanchez",telef,1.51);
		
		Telefono telef2=new Telefono(11,"movi","098818223",false);
		Contacto c2=new Contacto("Martines",telef,1.52);
		
		AdminContactos contactos=new AdminContactos();
		
		
		resultado=contactos.buscarMasPesado(c, c2);
		
		System.out.println("El mas pesado es: "+resultado.getPeso());
		
		resultado2=contactos.compararOperadoras(c, c2);
		
		System.out.println("SON LAS MISMAS OPERADORAS?: "+resultado2);
		
		}
	
		
}



