package com.utn.vista;

import java.util.Comparator;

public class Zapato  {

	private int talle;

	public Zapato(int talle) {
		this.talle = talle;

	}

	public int getTalle() {
		return talle;

	}

	public void setTalle(int talle) {
		this.talle = talle;
	}

	@Override
	public String toString() {
		return "Zapato [talle=" + talle + "]";
	}

}


