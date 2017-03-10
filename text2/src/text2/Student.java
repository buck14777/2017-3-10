package text2;

	public class Student {
		private String name, id; //姓名,編號
		private char gender; //性別
		int readYear; //入學年份
	public Student(String name1,String id1){
		name = name1;
		id = id1;
	}
	public void setName(String name1){
		name=name1;
	}
	public String getNane(){
		return name;
	}
	public void setId(String id1){
		id=id1;
	}
	public String getId(){
		return id;
	}
	public void setGender(char gender1){
		gender=gender1;
	}
	public char getGender(){
		return gender;
	}
	public void setReadYear(int readYear1){
		readYear=readYear1;
	}
	public int getReadYear(){
		return readYear;
	}
}
