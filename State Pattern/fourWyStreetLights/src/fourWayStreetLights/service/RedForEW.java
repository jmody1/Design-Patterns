

public class RedForEW implements StreetLightsStateI {

	StreetLightsContext streetlightscontext;
	/**
	 * parameterized constructor for RedForEW class 
	 * @param streetLightsContext
	 */
	public RedForEW(StreetLightsContext streetLightsContext) {
		// TODO Auto-generated constructor stub
		this.streetlightscontext = streetLightsContext;
	}

	/**
	 * Implementing the turnEWRed state. This state is reached when the red light goes on for EW direction.
	 * It will also make the vehicles in EW direction stop.
	 */
	@Override
	public void turnEWRed() {
		System.out.println("Signal in East and West is already red");
		streetlightscontext.setCurr_state(streetlightscontext.getRedforew());
	}

	/**
	 * Implementing the turnEWGreen state. This state is reached when the green light goes on for the EW direction.
	 * It will also make the vehicles in the EW direction move
	 */
	@Override
	public void turnEWGreen() {
		System.out.println("Let cars move in East and West direction");
		streetlightscontext.setCurr_state(streetlightscontext.getGreenforew());
	}

	/**
	 * Implementing the turnNSRed state. This state is reached when the red light goes on in NS direction.
	 * It will also make the vehicles stop in NS direction
	 */
	@Override
	public void turnNSRed() {
		System.out.println("Stop cars from moving in North or South direction");
		streetlightscontext.setCurr_state(streetlightscontext.getRedforns());
	}

	/**
	 * Implementing the turnNSGreen state. This state is reached when the green light goes on in NS direction.
	 * It will also make the vehicles move in NS direction
	 */
	@Override
	public void turnNSGreen() {
		System.out.println("Signal is already green in North and South direction");
		streetlightscontext.setCurr_state(streetlightscontext.getGreenforns());
	}

	@Override
	public void moveCarToN() {
		System.out.println("Let 2 cars move to North");
		streetlightscontext.setCurr_state(streetlightscontext.getRedforew());
	}

	@Override
	public void moveCarToS() {
		System.out.println("Let 2 cars move to South");
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
