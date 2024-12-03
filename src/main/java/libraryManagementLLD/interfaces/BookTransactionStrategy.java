package libraryManagementLLD.interfaces;

import libraryManagementLLD.entities.BookItem;
import libraryManagementLLD.entities.Member;

public interface BookTransactionStrategy {

	void execute(Member member, BookItem book);
}
