public class Statistics {
    private int count;
    private int sum;

    public Statistics() {
        // initialize the variable numberCount here
        this.count = count;
        this.sum = sum;


    }

    public void addNumber(int number) {
        //add a number to the statistics
        count++;                    //increase count by one
        this.sum += number;         // add number to the sum

    }

    public int getCount() {
        return count;
    }

    public int sum(){
        return this.sum;
}

    public double average(){
        return (double) this.sum / this.count;
    }

}





