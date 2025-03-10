
public class Quiz3App {
    public static void main(String[] args) {

        //What is the output of the following code?

// 1)
//        for (int i = 1; i <= 4; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//            if (i > 2) {
//                break;
//            }
//            System.out.println();
//        }

//*
//* *
//* * *

//2)
//        for (int i = 1; i <= 3; i++) {
//            for (int j = 1; j <= 3; j++) {
//                if (j % 2 == 0 || i % 2 == 0) {
//                    System.out.print("- ");
//                } else {
//                    System.out.print("* ");
//                }
//            }
//            System.out.println();
//        }

//* - *
//- - -
//* - *

//3)
//        int[] numbers = {13, 4, 2, 22, 34, 17};
//        int a = numbers[0];
//        for (int i = 1; i < numbers.length; i++) {
//            if (numbers[i] < a) {
//                a = numbers[i + 2];
//            }
//        }
//        System.out.println(a);

        //cavab: 17

//4)
//        int[] arr1 = {1, 2, 3};
//        int[] arr2 = {1, 2, 3};
//        int[] arr3 = arr1;
//        arr2[1] = 5;
//        arr3[1] = 4;
//        System.out.println(arr1[1] + " " + arr2[1] + " " + arr3[1]);

        //4 5 4

//5)
//        int[] arr = {9, 2, 5, 3};
//        for (int i = 0; i < arr.length - 1; i++) {
//            int minIndex = i;
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[j] < arr[minIndex]) {
//                    minIndex = j;
//                }
//            }
//            int temp = arr[i];
//            arr[i] = arr[minIndex];
//            arr[minIndex] = temp;
//        }
//        System.out.println(Arrays.toString(arr));

        //[2, 3, 5, 9]

//6)
//        int[][] nums = {{1, 2}, {3, 4, 5}, {6, 7, 8, 9}};
//        System.out.println(nums[3][1] + nums[0][0]);

        //error

//7)
//        int[][] matrix = new int[3][2];
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                matrix[i][j] = (i + j) * 2;
//            }
//        }
//        System.out.println(matrix[2][1] + matrix[1][1]);

        //10

//8)
//        String[] names = {"Alice", "Bob", "Charlie"};
//        names[1] = "Steven";
//        for (String name : names) {
//            System.out.print(name + " ");
//        }

        //Alice Steven Charlie

//9)
//        for (int i = 1; i <= 3; i++) {
//            for (int j = 3; j >= i; j--) {
//                System.out.print(i * j + " ");
//            }
//            System.out.println();
//        }

        //3 2 1
        //6 4
        //9
    }
}


