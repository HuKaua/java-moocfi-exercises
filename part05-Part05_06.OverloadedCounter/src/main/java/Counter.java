public class Counter {
    private int startValue;


    public Counter(int startValue){
        this.startValue = startValue;
    }

    public Counter(){
        this.startValue = 0;
    }

    public int value(){
        return this.startValue;
    }

    //quando o valor nao é declarado
    public void increase(){
        this.startValue++;
    }

    //quando o valor é declarado
    public void increase (int increaseBy){
        if (increaseBy < 0) {
            this.startValue = this.startValue;
        }else {
            this.startValue = this.startValue + increaseBy;
        }
    }

    // novamente, valor nao declarado
    public void decrease(){
        this.startValue --;
    }

    // valor declarado
    public void decrease(int decreaseBy){
        if (decreaseBy < 0) {
            return;
        }
        this.startValue = this.startValue - decreaseBy; 
    }


}
