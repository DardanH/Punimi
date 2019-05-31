public class Controller {
    public static void main(String[] args) {
    //Krijim i objektit  te Array
      Arrays array=new Arrays();
      // objekt view me parameter array.
      VIew view=new  VIew(array);
      Model c=new Model(view,array);
      c.run();
    }
}


