package CatCoding.IntelHen;

public class MoldovanHen extends Hen{
    public MoldovanHen(int eggsPerMonth, String country) {
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
