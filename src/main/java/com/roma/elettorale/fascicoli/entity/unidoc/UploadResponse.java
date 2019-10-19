package com.roma.elettorale.fascicoli.entity.unidoc;


import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "message"
})



    @XmlRootElement(name = "UploadResponse", namespace = "")
    public class UploadResponse {

        @XmlElement(name = "Message", namespace = "http://tempuri.org/BustaProtocollo.xsd", required = true)
        protected Message message;

        public Message getMessage() {
            return message;
        }

        /**
         * Imposta il valore della propriet� message.
         *
         * @param value
         *     allowed object is
         *     {@link Message }
         *
         */
        public void setMessage(Message value) {
            this.message = value;
        }
}
