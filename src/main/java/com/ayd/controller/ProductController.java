package com.ayd.controller;

import com.ayd.entity.Product;
import com.ayd.service.ProductService;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.util.List;



@Path("products")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ProductController {

    @Inject
    ProductService service;

    @GET
    public Response listProducts() {
        List<Product> products = service.listProduct();

        return Response.ok(products).build();
    }

    @POST
    public Response saveProduct(Product dto) {

        Product product = service.saveProduct(dto);

        return Response.ok(product).status(201).build();
    }
    
}
