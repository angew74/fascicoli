package com.roma.elettorale.fascicoli.service;

import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;
import org.apache.ws.security.WSPasswordCallback;
import org.apache.ws.security.util.Base64;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class PasswordCallBack implements CallbackHandler {

    private static final Logger log = LoggerFactory.getLogger(PasswordCallBack.class);


    @Autowired
    Environment env;


    public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {

        for (int i = 0; i < callbacks.length; i++) {
            if (callbacks[i] instanceof WSPasswordCallback) {
                WSPasswordCallback pc = (WSPasswordCallback)callbacks[i];

                if (pc.getUsage()==org.apache.ws.security.WSPasswordCallback.USERNAME_TOKEN){

                    String password=env.getProperty("passwordcertificati");
                    byte[] b = password.getBytes("UTF-8");
                    MessageDigest sha=null;
                    try {
                        sha = MessageDigest.getInstance("SHA-1");
                    } catch (NoSuchAlgorithmException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    sha.reset();
                    sha.update(b);
                    pc.setPassword(Base64.encode(sha.digest()));
                }

            }
            else {
                throw new UnsupportedCallbackException(callbacks[i], "Unrecognized Callback");
            }
        }
    }
}