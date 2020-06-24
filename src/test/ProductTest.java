package test;

import main.Product;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.UUID;


class ProductTest {

    Product product;

    @Before
    public void initClasses(){
        product = new Product.ProductBuilder(UUID.randomUUID(), "X-Fact", "Bycicle", 12, 130000).build();
    }

    @Test
    public void checkProductBuilder(){
        System.out.println(product);
        Assert.assertNotNull(product);
    }
}