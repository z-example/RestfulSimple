package org.example.api;

import org.example.domain.ErrorMessage;
import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;

import javax.ws.rs.*;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.Response;
import java.io.InputStream;

/**
 * Created with IntelliJ IDEA.
 * Date: 2016/8/13
 * Time: 15:36
 *
 * @author: Zero
 */
@Controller
@Path("/foo")
public class FooResource {

    @GET
    @Produces("application/json")
    public Response index() {
        return Response.ok(new ErrorMessage(0, "OK")).build();
    }

    @POST
    @Produces("application/json") //x-www-form-urlencoded
    public Response form(Form form) {
        return Response.ok(ErrorMessage.ok(form.asMap())).build();
    }

    @PUT
    @Produces("application/json")
    public Response put(String input){
        return Response.ok(ErrorMessage.ok(input)).build();
    }

    //compile("org.glassfish.jersey.media:jersey-media-multipart:2.22.1")
    @POST
    @Path("/form-data")
    @Consumes("multipart/form-data")
    @Produces("application/json")
    public Response fomrData(@FormDataParam("name") String name) {
        return Response.ok(ErrorMessage.ok(name)).build();
    }

    @POST
    @Path("/upload")
    @Consumes("multipart/form-data")
    @Produces("application/json")
    public Response upload(@FormDataParam("file") InputStream fileInputStream,
                           @FormDataParam("file") FormDataContentDisposition fileMetaData) {
        return Response.ok(ErrorMessage.ok()).build();
    }



}
