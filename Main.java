package fr.jeremy.perceptrontest;

/*FR:Ici un perceptron simple monocouche à 5 entrees. Il suffit de determiner les 4 entrées (le tableau x) et le programme calcule premierement la somme pondérée des entrée et des poids synapiques(le tableau w) et adaptes 
 * ensuite les poids synaptiques en fonctions du resultat attendu. On pourrait expliquer cela en disant que le programme programme pourrait etre capable d'adaptabilité en ce qui concerne ses informations. 
 * commencé à coder le :10/01/2019 
 * terminer le 28/01/2019 
 * 
 * pour me contacter :jeremy.krief22@gmail.com
 * 
 * Jeremy Krief
 * 
 * 
 * EN:Here a simple monolayer perceptron with 5 entries. It is sufficient to determine the 4 entries (the array x) and the program first calculates the weighted sum of the entries and the synapic weights (the array w)
 *  and adapted then the synaptic weights as functions of the expected result. This could be explained by saying that the program program might be able to adapt to its informations.
 * started coding on: 01/10/2019
 * finish the 01/28/2019
 * 
 *  Contact :jeremy.krief22@gmail.com
 *  
 *  Jeremy Krief
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int x[]; x = new int [4];int x0;// = -1;
		int w[]; w = new int [4];int w0;// = 2;
		int wile=0;int i = 1;
		boolean success;
		
		
		int y,z,d = 0;
		
		w[0]=w[1]=w[2]=w[3] = 0;
		w0 = 2;
		x0 = -1;
		
		while(wile<=16)
		{
			
			System.out.println("Entrées Perceptron:");
			
			//x1
			System.out.println("");
		System.out.println("X1 (0 / 1):");
		Scanner scanf = new Scanner(System.in);
		x[0] = scanf.nextInt();
		
		while (x[0] > 1 || x[0] < 0)
		{
			System.out.println("X1 (0 / 1):");
			Scanner scanf1 = new Scanner(System.in);
			x[0] = scanf1.nextInt();
		}
			 
			//x2		
		System.out.println("X2 (0 / 1):");
		Scanner scanf2 = new Scanner(System.in);
		x[1] = scanf2.nextInt();
		
		while (x[1] > 1 || x[1] < 0)
		{
			System.out.println("X2 (0 / 1):");
			Scanner scanf2r = new Scanner(System.in);
			x[1] = scanf2r.nextInt();
		}
			//x3
		System.out.println("X3 (0 / 1):");
		Scanner scanf3 = new Scanner(System.in);
		x[2] = scanf.nextInt();
		
		while (x[2] > 1 || x[2] < 0)
		{
			System.out.println("X3 (0 / 1):");
			Scanner scanf3r = new Scanner(System.in);
			x[2] = scanf3r.nextInt();
		}
		
			//x4
		System.out.println("X4 (0 / 1):");
		Scanner scanf4 = new Scanner(System.in);
		x[3] = scanf4.nextInt();
		
		while (x[3] > 1 || x[3] < 0)
		{
			System.out.println("X4 (0 / 1):");
			Scanner scanf4r = new Scanner(System.in);
			x[3] = scanf4r.nextInt();
	  	}
		System.out.println("d (0 / 1):");
		Scanner scanf5 = new Scanner(System.in);
		d = scanf5.nextInt();
		
		while (d > 1 || d < 0)
		{
			System.out.println("d (0 / 1):");
			Scanner scanf5r = new Scanner(System.in);
			d = scanf5r.nextInt();
	  	}
		
		
		
		y =  x[0]*w[0] + x[1]*w[1] + x[2]*w[2] + x[3]*w[3] + x0*w0;
		
			
			if(y >= 0) 
			{ 
			z= 1;	
			}
		
			else
			{ 
			z = 0;
			}
		
			if(z == d)
			{
				success = true;
			}
			else if(d!=z)	
			{
				
				w[0]= w[0] + (d-z)*x[0];	
				w[1]= w[1] + (d-z)*x[1];
				w[2]= w[2] + (d-z)*x[2];
				w[3]= w[3] + (d-z)*x[3];
				w0= w0 + (d-z)*x0;
			}
			
			
			if(d==z)
			{
				System.out.println("Step:"+i+"/16"+" entrée:"+x[0]+","+x[1]+","+x[2]+","+x[3]+","+x0+" z:"+z+", d:"+d+", poids: "+w[0]+""+w[1]+""+w[2]+""+w[3]+""+w0);
				
			}
			else if(d!=z)
			{
				System.out.println("Step:"+i+"/16"+" entrée:"+x[0]+","+x[1]+","+x[2]+","+x[3]+","+x0+" z:"+z+", d:"+d+", poids: "+w[0]+""+w[1]+""+w[2]+""+w[3]+""+w0);
				
			}
			i++;
			}
		

	}

}
