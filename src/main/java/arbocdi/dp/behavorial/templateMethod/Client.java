package arbocdi.dp.behavorial.templateMethod;

public class Client {
    public static void main(String[] args) {
        HouseBuilder houseBuilder = new HouseBuilder.GlassHouseBuilder();
        houseBuilder.buildHouse();
    }
}
