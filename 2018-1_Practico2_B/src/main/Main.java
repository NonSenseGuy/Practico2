package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static int elementoAdicional(int[] A, int[] B) {
		return elementoAdicional(A,B,0,A.length,-1);
	}
	
	public static int elementoAdicional(int[] A, int[] B, int ini, int fin,int elem) {
		if(ini>= fin) {
			return elem;
		}
		int m = (ini+fin)/2;
		if(A[m] != B[m]) {
			elem = m;
		}
		int izq = elementoAdicional(A,B,ini,m, elem);
		int der = elementoAdicional(A,B,m+1,fin, elem);
		return izq<der && izq != -1?izq:der;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int test = Integer.valueOf(br.readLine());
		for(int i = 0; i < test; i++) {
			int len = Integer.valueOf(br.readLine());
			int[] A = new int[len];
			int[] B = new int[len];
			for(int j = 0; j < len;j++) {
				String[] text = br.readLine().split(" ");
				A[j] = Integer.valueOf(text[0]);
				B[j] = Integer.valueOf(text[1]);
			}
			
			System.out.println(elementoAdicional(A,B));
			
		}
		
	}
}
