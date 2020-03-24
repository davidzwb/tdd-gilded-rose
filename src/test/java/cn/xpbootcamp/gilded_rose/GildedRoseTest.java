package cn.xpbootcamp.gilded_rose;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class GildedRoseTest {

    @Test
    public void productQualityNotLessThanZeroWhenProducedThreeOrFiftyDays() {
        Product product = new Product(30, 10);
        assertTrue(product.getQualityAfterDays(3) >= 0);
        assertTrue(product.getQualityAfterDays(50) >= 0);
    }

    @Test
    public void productQualityNotGreaterThanFiftyWhenProducedThreeOrFiftyDays() {
        Product product = new Product(30, 10);
        assertTrue(product.getQualityAfterDays(3) < 50);
        assertTrue(product.getQualityAfterDays(50) < 50);
    }

    @Test
    public void productWithinSellInDay() {
        int sellin = 30;
        float quality = 10;
        Product product = new Product(sellin, 10);
        assertEquals(quality, product.getQualityAfterDays(sellin - 1));
    }

    @Test
    public void productExceedsSellInOneDay() {
        int sellin = 30;
        float quality = 10;
        Product product = new Product(sellin, 10);
        assertEquals(quality / 2, product.getQualityAfterDays(sellin + 1));
    }

    @Test
    public void productExceedsSellInTwoDay() {
        int sellin = 30;
        float quality = 10;
        Product product = new Product(sellin, 10);
        assertEquals(quality / 2 / 2, product.getQualityAfterDays(sellin + 2));
    }
}