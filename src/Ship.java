import java.util.ArrayList;

//����� ��� �� �����
public class Ship {
	
	private int capacity;
	private ArrayList<Container > containers = new ArrayList<Container>();
	
	public Ship(int capacity) {
		this.capacity = capacity;
	}
	
//Adding container to the ship
	public void addContainer(Container c) {
		if(capacity>containers.size()) {
			containers.add(c);//��� ������ containers ��� �����.
	
		 System.out.println("The container has been added ");}
		else {System.out.println("Container is full"); }
	}
//Sinolili xreosi olon ton Container
	public double calcTotalCharge() {
		double sum=0;
		for(Container c:containers) {
			sum+=c.getCharge();
		}
		return sum; //���������� ��� �������� ������ ��� ������ �������� �� container ��� �������� ���� ���.
	}
	
	
	
	
	
	
	
	
	

}
