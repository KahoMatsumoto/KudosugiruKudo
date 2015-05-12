package int_to_eng;
import java.util.Scanner;


public class IntToEng {
	public static int m;
	
	 // ���C�����\�b�h
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        System.out.println(translateEng(input));

    }

    // ���l���p�󂷂�ϊ����郁�\�b�h
    static String translateEng(int n) {
    	String eng = "";
    	m=n;
    	if (m > 9) { // 10�ȏ�
    		int t = m / 1000;
    		if (t > 0) { // �l��
    			eng += thousands(t);
    		}    	 	

    		int hundsInt = m/100;
    		if (hundsInt > 0) { // �O��
    			eng += hunds(hundsInt);
    		}    	 	
    		if (10 <= m && m <= 19) { // �e�B�[��
        		eng += teens(m);
        		return eng;
    		}
    		
    		int tensInt = m/10; // ��
    		if (tensInt > 1) eng += tens(tensInt);
    		if (m % 10 != 0) {
    			eng = eng + " " + ones(m-tensInt*10);
    		}
    	
    	
    	} else { // �ꌅ
    		eng += ones(m);
    	}
        return eng;
    }
    static String ones(int n){
    	if(n==1) return "one";
    	if(n==2) return "two";
    	if(n==3) return "three";
    	if(n==4) return "four";
    	if(n==5) return "five";
    	if(n==6) return "six";
    	if(n==7) return "seven";
    	if(n==8) return "eight";
    	if(n==9) return "nine";
    	return "";
    }
    static String tens(int n) {
    	if(n==2) return "twenty";
    	if(n==3) return "thirty";
    	if(n==4) return "forty";
    	if(n==5) return "fifty";
    	if(n==6) return "sixty";
    	if(n==7) return "seventy";
    	if(n==8) return "eighty";
    	if(n==9) return "ninety";
    	return "";
    }
    static String teens(int n) {
    	if(n==11) return "eleven";
    	if(n==12) return "twelve";
    	if(n==13) return "thirteen";
    	if(n==14) return "fourteen";
    	if(n==15) return "fifteen";
    	if(n==16) return "sixteen";
    	if(n==17) return "seventeen";
    	if(n==18) return "eighteen";
    	if(n==19) return "nineteen";
    	return "ten";
    }
    static String hunds(int h){
    	String eng = ones(h) + " hundred";
		if (m % 100 != 0) eng += " ";
		m = m -  h * 100;
		return eng;
    }
    static String thousands(int h) {
    	int t = h / 10;
    	int x = h % 10;
    	String eng = "";
    	if (t > 0) eng = eng + tens(t) + " ";
    	eng = eng + ones(x) + " thousand";
		if (m % 1000 != 0) eng += " ";
		m = m - h * 1000;
		return eng;
    }
    
}
