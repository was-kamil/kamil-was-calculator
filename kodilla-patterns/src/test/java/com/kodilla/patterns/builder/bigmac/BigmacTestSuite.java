package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

import static com.kodilla.patterns.builder.bigmac.BunType.BUN_SESAME;


public class BigmacTestSuite {

    @Test
    public void testBigMackOrderProcess() {

        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun(BunType.ROLL_STANDARD)
                .bun(BUN_SESAME)
                .burgers(5)
                .sauce(SauceType.THOUSAND_ISLANDS)
                .sauce(SauceType.BARBECUE)
                .ingredients(IngredientsType.CHEESE)
                .ingredients(IngredientsType.MUSHROOMS)
                .ingredients(IngredientsType.SHRIMPS)
                .ingredients(IngredientsType.CHILLI_PEPPERS)
                .ingredients(IngredientsType.LETTUCE)
                .build();
        System.out.println("ORDER COMPLETED -->\n" + bigmac);

        int howManyBurgers = bigmac.getBurgers();
        int howManyIngredients = bigmac.getIngredients().size();


        Assert.assertEquals(5, howManyBurgers);
        Assert.assertEquals(5, howManyIngredients);
        Assert.assertTrue(bigmac.getIngredients().contains(IngredientsType.SHRIMPS));
        Assert.assertFalse(bigmac.getIngredients().contains(IngredientsType.ONION));

        Assert.assertEquals(bigmac.getBun(), BUN_SESAME);
        Assert.assertEquals(bigmac.getSauce(), SauceType.BARBECUE);
    }
}