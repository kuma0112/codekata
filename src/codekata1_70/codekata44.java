package codekata1_70;

public class codekata44 {
    public int solution(int[][] sizes) {
        int maxWidth = 0;
        int maxHeight = 0;

        // 각 명함의 가로와 세로 중 더 긴 쪽을 maxWidth, 더 짧은 쪽을 maxHeight로 설정
        for (int[] size : sizes) {
            int width = size[0];
            int height = size[1];

            maxWidth = Math.max(maxWidth, Math.max(width, height));
            maxHeight = Math.max(maxHeight, Math.min(width, height));
        }

        return maxWidth * maxHeight;
    }
}
