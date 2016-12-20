
public class hTag extends HtmlTag {
	
	public hTag(String id, String name, String text, String num){
		
		this.id=id;
		this.name=name;
		if(id!=null && name!=null)
		display="<h"+num+" id=\""+this.id+"\" name=\""+this.name+"\">"+text+"</h"+num+">";
		else
			display="<h"+num+">"+text+"</h>";
		
				
	}

}
