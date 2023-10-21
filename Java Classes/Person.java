class Person{
	private String cnic;
	private String name;
	private String address;
	private String gender;
	private String job;
	private String phone;
	private String email;
	Person(){
		this.cnic="";
		this.name="";
		this.address="";
		this.gender="";
		this.job="";
		this.phone="";
		this.email="";
	}
   Person(String cnic,String name,String address,String gender,String job,String phone,String email){
		this.cnic=cnic;
		this.name=name;
		this.address=address;
		this.gender=gender;
		this.job=job;
		this.phone=phone;
		this.email=email;
	}
	public void setCnic(String cnic){
		this.cnic=cnic;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setAddress(String address){
		this.address=address;
	}
	public void setGender(String gender){
		this.gender=gender;
	}
	public void setJob(String job){
		this.job=job;
	}
	public void setPhone(String phone){
		this.phone=phone;
	}
	public void setEmail(String email){
		this.email=email;
	}


	public String getCnic(){
		return this.cnic;
	}
	public String getName(){
		return this.name;
	}
	public String getAddress(){
		return this.address;
	}
	public String getEmail(){
		return this.email;
	}
	public String getPhone(){
		return this.phone;
	}
	public String getJob(){
		return this.job;
	}
	public String getGender(){
		return this.cnic;
	}
    public String toString(){
    	return "CNIC NO: "+getCnic()+"\tName: "+getName()+"\tAddress: "+getAddress()+"\tGender: "+getGender()+"\tJob: "+getJob()+"\tEmail Address:"+getEmail()+"\tPhone Number:"+getPhone();
    } 


}