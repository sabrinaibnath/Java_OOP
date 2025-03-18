import java.util.*;

public class Jaccard_Similarity {
    double JaccardSimilarity(String srt1,String str2) {
    	String[] arr=srt1.split(" ");
    	String[] arr2=str2.split(" ");
    	
    	LinkedHashSet<String>uni=new LinkedHashSet<>();
    	
    	for(String word:arr) {
    		uni.add(word);
    	}
    	for(String word:arr2) {
    		uni.add(word);
    	}
    	int intersec=0;
    	for(String word1:arr) {
    		for(String word2:arr2) {
    			if(word1.equals(word2)) {
    				intersec++;
    			}
    		}
    	}
    	int up=uni.size();
    	double up1=(double)up;
    	double intersec1=(double)(intersec);
    	double re=intersec1/up1;
    	return re ;
    }
	public static void main(String[] args) {
	    String s1,s2;
	    Scanner in=new Scanner(System.in);
	    
	    System.out.println("Please enter your string: ");
	    s1=in.nextLine();
	    
	    
	    System.out.println("Please enter your string: ");
	    s2=in.nextLine();
	    
	    Jaccard_Similarity obj=new Jaccard_Similarity();
	    System.out.println(obj.JaccardSimilarity(s1, s2));
	    
	    in.close();
	}

}
