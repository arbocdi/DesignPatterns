package arbocdi.dp.behavorial.templateMethod;

public abstract class HouseBuilder {
    public final void buildHouse(){
        buildFoundation();
        buildWalls();
        buildRoof();

        houseReady();
    }
    //abstract operations
    protected abstract void buildWalls();
    protected abstract void buildRoof();
    //concrete methods
    private void buildFoundation(){
        System.out.println("Building concrete foundation");
    }
    //hooks
    protected void houseReady(){}

    public static class GlassHouseBuilder extends HouseBuilder{
        @Override
        protected void buildWalls() {
            System.out.println("Building glass walls");
        }

        @Override
        protected void buildRoof() {
            System.out.println("Building glass roof");
        }

        @Override
        protected void houseReady() {
            System.out.println("Glass house built!");
        }
    }

}
