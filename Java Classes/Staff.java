import java.util.*;
import java.io.*;
public class Staff extends Person{
	
	

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
	
	//------------------------getters-----------------------------------//
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
	
	public String toString(){
		return "CNIC: "+getCnic()+"\tName: "+getName()+"\tAddress: "+getAddress()+"\tGender: "+getGender()+"\tJob: "+getJOb()+"\tEmail: "+getEmail()+"\tPhone: "+getPhone();
	}

	public void addStaff()throws Exception{
		Scanner input= new Scanner(System.in);
		FileWriter fr=new FileWriter("Staff.txt");
		LinkedList<String> array=new LinkedList<String>();

		int b=1;
		int serial=1;
		while(b==1){
			System.out.println("Enter CNIC :");
			setCnic(input.next());
			System.out.println("Enter name :");
			setName(input.next());
			System.out.println("Enter Address :");
			setAddress(input.next());
			System.out.println("Enter gender :");
			setGender(input.next());
			System.out.println("Enter department:");
			setJOb(input.next());
			System.out.println("Enter Email :");
			setEmail(input.next());
			
			System.out.println("Enter phone :");
			setPhone(input.next());
			
			array.add(serial+" "+toString());
			serial++;

			System.out.println("Enter 1 to enter data again and 0 to stop .................");
			b=input.nextInt();
		}

			for (String str:array ) {
				fr.write(str+"\n");
			}
			fr.close();
			System.out.println("Data Saved successfully!.....");
			  	System.out.println("Do want to see the saved data ?......");

			  	if (input.next().equals("yes")) {
	 				File r1=new File("Staff.txt");
					Scanner read1=new Scanner(r1);
			  		
					System.out.println("***************************************************************************************");
					while(read1.hasNext()){
						System.out.println(read1.nextLine()+"\n");
					}
					fr.close();
					System.out.println("***************************************************************************************");
			}
	}


	public void updateStaff() throws Exception{
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the Cnic of the person whose Data you want to update:");
		setCnic(input.next());
		File r=new File("Staff.txt");
		Scanner read=new Scanner(r);
		LinkedList<String> staffUpdates=new LinkedList<String>();
			while(read.hasNext()){
				staffUpdates.add(read.nextLine());
			}
	
			
			int index=-1;
			for (int i=0;i<staffUpdates.size() ;i++ ) {
				if (staffUpdates.get(i).contains(getCnic())) {
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
						String previous=staffUpdates.get(index);
						staffUpdates.remove(index);
						if (previous.contains(oldAddress)) {
							System.out.println("Enter the updated Address:");
							String newAddress=input.next();
							String updatedstaffAddress= previous.replaceFirst(oldAddress,newAddress);
							staffUpdates.add(index,updatedstaffAddress);
					}
					}else if (field.equalsIgnoreCase("Phone")) {
						System.out.println("Enter your old Phone Number:");
	  					String oldPhone=input.next();
						String previous=staffUpdates.get(index);
						staffUpdates.remove(index);
						if (previous.contains(oldPhone)) {
							System.out.println("Enter the updated Phone Number:");
							String newPhone=input.next();
							String updatedstaffPhone= previous.replaceFirst(oldPhone,newPhone);
							staffUpdates.add(index,updatedstaffPhone);
					}
					}else if (field.equalsIgnoreCase("Email")) {
						System.out.println("Enter your old Email Adress:");
	  					String oldEmailAddress=input.next();
						String previous=staffUpdates.get(index);
						staffUpdates.remove(index);
						if (previous.contains(oldEmailAddress)) {
							System.out.println("Enter the updated Email Adress:");
							String newEmailAdress=input.next();
							String updatedstaffEmail= previous.replaceFirst(oldEmailAddress,newEmailAdress);
							staffUpdates.add(index,updatedstaffEmail);
					}
					}else if (field.equalsIgnoreCase("Job")) {
						System.out.println("Enter your old job:");
	  					String oldJob=input.next();
						String previous=staffUpdates.get(index);
						staffUpdates.remove(index);
						if (previous.contains(oldJob)) {
							System.out.println("Enter the updated Email Adress:");
							String newJob=input.next();
							String updatedstaffJob= previous.replaceFirst(oldJob,newJob);
							staffUpdates.add(index,updatedstaffJob);
					}
					}else{
						System.out.println("Field not Found");
					}
					FileWriter file=new FileWriter("staff.txt");
					for(String write:staffUpdates) {  
		 	    
    				file.write(write+"\n");  	
	  			}
			  	
			  	file.close();
			  	System.out.println("Data updated successfully!.....");
			  	System.out.println("Do want to see the updated data ?......");

			  	if (input.next().equals("yes")) {
	 				File r1=new File("Staff.txt");
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