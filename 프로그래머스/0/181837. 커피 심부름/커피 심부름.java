class Solution {
    public int solution(String[] order) {
        int AMERICANO_PRICE = 4500;
        int CAFELATTE_PRICE = 5000;
        int length = order.length;
        int latteCount = 0;
        for (String s : order) {
            if (s.contains("cafelatte")) {
                latteCount++;
            }
        }
        return AMERICANO_PRICE * (length - latteCount) + CAFELATTE_PRICE * latteCount;
    }
}