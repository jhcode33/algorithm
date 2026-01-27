package programmers.string;
/*
문제 설명
단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요.
단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.

제한사항
s는 길이가 1 이상, 100이하인 스트링입니다.
입출력 예
s	return
"abcde"	"c"
"qwer"	"we"
*/
public class GetMiddleCharacter {
    public String solution(String s) {
        return s.length() % 2 == 0
                ? s.charAt(s.length() / 2 - 1) + String.valueOf(s.charAt(s.length() / 2))
                : String.valueOf(s.charAt(s.length() / 2));
    }

    public String getMiddle(String word){
        return word.substring((word.length()-1)/2, word.length()/2 + 1);
    }
}
