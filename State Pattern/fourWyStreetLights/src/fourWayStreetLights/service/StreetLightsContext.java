

public class StreetLightsContext {

	StreetLightsStateI greenforew;
	StreetLightsStateI redforew;
	StreetLightsStateI greenforns;
	StreetLightsStateI redforns;
	
	StreetLightsStateI curr_state = greenforew;

	/**
	 * Constructor for the context class
	 */
	public StreetLightsContext() {
		super();
		greenforew = new GreenforEW(this);
		redforew = new RedForEW(this);
		greenforns = new GreenForNS(this);
		redforns = new RedForNS(this);
		
	}
	
	public void turnEWRed(){
		curr_state.turnEWRed();
	}
	
	public void turnEWGreen(){
		curr_state.turnEWGreen();
	}
	
	public void turnNSRed(){
		curr_state.turnNSRed();
	}
	
	public void turnNSGreen(){
		curr_state.turnNSGreen();
	}
	
	/**
	 * Getters for all the actions of the state machine
	 * @return
	 */
	public StreetLightsStateI getGreenforew() {
		return greenforew;
	}

	public StreetLightsStateI getRedforew() {
		return redforew;
	}

	public StreetLightsStateI getGreenforns() {
		return greenforns;
	}

	public StreetLightsStateI getRedforns() {
		return redforns;
	}

	public StreetLightsStateI getCurr_state() {
		return curr_state;
	}

	public void setCurr_state(StreetLightsStateI curr_state) {
		this.curr_state = curr_state;
	}
}

