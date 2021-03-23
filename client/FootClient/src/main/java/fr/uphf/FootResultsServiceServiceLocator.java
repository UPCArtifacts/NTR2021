/**
 * FootResultsServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package fr.uphf;

public class FootResultsServiceServiceLocator extends org.apache.axis.client.Service implements fr.uphf.FootResultsServiceService {

    public FootResultsServiceServiceLocator() {
    }


    public FootResultsServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public FootResultsServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for FootResultsService
    private java.lang.String FootResultsService_address = "http://localhost:8080/ExempleWebAppMaven/services/FootResultsService";

    public java.lang.String getFootResultsServiceAddress() {
        return FootResultsService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String FootResultsServiceWSDDServiceName = "FootResultsService";

    public java.lang.String getFootResultsServiceWSDDServiceName() {
        return FootResultsServiceWSDDServiceName;
    }

    public void setFootResultsServiceWSDDServiceName(java.lang.String name) {
        FootResultsServiceWSDDServiceName = name;
    }

    public fr.uphf.FootResultsService getFootResultsService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(FootResultsService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getFootResultsService(endpoint);
    }

    public fr.uphf.FootResultsService getFootResultsService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            fr.uphf.FootResultsServiceSoapBindingStub _stub = new fr.uphf.FootResultsServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getFootResultsServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setFootResultsServiceEndpointAddress(java.lang.String address) {
        FootResultsService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (fr.uphf.FootResultsService.class.isAssignableFrom(serviceEndpointInterface)) {
                fr.uphf.FootResultsServiceSoapBindingStub _stub = new fr.uphf.FootResultsServiceSoapBindingStub(new java.net.URL(FootResultsService_address), this);
                _stub.setPortName(getFootResultsServiceWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("FootResultsService".equals(inputPortName)) {
            return getFootResultsService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://uphf.fr", "FootResultsServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://uphf.fr", "FootResultsService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("FootResultsService".equals(portName)) {
            setFootResultsServiceEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
