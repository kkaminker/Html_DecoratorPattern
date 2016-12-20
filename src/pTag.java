
public class pTag extends HtmlTag {
	
	
	public pTag(String id, String name, String text){
		
		this.id=id;
		this.name=name;
		if(id!=null && name!=null)
		display="<p id=\""+this.id+"\" name=\""+this.name+"\">"+text+"</p>";
		else
			display="<p>"+text+"</p>";
		
				
	}

}
