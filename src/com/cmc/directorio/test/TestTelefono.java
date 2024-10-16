package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Telefono;

public class TestTelefono {

	public static void main(String[] args) {
		Telefono t1 = new Telefono(10, "movi", "09941234123",false);
		System.out.println("El codigo es: "+t1.getCodigo()+" La operadora es: "+t1.getOperadora()+" El numero es: "+t1.getNumero());

	}

}
