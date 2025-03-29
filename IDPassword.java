import java.util.HashMap;


public class IDPassword{
	HashMap<String,String> logininfo = new HashMap<String,String>();
    IDPassword(){
		
		logininfo.put("Bro","pizza");
		logininfo.put("Mayank","Amna");
		logininfo.put("Aditya","Daru");
        logininfo.put("Priyank","Gujrat");
	 }
	 protected HashMap getLoginInfo(){
		return logininfo;
	}
  // IDPassword(){
	// static class HashMap<K,V>{
		// private class Node{
			// K key;
			// V value;
			
			// public Node(K key, V value){
				// this.key = key;
				// this.value = value;
				
			// }
		// }
		
		// private int n;
		// private int N;
		// private LinkedList<Node> buckets[];
		
		// @SuppressWarnings("unchecked")
		// public HashMap(){
			// this.N = 4;
			// this.buckets = new LinkedList[4];
			// for(int i = 0; i<4;i++){
				// this.buckets[i] = new LinkedList<>();
			// }
		// }
		
		// private int hashFunction(K key){
			// int bi = key.hashCode();  //can give positive or negative value
			// return Math.abs(bi) % N;
		// }
		
		// private int searchInLL(K key,int bi){
			// LinkedList<Node> ll = buckets[bi];
			// int di = 0;
			// for(int i = 0; i<ll.size();i++){
				// if(ll.get(i).key == key){
					// return i;
					
				// }
			// }
			// return -1;
		// }
		
		// public void put(K key, V value){
			// int bi = hashFunction(Key);
			// int di = searchInLL(key,bi);
			
			// if(di==-1){
				// buckets[bi].add(new Node(key,value));
				// n++;
			// }
			// else{
				// Node node = buckets[bi].get(di);
				// node.value = value;
			// }
		// }
		
	// }
  }
