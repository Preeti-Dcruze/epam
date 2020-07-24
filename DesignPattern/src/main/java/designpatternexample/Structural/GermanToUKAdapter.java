package designpatternexample.Structural;

public class GermanToUKAdapter implements UKConnector{

	private GermanConnector plug;
	 
	public GermanToUKAdapter(GermanConnector germanconnector) {
	   plug=germanconnector;
	}
	public void provideElectricity() {
		// TODO Auto-generated method stub
		System.out.println("Calling connected method of GermanConnector\n");
		
		plug.connected();
		System.out.println("Calling giveElectricity of GermanConnector\n");
		plug.giveElectricity();
	}

}
