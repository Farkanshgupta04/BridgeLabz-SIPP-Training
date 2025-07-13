public class StringConcatPerformance {
    public static void main(String[] args) {
        int N = 100000;
        String base = "hello";

        // String
        long startStr = System.nanoTime();
        String resultStr = "";
        for (int i = 0; i < N; i++) resultStr += base;
        long endStr = System.nanoTime();

        // StringBuilder
        long startSB = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) sb.append(base);
        long endSB = System.nanoTime();

        // StringBuffer
        long startSBuf = System.nanoTime();
        StringBuffer sBuf = new StringBuffer();
        for (int i = 0; i < N; i++) sBuf.append(base);
        long endSBuf = System.nanoTime();

        System.out.println("String Time: " + (endStr - startStr) / 1_000_000 + " ms");
        System.out.println("StringBuilder Time: " + (endSB - startSB) / 1_000_000 + " ms");
        System.out.println("StringBuffer Time: " + (endSBuf - startSBuf) / 1_000_000 + " ms");
    }
}