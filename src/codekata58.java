public class codekata58 {
    public int solution(int[] nums) {
        int answer = -1;

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    // 2. 각 조합의 합 구하기
                    int sum = nums[i] + nums[j] + nums[k];
                    // 3. 합이 소수인지 판별
                    if (sum < 2) {
                    }
                    for (int l = 2; i * i <= sum; i++){
                        if (sum % i == 0){
                    }
                    answer ++;
                }
            }
        }

        return answer;

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}

