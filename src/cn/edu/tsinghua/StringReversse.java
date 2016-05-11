package cn.edu.tsinghua;

public class StringReversse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="leetcode";
		//Rever String
		/*char[] string=s.toCharArray();
		int length=s.length();
        int j=0;
        if(length%2==0){
            j=length/2-1;
        }else{
            j=length/2;
        }
        char[] newString=new char[length];
        for(int i=0;i<=j;i++){
        	
                newString[length-i-1]=string[i];
                newString[i]=string[length-i-1];
        }
        System.out.println(newString);
        System.out.println(new String(newString));*/
		
		
		
		//revers vowels string
		int length=s.length();
        char[] string=s.toCharArray();
        char[] newString=s.toCharArray();
        int[] position=new int[length];
        int k=0;
        for(int i=0;i<length;i++){
        	if(string[i]=='a'||string[i]=='i'||string[i]=='e'||string[i]=='o'||string[i]=='u'||string[i]=='A'||string[i]=='I'||string[i]=='E'||string[i]=='O'||string[i]=='U'){
                position[k++]=i;
            }
        }
        for(int i=0;i<k;i++){
        	System.out.println(position[i]);
            newString[position[i]]=string[position[k-i-1]];
            newString[position[k-i-1]]=string[position[i]];
        }
        String result=new String(newString);
       
        System.out.println(result);
	}

}
