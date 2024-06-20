public class Cherry extends Fruit {
    private boolean hasWorm;

    public Cherry(String species, int numberOfFruits, double productionPrice, boolean hasWorm) {
        super(species, numberOfFruits, productionPrice);
        this.hasWorm = hasWorm;
    }

    public boolean isHasWorm() {
        return hasWorm;
    }

    public void setHasWorm(boolean hasWorm) {
        this.hasWorm = hasWorm;
    }

    @Override
    public double myMarketPrice() {
        if (hasWorm) {
            return productionPrice * 1.5;
        } else {
            return productionPrice * 1.2;
        }
    }
}
