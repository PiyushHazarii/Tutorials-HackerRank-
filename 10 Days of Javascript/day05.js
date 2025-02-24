// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Let and Const<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
function main() {
    // Write your code here. Read input using 'readLine()' and print output using 'console.log()'.
    
    // Print the area of the circle:
    
    // Print the perimeter of the circle:
    
     // Declare the constant PI
    const PI = Math.PI;

    // Read input and convert it to a floating-point number
    let r = parseFloat(readLine());

    // Calculate the area of the circle
    let area = PI * r * r;

    // Calculate the perimeter (circumference) of the circle
    let perimeter = 2 * PI * r;

    // Print the results
    console.log(area);
    console.log(perimeter);

}