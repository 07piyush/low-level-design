package libraryManagementLLD.strategies;

import libraryManagementLLD.entities.BookItem;
import libraryManagementLLD.entities.Member;
import libraryManagementLLD.interfaces.BookTransactionStrategy;

public class CheckoutStrategy implements BookTransactionStrategy{

	@Override
	public void execute(Member member, BookItem book) {
		//1. update status of book
		//2. update info of member
	}

}
