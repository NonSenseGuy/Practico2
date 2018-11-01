package main;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class main {
	
	public static void ordenar(int[] A) {
		ordenar(A,0,A.length-1);
	}
	public static void ordenar(int[] A, int ini, int fin) {
		if(ini>=fin) {
			return ;
		}
		int m = (ini+fin)/2;
		int mi = (ini+m)/2+1;
		for(int i = 0; mi+i <= m; i++) {
			int aux = A[mi+i];
			A[mi+i] = A[m+i+1];
			A[m+1+i] = aux;
		}
		ordenar(A,ini,m);
		ordenar(A,m+1,fin);
	}
	
	public static int[] ordenarIte(int[] A, int m, int mi) {
		for(int i = 0; mi+i <= m; i++) {
			int aux = A[mi+i];
			A[mi+i] = A[mi+i+1];
			A[mi+1+i] = aux;
		}
		return A;
	}
	
}
