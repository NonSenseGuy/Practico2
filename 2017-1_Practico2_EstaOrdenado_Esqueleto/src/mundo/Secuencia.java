package mundo;

public class Secuencia {
	public static boolean estaOrdenado(int[] A){
		return estaOrdenado(A,0,A.length-1);
	}
	
	public static boolean estaOrdenado(int[] A, int ini, int fin) {
		if(ini >= fin) {
			return true;
		}
		return estaOrdenado(A,ini, (ini+fin)/2 ) && estaOrdenado(A,((ini+fin)/2)+1, fin) && A[ini] <= A[fin];

	}
//	
//	public static boolean estaOrdenado(int[] A, int i, int anterior) {
//		if(A == null || i >= A.length) {
//			return true;
//		}
//		return estaOrdenado(A,i+1,A[i]) && A[i]>=anterior;
//	}
}
