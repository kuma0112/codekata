public class codekata70 {
    public static void main(String[] args) {
        String[] wallpaper = {".....", "....#"};
        solution(wallpaper);
    }

    public static int[] solution(String[] wallpaper) {
        int[] answer = {};
        int width = wallpaper[0].length();
        int height = wallpaper.length;
        // 1. wallpaper 배열을 char [][]에 담는다.
        char[][] wpArray = new char[height][width];

        int lux = Integer.MAX_VALUE;
        int luy = Integer.MAX_VALUE;
        int rdx = Integer.MIN_VALUE;
        int rdy = Integer.MIN_VALUE;

        // char 배열 안에 집어넣기
        for (int i = 0; i < height; i++){
            wpArray[i] = wallpaper[i].toCharArray();
        }

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++){
                if (wpArray[i][j] == '#'){
                    luy = Math.min(luy, i);
                    lux = Math.min(lux, j);
                    rdy = Math.max(rdy, i);
                    rdx = Math.max(rdx, j);
                }
            }
        }
        answer = new int[]{luy, lux, rdy+1, rdx+1};
        return answer;
    }
}
