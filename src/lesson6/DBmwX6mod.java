package lesson6;
public class DBmwX6mod extends DBmwX6 {
    public DBmwX6mod( ) { super( ); }

    @Override
    public void workedEngine( ) {
        System.out.println("BmwX6mod: Engine Running on Diesel.");
        System.out.println("BmwX6mod: Max Speed: " + getMaxSpeed( ));
    }

    @Override
    public void lightsShine( ) {
        System.out.println("BmwX6mod: Xenon Headlights.");
        //super.lightsShine();
    }
}
