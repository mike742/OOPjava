
public class Voucher {
	private static int nextVN = 1001;
	private static int nextChN = 2001;
	private static Voucher[] vouchers = new Voucher[32];

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
	
	private int getVoucherNumber() {
		return _voucherNumber;
	}
	
	public static void initialize(int fV, int fCh, int max) {
		nextVN = fV;
		nextChN = fCh;
		vouchers = new Voucher[max];
	}
	
	public static void issueCheck(int vN,  String paymentDate ) {
		
		// find voucher 
		
		if(find(vN)) {
			
			for(int i = 0; i < vouchers.length; ++i) {
				if(vouchers[i].getVoucherNumber() == vN) {
					// private String _paymentDate; !!!!
				}
			}
		}
		
		
		
		
		nextChN++;
	}
	
	public static void printData() {
		
		/*
Voucher Register:

voucher #1001   date: 17/08/2003   amount: $123.45
account: tools   vendor: Mack's Hardware
check #0   date: null
		 */
		
		System.out.println("Voucher Register:\n\n");
		
		for(int i = 0; i < vouchers.length; ++i) {
			System.out.println("voucher #" + (vouchers[i]._voucherNumber) + "\tdate: " 
								+ vouchers[i]._purchaseDate + "\tamount:" + vouchers[i]._amount + "\n" 
								+ "account: " + vouchers[i]._debitAccount);
		}
	}
	
	public static boolean find(int vN) {
		
		// code for finding ...... 
		
		return false;
	}
	
	
	public static void addVoucher(String purchaseDate, double amount, 
								  String debitAccount, String vendor) {
		
		Voucher newVaucher = new Voucher(purchaseDate, amount, debitAccount, vendor);
		
		// add to array
	}
}
