package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static int masCercano(int[] A,int masCercano) {
		if(A.length > 1) {
			return masCercano(A,0,A.length-1,masCercano,Integer.MAX_VALUE);
		}
		return A[0];
		
	}
	
	public static int masCercano(int[] A, int ini, int fin, int masCercano,int x) {
		if(ini>=fin) {
			return x;
		}
		int m = (ini+fin)/2;
		if(Math.abs(A[m]-masCercano) < Math.abs(x-masCercano)) {
			x = A[m];
			if(Math.abs(A[m]-masCercano) > Math.abs(A[m+1]-masCercano)) {
				x=A[m+1];
			}
		}
		int izq = masCercano(A,ini,m,masCercano,x);
		int der = masCercano(A,m+1,fin,masCercano,x);
		return Math.abs(izq-masCercano) < Math.abs(der-masCercano) ? izq:der;
	}
	
	public static void main(String[] args) throws IOException{
		System.out.println();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.valueOf(br.readLine());
		for(int i = 0; i < test; i++) {
			String[] text = br.readLine().split(" ");
			int num = Integer.valueOf(text[0]);
			int len = Integer.valueOf(text[1]);
			int[] A = new int[len];
			for(int j = 0; j < len; j++) {
				A[j] = Integer.valueOf(br.readLine());
			}
			int x = masCercano(A,num);
			if(x == Integer.MAX_VALUE) {
				System.out.println("No hay numeros cercanos");
			}else {
				System.out.println(x);
			}
			
		}
	}
}
