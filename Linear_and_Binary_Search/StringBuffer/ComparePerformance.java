public class ComparePerformance {
    public static void main(String[] args) {
        int count = 1000000;
        String text = "hello";

        // StringBuilder
        long startBuilder = System.nanoTime();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < count; i++) builder.append(text);
        long endBuilder = System.nanoTime();

        // StringBuffer
        long startBuffer = System.nanoTime();
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < count; i++) buffer.append(text);
        long endBuffer = System.nanoTime();

        System.out.println("Builder time: " + (endBuilder - startBuilder) + " ns");
        System.out.println("Buffer time: " + (endBuffer - startBuffer) + " ns");
    }
}