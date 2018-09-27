package br.indie.fiscal4j.cte300.webservices.consulta;

/**
 * CteConsultaCallbackHandler Callback class, Users can extend this class and implement
 * their own receiveResult and receiveError methods.
 */
public abstract class CteConsultaCallbackHandler {

    protected final Object clientData;

    /**
     * User can pass in any object that needs to be accessed once the NonBlocking
     * Web service call is finished and appropriate method of this CallBack is called.
     *
     * @param clientData Object mechanism by which the user can pass in user data
     *                   that will be avilable at the time this callback is called.
     */
    public CteConsultaCallbackHandler(Object clientData) {
        this.clientData = clientData;
    }

    /**
     * Please use this constructor if you don't want to set any clientData
     */
    public CteConsultaCallbackHandler() {
        this.clientData = null;
    }

    /**
     * Get the client data
     */

    public Object getClientData() {
        return clientData;
    }


    /**
     * auto generated Axis2 call back method for cteConsultaCT method
     * override this method for handling normal response from cteConsultaCT operation
     */
    public void receiveResultcteConsultaCT(
            br.indie.fiscal4j.cte300.webservices.consulta.CteConsultaStub.CteConsultaCTResult result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from cteConsultaCT operation
     */
    public void receiveErrorcteConsultaCT(java.lang.Exception e) {
    }


}
    