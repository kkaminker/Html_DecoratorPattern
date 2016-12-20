
public class uDecTag extends HtmlDecTag {
	
	public uDecTag(HtmlTag tag){
		super(tag);
	}
	
	public String toString(){
		return "<u>"+tag.toString()+"</u>";
	}


}
