public class Cmdline {
		
	public static void main(String[] args) {

		/*int i;
		i = 0;
		System.out.println("Argument " + i + " est bonjour");*/
		for (int t = 0; t < args.length; t++){
			System.out.println("Argument " + t + " is " + args[t]);
		}

	}
}