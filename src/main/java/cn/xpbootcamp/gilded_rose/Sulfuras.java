package cn.xpbootcamp.gilded_rose;

public class Sulfuras extends Product {

    public Sulfuras(float quality) {
        super(0, quality);
    }

    @Override
    public float getQualityAfterDays(int days) {
        return quality;
    }
}
