package EmpmanagementWithMap;

import java.util.Map;
import java.util.Scanner;

public interface EmpMethod {
	
	public void insert(Scanner sc, Map<Integer, Empbean> map, Empbean bean);
	
	public void show();
	
	public void update();
	
	public void delete(Scanner sc, Map<Integer, Empbean> map);

}
