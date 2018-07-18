
package com.stasbranger.voucherict.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="requestDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="valid" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="traderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="traderCompanyType" type="{urn:ec.europa.eu:taxud:vies:services:checkVat:types}companyTypeCode" minOccurs="0"/>
 *         &lt;element name="traderAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="traderStreet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="traderPostcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="traderCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="traderNameMatch" type="{urn:ec.europa.eu:taxud:vies:services:checkVat:types}matchCode" minOccurs="0"/>
 *         &lt;element name="traderCompanyTypeMatch" type="{urn:ec.europa.eu:taxud:vies:services:checkVat:types}matchCode" minOccurs="0"/>
 *         &lt;element name="traderStreetMatch" type="{urn:ec.europa.eu:taxud:vies:services:checkVat:types}matchCode" minOccurs="0"/>
 *         &lt;element name="traderPostcodeMatch" type="{urn:ec.europa.eu:taxud:vies:services:checkVat:types}matchCode" minOccurs="0"/>
 *         &lt;element name="traderCityMatch" type="{urn:ec.europa.eu:taxud:vies:services:checkVat:types}matchCode" minOccurs="0"/>
 *         &lt;element name="requestIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "requestDate",
    "valid",
    "traderName",
    "traderCompanyType",
    "traderAddress",
    "traderStreet",
    "traderPostcode",
    "traderCity",
    "traderNameMatch",
    "traderCompanyTypeMatch",
    "traderStreetMatch",
    "traderPostcodeMatch",
    "traderCityMatch",
    "requestIdentifier"
})
@XmlRootElement(name = "checkVatApproxResponse")
public class CheckVatApproxResponse {

    @XmlElement(required = true)
    protected String countryCode;
    @XmlElement(required = true)
    protected String vatNumber;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar requestDate;
    protected boolean valid;
    @XmlElementRef(name = "traderName", namespace = "urn:ec.europa.eu:taxud:vies:services:checkVat:types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> traderName;
    @XmlElementRef(name = "traderCompanyType", namespace = "urn:ec.europa.eu:taxud:vies:services:checkVat:types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> traderCompanyType;
    protected String traderAddress;
    protected String traderStreet;
    protected String traderPostcode;
    protected String traderCity;
    protected String traderNameMatch;
    protected String traderCompanyTypeMatch;
    protected String traderStreetMatch;
    protected String traderPostcodeMatch;
    protected String traderCityMatch;
    @XmlElement(required = true)
    protected String requestIdentifier;

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
     * Recupera il valore della proprietà requestDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRequestDate() {
        return requestDate;
    }

    /**
     * Imposta il valore della proprietà requestDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRequestDate(XMLGregorianCalendar value) {
        this.requestDate = value;
    }

    /**
     * Recupera il valore della proprietà valid.
     * 
     */
    public boolean isValid() {
        return valid;
    }

    /**
     * Imposta il valore della proprietà valid.
     * 
     */
    public void setValid(boolean value) {
        this.valid = value;
    }

    /**
     * Recupera il valore della proprietà traderName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTraderName() {
        return traderName;
    }

    /**
     * Imposta il valore della proprietà traderName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTraderName(JAXBElement<String> value) {
        this.traderName = value;
    }

    /**
     * Recupera il valore della proprietà traderCompanyType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTraderCompanyType() {
        return traderCompanyType;
    }

    /**
     * Imposta il valore della proprietà traderCompanyType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTraderCompanyType(JAXBElement<String> value) {
        this.traderCompanyType = value;
    }

    /**
     * Recupera il valore della proprietà traderAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraderAddress() {
        return traderAddress;
    }

    /**
     * Imposta il valore della proprietà traderAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraderAddress(String value) {
        this.traderAddress = value;
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
     * Recupera il valore della proprietà traderNameMatch.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraderNameMatch() {
        return traderNameMatch;
    }

    /**
     * Imposta il valore della proprietà traderNameMatch.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraderNameMatch(String value) {
        this.traderNameMatch = value;
    }

    /**
     * Recupera il valore della proprietà traderCompanyTypeMatch.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraderCompanyTypeMatch() {
        return traderCompanyTypeMatch;
    }

    /**
     * Imposta il valore della proprietà traderCompanyTypeMatch.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraderCompanyTypeMatch(String value) {
        this.traderCompanyTypeMatch = value;
    }

    /**
     * Recupera il valore della proprietà traderStreetMatch.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraderStreetMatch() {
        return traderStreetMatch;
    }

    /**
     * Imposta il valore della proprietà traderStreetMatch.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraderStreetMatch(String value) {
        this.traderStreetMatch = value;
    }

    /**
     * Recupera il valore della proprietà traderPostcodeMatch.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraderPostcodeMatch() {
        return traderPostcodeMatch;
    }

    /**
     * Imposta il valore della proprietà traderPostcodeMatch.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraderPostcodeMatch(String value) {
        this.traderPostcodeMatch = value;
    }

    /**
     * Recupera il valore della proprietà traderCityMatch.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraderCityMatch() {
        return traderCityMatch;
    }

    /**
     * Imposta il valore della proprietà traderCityMatch.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraderCityMatch(String value) {
        this.traderCityMatch = value;
    }

    /**
     * Recupera il valore della proprietà requestIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestIdentifier() {
        return requestIdentifier;
    }

    /**
     * Imposta il valore della proprietà requestIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestIdentifier(String value) {
        this.requestIdentifier = value;
    }

}
