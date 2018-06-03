import java.util.ArrayList;

public class BlockChain {
	
	static ArrayList<Block> chain = new ArrayList<>();
	
	public static void main(String[] args) {
		
		int i;
		for(i = 0 ; i<200; i++) {
			if(chain.size() == 0) {
				String tranactionList = "Sent David $100.00";
				Block genisis = new Block("0", tranactionList);
				chain.add(genisis);
				
				
			}else {
				String transList = "Recieved $50.00 from Steve";
				Block newTranaction = new Block(chain.get(i-1).getHashValue(),transList);
				chain.add(newTranaction);
			}
			System.out.println("Block " + (i+1) +": "+ chain.get(chain.size()-1).getHashValue());
		}

	}

}
