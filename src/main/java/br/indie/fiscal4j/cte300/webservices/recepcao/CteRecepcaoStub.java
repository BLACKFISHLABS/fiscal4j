package br.indie.fiscal4j.cte300.webservices.recepcao;

import org.apache.axiom.om.OMAttribute;
import org.apache.axis2.client.Stub;

import javax.xml.namespace.QName;

/*
 * CteRecepcaoStub java implementation
 */
@SuppressWarnings({"rawtypes", "unchecked", "deprecation", "unused"})
public class CteRecepcaoStub extends org.apache.axis2.client.Stub {
    protected org.apache.axis2.description.AxisOperation[] _operations;

    // hashmaps to keep the fault mapping
    private final java.util.HashMap faultExceptionNameMap = new java.util.HashMap();
    private final java.util.HashMap faultExceptionClassNameMap = new java.util.HashMap();
    private final java.util.HashMap faultMessageMap = new java.util.HashMap();

    private static int counter = 0;

    private static synchronized java.lang.String getUniqueSuffix() {
        // reset the counter if it is greater than 99999
        if (CteRecepcaoStub.counter > 99999) {
            CteRecepcaoStub.counter = 0;
        }
        CteRecepcaoStub.counter = CteRecepcaoStub.counter + 1;
        return java.lang.Long.toString(java.lang.System.currentTimeMillis()) + "_" + CteRecepcaoStub.counter;
    }

    private void populateAxisService() {
        // creating the Service with a unique name
        this._service = new org.apache.axis2.description.AxisService("CteRecepcao" + CteRecepcaoStub.getUniqueSuffix());
        this.addAnonymousOperations();
        // creating the operations
        org.apache.axis2.description.AxisOperation __operation;
        this._operations = new org.apache.axis2.description.AxisOperation[1];
        __operation = new org.apache.axis2.description.OutInAxisOperation();
        __operation.setName(new javax.xml.namespace.QName("http://www.portalfiscal.inf.br/cte/wsdl/CteRecepcao", "cteRecepcaoLote"));
        this._service.addOperation(__operation);
        this._operations[0] = __operation;
    }

    // populates the faults
    private void populateFaults() {
    }

    /**
     * Constructor that takes in a configContext
     */

    public CteRecepcaoStub(final org.apache.axis2.context.ConfigurationContext configurationContext, final java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
        this(configurationContext, targetEndpoint, false);
    }

    /**
     * Constructor that takes in a configContext and useseperate listner
     */
    public CteRecepcaoStub(final org.apache.axis2.context.ConfigurationContext configurationContext, final java.lang.String targetEndpoint, final boolean useSeparateListener) throws org.apache.axis2.AxisFault {
        // To populate AxisService
        this.populateAxisService();
        this.populateFaults();
        this._serviceClient = new org.apache.axis2.client.ServiceClient(configurationContext, this._service);
        this._serviceClient.getOptions().setTo(new org.apache.axis2.addressing.EndpointReference(targetEndpoint));
        this._serviceClient.getOptions().setUseSeparateListener(useSeparateListener);
        // Set the soap version
        this._serviceClient.getOptions().setSoapVersionURI(org.apache.axiom.soap.SOAP12Constants.SOAP_ENVELOPE_NAMESPACE_URI);
    }

    /**
     * Default Constructor
     */
    public CteRecepcaoStub(final org.apache.axis2.context.ConfigurationContext configurationContext) throws org.apache.axis2.AxisFault {
        this(configurationContext, "https://cte.fazenda.mg.gov.br/cte/services/CteRecepcao");
    }

    /**
     * Default Constructor
     */
    public CteRecepcaoStub() throws org.apache.axis2.AxisFault {
        this("https://cte.fazenda.mg.gov.br/cte/services/CteRecepcao");
    }

    /**
     * Constructor taking the target endpoint
     */
    public CteRecepcaoStub(final java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
        this(null, targetEndpoint);
    }

    /**
     * Auto generated method signature Transmissão de Lote de CT-e
     *
     * @param cteDadosMsg0
     * @param cteCabecMsg1
     */

    public br.indie.fiscal4j.cte300.webservices.recepcao.CteRecepcaoStub.CteRecepcaoLoteResult cteRecepcaoLote(final br.indie.fiscal4j.cte300.webservices.recepcao.CteRecepcaoStub.CteDadosMsg cteDadosMsg0, final br.indie.fiscal4j.cte300.webservices.recepcao.CteRecepcaoStub.CteCabecMsgE cteCabecMsg1) throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            final org.apache.axis2.client.OperationClient _operationClient = this._serviceClient.createClient(this._operations[0].getName());
            _operationClient.getOptions().setAction("http://www.portalfiscal.inf.br/cte/wsdl/CteRecepcao/cteRecepcaoLote");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);
            this.addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");
            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();
            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env;
            env = this.toEnvelope(Stub.getFactory(_operationClient.getOptions().getSoapVersionURI()), cteDadosMsg0, this.optimizeContent(new javax.xml.namespace.QName("http://www.portalfiscal.inf.br/cte/wsdl/CteRecepcao", "cteRecepcaoLote")), new javax.xml.namespace.QName("http://www.portalfiscal.inf.br/cte/wsdl/CteRecepcao", "cteRecepcaoLote"));
            env.build();
            // add the children only if the parameter is not null
            if (cteCabecMsg1 != null) {
                final org.apache.axiom.om.OMElement omElementcteCabecMsg1 = this.toOM(cteCabecMsg1, this.optimizeContent(new javax.xml.namespace.QName("http://www.portalfiscal.inf.br/cte/wsdl/CteRecepcao", "cteRecepcaoLote")));
                this.addHeader(omElementcteCabecMsg1, env);
            }
            // adding SOAP soap_headers
            this._serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);
            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);
            // execute the operation client
            _operationClient.execute(true);
            final org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            final org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
            final java.lang.Object object = this.fromOM(_returnEnv.getBody().getFirstElement(), br.indie.fiscal4j.cte300.webservices.recepcao.CteRecepcaoStub.CteRecepcaoLoteResult.class, this.getEnvelopeNamespaces(_returnEnv));
            return (br.indie.fiscal4j.cte300.webservices.recepcao.CteRecepcaoStub.CteRecepcaoLoteResult) object;
        } catch (final org.apache.axis2.AxisFault f) {
            final org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (this.faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "cteRecepcaoLote"))) {
                    // make the fault by reflection
                    try {
                        final java.lang.String exceptionClassName = (java.lang.String) this.faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "cteRecepcaoLote"));
                        final java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        final java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        final java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        // message class
                        final java.lang.String messageClassName = (java.lang.String) this.faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "cteRecepcaoLote"));
                        final java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        final java.lang.Object messageObject = this.fromOM(faultElt, messageClass, null);
                        final java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage", messageClass);
                        m.invoke(ex, messageObject);
                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (final ClassCastException | InstantiationException | IllegalAccessException | java.lang.reflect.InvocationTargetException | NoSuchMethodException | ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations Transmissão de Lote de CT-e
     *
     * @param cteDadosMsg0
     * @param cteCabecMsg1
     */
    public void startcteRecepcaoLote(final br.indie.fiscal4j.cte300.webservices.recepcao.CteRecepcaoStub.CteDadosMsg cteDadosMsg0, final br.indie.fiscal4j.cte300.webservices.recepcao.CteRecepcaoStub.CteCabecMsgE cteCabecMsg1, final br.indie.fiscal4j.cte300.webservices.recepcao.CteRecepcaoCallbackHandler callback) throws java.rmi.RemoteException {
        final org.apache.axis2.client.OperationClient _operationClient = this._serviceClient.createClient(this._operations[0].getName());
        _operationClient.getOptions().setAction("http://www.portalfiscal.inf.br/cte/wsdl/CteRecepcao/cteRecepcaoLote");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);
        this.addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");
        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();
        // Style is Doc.
        env = this.toEnvelope(Stub.getFactory(_operationClient.getOptions().getSoapVersionURI()), cteDadosMsg0, this.optimizeContent(new javax.xml.namespace.QName("http://www.portalfiscal.inf.br/cte/wsdl/CteRecepcao", "cteRecepcaoLote")), new javax.xml.namespace.QName("http://www.portalfiscal.inf.br/cte/wsdl/CteRecepcao", "cteRecepcaoLote"));
        // add the soap_headers only if they are not null
        if (cteCabecMsg1 != null) {
            final org.apache.axiom.om.OMElement omElementcteCabecMsg1 = this.toOM(cteCabecMsg1, this.optimizeContent(new javax.xml.namespace.QName("http://www.portalfiscal.inf.br/cte/wsdl/CteRecepcao", "cteRecepcaoLote")));
            this.addHeader(omElementcteCabecMsg1, env);
        }
        // adding SOAP soap_headers
        this._serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);
        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);
        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            @Override
            public void onMessage(final org.apache.axis2.context.MessageContext resultContext) {
                try {
                    final org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                    final java.lang.Object object = CteRecepcaoStub.this.fromOM(resultEnv.getBody().getFirstElement(), br.indie.fiscal4j.cte300.webservices.recepcao.CteRecepcaoStub.CteRecepcaoLoteResult.class, CteRecepcaoStub.this.getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultcteRecepcaoLote((br.indie.fiscal4j.cte300.webservices.recepcao.CteRecepcaoStub.CteRecepcaoLoteResult) object);
                } catch (final org.apache.axis2.AxisFault e) {
                    callback.receiveErrorcteRecepcaoLote(e);
                }
            }

            @Override
            public void onError(final java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    final org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    final org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (CteRecepcaoStub.this.faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "cteRecepcaoLote"))) {
                            // make the fault by reflection
                            try {
                                final java.lang.String exceptionClassName = (java.lang.String) CteRecepcaoStub.this.faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "cteRecepcaoLote"));
                                final java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                final java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                                final java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                                // message class
                                final java.lang.String messageClassName = (java.lang.String) CteRecepcaoStub.this.faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "cteRecepcaoLote"));
                                final java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                final java.lang.Object messageObject = CteRecepcaoStub.this.fromOM(faultElt, messageClass, null);
                                final java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage", messageClass);
                                m.invoke(ex, messageObject);
                                callback.receiveErrorcteRecepcaoLote(new java.rmi.RemoteException(ex.getMessage(), ex));
                            } catch (final ClassCastException | org.apache.axis2.AxisFault | InstantiationException | IllegalAccessException | java.lang.reflect.InvocationTargetException | NoSuchMethodException | ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorcteRecepcaoLote(f);
                            }
                        } else {
                            callback.receiveErrorcteRecepcaoLote(f);
                        }
                    } else {
                        callback.receiveErrorcteRecepcaoLote(f);
                    }
                } else {
                    callback.receiveErrorcteRecepcaoLote(error);
                }
            }

            @Override
            public void onFault(final org.apache.axis2.context.MessageContext faultContext) {
                final org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                this.onError(fault);
            }

            @Override
            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (final org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorcteRecepcaoLote(axisFault);
                }
            }
        });
        org.apache.axis2.util.CallbackReceiver _callbackReceiver;
        if (this._operations[0].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            this._operations[0].setMessageReceiver(_callbackReceiver);
        }
        // execute the operation client
        _operationClient.execute(false);
    }

    /**
     * A utility method that copies the namepaces from the SOAPEnvelope
     */
    private java.util.Map getEnvelopeNamespaces(final org.apache.axiom.soap.SOAPEnvelope env) {
        final java.util.Map returnMap = new java.util.HashMap();
        final java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
        while (namespaceIterator.hasNext()) {
            final org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
            returnMap.put(ns.getPrefix(), ns.getNamespaceURI());
        }
        return returnMap;
    }

    private final javax.xml.namespace.QName[] opNameArray = null;

    private boolean optimizeContent(final javax.xml.namespace.QName opName) {
        if (this.opNameArray == null) {
            return false;
        }
        for (final QName element : this.opNameArray) {
            if (opName.equals(element)) {
                return true;
            }
        }
        return false;
    }

    // https://cte.fazenda.mg.gov.br/cte/services/CteRecepcao
    public static class CteCabecMsgE implements org.apache.axis2.databinding.ADBBean {
        private static final long serialVersionUID = -5726167408343199043L;

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://www.portalfiscal.inf.br/cte/wsdl/CteRecepcao", "cteCabecMsg", "");

        /**
         * field for CteCabecMsg
         */

        protected CteCabecMsg localCteCabecMsg;

        /**
         * Auto generated getter method
         *
         * @return CteCabecMsg
         */
        public CteCabecMsg getCteCabecMsg() {
            return this.localCteCabecMsg;
        }

        /**
         * Auto generated setter method
         *
         * @param param CteCabecMsg
         */
        public void setCteCabecMsg(final CteCabecMsg param) {
            this.localCteCabecMsg = param;
        }

        /**
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        @Override
        public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory) {
            final org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this, CteCabecMsgE.MY_QNAME);
            return factory.createOMElement(dataSource, CteCabecMsgE.MY_QNAME);
        }

        @Override
        public void serialize(final javax.xml.namespace.QName parentQName, final javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            this.serialize(parentQName, xmlWriter, false);
        }

        @Override
        public void serialize(final javax.xml.namespace.QName parentQName, final javax.xml.stream.XMLStreamWriter xmlWriter, final boolean serializeType) throws javax.xml.stream.XMLStreamException {
            // We can safely assume an element has only one type associated with it
            if (this.localCteCabecMsg == null) {
                throw new org.apache.axis2.databinding.ADBException("cteCabecMsg cannot be null!");
            }
            this.localCteCabecMsg.serialize(CteCabecMsgE.MY_QNAME, xmlWriter);
        }

        private static java.lang.String generatePrefix(final java.lang.String namespace) {
            if (namespace.equals("http://www.portalfiscal.inf.br/cte/wsdl/CteRecepcao")) {
                return "";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, final java.lang.String namespace, final java.lang.String localPart, final javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            final java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = CteCabecMsgE.generatePrefix(namespace);
                }
                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(final java.lang.String prefix, final java.lang.String namespace, final java.lang.String attName, final java.lang.String attValue, final javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(final java.lang.String namespace, final java.lang.String attName, final java.lang.String attValue, final javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                this.registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(final java.lang.String namespace, final java.lang.String attName, final javax.xml.namespace.QName qname, final javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            final java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = this.registerPrefix(xmlWriter, attributeNamespace);
            }
            java.lang.String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                this.registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(final javax.xml.namespace.QName qname, final javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            final java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = CteCabecMsgE.generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }
                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(final javax.xml.namespace.QName[] qnames, final javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                final StringBuilder stringToWrite = new StringBuilder();
                java.lang.String namespaceURI;
                java.lang.String prefix;
                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = CteCabecMsgE.generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }
                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }
        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(final javax.xml.stream.XMLStreamWriter xmlWriter, final java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = CteCabecMsgE.generatePrefix(namespace);
                final javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    final java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }

        /**
         * databinding method to get an XML representation of this object
         */
        @Override
        public javax.xml.stream.XMLStreamReader getPullParser(final javax.xml.namespace.QName qName) throws org.apache.axis2.databinding.ADBException {
            // We can safely assume an element has only one type associated with it
            return this.localCteCabecMsg.getPullParser(CteCabecMsgE.MY_QNAME);
        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {

            /**
             * static method to create the object Precondition: If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable If this object is not an element, it is a complex type and the reader is at the event just after the outer start element Postcondition: If this object is an element, the reader is positioned at its end element If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static CteCabecMsgE parse(final javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                final CteCabecMsgE object = new CteCabecMsgE();
                final int event;
                final java.lang.String nillableValue = null;
                final java.lang.String prefix = "";
                final java.lang.String namespaceuri = "";
                try {
                    while (!reader.isStartElement() && !reader.isEndElement()) {
                        reader.next();
                    }
                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    final java.util.Vector handledAttributes = new java.util.Vector();
                    while (!reader.isEndElement()) {
                        if (reader.isStartElement()) {
                            if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.portalfiscal.inf.br/cte/wsdl/CteRecepcao", "cteCabecMsg").equals(reader.getName())) {
                                object.setCteCabecMsg(CteCabecMsg.Factory.parse(reader));
                            } // End of if for expected property start element
                            else {
                                // A start element we are not expecting indicates an invalid parameter was passed
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                            }
                        } else {
                            reader.next();
                        }
                    } // end of while loop
                } catch (final javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }
                return object;
            }
        }// end of factory class
    }

    public static class ExtensionMapper {

        public static java.lang.Object getTypeObject(final java.lang.String namespaceURI, final java.lang.String typeName, final javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            if ("http://www.portalfiscal.inf.br/cte/wsdl/CteRecepcao".equals(namespaceURI) && "cteCabecMsg".equals(typeName)) {
                return CteCabecMsg.Factory.parse(reader);
            }
            throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
        }
    }

    public static class CteCabecMsg implements org.apache.axis2.databinding.ADBBean {
        private static final long serialVersionUID = 4403972013842281508L;
        /*
         * This type was generated from the piece of schema that had name = cteCabecMsg Namespace URI = http://www.portalfiscal.inf.br/cte/wsdl/CteRecepcao Namespace Prefix =
         */

        /**
         * field for CUF
         */

        protected java.lang.String localCUF;

        /*
         * This tracker boolean wil be used to detect whether the user called the set method for this attribute. It will be used to determine whether to include this field in the serialized XML
         */
        protected boolean localCUFTracker = false;

        public boolean isCUFSpecified() {
            return this.localCUFTracker;
        }

        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public java.lang.String getCUF() {
            return this.localCUF;
        }

        /**
         * Auto generated setter method
         *
         * @param param CUF
         */
        public void setCUF(final java.lang.String param) {
            this.localCUFTracker = param != null;
            this.localCUF = param;
        }

        /**
         * field for VersaoDados
         */

        protected java.lang.String localVersaoDados;

        /*
         * This tracker boolean wil be used to detect whether the user called the set method for this attribute. It will be used to determine whether to include this field in the serialized XML
         */
        protected boolean localVersaoDadosTracker = false;

        public boolean isVersaoDadosSpecified() {
            return this.localVersaoDadosTracker;
        }

        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public java.lang.String getVersaoDados() {
            return this.localVersaoDados;
        }

        /**
         * Auto generated setter method
         *
         * @param param VersaoDados
         */
        public void setVersaoDados(final java.lang.String param) {
            this.localVersaoDadosTracker = param != null;
            this.localVersaoDados = param;
        }

        /**
         * field for ExtraAttributes This was an Attribute! This was an Array!
         */

        protected org.apache.axiom.om.OMAttribute[] localExtraAttributes;

        /**
         * Auto generated getter method
         *
         * @return org.apache.axiom.om.OMAttribute[]
         */
        public org.apache.axiom.om.OMAttribute[] getExtraAttributes() {
            return this.localExtraAttributes;
        }

        /**
         * validate the array for ExtraAttributes
         */
        protected void validateExtraAttributes(final org.apache.axiom.om.OMAttribute[] param) {
            if ((param != null) && (param.length > 1)) {
                throw new java.lang.RuntimeException();
            }
            if ((param != null) && (param.length < 1)) {
                throw new java.lang.RuntimeException();
            }
        }

        /**
         * Auto generated setter method
         *
         * @param param ExtraAttributes
         */
        public void setExtraAttributes(final org.apache.axiom.om.OMAttribute[] param) {
            this.validateExtraAttributes(param);
            this.localExtraAttributes = param;
        }

        /**
         * Auto generated add method for the array for convenience
         *
         * @param param org.apache.axiom.om.OMAttribute
         */
        public void addExtraAttributes(final org.apache.axiom.om.OMAttribute param) {
            if (this.localExtraAttributes == null) {
                this.localExtraAttributes = new org.apache.axiom.om.OMAttribute[]{};
            }
            final java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil.toList(this.localExtraAttributes);
            list.add(param);
            this.localExtraAttributes = (org.apache.axiom.om.OMAttribute[]) list.toArray(new OMAttribute[0]);
        }

        /**
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        @Override
        public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory) {
            final org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this, parentQName);
            return factory.createOMElement(dataSource, parentQName);
        }

        @Override
        public void serialize(final javax.xml.namespace.QName parentQName, final javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            this.serialize(parentQName, xmlWriter, false);
        }

        @Override
        public void serialize(final javax.xml.namespace.QName parentQName, final javax.xml.stream.XMLStreamWriter xmlWriter, final boolean serializeType) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix;
            java.lang.String namespace;
            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            this.writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
            if (serializeType) {
                final java.lang.String namespacePrefix = this.registerPrefix(xmlWriter, "http://www.portalfiscal.inf.br/cte/wsdl/CteRecepcao");
                if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                    this.writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix + ":cteCabecMsg", xmlWriter);
                } else {
                    this.writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "cteCabecMsg", xmlWriter);
                }
            }
            if (this.localExtraAttributes != null) {
                for (final OMAttribute localExtraAttribute : this.localExtraAttributes) {
                    this.writeAttribute(localExtraAttribute.getNamespace().getName(), localExtraAttribute.getLocalName(), localExtraAttribute.getAttributeValue(), xmlWriter);
                }
            }
            if (this.localCUFTracker) {
                namespace = "http://www.portalfiscal.inf.br/cte/wsdl/CteRecepcao";
                this.writeStartElement(null, namespace, "cUF", xmlWriter);
                if (this.localCUF == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException("cUF cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(this.localCUF);
                }
                xmlWriter.writeEndElement();
            }
            if (this.localVersaoDadosTracker) {
                namespace = "http://www.portalfiscal.inf.br/cte/wsdl/CteRecepcao";
                this.writeStartElement(null, namespace, "versaoDados", xmlWriter);
                if (this.localVersaoDados == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException("versaoDados cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(this.localVersaoDados);
                }
                xmlWriter.writeEndElement();
            }
            xmlWriter.writeEndElement();
        }

        private static java.lang.String generatePrefix(final java.lang.String namespace) {
            if (namespace.equals("http://www.portalfiscal.inf.br/cte/wsdl/CteRecepcao")) {
                return "";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, final java.lang.String namespace, final java.lang.String localPart, final javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            final java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = CteCabecMsg.generatePrefix(namespace);
                }
                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(final java.lang.String prefix, final java.lang.String namespace, final java.lang.String attName, final java.lang.String attValue, final javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(final java.lang.String namespace, final java.lang.String attName, final java.lang.String attValue, final javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                this.registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(final java.lang.String namespace, final java.lang.String attName, final javax.xml.namespace.QName qname, final javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            final java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = this.registerPrefix(xmlWriter, attributeNamespace);
            }
            java.lang.String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                this.registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(final javax.xml.namespace.QName qname, final javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            final java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = CteCabecMsg.generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }
                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(final javax.xml.namespace.QName[] qnames, final javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                final StringBuilder stringToWrite = new StringBuilder();
                java.lang.String namespaceURI;
                java.lang.String prefix;
                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = CteCabecMsg.generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }
                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }
        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(final javax.xml.stream.XMLStreamWriter xmlWriter, final java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = CteCabecMsg.generatePrefix(namespace);
                final javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    final java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }

        /**
         * databinding method to get an XML representation of this object
         */
        @Override
        public javax.xml.stream.XMLStreamReader getPullParser(final javax.xml.namespace.QName qName) throws org.apache.axis2.databinding.ADBException {
            final java.util.ArrayList elementList = new java.util.ArrayList();
            final java.util.ArrayList attribList = new java.util.ArrayList();
            if (this.localCUFTracker) {
                elementList.add(new javax.xml.namespace.QName("http://www.portalfiscal.inf.br/cte/wsdl/CteRecepcao", "cUF"));
                if (this.localCUF != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localCUF));
                } else {
                    throw new org.apache.axis2.databinding.ADBException("cUF cannot be null!!");
                }
            }
            if (this.localVersaoDadosTracker) {
                elementList.add(new javax.xml.namespace.QName("http://www.portalfiscal.inf.br/cte/wsdl/CteRecepcao", "versaoDados"));
                if (this.localVersaoDados != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localVersaoDados));
                } else {
                    throw new org.apache.axis2.databinding.ADBException("versaoDados cannot be null!!");
                }
            }
            for (final OMAttribute localExtraAttribute : this.localExtraAttributes) {
                attribList.add(org.apache.axis2.databinding.utils.Constants.OM_ATTRIBUTE_KEY);
                attribList.add(localExtraAttribute);
            }
            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {

            /**
             * static method to create the object Precondition: If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable If this object is not an element, it is a complex type and the reader is at the event just after the outer start element Postcondition: If this object is an element, the reader is positioned at its end element If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static CteCabecMsg parse(final javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                final CteCabecMsg object = new CteCabecMsg();
                final int event;
                java.lang.String nillableValue;
                final java.lang.String prefix = "";
                final java.lang.String namespaceuri = "";
                try {
                    while (!reader.isStartElement() && !reader.isEndElement()) {
                        reader.next();
                    }
                    if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                        final java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;
                            if (fullTypeName.contains(":")) {
                                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                            }
                            nsPrefix = nsPrefix == null ? "" : nsPrefix;
                            final java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);
                            if (!"cteCabecMsg".equals(type)) {
                                // find namespace for the prefix
                                final java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (CteCabecMsg) ExtensionMapper.getTypeObject(nsUri, type, reader);
                            }
                        }
                    }
                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    final java.util.Vector handledAttributes = new java.util.Vector();
                    // now run through all any or extra attributes
                    // which were not reflected until now
                    for (int i = 0; i < reader.getAttributeCount(); i++) {
                        if (!handledAttributes.contains(reader.getAttributeLocalName(i))) {
                            // this is an anyAttribute and we create
                            // an OMAttribute for this
                            final org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();
                            final org.apache.axiom.om.OMAttribute attr = factory.createOMAttribute(reader.getAttributeLocalName(i), factory.createOMNamespace(reader.getAttributeNamespace(i), reader.getAttributePrefix(i)), reader.getAttributeValue(i));
                            // and add it to the extra attributes
                            object.addExtraAttributes(attr);
                        }
                    }
                    reader.next();
                    while (!reader.isStartElement() && !reader.isEndElement()) {
                        reader.next();
                    }
                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.portalfiscal.inf.br/cte/wsdl/CteRecepcao", "cUF").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "cUF" + "  cannot be null");
                        }
                        final java.lang.String content = reader.getElementText();
                        object.setCUF(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                        reader.next();
                    } // End of if for expected property start element
                    while (!reader.isStartElement() && !reader.isEndElement()) {
                        reader.next();
                    }
                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.portalfiscal.inf.br/cte/wsdl/CteRecepcao", "versaoDados").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                        if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException("The element: " + "versaoDados" + "  cannot be null");
                        }
                        final java.lang.String content = reader.getElementText();
                        object.setVersaoDados(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                        reader.next();
                    } // End of if for expected property start element
                    while (!reader.isStartElement() && !reader.isEndElement()) {
                        reader.next();
                    }
                    if (reader.isStartElement()) {
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }
                } catch (final javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }
                return object;
            }
        }// end of factory class
    }

    public static class CteDadosMsg implements org.apache.axis2.databinding.ADBBean {
        private static final long serialVersionUID = 5857225950086883136L;

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://www.portalfiscal.inf.br/cte/wsdl/CteRecepcao", "cteDadosMsg", "");

        /**
         * field for ExtraElement
         */

        protected org.apache.axiom.om.OMElement localExtraElement;

        /**
         * Auto generated getter method
         *
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getExtraElement() {
            return this.localExtraElement;
        }

        /**
         * Auto generated setter method
         *
         * @param param ExtraElement
         */
        public void setExtraElement(final org.apache.axiom.om.OMElement param) {
            this.localExtraElement = param;
        }

        /**
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        @Override
        public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory) {
            final org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this, CteDadosMsg.MY_QNAME);
            return factory.createOMElement(dataSource, CteDadosMsg.MY_QNAME);
        }

        @Override
        public void serialize(final javax.xml.namespace.QName parentQName, final javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            this.serialize(parentQName, xmlWriter, false);
        }

        @Override
        public void serialize(final javax.xml.namespace.QName parentQName, final javax.xml.stream.XMLStreamWriter xmlWriter, final boolean serializeType) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix;
            java.lang.String namespace;
            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            this.writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
            if (serializeType) {
                final java.lang.String namespacePrefix = this.registerPrefix(xmlWriter, "http://www.portalfiscal.inf.br/cte/wsdl/CteRecepcao");
                if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                    this.writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix + ":cteDadosMsg", xmlWriter);
                } else {
                    this.writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "cteDadosMsg", xmlWriter);
                }
            }
            if (this.localExtraElement != null) {
                this.localExtraElement.serialize(xmlWriter);
            } else {
                throw new org.apache.axis2.databinding.ADBException("extraElement cannot be null!!");
            }
            xmlWriter.writeEndElement();
        }

        private static java.lang.String generatePrefix(final java.lang.String namespace) {
            if (namespace.equals("http://www.portalfiscal.inf.br/cte/wsdl/CteRecepcao")) {
                return "";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, final java.lang.String namespace, final java.lang.String localPart, final javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            final java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = CteDadosMsg.generatePrefix(namespace);
                }
                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(final java.lang.String prefix, final java.lang.String namespace, final java.lang.String attName, final java.lang.String attValue, final javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(final java.lang.String namespace, final java.lang.String attName, final java.lang.String attValue, final javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                this.registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(final java.lang.String namespace, final java.lang.String attName, final javax.xml.namespace.QName qname, final javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            final java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = this.registerPrefix(xmlWriter, attributeNamespace);
            }
            java.lang.String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                this.registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(final javax.xml.namespace.QName qname, final javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            final java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = CteDadosMsg.generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }
                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(final javax.xml.namespace.QName[] qnames, final javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                final StringBuilder stringToWrite = new StringBuilder();
                java.lang.String namespaceURI;
                java.lang.String prefix;
                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = CteDadosMsg.generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }
                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }
        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(final javax.xml.stream.XMLStreamWriter xmlWriter, final java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = CteDadosMsg.generatePrefix(namespace);
                final javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    final java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }

        /**
         * databinding method to get an XML representation of this object
         */
        @Override
        public javax.xml.stream.XMLStreamReader getPullParser(final javax.xml.namespace.QName qName) throws org.apache.axis2.databinding.ADBException {
            final java.util.ArrayList elementList = new java.util.ArrayList();
            final java.util.ArrayList attribList = new java.util.ArrayList();
            if (this.localExtraElement != null) {
                elementList.add(org.apache.axis2.databinding.utils.Constants.OM_ELEMENT_KEY);
                elementList.add(this.localExtraElement);
            } else {
                throw new org.apache.axis2.databinding.ADBException("extraElement cannot be null!!");
            }
            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {

            /**
             * static method to create the object Precondition: If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable If this object is not an element, it is a complex type and the reader is at the event just after the outer start element Postcondition: If this object is an element, the reader is positioned at its end element If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static CteDadosMsg parse(final javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                final CteDadosMsg object = new CteDadosMsg();
                final int event;
                final java.lang.String nillableValue = null;
                final java.lang.String prefix = "";
                final java.lang.String namespaceuri = "";
                try {
                    while (!reader.isStartElement() && !reader.isEndElement()) {
                        reader.next();
                    }
                    if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                        final java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;
                            if (fullTypeName.contains(":")) {
                                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                            }
                            nsPrefix = nsPrefix == null ? "" : nsPrefix;
                            final java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);
                            if (!"cteDadosMsg".equals(type)) {
                                // find namespace for the prefix
                                final java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (CteDadosMsg) ExtensionMapper.getTypeObject(nsUri, type, reader);
                            }
                        }
                    }
                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    final java.util.Vector handledAttributes = new java.util.Vector();
                    reader.next();
                    while (!reader.isStartElement() && !reader.isEndElement()) {
                        reader.next();
                    }
                    if (reader.isStartElement()) {
                        // use the QName from the parser as the name for the builder
                        final javax.xml.namespace.QName startQname1 = reader.getName();
                        // We need to wrap the reader so that it produces a fake START_DOCUMENT event
                        // this is needed by the builder classes
                        final org.apache.axis2.databinding.utils.NamedStaxOMBuilder builder1 = new org.apache.axis2.databinding.utils.NamedStaxOMBuilder(new org.apache.axis2.util.StreamWrapper(reader), startQname1);
                        object.setExtraElement(builder1.getOMElement());
                        reader.next();
                    } // End of if for expected property start element
                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }
                    while (!reader.isStartElement() && !reader.isEndElement()) {
                        reader.next();
                    }
                    if (reader.isStartElement()) {
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }
                } catch (final javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }
                return object;
            }
        }// end of factory class
    }

    public static class CteRecepcaoLoteResult implements org.apache.axis2.databinding.ADBBean {
        private static final long serialVersionUID = 3881618850031348317L;

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://www.portalfiscal.inf.br/cte/wsdl/CteRecepcao", "cteRecepcaoLoteResult", "");

        /**
         * field for ExtraElement
         */

        protected org.apache.axiom.om.OMElement localExtraElement;

        /**
         * Auto generated getter method
         *
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getExtraElement() {
            return this.localExtraElement;
        }

        /**
         * Auto generated setter method
         *
         * @param param ExtraElement
         */
        public void setExtraElement(final org.apache.axiom.om.OMElement param) {
            this.localExtraElement = param;
        }

        /**
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        @Override
        public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory) {
            final org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this, CteRecepcaoLoteResult.MY_QNAME);
            return factory.createOMElement(dataSource, CteRecepcaoLoteResult.MY_QNAME);
        }

        @Override
        public void serialize(final javax.xml.namespace.QName parentQName, final javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            this.serialize(parentQName, xmlWriter, false);
        }

        @Override
        public void serialize(final javax.xml.namespace.QName parentQName, final javax.xml.stream.XMLStreamWriter xmlWriter, final boolean serializeType) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix;
            java.lang.String namespace;
            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            this.writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
            if (serializeType) {
                final java.lang.String namespacePrefix = this.registerPrefix(xmlWriter, "http://www.portalfiscal.inf.br/cte/wsdl/CteRecepcao");
                if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                    this.writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix + ":cteRecepcaoLoteResult", xmlWriter);
                } else {
                    this.writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "cteRecepcaoLoteResult", xmlWriter);
                }
            }
            if (this.localExtraElement != null) {
                this.localExtraElement.serialize(xmlWriter);
            } else {
                throw new org.apache.axis2.databinding.ADBException("extraElement cannot be null!!");
            }
            xmlWriter.writeEndElement();
        }

        private static java.lang.String generatePrefix(final java.lang.String namespace) {
            if (namespace.equals("http://www.portalfiscal.inf.br/cte/wsdl/CteRecepcao")) {
                return "";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, final java.lang.String namespace, final java.lang.String localPart, final javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            final java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = CteRecepcaoLoteResult.generatePrefix(namespace);
                }
                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(final java.lang.String prefix, final java.lang.String namespace, final java.lang.String attName, final java.lang.String attValue, final javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(final java.lang.String namespace, final java.lang.String attName, final java.lang.String attValue, final javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                this.registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(final java.lang.String namespace, final java.lang.String attName, final javax.xml.namespace.QName qname, final javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            final java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = this.registerPrefix(xmlWriter, attributeNamespace);
            }
            java.lang.String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                this.registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(final javax.xml.namespace.QName qname, final javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            final java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = CteRecepcaoLoteResult.generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }
                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(final javax.xml.namespace.QName[] qnames, final javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                final StringBuilder stringToWrite = new StringBuilder();
                java.lang.String namespaceURI;
                java.lang.String prefix;
                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = CteRecepcaoLoteResult.generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }
                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }
        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(final javax.xml.stream.XMLStreamWriter xmlWriter, final java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = CteRecepcaoLoteResult.generatePrefix(namespace);
                final javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    final java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }

        /**
         * databinding method to get an XML representation of this object
         */
        @Override
        public javax.xml.stream.XMLStreamReader getPullParser(final javax.xml.namespace.QName qName) throws org.apache.axis2.databinding.ADBException {
            final java.util.ArrayList elementList = new java.util.ArrayList();
            final java.util.ArrayList attribList = new java.util.ArrayList();
            if (this.localExtraElement != null) {
                elementList.add(org.apache.axis2.databinding.utils.Constants.OM_ELEMENT_KEY);
                elementList.add(this.localExtraElement);
            } else {
                throw new org.apache.axis2.databinding.ADBException("extraElement cannot be null!!");
            }
            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {

            /**
             * static method to create the object Precondition: If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable If this object is not an element, it is a complex type and the reader is at the event just after the outer start element Postcondition: If this object is an element, the reader is positioned at its end element If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static CteRecepcaoLoteResult parse(final javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                final CteRecepcaoLoteResult object = new CteRecepcaoLoteResult();
                final int event;
                final java.lang.String nillableValue = null;
                final java.lang.String prefix = "";
                final java.lang.String namespaceuri = "";
                try {
                    while (!reader.isStartElement() && !reader.isEndElement()) {
                        reader.next();
                    }
                    if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                        final java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;
                            if (fullTypeName.contains(":")) {
                                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                            }
                            nsPrefix = nsPrefix == null ? "" : nsPrefix;
                            final java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);
                            if (!"cteRecepcaoLoteResult".equals(type)) {
                                // find namespace for the prefix
                                final java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (CteRecepcaoLoteResult) ExtensionMapper.getTypeObject(nsUri, type, reader);
                            }
                        }
                    }
                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    final java.util.Vector handledAttributes = new java.util.Vector();
                    reader.next();
                    while (!reader.isStartElement() && !reader.isEndElement()) {
                        reader.next();
                    }
                    if (reader.isStartElement()) {
                        // use the QName from the parser as the name for the builder
                        final javax.xml.namespace.QName startQname1 = reader.getName();
                        // We need to wrap the reader so that it produces a fake START_DOCUMENT event
                        // this is needed by the builder classes
                        final org.apache.axis2.databinding.utils.NamedStaxOMBuilder builder1 = new org.apache.axis2.databinding.utils.NamedStaxOMBuilder(new org.apache.axis2.util.StreamWrapper(reader), startQname1);
                        object.setExtraElement(builder1.getOMElement());
                        reader.next();
                    } // End of if for expected property start element
                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }
                    while (!reader.isStartElement() && !reader.isEndElement()) {
                        reader.next();
                    }
                    if (reader.isStartElement()) {
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    }
                } catch (final javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }
                return object;
            }
        }// end of factory class
    }

    private org.apache.axiom.om.OMElement toOM(final br.indie.fiscal4j.cte300.webservices.recepcao.CteRecepcaoStub.CteDadosMsg param, final boolean optimizeContent) {
        //try {
        return param.getOMElement(br.indie.fiscal4j.cte300.webservices.recepcao.CteRecepcaoStub.CteDadosMsg.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        //        } catch (final org.apache.axis2.databinding.ADBException e) {
        //            throw org.apache.axis2.AxisFault.makeFault(e);
        //        }
    }

    private org.apache.axiom.om.OMElement toOM(final br.indie.fiscal4j.cte300.webservices.recepcao.CteRecepcaoStub.CteRecepcaoLoteResult param, final boolean optimizeContent) {
        //try {
        return param.getOMElement(br.indie.fiscal4j.cte300.webservices.recepcao.CteRecepcaoStub.CteRecepcaoLoteResult.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        //        } catch (final org.apache.axis2.databinding.ADBException e) {
        //            throw org.apache.axis2.AxisFault.makeFault(e);
        //        }
    }

    private org.apache.axiom.om.OMElement toOM(final br.indie.fiscal4j.cte300.webservices.recepcao.CteRecepcaoStub.CteCabecMsgE param, final boolean optimizeContent) {
        //try {
        return param.getOMElement(br.indie.fiscal4j.cte300.webservices.recepcao.CteRecepcaoStub.CteCabecMsgE.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        //        } catch (final org.apache.axis2.databinding.ADBException e) {
        //            throw org.apache.axis2.AxisFault.makeFault(e);
        //        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(final org.apache.axiom.soap.SOAPFactory factory, final br.indie.fiscal4j.cte300.webservices.recepcao.CteRecepcaoStub.CteDadosMsg param, final boolean optimizeContent, final javax.xml.namespace.QName methodQName) {
        //try {
        final org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
        emptyEnvelope.getBody().addChild(param.getOMElement(br.indie.fiscal4j.cte300.webservices.recepcao.CteRecepcaoStub.CteDadosMsg.MY_QNAME, factory));
        return emptyEnvelope;
        //        } catch (final org.apache.axis2.databinding.ADBException e) {
        //            throw org.apache.axis2.AxisFault.makeFault(e);
        //        }
    }

    /* methods to provide back word compatibility */

    /**
     * get the default envelope
     */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(final org.apache.axiom.soap.SOAPFactory factory) {
        return factory.getDefaultEnvelope();
    }

    private java.lang.Object fromOM(final org.apache.axiom.om.OMElement param, final java.lang.Class type, final java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault {
        try {
            if (br.indie.fiscal4j.cte300.webservices.recepcao.CteRecepcaoStub.CteDadosMsg.class.equals(type)) {
                return br.indie.fiscal4j.cte300.webservices.recepcao.CteRecepcaoStub.CteDadosMsg.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }
            if (br.indie.fiscal4j.cte300.webservices.recepcao.CteRecepcaoStub.CteRecepcaoLoteResult.class.equals(type)) {
                return br.indie.fiscal4j.cte300.webservices.recepcao.CteRecepcaoStub.CteRecepcaoLoteResult.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }
            if (br.indie.fiscal4j.cte300.webservices.recepcao.CteRecepcaoStub.CteCabecMsgE.class.equals(type)) {
                return br.indie.fiscal4j.cte300.webservices.recepcao.CteRecepcaoStub.CteCabecMsgE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }
            if (br.indie.fiscal4j.cte300.webservices.recepcao.CteRecepcaoStub.CteCabecMsgE.class.equals(type)) {
                return br.indie.fiscal4j.cte300.webservices.recepcao.CteRecepcaoStub.CteCabecMsgE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }
        } catch (final java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
        return null;
    }
}
