import java.util.Date;

public class Task {
	int id;
	String name;
	String description;
	Date startDate;
	Date endDate;

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		System.out.println("adddescription" + description);
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
}
