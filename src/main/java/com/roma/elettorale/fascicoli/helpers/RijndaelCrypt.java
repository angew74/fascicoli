package com.roma.elettorale.fascicoli.helpers;


import com.roma.elettorale.fascicoli.service.CertificatiClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;


public class RijndaelCrypt {

    private static final Logger log = LoggerFactory.getLogger(RijndaelCrypt.class);

    public static final String TAG = "Fascicoli";

    private static String TRANSFORMATION = "AES/CBC/PKCS5Padding";
    private static String ALGORITHM = "AES";
    private static String DIGEST = "MD5";

    private static Cipher _cipher;
    private static SecretKey _password;
    private static IvParameterSpec _IVParamSpec;

    //16-byte private key
    private static byte[] IV = "comunediroma2007".getBytes();


    /**
     Constructor
     @password Public key

     */
    public RijndaelCrypt(String password) {

        try {

            //Encode digest
            MessageDigest digest;
            digest = MessageDigest.getInstance(DIGEST);
            _password = new SecretKeySpec(digest.digest(password.getBytes()), ALGORITHM);

            //Initialize objects
            _cipher = Cipher.getInstance(TRANSFORMATION);
            _IVParamSpec = new IvParameterSpec(IV);

        } catch (NoSuchAlgorithmException e) {
            log.error(TAG, "No such algorithm " + ALGORITHM, e);
        } catch (NoSuchPaddingException e) {
            log.error(TAG, "No such padding PKCS7", e);
        }
    }

    /**
     Encryptor.

     @text String to be encrypted
     @return Base64 encrypted text

     */
    public String encrypt(byte[] text) {

        byte[] encryptedData;

        try {

            _cipher.init(Cipher.ENCRYPT_MODE, _password, _IVParamSpec);
            encryptedData = _cipher.doFinal(text);

        } catch (InvalidKeyException e) {
            log.error(TAG, "Invalid key  (invalid encoding, wrong length, uninitialized, etc).", e);
            return null;
        } catch (InvalidAlgorithmParameterException e) {
            log.error(TAG, "Invalid or inappropriate algorithm parameters for " + ALGORITHM, e);
            return null;
        } catch (IllegalBlockSizeException e) {
            log.error(TAG, "The length of data provided to a block cipher is incorrect", e);
            return null;
        } catch (BadPaddingException e) {
            log.error(TAG, "The input data but the data is not padded properly.", e);
            return null;
        }
        String encodedString = Base64.getEncoder().encodeToString(encryptedData);
        return encodedString;

    }

    /**
     Decryptor.

     @text Base64 string to be decrypted
     @return decrypted text

     */
    public String decrypt(String text) {

        try {
            _cipher.init(Cipher.DECRYPT_MODE, _password, _IVParamSpec);

            byte[] decodedValue = Base64.getDecoder().decode(text);
            byte[] decryptedVal = _cipher.doFinal(decodedValue);
            return new String(decryptedVal);


        } catch (InvalidKeyException e) {
            log.error(TAG, "Invalid key  (invalid encoding, wrong length, uninitialized, etc).", e);
            return null;
        } catch (InvalidAlgorithmParameterException e) {
            log.error(TAG, "Invalid or inappropriate algorithm parameters for " + ALGORITHM, e);
            return null;
        } catch (IllegalBlockSizeException e) {
            log.error(TAG, "The length of data provided to a block cipher is incorrect", e);
            return null;
        } catch (BadPaddingException e) {
            log.error(TAG, "The input data but the data is not padded properly.", e);
            return null;
        }

    }

}