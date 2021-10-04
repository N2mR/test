package test;

import java.util.Random;
import java.util.Scanner;

public class Chapter2 {
	
	static Scanner sc() {
		return new Scanner(System.in);
	}
	
	static int max(int[] ary) {
		int max = 0;
		for(int i = 0; i < ary.length; i ++) {
			if(ary[i] > max) {
				max = ary[i];
			}
		}
		return max;
		
		
	}
	
	static int[] inputHeight() {
		Scanner sc = sc();
		System.out.println("身長の最大値を求めます");
		int num;
		System.out.println("人数を入力してください");
		num = sc.nextInt();
		int[] height = new int[num];
		for(int i = 0; i < num; i++) {
			System.out.println(i + 1 + "人目の身長を入力してください");
			height[i] = sc.nextInt();
		}
		return height;
	}
	
	static int[] randomYield() {
		Scanner sc = sc();
		Random rand = new Random();
		System.out.println("人数を入力してください");
		int num = sc.nextInt();
		int[] height = new int[num];
		for(int i = 0; i < num; i++) {
			height[i] = 100 + rand.nextInt(99);
		}
		return height;
		
	}
	
	static void outPut(int[] ary) {
		for(int i = 0; i < ary.length; i++) {
			System.out.println(ary[i]);
		}
		System.out.println();
	}
	
	static int[] narabikae(int[] ary) {
		int len = ary.length / 2;
		int[] newArray = ary;
		for(int i = 0; i < len; i++) {
			int beforeIdx = i;
			int afterIdx = ary.length - i - 1;
			int pickBeforeValue = ary[beforeIdx];
			int pickAfterValue = ary[afterIdx];
			newArray[beforeIdx] = pickAfterValue;
			newArray[afterIdx] = pickBeforeValue;
		}
		return newArray;
	}
	
	static void swap(int[] ary, int idx1, int idx2) {
		int one = ary[idx1];
		int two = ary[idx2];
		System.out.println(one + "と" + two + "を交換します");
		ary[idx1] = two;
		ary[idx2] = one;
	}
	
	static void reverse(int[] ary) {
		int[] newArray = ary;
		for(int i = 0; i < newArray.length / 2; i++) {
			int idx1 = i;
			int idx2 = newArray.length - i - 1;
			swap(newArray, idx1, idx2);
		}
	}
	
	static int sumOf(int[] ary) {
		int sum = 0;
		for(int n: ary) {
			sum += n;
		}
		return sum;
	}
	
	static int[] copy(int[] a, int[] b) {
		int[] newA = a;
		for(int i = 0; i < b.length; i++) {
			newA[i] = b[i];
		}
		return newA;
	}
	
	public static void main(String[] args) {
		
		int[] ary1 = {1,2,3,4,5,6,7,8,9};
		int[] ary2 = {9,8,7,6,5,4,3,2,1};
		int[] newA = copy(ary2, ary1);
		outPut(newA);
		
		
		
	}

}