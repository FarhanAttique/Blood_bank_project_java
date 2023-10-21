import java.util.*;
import java.io.*;
public class RunBloodBank{
	public static void main(String[] args) throws Exception {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the choice between 1 to 12....");
		System.out.println("1:Add Blood Pouch \n2: Remove Blood pouch\n3: Add blood bank \n4: Add donor \n5: Update donor\n6: Add Patient \n7: Add Staff\n8: Update Staff");
		int choice=input.nextInt();

		while(choice>=1&&choice<=12){

			if(choice==1){
			
			BloodPouch bloodPouch=new BloodPouch();
			bloodPouch.addBloodPouch();
			}else if (choice==2) {

					BloodPouch bloodPouch=new BloodPouch();
					bloodPouch.removeBloodPouch();
					 
		 	
				 }else if(choice==3){
							BloodBank bank=new BloodBank();
							bank.addBloodBank();

				 }else if(choice==4){
					Donor donor=new Donor();
					donor.addDonor();
					 
				}else if (choice==5) {
					Donor donor=new Donor();
					donor.updateDonor();	
				 }else if(choice==6){
							
				 	Patient patient= new Patient();
				 	patient.addPatient();
				}else if(choice==7){
							
				 	Staff staff= new Staff();
				 	staff.addStaff();
				}else if(choice==8){
							
				 	Staff staff= new Staff();
				 	staff.updateStaff();
				 	
				}

			System.out.println("1:Add Blood Pouch \n2: Remove Blood pouch\n3: Add blood bank \n4: Add donor \n5: Update donor\n6: Add Patient \n7: Add Staff\n8: Update Staff");
			choice=input.nextInt();
		}
		
	} 
	 
}


						