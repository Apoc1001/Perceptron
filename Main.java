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
		
		int iteration=1;int Etape=1;int i = 0,i1;//[0-3]
		
		int a =0;int m=0;
		
		int y,z,d = 0;
		float PourcentageReussite = 0;float PourcentageErreur = 0;int CompteurErreur = 0;
		
		w[0]=w[1]=w[2]=w[3] = 0;
		w0 = 2;
		x0 = -1;
		
		
		

		while(iteration<17)
		{
			System.out.println();
			System.out.println("Entrées Perceptron:");
		
			while(a < 4)
			{
				i1 = i +1;
				System.out.println("");
				System.out.print("X"+i1+"(0 / 1):");
				Scanner scanf = new Scanner(System.in);
				x[i] = scanf.nextInt();
				
				while (x[i] > 1 || x[i] < 0)
				{
					System.out.print("X"+i1+"(0 / 1):");
					@SuppressWarnings("resource")
					Scanner scanf1 = new Scanner(System.in);
					x[i] = scanf1.nextInt();
				}
				a++;i++;
				 
			}
		
		
		
		y =  x[0]*w[0] + x[1]*w[1] + x[2]*w[2] + x[3]*w[3] + x0*w0;
		
		if(x[0]==1 && x[1] == 0 && x[2]==0 && x[3]==1) {d = 1;}
		else {d=0;}
		
			
			if(y >= 0) 
			{ 
			z= 1;	
			}
		
			else
			{ 
			z = 0;
			}
		
			
			if(d==z)
			{
				System.out.println("s:"+iteration+"," + "E:"+Etape + " entrée:"+x[0]+","+x[1]+","+x[2]+","+x[3]+","+x0+" z:"+z+", d:"+d+", poids: "+w[0]+""+w[1]+""+w[2]+""+w[3]+""+w0);
				
			}
			else if(d!=z)
			{
				
				w[0]= w[0] + (d-z)*x[0];	
				w[1]= w[1] + (d-z)*x[1];
				w[2]= w[2] + (d-z)*x[2];
				w[3]= w[3] + (d-z)*x[3];
				w0= w0 + (d-z)*x0;
				CompteurErreur++;
				
				System.out.println("s:"+iteration+"," + "E"+Etape +"  entrée:"+x[0]+","+x[1]+","+x[2]+","+x[3]+","+x0+" z:"+z+", d:"+d+", poids: "+w[0]+""+w[1]+""+w[2]+""+w[3]+""+w0);
				
			}
			a=0;i=0;
			iteration++;
			
			if(iteration == 17)
			{
				
			System.out.println("");
			System.out.println("Fin.");
			System.out.println("Erreur(s):"+CompteurErreur);
			PourcentageErreur = (float)CompteurErreur / 16 *100;
			PourcentageReussite = 100 - PourcentageErreur;
			System.out.println("Reussie à "+PourcentageReussite+"%");
			Etape++;iteration =1;CompteurErreur = 0;
			}	
			
		
		
		
	}
		
 }

}
