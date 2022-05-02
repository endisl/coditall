package ood.creation.fm.solution;

import ood.creation.fm.solution.ndion.Controller;
import ood.creation.fm.solution.ndion.NdionViewEngine;
import ood.creation.fm.solution.smart.SmartController;

import java.util.HashMap;
import java.util.Map;

public class ProductsController extends SmartController {
    public void listProducts() {
        //get products from a database
        Map<String, Object> context = new HashMap<>();
        //context.put(products)
        render("products.html", context);
    }
}
