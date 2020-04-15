package taraharris.mini.Projects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class StudentGrades {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//array list for student name and student score
		
		ArrayList<String> studNames = new ArrayList<String>();
		ArrayList<Double> studScores = new ArrayList<Double>();
		
		//hashmap to collect letter grade
		HashMap<String,Double> A = new HashMap<String,Double>();
		HashMap<String,Double> B = new HashMap<String,Double>();
		HashMap<String,Double> C = new HashMap<String,Double>();
		HashMap<String,Double> F = new HashMap<String,Double>();
		
//loop to enter student name and score
		for(int i=0; i<3; i++) {
			System.out.print("Enter Stud name: ");
			studNames.add(input.next());
			System.out.println("Enter stud score: ");
			studScores.add(input.nextDouble());
		}
		// loop evaluates number grade to convert to letter grade
		for(int i =0; i<3; i++) {
			
			if(studScores.get(i)<=100 && studScores.get(i)>=90) {
				A.put(studNames.get(i), studScores.get(i));
			}
			
			if(studScores.get(i)<90 && studScores.get(i)>=80) {
				B.put(studNames.get(i), studScores.get(i));
			}
			
			if(studScores.get(i)<80 && studScores.get(i)>=70) {
				C.put(studNames.get(i), studScores.get(i));
			}
			
			if(studScores.get(i)<70 && studScores.get(i)>=0) {
				F.put(studNames.get(i), studScores.get(i));
			}
		}
		//print out letter students with letter grade
		System.out.println("A" + A);
		System.out.println("B" + B);
		System.out.println("C" + C);
		System.out.println("F" + F);


	        }
}
