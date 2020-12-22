package leetcode;

public class RansomNote383 {

    public void RansomNote383() {
        String ransomNote = "aa";
        String magazine = "a";
        StringBuffer sText = new StringBuffer(magazine);
        for (char c : ransomNote.toCharArray()) {
            if (magazine.length() == 0) {
                System.out.println("false");
            }
            if (magazine.indexOf(c) != -1) {
                sText.deleteCharAt(magazine.indexOf(c));
                magazine = sText.toString();
            } else {
                System.out.println("false");
            }

        }
        System.out.println("true");
    }
}
