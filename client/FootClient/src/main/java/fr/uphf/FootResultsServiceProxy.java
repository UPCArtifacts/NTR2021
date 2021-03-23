package fr.uphf;

public class FootResultsServiceProxy implements fr.uphf.FootResultsService {
  private String _endpoint = null;
  private fr.uphf.FootResultsService footResultsService = null;
  
  public FootResultsServiceProxy() {
    _initFootResultsServiceProxy();
  }
  
  public FootResultsServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initFootResultsServiceProxy();
  }
  
  private void _initFootResultsServiceProxy() {
    try {
      footResultsService = (new fr.uphf.FootResultsServiceServiceLocator()).getFootResultsService();
      if (footResultsService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)footResultsService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)footResultsService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (footResultsService != null)
      ((javax.xml.rpc.Stub)footResultsService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public fr.uphf.FootResultsService getFootResultsService() {
    if (footResultsService == null)
      _initFootResultsServiceProxy();
    return footResultsService;
  }
  
  public fr.uphf.Result retrieveResult(java.lang.String team1, java.lang.String team2) throws java.rmi.RemoteException{
    if (footResultsService == null)
      _initFootResultsServiceProxy();
    return footResultsService.retrieveResult(team1, team2);
  }
  
  
}