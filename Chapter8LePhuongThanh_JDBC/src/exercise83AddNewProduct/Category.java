package exercise83AddNewProduct;

public class Category {
	private String name;
	private String description;
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	public Category(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}
	public Category() {
		super();
	}
	@Override
	public String toString() {
		return this.name+"\t"+this.description+"\n";
	}

}
