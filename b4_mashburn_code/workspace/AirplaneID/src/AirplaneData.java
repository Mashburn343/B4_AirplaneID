
public class AirplaneData {

	// field

	private String engineType;
	private String engineNumber;
	private String engineLocation;

	public String getEngineType() {
		return engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

	public String getEngineNumber() {
		return engineNumber;
	}

	public void setEngineNumber(String engineNumber) {
		this.engineNumber = engineNumber;
	}

	public String getEngineLocation() {
		return engineLocation;
	}

	public void setEngineLocation(String engineLocation) {
		this.engineLocation = engineLocation;
	}
	
	public void createAirplaneData() {

		AirplaneData F15 = new AirplaneData();
		F15.setEngineType("jet");
		F15.setEngineNumber("2");
		F15.setEngineLocation("body");

		AirplaneData F16 = new AirplaneData();
		F16.setEngineType("jet");
		F16.setEngineNumber("1");
		F16.setEngineLocation("body");

		AirplaneData F18 = new AirplaneData();
		F18.setEngineType("jet");
		F18.setEngineNumber("2");
		F18.setEngineLocation("body");

		AirplaneData F35 = new AirplaneData();
		F35.setEngineType("jet");
		F35.setEngineNumber("1");
		F35.setEngineLocation("body");

		AirplaneData A10 = new AirplaneData();
		A10.setEngineType("jet");
		A10.setEngineNumber("2");
		A10.setEngineLocation("tail");
		
		// test
		
		//System.out.println("F15 has " + F15.getEngineNumber() + " Engines");
		//System.out.println("F16 has " + F16.getEngineNumber() + " Engines");
		//System.out.println("F18 has " + F18.getEngineNumber() + " Engines");
		//System.out.println("F35 has " + F35.getEngineNumber() + " Engines");
		//System.out.println("A10 has " + A10.getEngineNumber() + " Engines");
		
		
	}

	

}
