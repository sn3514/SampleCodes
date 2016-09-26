package com.fanniemae.icf.or.service.util;

import static org.assertj.core.api.Assertions.assertThat;

import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import org.junit.Test;
import org.springframework.security.crypto.encrypt.BytesEncryptor;
import org.springframework.security.crypto.encrypt.Encryptors;

public class EncyptionUtils {
	
	@Test 
	public void testEncryptionStronger() throws Exception {
		BytesEncryptor encryptor = Encryptors.stronger("password", "RdWqxw22qy0FesmZ0yQfIw");
		byte[] result = encryptor.encrypt("text".getBytes("UTF-8"));
		assertThat(result).isNotNull();
		assertThat(new String(result).equals("text")).isFalse();
		assertThat(new String(encryptor.decrypt(result))).isEqualTo("text");
		assertThat(new String(result)).isNotEqualTo(
				new String(encryptor.encrypt("text".getBytes())));
	}
	
	
	public static void main(String...args) throws Exception {
		String saltFromEPV = "abc123";
		
		byte[] key = saltFromEPV.getBytes("utf-8");
		MessageDigest sha = MessageDigest.getInstance("SHA-1");
		key = sha.digest(key);
		key = Arrays.copyOf(key, 16);
		
		SecretKeySpec secretKeySpec = new SecretKeySpec(key, "AES");
		
		Cipher cipher = Cipher.getInstance("AES");
		cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);
		byte[] encrypted = cipher.doFinal("Agn0stic".getBytes("utf-8"));
		System.out.println("encrypted string: " + Base64.getEncoder().encodeToString(encrypted));
		
		cipher.init(Cipher.DECRYPT_MODE, secretKeySpec);
		byte[] original = cipher.doFinal(encrypted);
		String originalString = new String(original);
		System.out.println("original string: " + originalString);
		
		
	}	
	
}
