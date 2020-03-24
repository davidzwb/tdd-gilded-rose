package cn.xpbootcamp.gilded_rose;

public class Product {
    public float getQualityAfterDays(int days) {
//        if (days > this.sellin) {
//            return quality / 2;
//        }

        float qualityAfterDays = quality;
        int daysAfterSellIn;

        if (days - sellin >= 0 ) {
            daysAfterSellIn = days - sellin;

            for (int i = 0; i < daysAfterSellIn; i++) {
                qualityAfterDays = qualityAfterDays / 2;
            }
        }

        return qualityAfterDays;
    }


    private int sellin;
    private float quality;

    public Product(int sellin, int quality) {
        this.sellin = sellin;
        this.quality = quality;
    }
}
