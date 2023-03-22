import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		int num = 0;
		Scanner input =  new Scanner(System.in);
		
		while(num != 4) {
			System.out.println("1. 메뉴 전체 보기");
			System.out.println("2. 메뉴 추가");
			System.out.println("3. 인기메뉴");
			System.out.println("4. 종료");
			System.out.print("1~4번 중에 고르세요:");
			num = input.nextInt();
			if (num == 1) {
				System.out.println("스테이크 플레이트 - 22000Won");
				System.out.println("투움바 파스타 - 15000Won");
				System.out.println("양송이 크림 파스타 - 13000Won");
				System.out.println("오징어 먹물 리조또 - 14000Won");
				System.out.println("불고기 필라프 - 16000Won");
				System.out.println("감바스 - 6000Won");
				System.out.println("샐러드 - 6000Won");
			}
			if (num == 2) {
				System.out.print("메뉴 이름:");
				String MenuName = input.next();
				System.out.print("메뉴 가격(Won):");
				int MenuPrice = input.nextInt();			
			}
			if(num == 3) {
				System.out.println("스테이크 플레이트 - 22000Won");
				System.out.println("투움바 파스타 - 15000Won");
				System.out.println("불고기 필라프 - 16000Won");
			}
		}
	}
}
