package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("입력할 주문의 개수를 입력하세요 : ");
        int n = scanner.nextInt();
        scanner.nextLine();



        ProductOrder[] productOrders = new ProductOrder[n];

        for (int i = 0; i < productOrders.length; i++) {
            System.out.println((i + 1) + "번째 주문 정보를 입력하세요.");
            System.out.println("상품명 : ");
            String productName = scanner.nextLine();
            System.out.println("가격 : ");
            int price = scanner.nextInt();
            System.out.println("수량 : ");
            int quantity = scanner.nextInt();
            scanner.nextLine();

            productOrders[i] = createOrder(productName, price, quantity);


        }



        printOrders(productOrders);
        int totalAmount = getTotalAmount(productOrders);
        System.out.println("총 결제 금액 : " + totalAmount);

    }

    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order;

    }

    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품 명 : " + order.productName + " 가격 : " + order.price + " 수량 : " + order.quantity);

        }
    }

    static int getTotalAmount(ProductOrder[] orders) {
        int totalAmount = 0;
        for (ProductOrder order : orders) {
            totalAmount += order.price * order.quantity;

        }
        return totalAmount;
    }

}
