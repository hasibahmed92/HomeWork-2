package HomeWork2;

public class Computer {
	
	static String model;
	static int memory;
	static boolean quickServer;
	int imei;
	String color; 
	double price; 
	
	//1st non static method
	public void computerSystem() {
		System.out.println("computerSystem: " +model+ " " +memory+ " " +quickServer); 
		}
	
	
	//2nd non static method
	public void computerInfo() {
		System.out.println("computerInfo: " +color+ " " +price+ " "+imei); 	
	}
	
		//1st constructor
		public Computer(String model, int memory, boolean quickServer) { 
			this.model = model;
			this.memory = memory;
			this.quickServer = quickServer;
		}  
		
		//2nd constructor
		public Computer(String color, double price, int imei) {
			this.color = color;
			this.price = price;
			this.imei = imei; 
			
		}
		
		// static method
		public static void getComputerSystem() {
			System.out.println("computerSystem: "+model+" "+memory);
		}


		
			
		}
		
		
		
	



