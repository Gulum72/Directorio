package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono3 {

	public static void main(String[] args) {
		String Tef;
		Telefono telf1=new Telefono(20,"movi"," 098234234 ",false);
		Telefono telf2=new Telefono(15,"claro"," 09821244 ",false);
		Telefono telf3=new Telefono(31,"movi"," 0914124124 ",false);
		AdminTelefono at=new AdminTelefono();
		
		Tef=at.contarMovi(telf1, telf2, telf3);
		System.out.println("Numeros movi: "+Tef);
		

	}

}
