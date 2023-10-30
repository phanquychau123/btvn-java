package btvnbai3;

        import java.util.Scanner;

        public class bai9 {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                // Khai báo mảng và kích thước của mảng
                int[] array = {1, 3, 7, 9, 5};
                int size = array.length;

                // In mảng ban đầu
                System.out.println("Mảng ban đầu:");
                for (int i = 0; i < size; i++) {
                    System.out.print(array[i] + " ");
                }

                // Nhập giá trị cần xoá
                System.out.println("\nNhập giá trị cần xoá: ");
                int valueToDelete = scanner.nextInt();

                int indexToDelete = -1; // Khởi tạo vị trí cần xoá
                for (int i = 0; i < size; i++) {
                    if (array[i] == valueToDelete) {
                        indexToDelete = i;
                        break; // Tìm thấy giá trị cần xoá, thoát khỏi vòng lặp
                    }
                }

                if (indexToDelete != -1) {
                    // Duyệt mảng từ vị trí cần xoá đến cuối mảng
                    for (int i = indexToDelete; i < size - 1; i++) {
                        array[i] = array[i + 1];
                    }
                    size--; // Giảm kích thước của mảng

                    // In mảng sau khi xoá
                    System.out.println("Mảng sau khi xoá:");
                    for (int i = 0; i < size; i++) {
                        System.out.print(array[i] + " ");
                    }
                } else {
                    System.out.println("Không tìm thấy giá trị cần xoá trong mảng.");
                }
            }
        }

