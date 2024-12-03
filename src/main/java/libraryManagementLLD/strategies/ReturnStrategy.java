package libraryManagementLLD.strategies;

import libraryManagementLLD.entities.BookItem;
import libraryManagementLLD.entities.Member;
import libraryManagementLLD.interfaces.BookTransactionStrategy;

public class ReturnStrategy implements BookTransactionStrategy{

	@Override
	public void execute(Member member, BookItem book) {
		//1. update book status
		//2. update member status
		//3. initiate late fee.
		//4. notify waiting member
	}

}
