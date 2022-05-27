package com.day6Arrays;



public class PrimeNumber {
	public int[] findAndReturnPrimeNumbers(int[] arr) {
		boolean isPrime = true;
		int[]a= new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=2;j<arr[i];j++)
			{
				if(arr[i]%j==0)
				{
					isPrime = false;
					break;
				}
				else {
					a[j]=arr[j];
				}
			}
		}
		 return a;
		
	}
	public static void main(String[] args) {
		int[] arr = {10,12,5,50,11,14,15};
		PrimeNumber primeNumber = new PrimeNumber();
		int[] ans =  primeNumber.findAndReturnPrimeNumbers(arr);
		System.out.println(ans);
	}
}
//var isPrime = true;
//for (var i = 2; i < num; i++) {
//   if(num % i == 0) {
//       isPrime = false;
//       break;
//   }
//}
//
//if (isPrime) {
//   console.log("Yes");
//} else {
//   console.log("No");
//}


/*
 * public int[] findAndReturnPrimeNumbers(int[] inputArray){ //write the logic
 * to iterate through the supplied inputArray and //determine each element
 * whether it is prime or not //create a second array of int //if any number is
 * prime inside the inputArray then add that number inside the second //array
 * //and return the second array //if no prime number is found then return the
 * empty array. } public static void main(String[] args){ //Create the object of
 * Main class //on the object of Main class call the findAndReturnPrimeNumbers
 * method //by supplying the following array as the parameter int[] arr =
 * {10,12,5,50,11,14,15}; //print each element from the returned array of
 * findAndReturnPrimeNumbers method //if findAndReturnPrimeNumbers method
 * returns an empty array then print the following message: //
 * "Prime number not found in the supplied Array" }
 */