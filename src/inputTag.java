
public class inputTag extends HtmlTag{
	
	public inputTag(String id, String name, String type, String eventType, String eventText, String value, String text){
		this.id=id;
		this.name=name;
		
		if(id!=null && name!=null)
			display="<input id=\""+this.id+"\" name=\""+this.name+"\" type=\""+type+"\" value=\""+value+"\" "+eventType+"=\""+eventText+"\">"+text+"</input>";
		else
			display="<input type=\""+type+"\" value=\""+value+"\" "+eventType+"=\""+eventText+"\">"+text+"</input>";

			
	}

}
//<input type="button" value="action" onclick="javascript:alert('action')"></input>
