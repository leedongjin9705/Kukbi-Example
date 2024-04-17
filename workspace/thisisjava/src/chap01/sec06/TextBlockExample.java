package chap01.sec06;

public class TextBlockExample {

	public static void main(String[] args) {
		String str1 = "" +
					  "{\n" +
					  "\t\"id\":\"winter\",\n" +
					  "\t\"name\":\"눈송이\"\n" +
					  "}";
		
		String str2 = """
				{
				"id" : "winter" ,
				"name" : "눈송이"
				}
				""";
		
		String str3 = """
				{
					나는 자바를 \
			배우고 있습니다.
				나는 자바를 
			배우고 있습니다.
				}
				""";
		
		
		System.out.println(str1);
		System.out.println("------------------------------");
		System.out.println(str2);
		System.out.println("------------------------------");
		System.out.println(str3);
					  

	}
}
