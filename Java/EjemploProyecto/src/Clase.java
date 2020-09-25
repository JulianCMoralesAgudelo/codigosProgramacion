
public class Clase {

	public static void main(String[] args) {
		Robot bender = new Robot();
		System.out.println(bender.ext);
		bender.caminar();
		bender.caminar(5);
		bender.caminar(5, 2);
		bender.caminar(5, "Tres esquinas");

		Robot mini = new RobotMini();
		Robot biggy = new RobotGrande();
		
		

	}

}
