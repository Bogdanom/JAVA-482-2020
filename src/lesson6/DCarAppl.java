package lesson6;
public class DCarAppl {
    public static void main(String[ ] args) {
        DACar carX6 = new DBmwX6( );
	  carX6.carRides( );
        ((DBmwX6)carX6).lightsShine( );

	  DACar carX6mod = new DBmwX6mod( );
        carX6mod.carRides( );
       ((DBmwX6)carX6mod).lightsShine( );
	  
	  DBmwX6 carX6mod2 = new DBmwX6mod( );
        carX6mod2.carRides( );
        carX6mod2.lightsShine( );
    }
}
