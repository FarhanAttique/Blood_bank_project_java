import java.util.*;
import java.io.*;
public class Patient extends Person{
	
	private String hiv;

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
	public void setHiv(String hiv){
		this.hiv=hiv;
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
	public String getHiv(){
		return  hiv;
	}

	public String toString(){
		return "CNIC: "+getCnic()+"\tName: "+getName()+"\tAddress: "+getAddress()+"\tGender: "+getGender()+"\tJob: "+getJOb()+"\tEmail: "+getEmail()+"\tBloodGroup: "+getHiv()+"\tPhone: "+getPhone();
	}

	public void addPatient()throws Exception{
		Scanner input= new Scanner(System.in);
		FileWriter fr=new FileWriter("Patient.txt");
		LinkedList<String> array=new LinkedList<String>();

		int b=1;
		while(b==1){
			System.out.println("Enter CNIC :");
			setCnic(input.next());
			System.out.println("Enter name :");
			setName(input.next());
			System.out.println("Enter Address :");
			setAddress(input.next());
			System.out.println("Enter gender :");
			setGender(input.next());
			System.out.println("Enter job :");
			setJOb(input.next());
			System.out.println("Enter Email :");
			setEmail(input.next());
			System.out.println("Enter Blood type :");
			setHiv(input.next());
			System.out.println("Enter phone :");
			setPhone(input.next());
			array.add(toString());


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
	 				File r1=new File("Patient.txt");
					Scanner read1=new Scanner(r1);
			  		
					System.out.println("***************************************************************************************");
					while(read1.hasNext()){
						System.out.println(read1.nextLine()+"\n");
					}
					fr.close();
					System.out.println("***************************************************************************************");
			}
	}


}