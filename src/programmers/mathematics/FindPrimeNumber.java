package programmers.mathematics;
/*문제 설명
1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수, solution을 만들어 보세요.
소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다.
(1은 소수가 아닙니다.)

제한 조건
n은 2이상 1000000이하의 자연수입니다.

입출력 예
n	result
10	4
5	3

입출력 예 설명
입출력 예 #1
1부터 10 사이의 소수는 [2,3,5,7] 4개가 존재하므로 4를 반환

입출력 예 #2
1부터 5 사이의 소수는 [2,3,5] 3개가 존재하므로 3를 반환

약수 - 어떤 수 n을 나누었을 때 “나머지 없이 딱 떨어지게” 만드는 수
소수 - 소수는 약수가 “딱 2개”인 수다. 소수가 아닌 수는 '합성수'
루트 - √n은 “어떤 수를 제곱(자기 자신을 곱함)했을 때 n이 되는 값

# 왜 “√n까지만” 약수를 찾으면 소수라고 판단할 수 있는가?
정수 n이 합성수라면 반드시 n = a × b 형태의 약수 쌍이 존재한다.
이때 두 약수 a, b 중 하나는 반드시 √n 이하이다.

만약 a > √n 이고 b > √n 이라면
a × b > √n × √n = n 이 되어 모순이 된다.

따라서 a × b = n 을 만족하려면
둘 중 하나는 반드시 √n 이하일 수밖에 없다.

따라서 √n까지만 검사하여 작은 약수가 존재하는지 판단하면, 그 수는 합성수라는 것을 알 수 있다.

*/
public class FindPrimeNumber {
    public int solution(int n) {
        int result = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                result++;
            }
        }
        return result;
    }

    public boolean isPrime(int n) {
        // 2,3은 소수이다.
        if (n <= 3) {
            return true;
        }
        // 2와 3의 배수는 소수가 아니다.
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        // 수학적으로 정의된 양의 제곱근 √a 를 가장 가까운 double 값으로 반환
        // √n 이하의 어떤 수로 나누어 떨어지면 합성수이다
        double sqrt = Math.sqrt(n);
        for (int i = 3; i <= sqrt; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
