package fr.uphf.ntr.restDemos.resources;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/xml/customer")
public class XMLService {

    @GET
    @Path("/{pin}")
    @Produces(MediaType.APPLICATION_XML)
    public Customer getCustomerInXML(@PathParam("pin") int pin) {
    	System.out.println("getCustomerInXML");
        Customer customer = new Customer();
        customer.setName("mkyong");
        customer.setPin(pin);

        return customer;

    }

}