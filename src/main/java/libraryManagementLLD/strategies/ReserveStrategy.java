package libraryManagementLLD.strategies;

import libraryManagementLLD.entities.BookItem;
import libraryManagementLLD.entities.Member;
import libraryManagementLLD.interfaces.BookTransactionStrategy;

public class ReserveStrategy implements BookTransactionStrategy{

	@Override
	public void execute(Member member, BookItem book) {
		//1. update book
		//2. update member
		
	}

}
