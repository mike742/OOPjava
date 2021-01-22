
public class VoucherDriver {

	public static void main(String[] args) {

		// Voucher v = new Voucher();
		
		System.out.println(Voucher.nextVN);
		System.out.println(Voucher.nextChN);
		System.out.println(Voucher.vouchers.length);
		
		Voucher.initialize(1001, 2001, 7);
		
		System.out.println(Voucher.nextVN);
		System.out.println(Voucher.nextChN);
		System.out.println(Voucher.vouchers.length);
		
		for(Voucher v: Voucher.vouchers) {
			System.out.println(v);
		}
	}

}
