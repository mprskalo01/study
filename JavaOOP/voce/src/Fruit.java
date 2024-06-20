public class Fruit {
    private String species;
    private int numberOfFruits;
    public double productionPrice;

    public Fruit(String species, int numberOfFruits, double productionPrice) {
        this.species = species;
        this.numberOfFruits = numberOfFruits;
        this.productionPrice = productionPrice;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getNumberOfFruits() {
        return numberOfFruits;
    }

    public void setNumberOfFruits(int numberOfFruits) {
        this.numberOfFruits = numberOfFruits;
    }

    public double getProductionPrice() {
        return productionPrice;
    }

    public void setProductionPrice(double productionPrice) {
        this.productionPrice = productionPrice;
    }

    @Override
    public String toString() {
        return "Species: " + species + "\nNumber of Fruits: " + numberOfFruits + "\nProduction Price: " + productionPrice;
    }

    public double productionPrice(int numberOfTrees) {
        return productionPrice * numberOfTrees;
    }

    public double myMarketPrice() {
        return productionPrice;
    }
}
