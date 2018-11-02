package mundo;

public class Secuencia {
	public static boolean esSierra(int[] A){
		boolean esMayor = false;
		if(A.length > 1) {
			if(A[0] > A[1])esMayor = true;
			return esSierra(A,0,A.length-1,esMayor);
		}
		return true;
	}	
	
	public static boolean esSierra(int[] A, int ini, int fin, boolean esMayor) {
		if(ini >= fin) {
			return true;
		}
		int m = (ini+fin)/2;
		boolean condicion = false;
		if(esMayor && m%2 == 0) {
			condicion = A[m]>A[m+1];
		}else if(esMayor && m%2 != 0){
			condicion = A[m]<A[m+1];
		}else if(!esMayor && m%2 == 0) {
			condicion = A[m]<A[m+1];
		}else if(!esMayor && m%2 != 0) {
			condicion = A[m]>A[m+1];
		}
		
		return esSierra(A,ini,m,esMayor) && esSierra(A,m+1,fin,esMayor) && condicion;
	}
}
