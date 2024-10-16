package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContacto1 {

	public static void main(String[] args) {
		Telefono telef=new Telefono(13,"movi","09881882",false);
		Contacto c=new Contacto("Sanchez",telef,1.21);
		Telefono telef2=new Telefono(12,"movi","09881882",false);
		Contacto c2=new Contacto("Sanchez",telef,1.51);
		
		AdminContactos contactos=new AdminContactos();
		
		Contacto masPesado = contactos.buscarMasPesado(c, c2);
		System.out.println("El mas pesado es: "+masPesado.getApellido());
		
		boolean Operadora=contactos.compararOperadoras(c, c2);
		System.out.println("Las operadoras son iguales?: "+Operadora);
		
		System.out.println("CONTACTO: "+"Apellido: "+masPesado.getApellido()+" Operadora: "+masPesado.getTelefono().getOperadora()+" Peso: "+masPesado.getPeso()+" Numero: "+masPesado.getTelefono().getNumero());

	}

}
