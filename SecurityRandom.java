package firstPackage;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class SecurityRandom {

	public static void main(String[] args) {
		SecureRandom sr = null;
		try {
			sr = SecureRandom.getInstance("SHA1PRNG");
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		byte[] b = new byte[2];
		sr.nextBytes(b);
		for(byte a:b){
			System.out.println(a);
		}
		sr.setSeed(b);
		System.out.println(sr.nextInt());

	}
}