package codekata1_70;

public class codekata58 {
    public int solution(int[] nums) {
        // 1. 0~3000 개수만큼의 크기를 가진 배열
        boolean[] isPrime = new boolean[3001];
        // 2. 2부터 3000까지 true로 초기화
        for (int i = 2; i <= 3000; i++) {
            isPrime[i] = true;
        }

        // 3. 2부터 3000까지 소수만 골라 arr에 넣는다
        for (int i = 2; i * i <= 3000; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= 3000; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // 3. 세 자리 합하여 소수인 경우 숫자 세기
        int count = 0;
        int size = nums.length;
        for (int i = 0; i < size - 2; i++) {
            for (int j = i + 1; j < size - 1; j++) {
                for (int k = j + 1; k < size; k++) {
                    if (isPrime[nums[i] + nums[j] + nums[k]]) count++;
                }
            }
        }

        return count;
    }
}

