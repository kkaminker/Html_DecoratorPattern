
public class SmallDecTag extends HtmlDecTag {
	

	public SmallDecTag(HtmlTag tag){
		super(tag);
	}
	
	public String toString(){
		return "<small>"+tag.toString()+"</small>";
	}


}
