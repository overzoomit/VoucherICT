
package com.stasbranger.voucherict.soap;

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
 *         &lt;element name="countryCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vatNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="traderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="traderCompanyType" type="{urn:ec.europa.eu:taxud:vies:services:checkVat:types}companyTypeCode" minOccurs="0"/>
 *         &lt;element name="traderStreet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="traderPostcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="traderCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requesterCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requesterVatNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "countryCode",
    "vatNumber",
    "traderName",
    "traderCompanyType",
    "traderStreet",
    "traderPostcode",
    "traderCity",
    "requesterCountryCode",
    "requesterVatNumber"
})
@XmlRootElement(name = "checkVatApprox")
public class CheckVatApprox {

    @XmlElement(required = true)
    protected String countryCode;
    @XmlElement(required = true)
    protected String vatNumber;
    protected String traderName;
    protected String traderCompanyType;
    protected String traderStreet;
    protected String traderPostcode;
    protected String traderCity;
    protected String requesterCountryCode;
    protected String requesterVatNumber;

    /**
     * Recupera il valore della proprietà countryCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Imposta il valore della proprietà countryCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Recupera il valore della proprietà vatNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVatNumber() {
        return vatNumber;
    }

    /**
     * Imposta il valore della proprietà vatNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVatNumber(String value) {
        this.vatNumber = value;
    }

    /**
     * Recupera il valore della proprietà traderName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraderName() {
        return traderName;
    }

    /**
     * Imposta il valore della proprietà traderName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraderName(String value) {
        this.traderName = value;
    }

    /**
     * Recupera il valore della proprietà traderCompanyType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraderCompanyType() {
        return traderCompanyType;
    }

    /**
     * Imposta il valore della proprietà traderCompanyType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraderCompanyType(String value) {
        this.traderCompanyType = value;
    }

    /**
     * Recupera il valore della proprietà traderStreet.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraderStreet() {
        return traderStreet;
    }

    /**
     * Imposta il valore della proprietà traderStreet.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraderStreet(String value) {
        this.traderStreet = value;
    }

    /**
     * Recupera il valore della proprietà traderPostcode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraderPostcode() {
        return traderPostcode;
    }

    /**
     * Imposta il valore della proprietà traderPostcode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraderPostcode(String value) {
        this.traderPostcode = value;
    }

    /**
     * Recupera il valore della proprietà traderCity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraderCity() {
        return traderCity;
    }

    /**
     * Imposta il valore della proprietà traderCity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraderCity(String value) {
        this.traderCity = value;
    }

    /**
     * Recupera il valore della proprietà requesterCountryCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequesterCountryCode() {
        return requesterCountryCode;
    }

    /**
     * Imposta il valore della proprietà requesterCountryCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequesterCountryCode(String value) {
        this.requesterCountryCode = value;
    }

    /**
     * Recupera il valore della proprietà requesterVatNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequesterVatNumber() {
        return requesterVatNumber;
    }

    /**
     * Imposta il valore della proprietà requesterVatNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequesterVatNumber(String value) {
        this.requesterVatNumber = value;
    }

}
