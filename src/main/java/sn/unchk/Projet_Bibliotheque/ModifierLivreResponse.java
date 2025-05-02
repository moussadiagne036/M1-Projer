package sn.unchk.Projet_Bibliotheque;

import java.util.List;
import java.util.Map;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)

public class ModifierLivreResponse {

    @XmlElement(required = true)
    private String message;

    public String getMessage() {
        return message;
    }



    public void setMessage(String s) {
        this.message = message;

    }
}
