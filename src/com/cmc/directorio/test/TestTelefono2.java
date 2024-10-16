package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono2 {

	public static void main(String[] args) {
		Telefono Tef;
		Telefono telf=new Telefono(20,"movi","098234234",false);
		AdminTelefono at=new AdminTelefono();
		
		Tef=at.activarMensajeria(telf);
		System.out.println("Numero: "+Tef.getNumero());
		System.out.println("Codigo: "+Tef.getCodigo());
		System.out.println("Operadora: "+Tef.getOperadora());
		System.out.println("Tiene whatsapp?: "+Tef.getTieneWhatsapp());

	}

}
