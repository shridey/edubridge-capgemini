package august03.collections.arraylist.challenge;

import java.util.ArrayList;
import java.util.List;

class Insect {
	private String insectName;
	private int insectWeight;
	
	public Insect(String name, int weight) {
		this.insectName = name;
		this.insectWeight = weight;
	}

	public String getInsectName() {
		return insectName;
	}

	public void setInsectName(String insectName) {
		this.insectName = insectName;
	}

	public int getInsectWeight() {
		return insectWeight;
	}

	public void setInsectWeight(int insectWeight) {
		this.insectWeight = insectWeight;
	}

	@Override
	public String toString() {
		return "Insect [insectName=" + insectName + ", insectWeight=" + insectWeight + "]";
	}
	
}

class Insecticides {
	
	public List<String> mapInsectsName(List<Insect> list) {
		List<String> names = new ArrayList<String>();
		for (Insect insect: list) {
			names.add(insect.getInsectName());
		}
		
		return names;
	}
	
	public List<Insect> getWeight(List<Insect> list) {
		List<Insect> filteredWeight = new ArrayList<Insect>();
		
		for (Insect insect: list) {
			if (insect.getInsectWeight() > 40 && insect.getInsectWeight() <= 100) {
				filteredWeight.add(insect);
			}
		}
		
		return filteredWeight;
	}

	
	
}

public class Source {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Insecticides i = new Insecticides();
		
		List<Insect> list = new ArrayList<Insect>();
		list.add(new Insect("Ant", 45));
		list.add(new Insect("Cockroach", 65));
		list.add(new Insect("bee", 99));
		list.add(new Insect("paper wasp", 11));
		
		System.out.println(i.mapInsectsName(list));
		System.out.println(i.getWeight(list));
	}

}
