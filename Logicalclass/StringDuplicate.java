package Logicalclass;

public class StringDuplicate {
    public static void main(String[] args) {
        String str = " Iditjava";
        int count = 0;
        char[] arr = str.toCharArray();
        System.out.println("find duplicate string");
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[j]);
                    count++;
                    break;
                }
            }
        }
    }
    }


