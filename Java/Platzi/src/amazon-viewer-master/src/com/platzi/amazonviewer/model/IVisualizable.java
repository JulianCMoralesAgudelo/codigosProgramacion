package com.platzi.amazonviewer.model;

import java.util.Date;

public interface IVisualizable {
	/**
	 * Este método captura el tiempo de inicio de visualización.
	 * 
	 * @param dateI objeto {@code Date} con el tiempo de inicio exacto.
	 * @return Objeto {@code Date} que devuelve la fecha y hora capturada.
	 **/
	Date startToSee(Date dateI);
	
	/**
	 * Este método captura el tiempo exacto de inicio y final de visualización.
	 * @param dateI objeto {@code Date} con el tiempo de inicio exacto.
	 * @param dateF objeto {@code Date} con el tiempo final exacto.
	 **/
	void stopToSee(Date dateI, Date dateF);
}