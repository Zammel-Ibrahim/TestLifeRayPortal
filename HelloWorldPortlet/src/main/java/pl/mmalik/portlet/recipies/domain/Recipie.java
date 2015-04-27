package pl.mmalik.portlet.recipies.domain;

public class Recipie {
	private String name;
	private String category;
	private String description;
	private Integer readyIn;

	public Recipie(){}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getReadyIn() {
		return readyIn;
	}

	public void setReadyIn(Integer readyIn) {
		this.readyIn = readyIn;
	}
	
	public static class Builder {
		private Recipie entity = new Recipie();
		
		public Builder setName(String name) {
			this.entity.setName(name);
			return this;
		}

		public Builder setCategory(String category) {
			this.entity.setCategory(category);
			return this;
		}
		
		public Builder setDescription(String description) {
			this.entity.setDescription(description);
			return this;
		}

		public Builder setReadyIn(Integer readyIn) {
			this.entity.setReadyIn(readyIn);
			return this;
		}
		
		public Recipie build(){
			return entity;
		}
	}
	
	@Override
	public String toString(){
		return System.out.format("%s %s, can be ready in %d| Cat. %s", 
				this.name, this.description, this.readyIn,this.category)
				.toString();
	}
}
