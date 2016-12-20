
public class htmlMain {

	public static void main(String[]args){
		HtmlTag tag=new pTag("id","name","text");
		System.out.println(tag.toString());
		tag=new emDecTag(tag);
		tag=new aDecTag(tag,"www.touro.edu");
		tag=new StrongDecTag(tag);
		tag=new SmallDecTag(tag);
		tag=new iDecTag(tag);
		tag=new uDecTag(tag);
		
		System.out.println(tag.toString());
		
		HtmlTag tag2=new hTag("id", "name", "text", "2");
		System.out.println(tag2.toString());
		
		HtmlTag tagNoNameId=new divTag(null, null, "text");
		System.out.println(tagNoNameId.toString());
		
		tag=new aDecTag(tag,"www.touro.edu");
		
		HtmlTag input=new inputTag("id","name","button","onClick","javascript:alert('action')","value","text");
		System.out.println(input.toString());
		
	}
	
	
}
