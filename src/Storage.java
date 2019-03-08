import java.util.ArrayList;
import java.util.List;

public class Storage {
	List<Task> tasks;
	
	public Storage() {
		tasks = new ArrayList<Task>();
	}
	
	public List<Task> getTasks() {
		return tasks;
	}

	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}
}
