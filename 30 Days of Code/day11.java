public class day11 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();
        String binary = Integer.toBinaryString(n);

        // Find the maximum number of consecutive 1's
        int maxOnes = 0;
        int count = 0;

        for (char c : binary.toCharArray()) {
            if (c == '1') {
                count++;
                maxOnes = Math.max(maxOnes, count);
            } else {
                count = 0;
            }
        }

        // Print the result
        System.out.println(maxOnes);
    }
}
