public interface ItemWithCashDepozit {

    public default boolean hasCashDeposit() {
        return true;
    }

    public double getCashDepozitAmmount();

}