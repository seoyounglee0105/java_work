package ch04;

import java.util.ArrayList;

public class MainTest2_buy {

	public static void main(String[] args) {

		BuyDAO buyDAO = new BuyDAO();

		// insert
//		int rowCount = buyDAO.insert(new BuyDTO("야스오", "책", 10, 3));
//		System.out.println(rowCount);
		
		// update
		int rowCount = buyDAO.update(new BuyDTO("홍길동", "책", 3000, 3), "홍길동", "책");
		System.out.println(rowCount);
		
		// delete
//		buyDAO.delete("야스오");
		
		// select
//		ArrayList<BuyDTO> list = buyDAO.select();
//		
//		for (BuyDTO dto : list) {
//			System.out.println("구매자 : " + dto.getUserName());
//			System.out.println("상품 : " + dto.getProductName());
//			System.out.println("개당 가격 : " + dto.getPrice());
//			System.out.println("구매 수량 : " + dto.getAmount());
//			System.out.println("========");
//		}
	}
	
}
