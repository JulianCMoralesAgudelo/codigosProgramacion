import java.util.ArrayList;
import java.util.List;

public class DiagonalDifference {

	public static void main(String[] args) {

		int primaryDiagnal = 0;
		int secDiagnal = 0;
		int diff;

		List<List<Integer>> arr = new ArrayList<>();

		for (int i = 0; i < arr.get(0).size(); i++) {
			primaryDiagnal += arr.get(i).get(i);
		}

		int col = arr.get(0).size() - 1;
		for (int i = 0; i < arr.get(0).size(); i++) {
			secDiagnal += arr.get(i).get(col);
			col--;
		}

		diff = primaryDiagnal - secDiagnal;
		System.out.println(Math.abs(diff));
	}

}
