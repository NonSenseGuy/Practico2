package mundo;

import static org.junit.Assert.*;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import org.junit.Test;

public class SecuenciaTest2 {

	private String arregloToString(int[] a){
		String arrStr = "[";
		String sep = "";
		for (int i = 0; i < a.length; i++) {
			arrStr += sep + a[i];
			sep = " ";
		}
		return arrStr+"]";
	}
	
	private int[] leerArregloPrueba(int n){
		try{
			Scanner lector = new Scanner(new FileReader("pruebas"+n+".txt"));
			int tam = lector.nextInt();
			int[] a = new int[tam];
			for (int i = 0; i < a.length; i++) {
				a[i] = lector.nextInt();
			}
			lector.close();
			return a;
		}catch(IOException ioexc){
			//ioexc.printStackTrace();
			return new int[0];
		}
	}
	
	@Test
	public void test0() {
		int[] arreglo = leerArregloPrueba(0);
		assertFalse("El arreglo "+arregloToString(arreglo)+" NO es sierra.", Secuencia.esSierra(arreglo));
	}

	@Test
	public void test1() {
		int[] arreglo = leerArregloPrueba(1);
		assertTrue("El arreglo SI es sierra.", Secuencia.esSierra(arreglo));
	}

	@Test
	public void test2() {
		int[] arreglo = leerArregloPrueba(2);
		assertFalse("El arreglo "+arregloToString(arreglo)+" NO es sierra.", Secuencia.esSierra(arreglo));
	}

	@Test
	public void test3() {
		int[] arreglo = leerArregloPrueba(3);
		assertTrue("El arreglo SI es sierra.", Secuencia.esSierra(arreglo));
	}

	@Test
	public void test4() {
		int[] arreglo = leerArregloPrueba(4);
		assertFalse("El arreglo NO es sierra.", Secuencia.esSierra(arreglo));
	}

	@Test
	public void test5() {
		int[] arreglo = leerArregloPrueba(5);
		assertTrue("El arreglo SI es sierra.", Secuencia.esSierra(arreglo));
	}

	@Test
	public void test6() {
		int[] arreglo = leerArregloPrueba(6);
		assertFalse("El arreglo NO es sierra.", Secuencia.esSierra(arreglo));
	}

	@Test
	public void test7() {
		int[] arreglo = leerArregloPrueba(7);
		assertTrue("El arreglo SI es sierra.", Secuencia.esSierra(arreglo));
	}

	@Test
	public void test8() {
		int[] arreglo = leerArregloPrueba(8);
		assertFalse("El arreglo NO es sierra.", Secuencia.esSierra(arreglo));
	}

	@Test
	public void test9() {
		int[] arreglo = leerArregloPrueba(9);
		assertTrue("El arreglo SI es sierra.", Secuencia.esSierra(arreglo));
	}
}
