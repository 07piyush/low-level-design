package libraryManagementLLD.executor;

import libraryManagementLLD.entities.BookItem;
import libraryManagementLLD.entities.Member;
import libraryManagementLLD.interfaces.BookTransactionStrategy;

public class BookTransactionExecutor {

	private static BookTransactionExecutor executor;
	
	public BookTransactionExecutor getInstance() {
		if(executor==null) {
			synchronized(BookTransactionStrategy.class) {
				if(executor == null) {
					executor = new BookTransactionExecutor();
				}
			}
		}
		return executor;
	}
	
	public void performTransaction(BookTransactionStrategy strategy, Member member, BookItem book) {
        strategy.execute(member, book);
    }
	
}
