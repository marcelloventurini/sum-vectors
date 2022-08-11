package application;

import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter the amount for each vector: ");
    int n = scanner.nextInt();
    int[] vect1 = new int[n];
    int[] vect2 = new int[n];
    int[] vect3 = new int[n];

    System.out.println("Vector A: ");

    for (int i = 0; i < vect1.length; i++) {
      vect1[i] = scanner.nextInt();
    }

    System.out.println("Vector B: ");

    for (int i = 0; i < vect2.length; i++) {
      vect2[i] = scanner.nextInt();
    }

    for (int i = 0; i < vect3.length; i++) {
      vect3[i] = vect1[i] + vect2[i];
    }

    System.out.println("Resulting vector: ");

    for (int i = 0; i < vect3.length; i++) {
      System.out.println(vect3[i]);
    }

    scanner.close();
  }
}
