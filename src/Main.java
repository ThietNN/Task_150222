import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 5 cuốn Programming
        ProgrammingBook p1 = new ProgrammingBook("16", "Nhap mon Java", "ThietNN", 16000, "Java", "Spring");
        ProgrammingBook p2 = new ProgrammingBook("07", "Java trung cap", "TNN", 7000, "Java", "Struts");
        ProgrammingBook p3 = new ProgrammingBook("25", "Nhap mon PHP", "TrangLTH", 25000, "PHP", "Larevel");
        ProgrammingBook p4 = new ProgrammingBook("12", "PHP trung cap", "TLTH", 12000, "PHP", "Phalcon");
        ProgrammingBook p5 = new ProgrammingBook("98", "IT noi chung", "Both", 98000, "C", "Anything");

        // 5 cuốn Fiction
        FictionBook f1 = new FictionBook("1", "Norwegian Wood", "Haruki Murakami", 200000, "Romance");
        FictionBook f2 = new FictionBook("2", "1Q84", "Haruki Murakami", 600000, "Romance");
        FictionBook f3 = new FictionBook("3", "The Maid", "Nita Prose", 199800, "Mystery");
        FictionBook f4 = new FictionBook("4", "Sherlock Holmes", "Arthur Conan Doyle", 1000000, "Thriller");
        FictionBook f5 = new FictionBook("5", "Arsene Lupin", "Maurice LeBlanc", 1000000, "Thriller");

        Book[] b = {p1, p2, p3, p4, p5, f1, f2, f3, f4, f5};

        // Tính tổng giá tiền để mua sách
        int sum = 0;
        for (Book value : b) {
            sum += value.getPrice();
        }
        System.out.println("Tổng giá tiền của " + b.length + " cuốn sách là: " + sum);

        // Đếm số cuốn sách sử dụng ngôn ngữ Java
        int count = 0;
        for (Book value : b) {
            if (value instanceof ProgrammingBook) {
                if (((ProgrammingBook) value).getLanguage().equals("Java"))
                    count++;
            }
        }
        System.out.println("Số cuốn sách thuộc loại Programming sử dụng ngôn ngữ Java là: " + count);

        // Tìm sách
        Scanner sc = new Scanner(System.in);
        String search;
        System.out.println("Nhập tên cuốn sách mà bạn kiểm tra giá tiền: ");
        System.out.println("Hoặc gõ 'Exit' để dừng chương trình.");
        do {
            search = sc.nextLine();
            boolean check = false;
            for (Book book : b) {
                if (search.equals(book.getName())) {
                    check = true;
                    break;
                }
            }
            if (check) {
                for (Book book : b) {
                    if (search.equals(book.getName())) {
                        System.out.println("Giá tiền của cuốn " + book.getName() + " là: " + book.getPrice());
                        break;
                    }
                }
            }
            else
                System.out.println("Không tìm thấy cuốn sách bạn vừa nhập.");
        }while (!search.equals("Exit")) ;
    }
}
