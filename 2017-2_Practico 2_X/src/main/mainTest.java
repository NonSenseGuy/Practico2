package main;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class mainTest {
	
	private int[] arr;
	
	void setup(){
		arr = new int[] {2,6,10,14,18,22,26,30,4,8,12,16,20,24,28,32};
	}
	
	boolean estaOrdenado(int[] A) {
		return estaOrdenado(A,0,A.length-1);
	}
	boolean estaOrdenado(int[] A, int ini, int fin) {
		if(ini>=fin) {
			return true;
		}
		int m = (ini+fin)/2;
		return estaOrdenado(A,ini,m) && estaOrdenado(A,m+1,fin) && A[m]<=A[m+1];
	}

	@Test
	void test() {
		setup();
		main.ordenar(arr);
		assertTrue(estaOrdenado(arr));
	}

}
