package CatCoding.IntelHen;

public class UkrainianHen extends Hen{
    public UkrainianHen(int eggsPerMonth, String country) {
        super(eggsPerMonth, country);
    }

    @Override
    public int getCountOfEggsPerMonth() {
        return super.getCountOfEggsPerMonth();
    }

    @Override
    public String getDescription() {
        return super.getDescription()+", моя страна "+getCountry()+" я несу "+getEggsPerMonth()+" яиц в месяц";
    }
}
