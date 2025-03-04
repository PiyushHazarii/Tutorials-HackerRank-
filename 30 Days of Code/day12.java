public class day12 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // Read input and store in a 2D array
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            arr[i] = Stream.of(bufferedReader.readLine().trim().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        bufferedReader.close();

        // Variable to store the maximum hourglass sum
        int maxSum = Integer.MIN_VALUE;

        // Iterate through the 2D array to find all hourglass sums
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                int hourglassSum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2]
                                + arr[i + 1][j + 1]
                                + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];

                maxSum = Math.max(maxSum, hourglassSum);
            }
        }

        // Print the maximum hourglass sum
        System.out.println(maxSum);
    }
}
