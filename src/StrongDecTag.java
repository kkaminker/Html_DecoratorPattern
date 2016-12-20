
public class StrongDecTag extends HtmlDecTag{
	
	public StrongDecTag(HtmlTag tag){
		super(tag);
	}
	
	public String toString(){
		return "<strong>"+tag.toString()+"</strong>";
	}

}
