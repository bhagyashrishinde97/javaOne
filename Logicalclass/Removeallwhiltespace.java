package Logicalclass;

public class Removeallwhiltespace {
    public static void main(String[] args) {
        String withSpace = "Remove white space from line";
        StringBuilder removeSpace = new StringBuilder();

        for (int i = 0; i < withSpace.length(); i++) {
            if (!Character.isWhitespace(withSpace.charAt(i))) {
                removeSpace  = removeSpace.append(withSpace.charAt(i));
              }
              }
            System.out.println(removeSpace);
    }
}