
public class VoucherDriver {

	public static void main(String[] args) {

		Voucher.initialize(1001, 2001, 7); // [null, null, null, null ..]
		
		// get user info for new voucher
			// logic
			Voucher.addVoucher("10/10/21", 20.21, "Robertson", "Tim Hortons");
			Voucher.addVoucher("11/10/21", 40.21, "Robertson", "Tim Hortons");
			
		// get user choice
			Voucher.printData();
			
		// get user info about voucher # and purchaiseDate
			int vNumber = 1002;
			boolean b = Voucher.find(vNumber) != false;
			
			if(b) {
				// get purchaiseDate
				Voucher.issueCheck("10/10/2010");
			}
	}

}
