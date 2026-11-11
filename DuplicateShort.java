public static boolean isDuplicateShort(String s) {
    if (s.isEmpty()) return true;
    if (s.length() % 2 != 0) return false;

    int mid = s.length() / 2;
    String s1 = s.substring(0, mid);
    String s2 = s.substring(mid);

    return s1.equals(s2) && isDuplicateShort(s1.substring(1));
}

void main() {
    IO.println("ALLALL: " + isDuplicateShort("ALLALL"));
    IO.println("HTMMTMMHTMMTMM: " + isDuplicateShort("HTMMTMMHTMMTMM"));
    IO.println("RRRR: " + isDuplicateShort("RRRR"));
    IO.println("ALILIALILI: " + isDuplicateShort("ALILIALILI"));
    IO.println("HPOPOHPOPO: " + isDuplicateShort("HPOPOHPOPO"));
    IO.println("POP: " + isDuplicateShort("POP"));
}
