package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono4 {

	public static void main(String[] args) {
		String Tef;
		Telefono telf1=new Telefono(20,"claro"," 098234234 ",false);
		Telefono telf2=new Telefono(15,"claro"," 09821244 ",false);
		Telefono telf3=new Telefono(31,"movi"," 0914124124 ",false);
		Telefono telf4=new Telefono(31,"claro"," 0986552781 ",false);
		AdminTelefono at=new AdminTelefono();
		
		Tef=at.contarClaro(telf1, telf2, telf3,telf4);
		System.out.println("Numeros claro: "+Tef);

	}

}
