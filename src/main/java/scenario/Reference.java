package scenario;

import java.util.ArrayList;

public class Reference {
	private ArrayList<Developer> developers;
	private ArrayList<ProjectManager> projectManagers;
	public Reference() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Reference(ArrayList<Developer> developers, ArrayList<ProjectManager> projectManagers) {
		super();
		this.developers = developers;
		this.projectManagers = projectManagers;
	}
	public ArrayList<Developer> getDevelopers() {
		return developers;
	}
	public void setDevelopers(ArrayList<Developer> developers) {
		this.developers = developers;
	}
	public ArrayList<ProjectManager> getProjectManagers() {
		return projectManagers;
	}
	public void setProjectManagers(ArrayList<ProjectManager> projectManagers) {
		this.projectManagers = projectManagers;
	}
	@Override
	public String toString() {
		return "Reference [developers=" + developers + ", projectManagers=" + projectManagers + "]";
	}
	

}
