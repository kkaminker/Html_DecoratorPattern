
public class emDecTag extends HtmlDecTag {
	
	public emDecTag(HtmlTag tag){
		super(tag);
	}
	
	public String toString(){
		return "<em>"+tag.toString()+"</em>";
	}

}
