import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;


public class Recipe implements Serializable{

	String name; 
	String description; 
	ArrayList<String> ingredients;
	ArrayList<String> instructions;
	int time;
	
	public Recipe(String name, String description, ArrayList<String> ingredients, ArrayList<String> instructions, int time) {
		this.name = name;
		this.description = description;
		this.ingredients = ingredients;
		this.instructions = instructions;
		this.time = time;
	} 
	
	// for recipe additions
	public Recipe(String name) {
		this.name = name;
	} 
	
	// shouldn't have to use all these getters and setters, leaving them here in case
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

	public ArrayList<String> getIngredients() {
		return ingredients;
	}


	public void setIngredients(ArrayList<String> ingredients) {
		this.ingredients = ingredients;
	}


	public ArrayList<String> getInstructions() {
		return instructions;
	}
	
	public void setTime(int time) {
    	this.time = time;
    } //end setTime
    

    public int getTime() {
        return time;
    } //end getTime
	
    
	public String toString() {
		
		String output = " ";
		output += "\n";
		output += "Recipe Name: " + this.name + "\n"; 
		output += "Recipe Description: " + this.description + "\n";		
		output += "Recipe Ingredients: "+ "\n";
		//put ingredients in a vertical list
		for (int i = 0; i < ingredients.size(); i++) {
			output += this.ingredients.get(i) + "\n";
		} //end for
			
		output += "Recipe Instructions: "+ "\n";
		//put instructions in a vertical list
		for (int i = 0; i < instructions.size(); i++) {
			output += this.instructions.get(i) + "\n";
		} //end for
		
		output += "Recipe Time: "+ this.time + " minutes\n";
		
		return output;

    } //end toString

		
} //end public class Recipe