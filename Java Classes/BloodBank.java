import java.util.*;
import java.io.*;
class BloodBank{
	private String id;
	private String name;
	private String address;
	private String  location; 
	private String contact;

	// setters----------
	public void setId(String id){
		this.id=id;
	}
	public void setName(String name){
		this.name=name;
	}
	
	public void setAddress(String address){
		this.address=address;
	}
	public void setLocation(String location){
		this.location=location;
	}
	
	public void setContact(String contact){
		this.contact=contact;
	}

	// getters-----------------
		public String getId(){
			return id;
		}
		public String getName(){
			return name;
		}
		
		public String getLocation(){
			return location;
		}
		
		public String getAddress(){
			return address;
		}
		public String getContact(){
			return contact;
		}

		public String toString(){
			return "ID: "+getId()+"\tBank Name: "+getName()+"\tBank Address: "+getAddress()+"\tLocation: "+getLocation()+"\tContact: "+getContact();
		}
		public void addBloodBank() throws Exception{
			Scanner input=new Scanner(System.in);
			FileWriter addBlodBank=new FileWriter("BloodBank.txt");
			
			LinkedList<String> aL=new LinkedList<String>();
			int a=1;
			while(a==1){
				System.out.println("Enter id:");
				setId(input.next());
				System.out.println("Enter name: ");
				setName(input.next());
				System.out.println("Enter address: ");
				setAddress(input.next());
				System.out.println("Enter Location: ");
				setLocation(input.next());
				System.out.println("Enter contact: ");
				setContact(input.next());
				aL.add(toString());

				System.out.println("Enter 1 to add more data and 0 to Stop:....");
				a=input.nextInt();
			}
			for (String write:aL ) {
				addBlodBank.write(write+"\n");
			}
			addBlodBank.close();
				System.out.println("Data Saved successfully!.....");
			  	System.out.println("Do want to see the saved data ?......");

			  	if (input.next().equals("yes")) {
	 				File r1=new File("BloodBank.txt");
					Scanner read1=new Scanner(r1);
			  		
					System.out.println("***************************************************************************************");
					while(read1.hasNext()){
						System.out.println(read1.nextLine()+"\n");
					}
					addBlodBank.close();
					System.out.println("***************************************************************************************");
			}
		}

   
}