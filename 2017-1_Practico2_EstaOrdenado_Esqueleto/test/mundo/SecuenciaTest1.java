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
		assertTrue("El arreglo "+arregloToString(arreglo)+" SI está ordenado.", Secuencia.estaOrdenado(arreglo));
	}
	
	@Test
	public void test02() {
		int[] arreglo = new int[]{5};
		assertTrue("El arreglo "+arregloToString(arreglo)+" SI está ordenado.", Secuencia.estaOrdenado(arreglo));
	}
	
	@Test
	public void test03() {
		int[] arreglo = new int[]{8, 3};
		assertFalse("El arreglo "+arregloToString(arreglo)+" NO está ordenado.", Secuencia.estaOrdenado(arreglo));
	}
	
	@Test
	public void test04() {
		int[] arreglo = new int[]{2, 7, 9};
		assertTrue("El arreglo "+arregloToString(arreglo)+" SI está ordenado.", Secuencia.estaOrdenado(arreglo));
	}
	
	@Test
	public void test05() {
		int[] arreglo = new int[]{6, 6, 6};
		assertTrue("El arreglo "+arregloToString(arreglo)+" SI está ordenado.", Secuencia.estaOrdenado(arreglo));
	}
	
	@Test
	public void test06() {
		int[] arreglo = new int[]{7, 1, 4, 2, 5, 3, 6, 0};
		assertFalse("El arreglo "+arregloToString(arreglo)+" NO está ordenado.", Secuencia.estaOrdenado(arreglo));
	}
	
	@Test
	public void test07() {
		int[] arreglo = new int[]{234, 345, 456, 567, 678, 789, 891, 912, 18, 27, 36, 45, 54, 63, 72, 81};
		assertFalse("El arreglo "+arregloToString(arreglo)+" NO está ordenado.", Secuencia.estaOrdenado(arreglo));
	}
	
	@Test
	public void test08() {
		int[] arreglo = new int[]{30, 50, 10, 20, 60, 80, 50, 70};
		assertFalse("El arreglo "+arregloToString(arreglo)+" NO está ordenado.", Secuencia.estaOrdenado(arreglo));
	}
	
	@Test
	public void test09() {
		int[] arreglo = new int[]{787, 715, 692, 658, 531, 498, 100};
		assertFalse("El arreglo "+arregloToString(arreglo)+" NO está ordenado.", Secuencia.estaOrdenado(arreglo));
	}
	
	@Test
	public void test10() {
		int[] arreglo = new int[]{1, 2, 4, 3, 5, 6, 7, 8, 9, 11, 12};
		assertFalse("El arreglo "+arregloToString(arreglo)+" NO está ordenado.", Secuencia.estaOrdenado(arreglo));
	}
	
	
}
