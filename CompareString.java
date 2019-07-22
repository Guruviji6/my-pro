
public class CompareString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		boolean chk = CompareString.comparePatientId("KH1234","KH1234");
		System.out.println("Chk: "+chk);
	}
	

	public static boolean comparePatientId(String fromPatId, String toPatId) {
		int comp = toPatId.compareTo(fromPatId);
		System.out.println("comp: "+comp);
		if(comp >= 0) {
			return true;
		} else {
			return false;
		}
	}

}
