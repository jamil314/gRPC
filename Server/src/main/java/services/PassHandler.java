package services;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;

public class PassHandler {
    static String hash(String password){
        SecureRandom random = new SecureRandom();
        byte[] salt = new byte[16];
        System.out.println(new String(salt));
        random.nextBytes(salt);

        KeySpec spec = new PBEKeySpec(password.toCharArray(), salt, 65536, 128);
        SecretKeyFactory factory;

        {
            try {
                factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
                byte[] hash = factory.generateSecret(spec).getEncoded();
                String saltS = new String(hash, StandardCharsets.UTF_8);
                return getPw(password, saltS)+"jamil"+saltS;
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
            } catch (InvalidKeySpecException e) {
                e.printStackTrace();
            }
        }
        return "";
    }

    static String getPw(String password, String saltS){
        byte[] salt = saltS.getBytes(StandardCharsets.UTF_8);
        KeySpec spec = new PBEKeySpec(password.toCharArray(), salt, 65536, 128);
        SecretKeyFactory factory;

        byte[] salt2 = saltS.getBytes(StandardCharsets.UTF_8);
        KeySpec spec2 = new PBEKeySpec(password.toCharArray(), salt, 65536, 128);
        SecretKeyFactory factory2;

        {
            try {
                factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
                byte[] hash = factory.generateSecret(spec).getEncoded();

                factory2 = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
                byte[] hash2 = factory.generateSecret(spec).getEncoded();

                System.out.println(password+"+"+saltS+"="+new String(hash, StandardCharsets.UTF_8));
                System.out.println(password+"+"+saltS+"="+new String(hash2  , StandardCharsets.UTF_8));

                return new String(hash, StandardCharsets.UTF_8);
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
            } catch (InvalidKeySpecException e) {
                e.printStackTrace();
            }
        }
        return "";
    }
}
