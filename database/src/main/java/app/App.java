package app;
import java.util.Scanner;



import com.revature.repository.AccountRepository;
import com.revature.repository.JdbcAccountRepository;
//import com.example.repository.TxnRepository;
//import com.example.repository.TxnRepositoryImpl;
import com.revature.service.TxrService;
import com.revature.service.TxrServiceImp1;
import com.revature.entity.accountdetails;
import com.revature.entity.TDetails;

public class App {

	public static void main(String[] args) {
		
		AccountRepository accountRepository = new JdbcAccountRepository();
		TxrService txrService = new TxrServiceImp1(accountRepository);
		Scanner input = new Scanner(System.in);
		while(true)
		{
		System.out.println("\nSelect 1 for account creation");
		System.out.println("Select 2 for money transfer");
		System.out.println("Select 3 for account details");
		System.out.println("Select 4 for edit account");
		System.out.println("Select 5 to delete account");
		System.out.println("Select 6 to count Accounts");
		System.out.println("Select 7 for transactions");
		System.out.println("Select 8 to count transactions");
		System.out.println("Select 0 to exit");
		int option = input.nextInt();
		if(option!=0) {
		switch(option) {
		case 1:{
		AccountRepository accRepository = new JdbcAccountRepository(); // a.k.a D.A.O
		System.out.println("Enter Name");
		String name0 = input.next();
		System.out.println("Enter phone");
		String phone = input.next();
		System.out.println("Enter address");
		String address0 = input.next();
		System.out.println("Enter opening balance");
		double balance0 = input.nextDouble();
		System.out.println("Enter aadhar_no");
		String aadhar_no0 = input.next();
		System.out.println("bank_name");
		String bank_name0 = input.next();
		accountdetails accdetails = new accountdetails(name0,phone,address0,balance0,aadhar_no0,bank_name0);
		accRepository.save(accdetails);
		break;
		}
		case 2:{
		AccountRepository accRepository = new JdbcAccountRepository();
		System.out.println("Enter from account");
		String fid = input.next();
		System.out.println("Enter to account");
		String tid = input.next();
		System.out.println("Enter the amount");
		double am = input.nextDouble();
		boolean f = txrService.transfer(am, fid, tid);
		if(f) {
		TDetails tdetails = new TDetails(fid,tid,am);
		accRepository.tsave(tdetails);
		}
		break;
		}
		case 3:
		{
			System.out.println("Enter Account id (0 For all account )");
			int n1=input.nextInt();
			accountRepository.getaccountdetails(n1).forEach(accdetails->System.out.println(accdetails));
			break;
		}
		case 4:
		{
			System.out.println("Enter Account id");
			int n1=input.nextInt();
			accountRepository.edit(n1);
			break;
		}
		case 5:{
			System.out.println("Enter Account id)");
			
			
			
			
			
			
			
			
			int n1=input.nextInt();
			accountRepository.delete(n1);
			break;
		}
		case 6:{
			System.out.println(accountRepository.countAcc());
			break;
		}
		case 7:{
			accountRepository.getTransfer().forEach(tdetails->System.out.println(tdetails));
			break;
		}
		case 8:{
			System.out.println(accountRepository.count());
			break;	
		}
		}
		}
		else {
			break;
		}
}
}
}