
public class Address {

	private String street;
	private String city;
	private String state;
	private String zip;
	
	/*public Address(String str, String ct, String st, String zp){
		street  = str;
		city	= ct;
		state	= st;
		zip		= zp;
	}*/
	
	public String getAddress(){
		return street + "\n" + city + ", " + state + " " + zip;	
	}
	
	public void setAddress(String str, String ct, String st, String zp){
		street = str;
		city = ct;
		state = st;
		zip = zp;
	}

}
