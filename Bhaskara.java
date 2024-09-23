import java.util.Scanner;

public class Bhaskara {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		double A , B , C , del, x, x1, x2;
		A = sc.nextDouble();
		System.out.println("O valor de A é: " + A);
		B = sc.nextDouble();
			System.out.println("O valor de B é: " + B);
			C= sc.nextDouble();
			System.out.println("O valor de C é: " + C);
			
			del= (B*B -4 * A* C);
           x =-B / (2 * A);
			x1= (-B - Math.sqrt(del)) / (2*A);
			x2= (-B + Math.sqrt(del)) / (2*A);
			
			if (del > 0) {
				System.out.println("Há duas soluções reais. ");
				System.out.printf("A solução da x1 é: %1f" , x1 );
				System.out.printf("A solução do x2 é: %1f" , x2);
			}else if (del ==0) {
				System.out.println("Há uma soluçao real.");
				System.out.printf("A solução é: %1f " , + x);
			}else {
				System.out.println("Não há solução real.");
			}
        }
}
