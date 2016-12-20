
public class aDecTag extends HtmlDecTag {
	
	private String href=null;
	
	public aDecTag(HtmlTag tag){
		super(tag);
	}
	
	public aDecTag(HtmlTag tag, String href){
		this(tag);
		this.href=href;
	}
	
	public String toString(){
		if(href==null)
			return "<a>"+tag.toString()+"</a>";
		else
			return "<a href=\""+href+"\">"+tag.toString()+"</a>";
	}



}
