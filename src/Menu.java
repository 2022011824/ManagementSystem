import java.util.Scanner;

public class Menu {
	//어디서나 접근 가능한 ’menu’ 클래스 설정
	public static void main(String[] args) {
		//어디서나 접근 가능한 main 함수
		int num = 0; //사용자로부터 받을 정수형 변수 num 초기화 
		Scanner input =  new Scanner(System.in);
		//input 타입의 클래스 설정, 메모리 공간을 할당함, 콘솔로 사용자의 입력 값을 받는다.
		
		while(num != 8) { //num==8이면 반복문 종료
			System.out.println("*Restaurant Menu Management Menu");
			// Restaurant Menu Management Menu 출력
			System.out.println("1. Add restaurant menu");
			System.out.println("2. Delete restaurant menu");
			System.out.println("3. View restaurant full menu");
			System.out.println("4. View the pasta menu");
			System.out.println("5. View the pizza menu");
			System.out.println("6. View the side menu");
			System.out.println("7. Show a management menu");
			System.out.println("8. Exit");
			System.out.print("Select one number 1-8:");
			num = input.nextInt();
			//콘솔로 사용자로부터 받은 숫자를 num에 대입
			
			if(num == 1) //num==1일 경우
				AddMenu(); //함수 AddMenu 호출
			if(num == 2) //num==2일 경우
				DeleteMenu(); //함수 DeletMenu 호출
			if(num == 3) //num==3일 경우
				ViewFullMenu(); //함수 ViewFullMenu 호출
			if(num == 4) //num==4일 경우
				ViewPastaMenu(); //함수 ViewPastaMenu 호출
			if(num == 5) //num==5일 경우
				ViewPizzaMenu(); //함수 ViewPizzaMenu 호출
			if(num == 6) //num==6일 경우
				ViewSideMenu(); //함수 ViewSideMenu 호출
			if(num == 7) //num==7일 경우
				continue; //다시 while 반복문의 처음으로 돌아간다.
		}
	}		
	
	public static void AddMenu() { //함수 AddMenu 정의
		Scanner input =  new Scanner(System.in);
		System.out.println("Restaurant menu type(pasta/pizza/side): ");
		String menuType = input.nextLine();
		//Restaurant menu type(pasta/pizza/side)을 문자열 변수 menuType에 대입
		System.out.println("Restaurant menu name: ");
		String menuName = input.nextLine();
		//Restaurant menu name을 문자열 변수 menuName에 대입
		System.out.println("Restaurant menu price: ");
		int menuPrice = input.nextInt();
		//Restaurant menu price를 정수형 변수 menuPrice에 대입
	}
	
	public static void DeleteMenu() { //함수 DeletMenu 정의
		Scanner input =  new Scanner(System.in);
		System.out.println("Restaurant menu type(pasta/pizza/side): ");
		String menuType = input.nextLine();
		//Restaurant menu type(pasta/pizza/side)을 문자열 변수 menuType에 대입
		System.out.println("Restaurant menu name: ");
		String menuName = input.nextLine();
		//Restaurant menu name을 문자열 변수 menuName에 대입
	}
	
	public static void ViewFullMenu() { //함수 ViewFullMenu 정의
		System.out.println("-Pasta Menu-");
		//Pasta Menu 출력
		System.out.println("-Pizza Menu-");
		//Pizza Menu 출력
		System.out.println("-side Menu-");
		//Side Menu 출력
	}
		
	public static void ViewPastaMenu() { //함수 ViewPastaMenu 정의
		System.out.println("-Pasta Menu-");
		//Pasta Menu 출력
	}
	
	public static void ViewPizzaMenu() { //함수 ViewPizzaMenu 정의
		System.out.println("-Pizza Menu-");
		//Pizza Menu 출력
	}
	
	public static void ViewSideMenu() { //함수 ViewSideMenu 정의
		System.out.println("-side Menu-");
		//Side Menu 출력
	}
	
}
