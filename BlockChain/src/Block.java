import java.security.*;
import java.util.Arrays;
import java.util.Date;

public class Block {
	private String previousHash;
	private String transaction;
	private String hashValue;
	private long timestamp;
	
	public Block(String previousHash,  String transaction) {
		this.previousHash = previousHash;
		this.transaction = transaction;
		this.timestamp = new Date().getTime();
		this.hashValue = calculateHash();
	
	}
	
	public String getPreviousHash() {
		return previousHash;
	}
	
	public String getTransactions() {
		return transaction;
	}
	
	public String getHashValue() {
		return hashValue;
	}
	
	public String calculateHash() {
		String calculatedhash = stringUtil.applySha256( 
				previousHash +
				Long.toString(timestamp) +
				transaction 
				);
		return calculatedhash;
	}
}
