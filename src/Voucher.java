
public class Voucher {
	static int nextVN = 1001;
	static int nextChN = 2001;
	static Voucher[] vouchers = new Voucher[32];

	private int _voucherNumber;
	private String _purchaseDate;
	private double _amount;
	private String _debitAccount;
	private String _vendor;
	private int _checkNumber;
	private String _paymentDate;
	
	public Voucher(String purchaseDate, double amount, String debitAccount, String vendor) {
		
		_voucherNumber = nextVN;
		_paymentDate = purchaseDate;
		_amount = amount;
		_debitAccount = debitAccount;
		_vendor = vendor;
		nextVN++;
	}
	
	public static void initialize(int fV, int fCh, int max) {
		nextVN = fV;
		nextChN = fCh;
		vouchers = new Voucher[max];
	}
	
	public void issueCheck( ) {}
	
	public static void printData() {}
	
	public static Voucher find(int vN) {
		return null;
	}
	
	
	public static void addVoucher(String purchaseDate, double amount, String debitAccount, String vendor) {
		
		Voucher newVaucher = new Voucher(purchaseDate, amount, debitAccount, vendor);
	}
}
