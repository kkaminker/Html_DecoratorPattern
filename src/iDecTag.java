
public class iDecTag extends HtmlDecTag {
	
	public iDecTag(HtmlTag tag){
		super(tag);
	}
	
	public String toString(){
		return "<i>"+tag.toString()+"</i>";
	}

}
