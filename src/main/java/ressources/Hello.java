package ressources;


import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.awt.*;
import java.security.PublicKey;

@Path("/Hello-joujou")
public class Hello {

    @GET
    @Path("/Hi")
    @Produces(MediaType.TEXT_PLAIN)
    Public Response SayHello(){ return Response.status(200).entity("hello").build();}
}
