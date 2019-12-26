package day26_ArrayPart3;

public class task94_password {

	public static void main(String[] args) {


		String info1 = "This info is used for creation password : xxxCD132Gxxx . Please do not share with anyone";
		String info2 = "This info is used for creation password : xxx00ABC!xxx . Please do not share with anyone";

		String[] ar1=info1.split("xxx");
		String[] ar2=info2.split("xxx");
		String password=ar1[1].concat(ar2[1]);
		System.out.println(password);
	}
	}


