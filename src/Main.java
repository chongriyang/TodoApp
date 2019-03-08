import java.util.Scanner;

public class Main {
	static LogicController logic;

	public Main() {
		logic = new LogicController();
	}

	public static void main(String args[]) {
		System.out.println("Commands:");
		System.out.println("add <task>, enter 1");
		System.out.println("modify <task>, enter 2");
		System.out.println("delete <task>, enter 3");
		System.out.println(">");
		Scanner sc = new Scanner(System.in);
		while(true) {
			String input = "";
			if (sc.hasNext()) {
				input = sc.next();
				switch (Integer.valueOf(input)) {
				case 1:
					Task addTask = new Task();
					System.out.println("Enter name:");
					addTask.setName(sc.next());
					System.out.println("Enter description:");
					addTask.setDescription(sc.next());
					logic.addTask(addTask);
					break;
				case 2:
					String modifyInput = "";
					System.out.println("Enter task ID:");
					Task modifyTask = logic.getStorage().getTasks().get(sc.next());
					System.out.println("Enter new name:");
					modifyInput = sc.next().trim();
					if (!modifyInput.isEmpty()) {
						modifyTask.setName(sc.next());
					}

					System.out.println("Enter new description:");
					modifyInput = sc.next().trim();
					if (!modifyInput.isEmpty()) {
						modifyTask.setName(sc.next());
					}
					break;
				case 3:
					System.out.println("Enter Task id:");
					logic.delTask(sc.nextInt());
					break;
				}
			}
		}
	}
}
