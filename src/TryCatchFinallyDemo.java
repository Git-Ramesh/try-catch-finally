
public class TryCatchFinallyDemo {
	public static void main(String[] args) {
//		throwError();
//		System.out.println("Statement after exception"); // This won't execute
		
// 		================================= try - catch
//		System.out.println("Statement before of try"); // ok
//		try {
//		System.out.println("Statement in try before exception"); //ok
//		throwError();
//		System.out.println("Statement in try after exception"); // not
//		} catch(Exception e) {
//			System.out.println("Statement at catch");  // ok
//		}
//		System.out.println("Statement after catch"); // ok

// 		================================= try - finally
//		System.out.println("Statement before of try"); // ok
//		try {
//		System.out.println("Statement in try before exception"); //ok
//		throwError();
//		System.out.println("Statement in try after exception"); // not
//		} finally {
//			System.out.println("Statement in finally");  // ok
//		}
//		System.out.println("Statement after finally catch"); // not

// 		================================= try - catch - finally

//		System.out.println("Statement before of try"); // ok
//		try {
//			System.out.println("Statement in try before exception"); // ok
//			throwError();
//			System.out.println("Statement in try after exception"); // not
//		} catch (Exception e) {
//			System.out.println("Statement at catch"); // ok
//		} finally {
//			System.out.println("Statement in finally"); // ok
//		}
//		System.out.println("Statement after finally"); // ok
//	}
	
//		================================= try - catch(having throw) - finally

	System.out.println("Statement before of try"); // ok
	try {
		System.out.println("Statement in try before exception"); // ok
		throwError();
		System.out.println("Statement in try after exception"); // not
	} catch (Exception e) {
		throwError();
		System.out.println("Statement at catch"); // not
	} finally {
		System.out.println("Statement in finally"); // ok
	}
	System.out.println("Statement after finally"); // not
}

	public static void throwError() {
		throw new RuntimeException("Developer error");
	}
}
