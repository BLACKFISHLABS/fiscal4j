/**
 * NfeConsulta2CallbackHandler.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package br.indie.fiscal4j.nfe.webservices.nota.consulta;

import br.indie.fiscal4j.nfe.webservices.nota.consulta.NfeConsulta2Stub.NfeConsultaNF2Result;

abstract class NfeConsulta2CallbackHandler {

    protected Object clientData;

    public NfeConsulta2CallbackHandler(final Object clientData) {
        this.clientData = clientData;
    }

    public NfeConsulta2CallbackHandler() {
        this.clientData = null;
    }

    public Object getClientData() {
        return this.clientData;
    }

    public void receiveResultnfeConsultaNF2(final NfeConsultaNF2Result result) {
    }

    public void receiveErrornfeConsultaNF2(final Exception e) {
    }
}
