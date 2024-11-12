/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicioeval;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * @author alumno
 */
public class EjercicioEval {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        File fichero = new File("clientes.dat");
        		FileInputStream fis;
		try {
			fis = new FileInputStream(fichero);
			ObjectInputStream ois = new ObjectInputStream(fis);
			while (fis.available()>0) {
				
				Venta venta = (Venta) ois.readObject();
				System.out.println(venta);
			}
                        ois.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
