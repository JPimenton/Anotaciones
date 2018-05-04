
/**
 * AnotacionesSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.2  Built on : Sep 06, 2010 (09:42:01 CEST)
 */
package es.aytos.main.server;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * AnotacionesSkeleton java skeleton for the axisService
 */
public class AnotacionesSkeleton {

	FileWriter file;
	PrintWriter pw;

	public void escribir(es.aytos.main.Escribir escribir) {
		
		try {
			file = new FileWriter("Anotaciones.txt", true);
			pw = new PrintWriter(file);
			pw.println(escribir.getArgs0()+" "+escribir.getArgs1());
			pw.println("********************");
			pw.close();
		} catch (IOException e) {
			e.printStackTrace();
			
		}
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param leer
	 */

	public es.aytos.main.LeerResponse leer(es.aytos.main.Leer leer) {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException("Please implement " + this.getClass().getName() + "#leer");
	}

}
