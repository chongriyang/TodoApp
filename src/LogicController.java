public class LogicController {
	Storage storage;

	public LogicController() {
		storage = new Storage();
	}
	
	public Storage getStorage() {
		return storage;
	}

	public void setStorage(Storage storage) {
		this.storage = storage;
	}
	
	public void addTask(Task task) {
		storage.getTasks().put(storage.getNewTaskId(), task);
	}
	
	public void delTask(int id) {
		if (storage.getTasks().get(id) != null) {
			storage.getTasks().remove(id);
		}
	}
	
	public void modifyTask(int id, Task task) {
		if (storage.getTasks().get(id) != null) {
			storage.getTasks().put(id, task);
		}
	}
}
