
public class FinalFieldTest {

	public static void main(String[] args) {
		
		final float PI=3.14f; //this is a local variable
		
		System.out.println("PI : "+PI);
		
		//PI=3.18f;
		
		System.out.println("PI : "+PI);
		
		Sun sun = new Sun();
		sun.calculateDistanceBetweenTheEarthAndTheSun();
	}
	
}

class Sun
{
	final float SPEED_OF_LIGHT=186000.519f;
	final int TIME_TOOK_TO_REACH_ON_EARTH=480;
	
	
	void calculateDistanceBetweenTheEarthAndTheSun() {
		double distance = SPEED_OF_LIGHT * TIME_TOOK_TO_REACH_ON_EARTH;
		System.out.println("The distance between the Earth and the Sun : "+distance);
	}
}

