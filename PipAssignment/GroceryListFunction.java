import java.util.ArrayList;
public class GroceryListFunction{
	ArrayList <String> totalGroceryList = new ArrayList <String>();

	public int getSizeOfGroceryList(){
			return totalGroceryList.size();
	}


	public String addGroceryList(String item){

		totalGroceryList.add(item);
		return "Items Successfully Added";
	}


	public String removeGroceryList(String item){
		for(String grocery : getSizeOfGroceryList);
			if(!grocery.equalsIgnoreCase(item)
				return "Item is not in the GroceryList";

		totalGroceryList.remove(item);
			return "Items Successfully Removed"
	


	}










}