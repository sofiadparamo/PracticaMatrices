package net.skykrowd;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        int n,i=0,k;

        System.out.print("Ingrese N: ");
        n=leer.nextInt();

        if (n%2==0)
            n=9;

        char mat[][]= new char [n][];


        while(i<mat.length/2+1){
            mat[i]=new char [i];
            for (int j=0;j<mat[i].length;j++)
                mat[i][j]='*';
            i++;
        }
        k=mat.length/2+1;

        while(k>=0&&i<n){
            mat[i]=new char [k];
            for (int j=0;j<mat[i].length;j++)
                mat[i][j]='*';
            i++;
            k--;
        }
        mat[n-1][0]='*';

        mostrar(mat);
    }

    private static void mostrar(char mat[][]){
        for (int i=0;i<mat.length;i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + "\t");
            }
            System.out.print("\n");
        }
        System.out.print(mat[mat.length-1][mat[mat.length-1].length-1]);
    }
}
