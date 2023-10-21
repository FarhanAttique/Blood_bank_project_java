import java.util.*;
import java.io.*;
public class Donor extends Person{
	private String bloodType;

	public void setCnic(String cnic){
		super.setCnic(cnic);
	}
	public void setName(String name){
		super.setName(name);
	}
	public void setAddress(String address){
		super.setAddress(address);
	}
	public void setGender(String gender){
		super.setGender(gender);
	}
	public void setJOb(String job){
		super.setJob(job);
	}
	public void setEmail(String email){
		super.setEmail(email);
	}
	
	public void setPhone(String phone){
		super.setPhone(phone);

	}
	public void setBloodType(String bloodType){
		this.bloodType=bloodType;
	}
	public String getCnic(){
		return  super.getCnic();
	}
	public String getName(){
		return  super.getName();
	}
	public String getAddress(){
		return  super.getAddress();
	}
	public String getGender(){
		return  super.getGender();
	}
	public String getJOb(){
		return  super.getJob();
	}
	public String getEmail(){
		return  super.getEmail();
	}
	
	public String getPhone(){
		return  super.getPhone();
	}
	public String getBloodType(){
		return  bloodType;
	}
	public String toString(){
		return "CNIC NO: "+
		getCnic()+"\tName: "+getName()+"\tAddress: "+getAddress()+"\tGender: "+getGender()+"\tJob: "+getJOb()+"\tEmail Address:"+getEmail()+"\tBlood Group:"+getBloodType()+"\tPhone Number:"+getPhone();
	}



//---------------------------------ADD DONOR-----------------------------------------------------//





	public void addDonor() throws Exception{
		Scanner input=new Scanner(System.in);
		FileWriter donorFile=new FileWriter("Donor.txt");
		LinkedList<String> addDonorArray=new LinkedList<String>();

		int i=1;
		while(i==1) {
		 	System.out.println("Enter Your Cnic:...");
		 	setCnic(input.next());
		 	System.out.println("Enter Enter your name:");
		 	setName(input.next());
		 	System.out.println("Enter Your Address:");
		 	setAddress(input.next());
		 	System.out.println("Enter your gender:");
		 	setGender(input.next());
		 	System.out.println("Enter your job:");
		 	setJOb(input.next());
		 	System.out.println("Enter your email address:");
		 	setEmail(input.next());
		 	System.out.println("Enter your blood type:");
		 	setBloodType(input.next());
		 	System.out.println("Enter your phone number:");
		 	setPhone(input.next());

		 	addDonorArray.add(toString());
		 	System.out.println("Enter 1 to add more data and 0 to stop!.......");
		 	i=input.nextInt();
		}
	 	for(String write:addDonorArray) {      
			donorFile.write(write+"\n");  	
		}
		  	
	  	donorFile.close();
	  	System.out.println("Data Saved");
	  	System.out.println("Do want to see data that you have entered?......");
	  	if (input.next().equals("yes")) {
	  		File r=new File("donor.txt");
			Scanner read=new Scanner(r);
			System.out.println("***************************************************************************************");
			while(read.hasNext()){
				System.out.println(read.nextLine()+"\n");
			}
			donorFile.close();
			System.out.println("***************************************************************************************");
	 	}
	}



	//---------------------------UPDATE DONAR-----------------------------------------//


	public void updateDonor() throws Exception{
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the Cnic of the person whose Data you want to update:");
		setCnic(input.next());
		File r=new File("donor.txt");
		Scanner read=new Scanner(r);
		LinkedList<String> donorUpdates=new LinkedList<String>();
			while(read.hasNext()){
				donorUpdates.add(read.nextLine());
			}
	
			
			int index=-1;
			for (int i=0;i<donorUpdates.size() ;i++ ) {
				if (donorUpdates.get(i).contains(getCnic())) {
					index=i;
				}
			}
			if (index>=0) {
				System.out.println("Enter the name of field that you want update:");
					String field = input.next();
  				if (field.equalsIgnoreCase("Name")||field.equalsIgnoreCase("name")||field.equalsIgnoreCase("CNIC")) {
  				System.out.println("You can't change the fields");
  				}else if (field.equalsIgnoreCase("Address")) {
						System.out.println("Enter your old address:");
	  					String oldAddress=input.next();
						String previous=donorUpdates.get(index);
						donorUpdates.remove(index);
						if (previous.contains(oldAddress)) {
							System.out.println("Enter the updated Address:");
							String newAddress=input.next();
							String updatedDonorAddress= previous.replaceFirst(oldAddress,newAddress);
							donorUpdates.add(index,updatedDonorAddress);
					}
					}else if (field.equalsIgnoreCase("Phone")) {
						System.out.println("Enter your old Phone Number:");
	  					String oldPhone=input.next();
						String previous=donorUpdates.get(index);
						donorUpdates.remove(index);
						if (previous.contains(oldPhone)) {
							System.out.println("Enter the updated Phone Number:");
							String newPhone=input.next();
							String updatedDonorPhone= previous.replaceFirst(oldPhone,newPhone);
							donorUpdates.add(index,updatedDonorPhone);
					}
					}else if (field.equalsIgnoreCase("Email")) {
						System.out.println("Enter your old Email Adress:");
	  					String oldEmailAddress=input.next();
						String previous=donorUpdates.get(index);
						donorUpdates.remove(index);
						if (previous.contains(oldEmailAddress)) {
							System.out.println("Enter the updated Email Adress:");
							String newEmailAdress=input.next();
							String updatedDonorEmail= previous.replaceFirst(oldEmailAddress,newEmailAdress);
							donorUpdates.add(index,updatedDonorEmail);
					}
					}else if (field.equalsIgnoreCase("Job")) {
						System.out.println("Enter your old job:");
	  					String oldJob=input.next();
						String previous=donorUpdates.get(index);
						donorUpdates.remove(index);
						if (previous.contains(oldJob)) {
							System.out.println("Enter the updated Email Adress:");
							String newJob=input.next();
							String updatedDonorJob= previous.replaceFirst(oldJob,newJob);
							donorUpdates.add(index,updatedDonorJob);
					}
					}else{
						System.out.println("Field not Found");
					}
					FileWriter file=new FileWriter("donor.txt");
					for(String write:donorUpdates) {  
		 	    
    				file.write(write+"\n");  	
	  			}
			  	
			  	file.close();
			  	System.out.println("Data updated successfully!.....");
			  	System.out.println("Do want to see the updated data ?......");

			  	if (input.next().equals("yes")) {
	 				File r1=new File("donor.txt");
					Scanner read1=new Scanner(r1);
			  		
					System.out.println("***************************************************************************************");
					while(read1.hasNext()){
						System.out.println(read1.nextLine()+"\n");
					}
					file.close();
					System.out.println("***************************************************************************************");
			}
  		
	  		}else {
				System.out.println("CNIC Number not found !.......");
			}
	}


}