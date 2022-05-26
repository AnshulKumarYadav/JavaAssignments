package com.day6Arrays;

import java.util.Scanner;

public class EvenSum {
	static void evenSum(int N,int M,int[][]mat)
	{
		int sum;
		System.out.println("The matrix is : ");
		for(int i=0;i<N;i++)
		{
			sum = 0;
			String bag="";
			for(int j=0;j<M;j++)
			{
				bag += mat[i][j]+" ";
				if(mat[i][j]%2==0)
				{
//					System.out.println("Even numbers: "+mat[i][j]);
					sum =+ mat[i][j];
				}
			}
			System.out.println(bag);
			System.out.println("The sum of even numbers in the columns : "+sum);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int N = sc.nextInt();
		System.out.println("Enter the number of columns: ");
		int M = sc.nextInt();
		int[][] mat = new int[N][M];
		System.out.println("Enter the matrix: ");
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<M;j++)
			{
				mat[i][j]=sc.nextInt();
			}
		}
		sc.close();
		evenSum(N, M, mat);
	}
}


//arr = [1,2,3],[4,5,6],[7,8,9]