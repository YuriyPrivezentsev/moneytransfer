package com.lucky.moneytransfer.controller;

import com.lucky.moneytransfer.service.TransferManager;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.parameters.Parameter;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/transfer")
public class Endpoint {

    @Inject
    private
    TransferManager service;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/balance/{uid}")
    @Operation(description = "Get user accounts' balance")
    public String balance(@Parameter(name = "uid", description = "Unique user identificator", required = true) @PathParam("uid") String uid) {
        return service.getBalance(uid);
    }
}