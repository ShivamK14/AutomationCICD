package democlass;

public class FlyEmirates  implements AirTraficControl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AirTraficControl FE  = new FlyEmirates();
		FE.Red();

	}
	
	public  void bodyColour() {
	}

	@Override
	public void Red() {
		// TODO Auto-generated method stub
		System.out.print("Colour is red");
	}
	

}
