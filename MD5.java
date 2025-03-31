import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

class MD5 {
public static String md5(String input) {
try {
MessageDigest hash = MessageDigest.getInstance("MD5");
byte[] messageDigest = hash.digest(input.getBytes());
BigInteger no = new BigInteger(1, messageDigest);
String hashtext = no.toString(16);
while (hashtext.length() < 32) {
hashtext = "0" + hashtext;
}
return hashtext;
} catch (NoSuchAlgorithmException e) {
throw new RuntimeException(e);
}
}

public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter string to generate MD5 hash: ");
String s = sc.nextLine();
System.out.println("Generated MD5 hash: " + md5(s));
sc.close();
}
}


