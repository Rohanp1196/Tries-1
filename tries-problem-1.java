class TrieNode{
	
	public char value;
	public TrieNode[] children = new TrieNode[26];
	public boolean word ;
	public TrieNode(){}
	public TrieNode(char lett){
		
		TrieNode node = new TrieNode();
		node.value=lett;
	}
	
	
}


class Trie {

    /** Initialize your data structure here. */
	TrieNode root;
    public Trie() {
		
		root = new TrieNode(' ');
        
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
		TrieNode node = root;
		
		for (int i=0;i<word.length();i++){
			
			char ch = word.charAt(i);
			
			if(node.children[ch- 'a']==null)
				node.children[ch- 'a'] = new TrieNode(c);
			
			node = node.children[ch- 'a'];
		}
		node.word = true;
        
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
		
		TrieNode node = root;
		
		for (int i=0;i<word.length();i++){
			
			char ch = word.charAt(i);
			
			if(node.children[ch- 'a']==null)
				return false;
			
			node = node.children[ch- 'a'];
		}
		return node.word;
        
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
		TrieNode node = root;
		
		for (int i=0;i<prefix.length();i++){
			
			char ch = word.charAt(i);
			
			if(node.children[ch- 'a']==null)
				return false;
			
			node = node.children[ch- 'a'];
		}
		return true;
        
        
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */