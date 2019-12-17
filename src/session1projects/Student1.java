package session1projects;

public class Student1 {
	
	static String collegeName= "JohnAbbott";
	
	private String name;
	private String stdId;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStdId() {
		return stdId;
	}
	public void setStdId(String stdId) {
		this.stdId = stdId;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", stdId=" + stdId + "] "
				+ "and collegeName = " + collegeName;
	}
	
	
	
	
	
	
	
	
}
