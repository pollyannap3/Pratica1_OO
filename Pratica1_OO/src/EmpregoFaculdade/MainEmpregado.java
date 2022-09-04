package EmpregoFaculdade;

public class MainEmpregado {

	public static void main(String[] args) {
		
		EmpregadoDaFaculdade emp1; 
				
		emp1 = new EmpregadoDaFaculdade("Maria", 5000, 20, 5800);
		System.out.println(emp1.getInfo());

	}

}
