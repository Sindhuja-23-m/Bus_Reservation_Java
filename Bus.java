package BusReser;

public class Bus {
	private int busNo;
	private boolean AC;
	private int capacity;// get and set
	
	Bus(int no,boolean ac,int cap){
		this.busNo = no;
		this.AC = ac;
		this.capacity = cap;
	}
	
	public int getBusNo() {//accessors
		return busNo;
	}
	
	public boolean isAc() {
		return AC;
	}
	
	public void setAc(boolean val) {
		AC = val;
	}
	
	public int getCapacity(){// accessor method
		return capacity;
	
	}
	
	public void setCapacity(int cap) {// mutator
		capacity = cap;
	}
	
	public void displayBusInfor(){
		System.out.println("Bus No : " + busNo +"AC:" +AC+ "Total Capacity: " + capacity);
	}
}
