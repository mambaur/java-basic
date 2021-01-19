package main;

public class BinaryGap {
    public static void main(String[] args) {
        int solution = solution(20);
        System.out.println(solution);
    }

    static int solution(int N){
        //get binary representation
        String binaryRep = Integer.toBinaryString(N);
        //cut last zeros since they aren't between "1"
        if (!binaryRep.endsWith("1")) {
            final int i = binaryRep.lastIndexOf("1");
            binaryRep = binaryRep.substring(0, i);
        }

        //count the longest zero string
        String[] binaryBlocks = binaryRep.split("1");
        int result = 0;
        for (String binaryBlock : binaryBlocks) {
            int binaryBlockLength = binaryBlock.length();
            if (binaryBlockLength > result) {
                result = binaryBlockLength;
            }
        }
        return result;
    }
}
