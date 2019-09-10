
public class Photo {
	private int height; 
	private int width; 
	private String type; 

	
	public Photo(int ht, int wd, String ty){
		height = ht; 
		width = wd; 
		type = ty; 
	}
	
	public Photo(){
		height = 0;
		width = 0;
		type = "";
	}
	
	public void setHeight(int ht){
		height = ht; 
	}
	public int getHeight(){
		return height;
	}
	
	public void setWidth(int wd){
		width = wd;
	}
	public int getWidth(){
		return width;
	}
	
	
	public void setType(String ty){
		type = ty; 
	}
	public String getType(){
		return type;
	}
	
	public void ToString(){
		System.out.println(height + "-" + width + "-" + type);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
