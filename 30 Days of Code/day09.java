public class day09 {
    public static void main(String []argh){
         Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // Number of entries in phone book
        in.nextLine(); // Consume the newline character
        
        // Create a HashMap to store the phone book entries
        Map<String, String> phoneBook = new HashMap<>();
        
        // Read phone book entries
        for(int i = 0; i < n; i++) {
            String name = in.next();
            String phone = in.next();
            phoneBook.put(name, phone);
        }
        
        // Process queries
        while (in.hasNext()) {
            String query = in.next();
            if (phoneBook.containsKey(query)) {
                System.out.println(query + "=" + phoneBook.get(query));
            } else {
                System.out.println("Not found");
            }
        }
        
        in.close();
    }
}