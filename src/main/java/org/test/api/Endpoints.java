package org.test.api;

import org.test.ArtificialIntelligenceInstance;
import org.test.MysteriousTokenizer;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.awt.*;

/**
 * This is our REST API endpoint
 */
@Path("/api")
@Consumes(MediaType.APPLICATION_JSON)
public class Endpoints {
    private MysteriousTokenizer tokenizer;
    private ArtificialIntelligenceInstance ai;

    @Path("status")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getStatus() {
        return Response.status(200).build();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response tokenizeText(String text) {
        return Response.ok(tokenizer.tokenize(text)).build();
    }

    @POST
    @Consumes(MediaType.MULTIPART_FORM_DATA)
    @Produces(MediaType.APPLICATION_JSON)
    public Response classifyImage(Image image) {
        return Response.ok(ai.defineCategory(image)).build();
    }
}
