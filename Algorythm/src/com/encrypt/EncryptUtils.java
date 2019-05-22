package com.encrypt;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import sun.misc.BASE64Encoder;

//Access restriction: The type BASE64Encoder is not accessible due to restriction on required library C:\Program Files (x86)\Java\jre1.6.0_05\lib\rt.jar
public class EncryptUtils {

	private Cipher ecipher;
    private Cipher dcipher;
	
    EncryptUtils(SecretKey key) {
        try {
            ecipher = Cipher.getInstance("AES");
            dcipher = Cipher.getInstance("AES");
            ecipher.init(Cipher.ENCRYPT_MODE, key);
            dcipher.init(Cipher.DECRYPT_MODE, key);
        } catch (Exception e) {
            System.out.println("Failed in initialization");
        }
    }
    
    public String encrypt(String str) {
        try {
            byte[] utf8 = str.getBytes("UTF-8");
            byte[] enc = ecipher.doFinal(utf8);
             
            return new BASE64Encoder().encode(enc);
        } catch (Exception e) {
            System.out.println("Failed in Encryption");
        }
        return null;
    }
    
    public String decrypt(String str) {
        try {
            byte[] dec = new sun.misc.BASE64Decoder().decodeBuffer(str);
 
            byte[] utf8 = dcipher.doFinal(dec);
 
            return new String(utf8, "UTF-8");
        } catch (Exception e) {
            System.out.println("Failed in Decryption");
        }
        return null;
    }
    
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
            String mykey ="1234567891234567";
            SecretKey key = new SecretKeySpec(mykey.getBytes(), "AES");
            EncryptUtils encrypter = new EncryptUtils(key);
            String original = "sjav2025";
            System.out.println("Before Encryption   : " + original);
            String encrypted = encrypter.encrypt(original);
            System.out.println("After Encryption   : " + encrypted);
            String decrypted = encrypter.decrypt(encrypted);
            System.out.println("After Decryption   : " + decrypted);
         
             
             
        } catch (Exception e) {
        }

	}

}
