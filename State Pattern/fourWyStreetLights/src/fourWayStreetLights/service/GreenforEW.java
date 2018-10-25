

public class GreenforEW implements StreetLightsStateI {

	
	StreetLightsContext streetlightscontext;
	
	/**
	 * parameterized constructor for Green Light on EW state
	 * @param streetlightscontext
	 */
	public GreenforEW(StreetLightsContext streetlightscontext) {
		super();
		this.streetlightscontext = streetlightscontext;
	}

	/**
	 * Implementing the turnEWRed state. This state is reached when the red light goes on for EW direction.
	 * It will also make the vehicles in EW direction stop.
	 */
	@Override
	public void turnEWRed() {
		
		System.out.println("Stop cars from moving in East or West direction");
		streetlightscontext.setCurr_state(streetlightscontext.getRedforew());
	}

	/**
	 * Implementing the turnEWGreen state. This state is reached when the green light goes on for the EW direction.
	 * It will also make the vehicles in the EW direction move
	 */
	@Override
	public void turnEWGreen() {
		System.out.println("Signal in East and West is already Green"); 
		streetlightscontext.setCurr_state(streetlightscontext.getGreenforew());
	}

	/**
	 * Implementing the turnNSRed state. This state is reached when the red light goes on in NS direction.
	 * It will also make the vehicles stop in NS direction
	 */
	@Override
	public void turnNSRed() {
		System.out.println("Signal in North and South is already Red");
		streetlightscontext.setCurr_state(streetlightscontext.getRedforns());
	}

	/**
	 * Implementing the turnNSGreen state. This state is reached when the green light goes on in NS direction.
	 * It will also make the vehicles move in NS direction
	 */
	@Override
	public void turnNSGreen() {
		System.out.println("Cars move in North and South direction");
		streetlightscontext.setCurr_state(streetlightscontext.getGreenforns());
	}

	@Override
	public void moveCarToN() {
		System.out.println("Let 2 cars move in North");
		streetlightscontext.setCurr_state(streetlightscontext.getRedforew());
		
	}

	@Override
	public void moveCarToS() {
		System.out.println("Let 2 cars move in South");
		streetlightscontext.setCurr_state(streetlightscontext.getRedforew());
	}

	@Override
	public void moveCarToE() {
		System.out.println("Let 2 cars move in East");
		streetlightscontext.setCurr_state(streetlightscontext.getRedforns());
	}

	@Override
	public void moveCarToW() {
		System.out.println("Let 2 cars move in West");
		streetlightscontext.setCurr_state(streetlightscontext.getRedforns());
	}

	
}
