package exerciseOne;

public class Main {

	public static void main(String[] args) {
	
		String pariDispari = "epicode";
		System.out.println(pariDispari + " " + CheckPari(pariDispari));
		
		int anno = 2024;
		System.out.println(anno + " " + CheckBisestile(anno));
		
	}
	
	public static boolean CheckPari(String pariDispari) {
			
			if(pariDispari.length() % 2 == 0) {
				return true;
			} else {
				return false;
			}
	}
	
	public static boolean CheckBisestile(int anno) {
		
		if(anno % 4 == 0 || anno % 100 == 0 && anno % 400 == 0) {
			return true;		
		} else {
			return false;
		}
	}
}
