
public class divTag extends HtmlTag {
	
	public divTag(String id, String name, String text){
		
		this.id=id;
		this.name=name;
		if(id!=null && name!=null)
		display="<div id=\""+this.id+"\" name=\""+this.name+"\">"+text+"</div>";
		else
			display="<div>"+text+"</div>";
		
				
	}
	
	
	

	
	

}
