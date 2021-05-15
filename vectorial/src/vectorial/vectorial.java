package vectorial;
import java.util.*;
import java.util.ArrayList;
/**
 * Esta clase calcula operaciones de suma , resta, multiplicacion de  2 a 3  vectores enteros.
 * Ademas puede invertir un vector y calcular la suma total de susu elementis enteros.
 * @author Daniel 
 *
 */
public class vectorial  {
	int [] total;

	public static void main(String[] args) {
		///llamo a las varaibles del otra classe 
		parametros vector = new parametros();
		vectorial    vectorial    = new vectorial   ();
		//varaible

		int v1[]=parametros.vector1;
		int v2[]=parametros.vector2;
		int v3[]=parametros.vector3;
		int v4[];
		
		vectorial.sumatorio(v1,v2);
		v4=vectorial.getResultado( );
				
		/*
		vectorial.sumatorio(v1,v2,v3);
		v4=vectorial.getResultado( );*/
		
		/*vectorial.resta(v1,v2);
		v4=vectorial.getResultado( );*/
		
		/*vectorial.resta(v1,v2,v3);
		v4=vectorial.getResultado( );*/
		
		/*vectorial.resta(v1,v2);
		v4=vectorial.getResultado( );*/
		
		/*vectorial.multiplicacio(v1,v2);
		v4=vectorial.getResultado( );*/
		
		/*vectorial.multiplicacio(v1,v2,v3);
		v4=vectorial.getResultado( );*/
	}
	/**
	 * Este método es una  suma entre dos vectores de la mismo numero de elementos
	 * @param - vector1
	 * @param -  vector2
	 */
	public void sumatorio(int  vector1[] , int vector2[]) {
		
		try {
			
			int num=2;
			if(vector1.length>vector2.length ) {
				num=vector1.length;
			}
			else {
				num=vector2.length;
			}		
			int[] vector3 = new int[num];
			for (int y=0;y<vector3.length;y++) {
				vector3[y]=(vector1[y]+vector2[y]);
			}
			total=vector3;
		}catch(ArrayIndexOutOfBoundsException ex) {
			System.out.print("Los vectores tiene que tener la misma longitud \n");
			throw new ArrayIndexOutOfBoundsException("Los vectores tiene que tener la misma longitud");
		}

	}
	
	/**
	 * 
	 * @param vector1
	 * @param vector2
	 * @param vector3
	 */
		public void sumatorio(int  vector1[] , int vector2[], int vector3[]) {	
			try {
				
			int num=2;
			if(vector1.length>vector2.length && vector1.length>vector3.length) {
				num=vector1.length;
			}
			else if(vector2.length>vector1.length && vector2.length>vector3.length){
				num=vector2.length;
			}
			else {
				num=vector3.length;
			}
			
			int[] vector4 = new int[num];
			
			for (int y=0;y<vector4.length;y++) {
				
					vector4[y]=(vector1[y]+vector2[y]+vector3[y]);
					
			}
			total=vector4;
		}catch(ArrayIndexOutOfBoundsException ex) {
			System.out.print("Los vectores tiene que tener la misma longitud \n");
			throw new ArrayIndexOutOfBoundsException("Los vectores tiene que tener la misma longitud");
		}
		}	
				/**
				 * 
				 * @param vector1
				 * @param vector2
				 */
		public  void resta(int  vector1[] , int vector2[]) {
			try {
			int num=2;
			if(vector1.length>vector2.length ) {
				num=vector1.length;
			}
			else {
				num=vector2.length;
			}

			int[] vector3 = new int[num];
			for (int y=0;y<vector3.length;y++) {
				
				vector3[y]=(vector1[y]-vector2[y]);
				}
			total=vector3;
		}catch(ArrayIndexOutOfBoundsException ex) {
			System.out.print("Los vectores tiene que tener la misma longitud \n");
			throw new ArrayIndexOutOfBoundsException("Los vectores tiene que tener la misma longitud");
		}
			}
		/**
		 * 
		 * @param vector1
		 * @param vector2
		 * @param vector3
		 */
		public  void resta(int  vector1[] , int vector2[], int vector3[]) {
			try {
			int num=2;
			if(vector1.length>vector2.length && vector1.length>vector3.length) {
				num=vector1.length;
			}
			else if(vector2.length>vector1.length && vector2.length>vector3.length){
				num=vector2.length;
			}
			else {
				num=vector3.length;
			}
			
			int[] vector4 = new int[num];
			for (int y=0;y<vector4.length;y++) {
	
					vector4[y]=(vector1[y]-vector2[y]-vector3[y]);
					
				
					}
			total=vector4;	
			}catch(ArrayIndexOutOfBoundsException ex) {
				System.out.print("Los vectores tiene que tener la misma longitud \n");
				throw new ArrayIndexOutOfBoundsException("Los vectores tiene que tener la misma longitud");
			}
		}	
		
			/**
			 * 
			 * @param vector1
			 * @param vector2
			 */
		public  void multiplicacio(int  vector1[] , int vector2[]) {
			try {
		
			int num=2;
			if(vector1.length>vector2.length ) {
				num=vector1.length;
			}
			else {
				num=vector2.length;
			}
			
			int[] vector3 = new int[num];

			for (int y=0;y<vector3.length;y++) {
				
					vector3[y]=(vector1[y]*vector2[y]);
					
					}	
			total=vector3;
			}catch(ArrayIndexOutOfBoundsException ex) {
				System.out.print("Los vectores tiene que tener la misma longitud \n");
				throw new ArrayIndexOutOfBoundsException("Los vectores tiene que tener la misma longitud");
			}
					}
		/**
		 * 
		 * @param vector1
		 * @param vector2
		 * @param vector3
		 */
		public  void multiplicacio(int  vector1[] , int vector2[], int vector3[]) {
			try {
		
			int num=2;
			if(vector1.length>vector2.length && vector1.length>vector3.length) {
				num=vector1.length;
			}
			else if(vector2.length>vector1.length && vector2.length>vector3.length){
				num=vector2.length;
			}
			else {
				num=vector3.length;
			}
			
			int[] vector4 = new int[num];
			
			
			for (int y=0;y<vector4.length;y++) {
				
					vector4[y]=(vector1[y]*vector2[y]*vector3[y]);
					
					}			
			total=vector4;
			}catch(ArrayIndexOutOfBoundsException ex) {
				System.out.print("Los vectores tiene que tener la misma longitud \n");
				throw new ArrayIndexOutOfBoundsException("Los vectores tiene que tener la misma longitud");
			}
			}
		/**
		 * 
		 * @param vector1
		 */
		public  void invertir(int  vector1[] ) {
			int[] invertido = new int[vector1.length];
			for (int y=0;y<vector1.length;y++) {
				invertido[y] = vector1[vector1.length-1-y];
						}	
			total=invertido;
			}
			/**
			 * 
			 * @param vector1
			 * @return
			 */
		public static int total(int  vector1[] ) {
			int todo = 0;
			for (int y=0;y<vector1.length;y++) {
				todo+= vector1[y];
					}		
			return todo;
					}
			/**
			 * 
			 * @return - retorna un entero
			 */
		public   int[] getResultado( ) {	
			/*	if(total==null) {
				System.out.print("No tiene ningun resultado");
				}else {
					imprimir(total);
					}*/
			return total;	
		}
		
	public  void imprimir( int numero[]) {
		for(int y=0;y<numero.length;y++){  // 
			System.out.print("["+numero[y]+"]");
		}
		System.out.print("\n");
				
	}
}
