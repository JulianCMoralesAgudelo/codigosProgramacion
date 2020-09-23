package unit4;
import java.util.ArrayList;
import java.util.Arrays;
public class ExamplesRecursion {

	public static void main(String args[]) {
		System.out.println("sumN(5):"+sumN(5));
		System.out.println("power(5,0):"+power(5,0));
		int a[]={3,4,5,2};
		System.out.println("sumArray({3,4,5,2}):"+sumArray(a));
		System.out.println("checkSort({3,4,5,2}):"+checkSort(a));
		a[3]=8;
		System.out.println("checkSort({3,4,5,8}):"+checkSort(a));
		a[3]=-1;
		try {
			System.out.println("findMin({3,4,5,-1}):"+findMin(a));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("find({3,4,5,-1},5):"+find(a,5));

		System.out.println("russianmultiply({5,-4}):"+russianmultiply(5,-4));
		System.out.println("sum2toN(5):"+sum2toN(5));
		System.out.println("binomial(5,2):"+binomial(5,2));
		sort(a);
		System.out.println("sort({3,4,5,-1}):"+ Arrays.toString(a));
		a=new int[1];
		a[0]=3;
		sort(a);
		System.out.println("sort({3}):"+ Arrays.toString(a));
		int[] b= {-2,1,0,-1};
		sort(b);
		System.out.println("sort({-2,1,0,-1}):"+ Arrays.toString(b));
		reverse(b);
		System.out.println("reverse({-2,1,0,-1}):"+ Arrays.toString(b));
		System.out.println("tobinary(100):"+ toBinary(53));
		System.out.println("minIndex({-1,0,1,-2}):"+minIndex(b,0,b.length-1));
		fun2(b,0,b.length-1);
		System.out.println("fun2({-1,0,1,-2},0,3):"+Arrays.toString(b));
		System.out.println("f(1):"+ f(91));
		System.out.println("checkPalindrome('doctor'):"+ checkPalindrome("doctor"));
		System.out.println("checkPalindrome('acbca'):"+ checkPalindrome("acbca"));
		System.out.println("checkPalindrome('acbbca'):"+ checkPalindrome("acbbca"));

		System.out.println("checkPalindrome('a'):"+ checkPalindrome("a"));
		System.out.println("mystery(4):"+ mystery(3));
		System.out.println("ackerman(3,5):"+ ackerman(3,5));
		System.out.println("f2(0):"+ f2(0));

		System.out.println("isPrimer(11):"+isPrime(11));
		System.out.println("reversePhrase('this is my cat'):"+reversePhrase("cat"));
		System.out.println("elfish('telefono'):"+elfish("teleono"));
		
		
	}
	
}

