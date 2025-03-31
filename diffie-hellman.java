import java.util.Scanner;
class DiffiHell{
private static long power(long a, long b, long p) {
long result = 1;
a = a % p;
while (b > 0) {
if (b % 2 == 1) {
result = (result * a) % p;
}
a = (a * a) % p;
b = b / 2;
}
return result;
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
long P, G, x, a, y, b, ka, kb;
System.out.print("Enter the prime number P: ");
P = sc.nextLong();
System.out.print("Enter the primitive root G for P: ");
G = sc.nextLong();
System.out.print("Enter Alice's private key a: ");
a = sc.nextLong();
x = power(G, a, P);
System.out.print("Enter Bob's private key b: ");
b = sc.nextLong();
y = power(G, b, P);
ka = power(y, a, P);
kb = power(x, b, P);
System.out.println("Public value for Alice (x): " + x);
System.out.println("Public value for Bob (y): " + y);
System.out.println("Secret key for Alice: " + ka);
System.out.println("Secret key for Bob: " + kb);
sc.close();
}
}
