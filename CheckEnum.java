public class CheckEnum {
	public enum Season {
		WINTER('W'), SPRING(10), SUMMER(15), FALL(20);

		private int value;

		private Season(int value) {
			this.value = value;
		}
	}

	public static void main(String args[]) {
		/*for (Season s : Season.values()) {
			System.out.println(s + " " + s.value);
		}*/
		System.out.println("Spring Value: "+Season.WINTER.value);
	}
}