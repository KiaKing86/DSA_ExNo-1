public static boolean isDuplicate(String s) {
    int len = s.length();
    if (len == 0) {
        return true;
    }
    if (len % 2 != 0) {
        return false;
    }
    int mid = len / 2;
    String firstHalf = s.substring(0, mid);
    String secondHalf = s.substring(mid);

    if (!firstHalf.equals(secondHalf)) {
        return false;
    }
    String remaining = firstHalf.substring(1);
    return isDuplicate(remaining);
}

void main() {
    IO.println("RRRR: " + isDuplicate("RRRR"));
    IO.println("ALLALL: " + isDuplicate("ALLALL"));
    IO.println("HTMMTMMHTMMTMM: " + isDuplicate("HTMMTMMHTMMTMM"));
    IO.println("ALILIALILI: " + isDuplicate("ALILIALILI"));
    IO.println("HPOPOHPOPO: " + isDuplicate("HPOPOHPOPO"));
    IO.println("POP: " + isDuplicate("POP"));
}