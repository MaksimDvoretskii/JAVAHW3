public class BonusMiles {
    public int calculate(int price) {
        int bonusMiles = 20;
        int miles = price / bonusMiles;
        return miles;
    }
}
