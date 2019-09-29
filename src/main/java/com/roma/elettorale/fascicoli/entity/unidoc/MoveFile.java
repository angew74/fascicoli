
package com.roma.elettorale.fascicoli.entity.unidoc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id_file" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="id_folder" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "idFile",
    "idFolder"
})
@XmlRootElement(name = "moveFile")
public class MoveFile {

    @XmlElement(name = "id_file", namespace = "http://tempuri.org/")
    protected int idFile;
    @XmlElement(name = "id_folder", namespace = "http://tempuri.org/")
    protected int idFolder;

    /**
     * Recupera il valore della proprieta idFile.
     * 
     */
    public int getIdFile() {
        return idFile;
    }

    /**
     * Imposta il valore della proprieta idFile.
     * 
     */
    public void setIdFile(int value) {
        this.idFile = value;
    }

    /**
     * Recupera il valore della proprieta idFolder.
     * 
     */
    public int getIdFolder() {
        return idFolder;
    }

    /**
     * Imposta il valore della proprieta idFolder.
     * 
     */
    public void setIdFolder(int value) {
        this.idFolder = value;
    }

}
