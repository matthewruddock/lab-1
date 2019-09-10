
public class House {
	
	private int id;       
	private float price;    
	private String location; 
	private String advertiser;
	private Photo image = new Photo();


	public House(int i, float pr, String loca, String adver, Photo img){
		id = i;       
		price = pr;    
		location = loca; 
		advertiser = adver;
		image = img; 
	}
	
	public House(){
		id = 0;       
		price = 0;    
		location = ""; 
		advertiser = "";
		image = new Photo(0,0,""); 
	}
	
	public void setID(int i){
		id = i; 
	}
	public int getID(){
		return id;
	}
	
	public void setPrice(float pr){
		price = pr;
	}
	public float getPrice(){
		return price;
	}
	
	
	public void setLocation(String loca){
		location = loca;  
	}
	public String getLocation(){
		return location;
	}
	
	
	public void setAdvertiser(String adver){
		advertiser = adver; 
	}
	public String getAdvertiser(){
		return advertiser;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

}
