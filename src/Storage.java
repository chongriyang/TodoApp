import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Storage {
	Set<Integer> taskIdSet = new HashSet<>();
	Map<Integer, Task> tasks = new HashMap<>();
	int taskIdCounter = 0;
	
	public int getNewTaskId() {
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			if (!taskIdSet.contains(i)) {
				taskIdSet.add(i);
				return i;
			}
		}
		
		return -1;
	}
	
	public Storage() {
		tasks = new HashMap<Integer, Task>();
	}
	
	public Map<Integer, Task> getTasks() {
		return tasks;
	}

	public void setTasks(Map<Integer, Task> tasks) {
		this.tasks = tasks;
	}
}
