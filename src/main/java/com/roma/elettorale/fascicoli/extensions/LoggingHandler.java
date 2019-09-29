package com.roma.elettorale.fascicoli.extensions;

import java.io.ByteArrayOutputStream;
import java.lang.invoke.MethodHandles;
import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class LoggingHandler implements SOAPHandler<SOAPMessageContext> {

    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @Override
    public boolean handleMessage(final SOAPMessageContext context) {
        final SOAPMessage msg = context.getMessage();
        final boolean request = ((Boolean) context.get(SOAPMessageContext.MESSAGE_OUTBOUND_PROPERTY)).booleanValue();
        if (request) { // This is a request message.
            logMessage(msg);
        } else { // This is the response message
            logMessage(msg);
        }
        return true;
    }

    @Override
    public boolean handleFault(final SOAPMessageContext context) {
        logMessage(context.getMessage());
        return true;
    }

    private void logMessage(final SOAPMessage msg) {
        try {
            // Write the message to the output stream
            final ByteArrayOutputStream baos = new ByteArrayOutputStream();
            msg.writeTo(baos);
            LOGGER.info(baos.toString());
            baos.close();
        } catch (final Exception e) {
            LOGGER.error("Caught exception: " + e.getMessage(), e);
        }
    }

    @Override
    public void close(final MessageContext context) {
        // Not required for logging
    }

    @Override
    public Set<QName> getHeaders() {
        // Not required for logging
        return null;
    }

}