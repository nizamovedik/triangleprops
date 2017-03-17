package proj.props;

public class IsPositiveSides {

	public boolean isTrue(int a, int b, int c) {
		// TODO Auto-generated method stub
		if ( a > 0 && b > 0 && c > 0 &&
				a + b > c && b + c > a && a + c > b)
			return true;
		return false;
	}

}
