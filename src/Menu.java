import java.util.Scanner;

public class Menu {
	//어디서나 접근 가능한 ’menu’ 클래스 설정
	public static void main(String[] args) {
		//어디서나 접근 가능한 main 함수 
		Scanner input =  new Scanner(System.in);
		RestaurantMenuManager restaurantMenuManager = new RestaurantMenuManager(input);
		
		int num = -1; //사용자로부터 받을 정수형 변수 num 초기화
		
		while(num != 4) { //num==8이면 반복문 종료
			System.out.println("*Restaurant Menu Management Menu");
			// Restaurant Menu Management Menu 출력
			System.out.println("1. Add restaurant menu");
			System.out.println("2. Delete restaurant menu");
			System.out.println("3. View restaurant menu");
			System.out.println("4. Exit");
			System.out.print("Select one number 1-4:");
			num = input.nextInt();
			
			//콘솔로 사용자로부터 받은 숫자를 num에 대입
			
			if(num == 1) //num==1일 경우
				restaurantMenuManager.addMenu(); //함수 AddMenu 호출
			if(num == 2) //num==2일 경우
				restaurantMenuManager.deleteMenu(); //함수 DeletMenu 호출
			if(num == 3) //num==3일 경우
				restaurantMenuManager.viewMenu(); //함수 ViewFullMenu 호출
			if(num == 4) //num==4일 경우
				continue; //다시 while 반복문의 처음으로 돌아간다.
		}
	}		
	
}
