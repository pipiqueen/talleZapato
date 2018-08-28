package com.utn.vista;

import java.util.Comparator;

public class Comparador implements Comparator<Zapato> {

	@Override
	public int compare (Zapato arg0,Zapato arg1) {
		if (arg0.getTalle()<arg1.getTalle()) {
			return 1;
		}else if(arg0.getTalle()>arg1.getTalle()){
				return -1;
			}else {
			return 0;
			
		
			
		}
	}
}

