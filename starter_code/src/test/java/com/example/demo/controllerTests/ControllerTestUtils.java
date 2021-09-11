package com.example.demo.controllerTests;

import com.example.demo.model.persistence.Item;

import java.math.BigDecimal;

public class ControllerTestUtils {
    public static final String ROUND_WIDGET = "Round Widget";

    public static Item item_get() {
        Item item = new Item();
        item.setId(0L);
        item.setName(ROUND_WIDGET);
        item.setPrice(new BigDecimal("2.99"));
        item.setDescription("A widget that is round");
        return item;
    }

}
