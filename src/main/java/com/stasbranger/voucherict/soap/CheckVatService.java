package com.stasbranger.voucherict.soap;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;

/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(
		name = "checkVatService",
		targetNamespace = "urn:ec.europa.eu:taxud:vies:services:checkVat",
		wsdlLocation = "http://ec.europa.eu/taxation_customs/vies/checkVatService.wsdl")
public class CheckVatService
extends Service
{

	private final static URL CHECKVATSERVICE_WSDL_LOCATION;
	private final static WebServiceException CHECKVATSERVICE_EXCEPTION;
	private final static QName CHECKVATSERVICE_QNAME = new QName("urn:ec.europa.eu:taxud:vies:services:checkVat", "checkVatService");

	static{
		URL url = null;
		WebServiceException e = null;
		try{
			url = new URL("http://ec.europa.eu/taxation_customs/vies/checkVatService.wsdl");
		}catch(MalformedURLException ex){
			e = new WebServiceException(ex);
		}
		CHECKVATSERVICE_WSDL_LOCATION = url;
		CHECKVATSERVICE_EXCEPTION = e;
	}

	public CheckVatService(){
		super(__getWsdlLocation(), CHECKVATSERVICE_QNAME);
	}

	/*
	public CheckVatService(WebServiceFeature... features){
		super(__getWsdlLocation(), CHECKVATSERVICE_QNAME, features);
	}
	*/

	public CheckVatService(URL wsdlLocation){
		super(wsdlLocation, CHECKVATSERVICE_QNAME);
	}

	/*
	public CheckVatService(URL wsdlLocation, WebServiceFeature... features){
		super(wsdlLocation, CHECKVATSERVICE_QNAME, features);
	}
	*/

	public CheckVatService(URL wsdlLocation, QName serviceName){
		super(wsdlLocation, serviceName);
	}

	/*
	public CheckVatService(URL wsdlLocation, QName serviceName, WebServiceFeature... features){
		super(wsdlLocation, serviceName, features);
	}
	*/

	/**
	 * 
	 * @return
	 *         returns CheckVatPortType
	 */
	@WebEndpoint(name = "checkVatPort")
	public CheckVatPortType getCheckVatPort() {
		return super.getPort(new QName("urn:ec.europa.eu:taxud:vies:services:checkVat", "checkVatPort"), CheckVatPortType.class);
	}

	/**
	 * 
	 * @param features
	 *            A list of {@link javax.xml.ws.WebServiceFeature} to configure
	 *            on the proxy. Supported features not in the
	 *            <code>features</code> parameter will have their default
	 *            values.
	 * @return
	 *         returns CheckVatPortType
	 */
	@WebEndpoint(name = "checkVatPort")
	public CheckVatPortType getCheckVatPort(WebServiceFeature... features) {
		return super.getPort(new QName("urn:ec.europa.eu:taxud:vies:services:checkVat", "checkVatPort"), CheckVatPortType.class, features);
	}

	private static URL __getWsdlLocation() {
		if(CHECKVATSERVICE_EXCEPTION != null){
			throw CHECKVATSERVICE_EXCEPTION;
		}
		return CHECKVATSERVICE_WSDL_LOCATION;
	}

}