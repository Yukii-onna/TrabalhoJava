package src;

import java.io.*;
import java.util.Scanner;

public class Trabalho {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		File arq = new File("C:\\Users\\joojp\\Desktop\\texto\\tp\\trab.txt");
		double [][] mat = new double [2][2];
		for (int ln = 0; ln < mat.length; ln++) {
			for (int col = 0; col < mat[0].length; col++) {
				System.out.printf("Digite um número [%d][%d]:", ln, col);
				mat[ln][col] = ent.nextInt();
			}
		}
		try {
			Scanner ent1 = new Scanner(arq);
			FileWriter arq1 = new FileWriter("C:\\Users\\joojp\\Desktop\\texto\\tp\\trab.txt",true);
			
			for (int ln = 0; ln < mat.length; ln++) {
				for (int col = 0; col < mat[0].length; col++) {
					if(ln == 0 && col == 0) {
						arq1.write("MascInfant-");
						arq1.write("Estoque:");
					}
					if(ln == 0 && col == 1) {
						arq1.write("PreçoVenda:");
					}
					if(ln == 1 && col == 0) {
						arq1.write("MascAdult-");
						arq1.write("Estoque:");
					}
					if(ln == 1 && col == 1) {
						arq1.write("PreçoVenda:");
					}
					arq1.write(Double.toString(mat[ln][col]));
					arq1.write(" ");
				}
				arq1.write("\n");
			}
			arq1.close();
			ent1.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		ent.close();
	}

}
