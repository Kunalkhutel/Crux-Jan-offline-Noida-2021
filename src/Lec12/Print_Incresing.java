package Lec12;

public class Print_Incresing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        PI(5);
	}
	public static void PI(int n) {
		if(n==0) {
			return;
		}
	// Head Recursion
		PI(n-1);
		System.out.println(n);
	}
}
