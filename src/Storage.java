import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Storage {
	Set<Integer> taskIdSet;
	Map<Integer, Task> tasks;
	
	public Storage() {
		taskIdSet = new HashSet<>();
		tasks = new HashMap<>();
	}
	
	public int getNewTaskId() {
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			if (!taskIdSet.contains(i)) {
				taskIdSet.add(i);
				return i;
			}
		}
		
		return -1;
	}
	
	public Map<Integer, Task> getTasks() {
		return tasks;
	}

	public void setTasks(Map<Integer, Task> tasks) {
		this.tasks = tasks;
	}
}
