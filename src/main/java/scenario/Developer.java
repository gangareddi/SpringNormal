package scenario;

public class Developer {
	private String developerName;
	private String projectName;
	public Developer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Developer(String developerName, String projectName) {
		super();
		this.developerName = developerName;
		this.projectName = projectName;
	}
	public String getDeveloperName() {
		return developerName;
	}
	public void setDeveloperName(String developerName) {
		this.developerName = developerName;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	@Override
	public String toString() {
		return "Developer [developerName=" + developerName + ", projectName=" + projectName + "]";
	}
	

}
