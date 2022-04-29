public class Solution {

    public static int solution(int N) {
        String binaryString = Integer.toBinaryString(N);
        int strSize = binaryString.length(), maxBinaryCount = 0;
        int i = 0;
        while (i < strSize - 1) {
            if (binaryString.charAt(i) == '1') {
                int binaryCount = 0;
                for (int j = i + 1; j < strSize; j++) {
                    i = j;
                    if (binaryString.charAt(j) == '1') {
                        if (maxBinaryCount < binaryCount) {
                            maxBinaryCount = binaryCount;
                        }
                        break;
                    }
                    binaryCount++;
                }
            } else {
                i++;
            }
        }
        return maxBinaryCount;
    }

    public static void main(String[] args) {
        System.out.println(solution(1041));
    }
}
