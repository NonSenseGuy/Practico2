package mundo;

import static org.junit.Assert.*;
import org.junit.Test;

public class SecuenciaTest1 {
	
	private String arregloToString(int[] a){
		String arrStr = "[";
		String sep = "";
		for (int i = 0; i < a.length; i++) {
			arrStr += sep + a[i];
			sep = " ";
		}
		return arrStr+"]";
	}
	
	@Test
	public void test01() {
		int[] arreglo = new int[]{};
		assertTrue("El arreglo "+arregloToString(arreglo)+" SI es sierra.", Secuencia.esSierra(arreglo));
	}
	
	@Test
	public void test02() {
		int[] arreglo = new int[]{5};
		assertTrue("El arreglo "+arregloToString(arreglo)+" SI es sierra.", Secuencia.esSierra(arreglo));
	}
	
	@Test
	public void test03() {
		int[] arreglo = new int[]{8, 3};
		assertTrue("El arreglo "+arregloToString(arreglo)+" SI es sierra.", Secuencia.esSierra(arreglo));
	}
	
	@Test
	public void test04() {
		int[] arreglo = new int[]{6, 6};
		assertFalse("El arreglo "+arregloToString(arreglo)+" NO es sierra.", Secuencia.esSierra(arreglo));
	}
	
	@Test
	public void test05() {
		int[] arreglo = new int[]{2, 7, 9};
		assertFalse("El arreglo "+arregloToString(arreglo)+" SI es sierra.", Secuencia.esSierra(arreglo));
	}
	
	@Test
	public void test06() {
		int[] arreglo = new int[]{1, 1, 1};
		assertFalse("El arreglo "+arregloToString(arreglo)+" NO es sierra.", Secuencia.esSierra(arreglo));
	}
	
	@Test
	public void test07() {
		int[] arreglo = new int[]{7, 1, 4, 2, 5, 3, 6, 0};
		assertTrue("El arreglo "+arregloToString(arreglo)+" SI es sierra.", Secuencia.esSierra(arreglo));
	}
	
	@Test
	public void test08() {
		int[] arreglo = new int[]{10, 5, 7, 3, 8, 2, 4, 1, 9, 6};
		assertTrue("El arreglo "+arregloToString(arreglo)+" SI es sierra.", Secuencia.esSierra(arreglo));
	}
	
	@Test
	public void test09() {
		int[] arreglo = new int[]{234, 345, 456, 567, 678, 789, 891, 912, 18, 27, 36, 45, 54, 63, 72, 81};
		assertFalse("El arreglo "+arregloToString(arreglo)+" NO es sierra.", Secuencia.esSierra(arreglo));
	}
	
	@Test
	public void test10() {
		int[] arreglo = new int[]{30, 50, 10, 20, 60, 40, 50, 5};
		assertFalse("El arreglo "+arregloToString(arreglo)+" NO es sierra.", Secuencia.esSierra(arreglo));
	}	
}
