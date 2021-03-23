import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import fr.uphf.FootResultsService;
import fr.uphf.FootResultsServiceServiceLocator;
import fr.uphf.Result;

public class MyFootClient {

	public static void main(String[] args) throws RemoteException, ServiceException {
		System.out.println("From the Client ");
		FootResultsServiceServiceLocator loc = new FootResultsServiceServiceLocator();
		FootResultsService myservice =loc.getFootResultsService();
		Result matchResult = myservice.retrieveResult("OM", "Nice");
		System.out.println("Response "+ matchResult);

	}

}
