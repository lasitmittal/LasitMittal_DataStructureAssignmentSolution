package com.greatlearning.driver;
import com.greatlearning.service.Skyscraper;

public class Driver1_Skyscraper {

	public static void main(String[] args) {
		Skyscraper ss = new Skyscraper();
        int no_of_floors = ss.inputFloors();
        ss.assemblyPlan(no_of_floors);

	}
}