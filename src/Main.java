
public class Main {

	public static void main(String[] args) {
		
		Ship ship = new Ship(3);
		
		Container c1,r1,c2,r2;
		c1= new Bulk("CY123","Barcelona",1200);
		r1 = new Refridgerator("SFSS","Pireus",2.1);
		c2= new Bulk("CWFDS","London",1800);
		r2= new Refridgerator("FSFRE","Milano",9.1);
		
		ship.addContainer(c1);
		ship.addContainer(r1);
		ship.addContainer(c2);
		ship.addContainer(r2);
		
//		System.out.println("Ship's total charge: "+ ship.calcTotalCharge());
				
		new ChargeCalculator(ship);
		

	}

}
