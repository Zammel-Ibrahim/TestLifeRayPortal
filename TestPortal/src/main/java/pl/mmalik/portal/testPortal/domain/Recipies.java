package pl.mmalik.portal.testPortal.domain;

public class Recipies {
	private String name;
	private int timeToDo;
	private int difficultyLvl;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTimeToDo() {
		return timeToDo;
	}

	public void setTimeToDo(int timeToDo) {
		this.timeToDo = timeToDo;
	}

	public int getDifficultyLvl() {
		return difficultyLvl;
	}

	public void setDifficultyLvl(int difficultyLvl) {
		this.difficultyLvl = difficultyLvl;
	}
	
	public Recipies(){}
	public Recipies(String name, int timeToDo, int diffLevel){
		this.name = name;
		this.timeToDo = timeToDo;
		this.difficultyLvl = diffLevel;
	}
}
