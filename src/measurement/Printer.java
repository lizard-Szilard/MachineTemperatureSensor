
package measurement;
	
public class Printer {
	public double printAllMachineTemperatures(double listSuhu[]){
		
		int index = 0;
		while(listSuhu.length != 0 && index < listSuhu.length){
				System.out.println(listSuhu[index]);
				index++;
		}
		return 0;
	}
}
