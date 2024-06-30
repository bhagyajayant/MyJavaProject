package demo123;

public class Browser {
	
	//WAF
	//launch a browser // browser name(String)-- input param chrome/safari//ff/edge
	//retrun /boolean/true, false
	// 1st method
	
	public boolean launchBrowser(String browserName) {
	System.out.println("launching the browser--------"+browserName );
	

	if (browserName.equals("chrome")) {
		System.out.println("chorme browser is launched");
	return true;				
		//break;
	}
	else if (browserName.equals("firefox")) {
		System.out.println("firefox browser is launched");
		return true;
		
	}
	else if (browserName.equals("edge")) {
			System.out.println("edge browser is launched");
		return true;
			
	}
	else if (browserName.equals("safari")) {
		System.out.println("edge browser is launched");
		return true;
		//break;
	} 
	else {
		System.out.println("please pass the right browser");
	 return false;
			//break;
	}

	}
	
	// 2nd method -->same function with Switch
	
	public boolean launchAppBrowser(String browserName) {
		
		System.out.println("launching the browser"+ browserName);
		boolean flag = true;
		
		switch(browserName){
		case "chrome":
			System.out.println("chrome is launched");
		//	return true;
		break;									//return and break cannot be used together.
		case "safari":
			System.out.println("safari is launched");
		//	return true;
			break;
		case "firefox":
			System.out.println("firefox is launched");
		//	return true;
			break;
		case "edge":
			System.out.println("edge is launched");
		//	return true;
			break;
		default:
		System.out.println("plz pass the right browser");
		//return false;
		flag = false;
		break;
			
		}
		return flag;
	
	}
	
	
	//REquirements
	//function name = getStudentMark
	//input param = studentName
	//return is marks
	
	public int getStudentMarks(String studentName) {
		
		System.out.println("getting student marks" + studentName);
		
		 int marks = -1; // we have to initialize otherwise compiler will get confused to what return when value is passed apart from defined case value.
		 
		switch (studentName.toLowerCase()) {  // ToLOwerCase is for anycase.
		case "bhagya":
			marks = 100;
			break;
		case "Jayu":
			marks = 95;
			break;
		case "Shubhu":
			marks = 80;
			break;
		case "Papu":
			marks = 75;
			break;
		default :
			System.out.println("Enter right student name "+ studentName);
		break;
		}
		return marks;
	
	}

	
		public static void main(String[] args) {
			
		Browser br = new Browser();
		
			int b1 =br.getStudentMarks("Bhagya");
		System.out.println(b1);
		if(b1>=0 && b1<=100) {
			System.out.println("print the marksheet" +b1);
		}
			
			int j1 =br.getStudentMarks("Jayu");
		System.out.println(j1);
		if(j1>=0 && j1<=100) {
			System.out.println("print the marksheet" +j1);
		}
			int s1= br.getStudentMarks("Shubhu");
		System.out.println(s1);
		if(s1>=0 && s1<=100) {
			System.out.println("print the marksheet" +s1);
		}
			int p1= br.getStudentMarks("tom");
					System.out.println(p1);
		if(p1>=0 && p1<=100) {
			System.out.println("print the marksheet" +p1);
					}			
		
		
			
	//	if (br.launchAppBrowser("chrome")) {   // here we can store value in a variable also or directly use if else.
			
	//		System.out.println("Enter the url www.google.com");
	//	}
	//	else
		//{
	//		System.out.println("no need to enter any url");
	//	}
		
			
		
	//	boolean flag = br.launchBrowser("firefox");
		//if(flag)
		//{
			//System.out.println("enter url : https://www.therusticlumber.com");
			
		//}
		//else
		//{
		//System.out.println("no need to enter the brwoser");
		//}
		

//	}
		}
}


