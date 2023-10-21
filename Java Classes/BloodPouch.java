import java.util.Scanner;
import java.util.*;
import java.io.*;
 class BloodPouch{
 	private String id;
 	private String bloodtype;
 	private String location;
 	private String cholestrolLevel;
 	private String expirationDate;


//--------------------------------setters---------------------------------------//
 	void setId(String id){
 		this.id=id;
 	}
 	void setBloodtype(String bloodtype){
 		this.bloodtype=bloodtype;
 	}
 	void setLocation(String location){
 		this.location=location;
 	}
 	void setCholestrolLevel(String cholestrolLevel){
 		this.cholestrolLevel=cholestrolLevel;
 	}
 	void setExpirationDate(String expirationDate){
 		this.expirationDate=expirationDate;
 	}
 	//--------------------------------getters---------------------------------------//
 	String getId(){
 		return id;
 	}
 	String getBloodtype(){
 		return bloodtype;
 	}
 	String getCholestrolLevel(){
 		return cholestrolLevel;
 	}
 	String getLocation(){
 		return location;
 	}
 	String getExpirationDate(){
	return expirationDate;
 	}

	public String toString(){
		return "ID: "+getId()+"\tBlood Group: "+getBloodtype()+"\tLocation: "+getLocation()+"\tCholestrol: "+getCholestrolLevel()+"\tExpiration Date: "+getExpirationDate();
	}
	public void addBloodPouch() throws Exception{
		Scanner input=new Scanner(System.in);
		 FileWriter file=new FileWriter("output.txt");
			 LinkedList<String> addBloodPouchArray=new LinkedList<String>(); 
			 int i=1;
			 while(i==1) {
			 	System.out.println("Enter id:");
			 	setId(input.next());
			 	System.out.println("Enter Blood type");
			 	setBloodtype(input.next());
			 	System.out.println("Enter Location:");
			 	setLocation(input.next());
			 	System.out.println("Enter chlestrol :");
			 	setCholestrolLevel(input.next());
			 	System.out.println("Enter Expiry date:");
			 	setExpirationDate(input.next());

			 	addBloodPouchArray.add(toString());
			 	System.out.println("Enter 1 to add more data and 0 to stop!.......");
			 	i=input.nextInt();
			 }
			 	for(String write:addBloodPouchArray) {  
			 	    
	    			file.write(write+"\n");  	
	  			}
			  	
			  	file.close();
			  	System.out.println("Data Saved");
			  	System.out.println("Do want to see data that you have entered?......");
			  	if (input.next().equals("yes")) {
			  		File r=new File("output.txt");
					Scanner read=new Scanner(r);
					System.out.println("***************************************************************************************");
					while(read.hasNext()){
						System.out.println(read.nextLine()+"\n");
					}
					file.close();
					System.out.println("***************************************************************************************");
			  	}
	}
	public void removeBloodPouch() throws Exception{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter id:");
 		setId(input.next());
 		File r=new File("output.txt");
		Scanner read=new Scanner(r);
		LinkedList<String> bloodPouchArray=new LinkedList<String>();
		while(read.hasNext()){
			bloodPouchArray.add(read.nextLine());
		}

		
		int index=-1;
		for (int i=0;i<bloodPouchArray.size() ;i++ ) {
			if (bloodPouchArray.get(i).contains(getId())) {
				index=i;
			}
		}
		if (index>=0) {
			
			bloodPouchArray.remove(index);	
		
			FileWriter file=new FileWriter("output.txt");
		for(String write:bloodPouchArray) {  
 	    
		file.write(write+"\n");  	
			}
	  	
	  	file.close();
	  	System.out.println("Data removed successfully!.....");
	  	System.out.println("Do want to see the updated data ?......");

	  	if (input.next().equals("yes")) {
				File r1=new File("output.txt");
			Scanner read1=new Scanner(r1);
	  		
			System.out.println("***************************************************************************************");
			while(read1.hasNext()){
				System.out.println(read1.nextLine()+"\n");
			}
			file.close();
			System.out.println("***************************************************************************************");
		}
		}else {
			System.out.println("Id not found !.......");
		}
	}
 			

 }

