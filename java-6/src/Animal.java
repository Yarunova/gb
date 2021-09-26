public class Animal {

   protected String name; // кличка животного
   protected int maxRun; // сколько животное может пробежать
   protected int maxSwim; //сколько животное может проплыть
   protected int totalRun; // счетчик, сколько животное уже пробежало
   protected int totalSwim; // счетчик, сколько животное уже проплыло

   public Animal(String name, int maxRun, int maxSwim) {
      this.name = name;
      this.maxRun = maxRun;
      this.maxSwim = maxSwim;
   }

   // бег
   public void run(int distance) {
      if(this.totalRun + distance <= this.maxRun) {
         this.totalRun += distance;
         System.out.println(this.name + " пробежал " + this.totalRun);
      }
      else{
         System.out.println(this.name + " уже пробежал макимальную дистанцию");
      }

   }

   // плавание
   public void swim(int distance) {
      if(this.totalSwim + distance <= this.maxSwim) {
         this.totalSwim += distance;
         System.out.println(this.name + " проплыл " + this.totalSwim);
      }
      else{
         System.out.println(this.name + " уже проплыл макимальную дистанцию");
      }

   }


}
