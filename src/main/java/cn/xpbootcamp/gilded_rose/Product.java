package cn.xpbootcamp.gilded_rose;

public class Product {
    public float getQualityAfterDays(int days) {

        float qualityAfterDays = quality;
        int daysAfterSellIn;

        if (days - sellin >= 0) {
            daysAfterSellIn = days - sellin;

            for (int i = 0; i < daysAfterSellIn; i++) {
                qualityAfterDays = qualityAfterDays / 2;
            }
        }

        return qualityAfterDays;
    }


    protected int sellin;
    protected float quality;

    public Product() {
        this.sellin = 0;
        this.quality = 0;
    }

    public Product(int sellin, float quality) {
        this.sellin = sellin;
        this.quality = quality;
    }
}

