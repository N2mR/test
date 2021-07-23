package test;
import java.util.Scanner;
public class Test {
	
	//stdIn
	public static Scanner stdIn() {
//		Scanner stdIn = new Scanner(System.in);
		return new Scanner(System.in);
	}
	
	 static int max(int a, int b, int c, int d) {
		int max = a;
		if(b > max) max = b;
		if(c > max) max = c;
		if(d > max) max = d;
		return max;
	}
	 
	static int min(int a, int b, int c) {
		int min = a;
		if(min > b) min = b;
		if(min > c) min = c;
		return min;
	}
	
	static int mid3(int a, int b, int c) {
		if(a >= b) {
			if(b >= c) {
				return b;
			}else if(a <= c) {
				return a;
			}else {
				return c;
			}
		}else if(a >= c) {
			return a;
		}else if(b >= c) {
			return c;
		}else {
			return b;
		}
	}
	static int callMid3WithTerminal(){
		Scanner sc = new Scanner(System.in);
		System.out.println("1つめの数字を入力してください");
		int one = sc.nextInt();
		System.out.println("2つめの数字を入力してください");
		int two = sc.nextInt();
		System.out.println("3つめの数字を入力してください");
		int three = sc.nextInt();
		
		int midResult = mid3(one, two, three);
		sc.close();
		return midResult;
	}
	
	static void judgeSign() {
		Scanner sc = new Scanner(System.in);
		System.out.println("数字を入力してください");
		int n = sc.nextInt();
		if(n > 0) {
			System.out.println("正です");
		}else if(n < 0) {
			System.out.println("負です");
		}else {
			System.out.println("0です");
		}
		sc.close();
	}
	
	static void oneSeven() {
		int aSum = 0;
		for(int i = 1; i < 11; i++) {
			aSum += i;
		}
		System.out.println(aSum);
	}
	
	static void oneEight() {
		Scanner stdIn = new Scanner(System.in);
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		
		int max;
		int min;
		
		if(a >= b) {
			max = a;
			min = b;
		}else { 
			max = b;
			min = a;
		}
		
		int bSum = 0;
		for(int i = min; i < max + 1; i++) {
			bSum += i;
		}
		stdIn.close();
		System.out.println(bSum);
	}
	
	static void oneNine() {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("数値aを入力してください");
		int a = stdIn.nextInt();
		int b;
		do {
			System.out.println("aよりも大きい数値bを入力してください");
			b = stdIn.nextInt();
		}while(a > b);
		stdIn.close();
		System.out.println("b - a = 6" + (b - a) + "です");
	}
	
	static void oneTen() {
		Scanner stdIn = new Scanner(System.in);
		int n;
		do {
			System.out.println("整数を入力してください");
			n = stdIn.nextInt();
		}while(n <= 0);
		
		int digest = 0;
		while(n > 0) {
			n /= 10;
			digest++;
		}
		System.out.println("整数nの桁数は" + digest + "です");
		stdIn.close();
	}
	
	static void listOneTen() {
		Scanner stdIn = stdIn();
		int n;
		do {
			System.out.println("整数ｎを入力してください");
			n = stdIn.nextInt();
		}while(n <= 0);
		System.out.println("１からｎまでの総和を求めます");
		int sum = 0;
		for(int i = 1; i < n; i++) {
			System.out.print(i + " + ");
			sum += i;
		}
		System.out.print(n + " = ");
		sum += n;
		System.out.println(sum);
		
	}
	
	static void listOneFourteenOriginal(){
		Scanner sc = stdIn();
		int w, n;
		System.out.println("指定された個数のh * wを*で埋めます\nhの個数を整数で入力してください");
		do {
			n = sc.nextInt();
		}while(n <= 0);
		System.out.println("wの個数を整数で入力してください");
		do {
			w = sc.nextInt();
		}while(w <= 0);
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < w; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	static void listOneFourteen() {
		Scanner sc = stdIn();
		int n, w;
		System.out.println("ｎを入力してください");
		n = sc.nextInt();
		System.out.println("ｗを入力してください");
		w = sc.nextInt();
		for(int i = 0; i < n; i++) {
			System.out.print("*");
			if((i+ 1) % w == 0) {
				System.out.println();
			}
		}
		sc.close();
		
	}
	
	static void listOneFourteenRepaired() {
		Scanner sc = stdIn();
		int n,w;
		System.out.println("ｎを入力してください");
		n = sc.nextInt();
		System.out.println("ｗを入力してください");
		w = sc.nextInt();
		int blockN = n / w;
		for(int i = 0; i < blockN; i++) {
			System.out.println("*".repeat(w));
		}
		int rest = n % w;
		if(rest > 0) {
			System.out.println("*".repeat(rest));
		}
		sc.close();
	}
	
	static void colOneSeven() {
		Scanner sc = stdIn();
		int num;
		do {
			System.out.println("二桁の自然数を入力してください");
			num = sc.nextInt();
		}while(num < 10 || num > 99);
	}
	public static void main(String[] args) {
		
		colOneSeven();
		
	}

}